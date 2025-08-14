import random

def printBoard(board): # Stampa il tabellone di gioco
    for row in board:
        print("|".join(row))
        print("-----")

def checkWinner(board): # Verifica se c'è una vincita,
                        # Restituisce il simbolo vincente oppure None se non c'è una vincita,
                        # Controllo della vincita eseguito solo in orizzontale
    for row in board:
        if len(set(row)) == 1 and row[0] != ' ':
            return row[0]

    return None

def updateBoard(board, symbol): # Aggiorna il tabellone di gioco con il simbolo dato in una posizione vuota casuale
                                # Restituisce True se l'aggiornamento ha successo, False se il tabellone è pieno
    emptyPositions = []
    for i in range(3):
        for j in range(3):
            if board[i][j] == ' ':
                emptyPositions.append((i, j))
    
    if not emptyPositions:
        return False

    position = random.choice(emptyPositions)
    board[position[0]][position[1]] = symbol
    return True

def playSlotMachine(board, symbols, currentBet): # Metodo principale del gioco, continua a giocare finche'
                                                 # o la board e' piena, o c'e' una vittoria
    while True:
        printBoard(board)
        input("Premi Invio per giocare...")
            
        symbol = random.choice(symbols)
        if symbol == 'S':
            multiplier = 10
        elif symbol == 'A':
            multiplier = 5
        else:
            multiplier = 2

        if not updateBoard(board, symbol):
            print("Hai perso!")
            return -currentBet

        winner = checkWinner(board)
        if winner:
            printBoard(board)
            print(f"\nComplimenti! Hai vinto con il simbolo {winner}. Moltiplicatore: x{multiplier}\n")
            return currentBet * multiplier

# Inizializzazione delle variabili
initialBalance = 0
currentBalance = initialBalance
totalWinnings = 0
lastBet = 0

mat = [[' ', ' ', ' '],[' ', ' ', ' '],[' ', ' ', ' ']]
symbols = ["S", "S", "A", "A", "A", "B", "B", "B", "B", "B"]

# Ciclo principale del programma e menu' per l'interazione
while True:
    print(f"Saldo attuale: {currentBalance:.2f}\n")
    print(f"Puntata attuale: {lastBet:.2f}\n")
    print("Menu:")
    print("1. Aggiungi denaro")
    print("2. Modifica puntata")
    print("3. Gioca")
    print("4. Visualizza vincita")
    print("5. Ritira soldi")
    print("6. Esci\n")

    choice = input("Seleziona un'opzione: ")

    if choice == '1':
        try:
            addedMoney = float(input("Inserisci la quantità di denaro da aggiungere: "))
            if addedMoney < 0:
                print("\nErrore: Impossibile aggiungere una quantità negativa di denaro.\n")
            else:
                currentBalance += addedMoney
        except ValueError:
            print("\nErrore: Inserire un valore numerico valido.\n")
    elif choice == '2':
        try:
            newBet = float(input("Inserisci la nuova puntata: "))
            if newBet < 0:
                print("\nErrore: Impossibile impostare una puntata negativa.\n")
            elif newBet > currentBalance:
                print("\nErrore: Puntata superiore al saldo attuale.\n")
            else:
                lastBet = newBet
        except ValueError:
            print("\nErrore: Inserire un valore numerico valido.\n")
    elif choice == '3':
        if lastBet > currentBalance:
            print("\nErrore: La puntata è superiore al saldo attuale. Riduci la puntata o aggiungi denaro.\n")
        else:
            winnings = playSlotMachine(mat, symbols, lastBet)
            currentBalance += winnings
            if winnings > 0:
                totalWinnings += winnings
        mat = [[' ', ' ', ' '],[' ', ' ', ' '],[' ', ' ', ' ']]
    elif choice == '4':
        print(f"\nVincita totale: {totalWinnings:.2f}\n")
    elif choice == '5':
        print(f"\nHai ritirato: {currentBalance:.2f}\n")
        currentBalance = initialBalance
        totalWinnings = 0
    elif choice == '6':
        print("\nArrivederci!\n")
        break
    else:
        print("\nScelta non valida. Riprova.\n")