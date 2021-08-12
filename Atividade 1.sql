CREATE TABLE Paciente (
	id SERIAL,
	nome VARCHAR(20),
	telefone VARCHAR(15),
	datanascimento DATE,
	rg VARCHAR(10),
	cpf VARCHAR(11),
	
	CONSTRAINT pkPaciente PRIMARY KEY(id)
);

CREATE TABLE Empregado (
	id SERIAL,
	cpf VARCHAR(11),
	rg VARCHAR(10),
	datanascimento DATE,
	
	CONSTRAINT pkEmpregado PRIMARY KEY(id)
);

SELECT * FROM Paciente;
SELECT * FROM Empregado;
