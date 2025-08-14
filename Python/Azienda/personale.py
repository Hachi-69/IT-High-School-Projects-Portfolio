class Personale:
    def __init__(self, nome, cognome, orepy):
        self.nome=nome
        self.cognome=cognome
        self.orepy=orepy
        
    def __str__(self):
        return f'{self.nome} - {self.cognome} {self.nome} - {self.orepy}'
    
    def __eq__(self, other):
        return self.nome == other.nome and self.cognome == other.cognome and self.orepy == other.orepy