from personale import Personale
class Backend (Personale):
    def __init__(self, nome, cognome, orepy, orephp):
        super().__init__(nome, cognome, orepy)
        self.nome=nome
        self.cognome=cognome
        self.orephp=orephp
        
    def __str__(self):
        return f'{self.nome} - {self.cognome} {self.nome} - {self.orephp}'
    
    def __eq__(self, other):
        return self.nome == other.nome and self.cognome == other.cognome and self.orephp == other.orephp