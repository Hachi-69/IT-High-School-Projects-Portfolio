from personale import Personale
class Frontend (Personale):
    def __init__(self, nome, cognome, orepy, orejs):
        super().__init__(nome, cognome, orepy)
        self.nome=nome
        self.cognome=cognome
        self.orejs=orejs
        
    def __str__(self):
        return f'{self.nome} - {self.cognome} {self.nome} - {self.orejs}'
    
    def __eq__(self, other):
        return self.nome == other.nome and self.cognome == other.cognome and self.orejs == other.orejs