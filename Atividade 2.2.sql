DROP TABLE IF EXISTS Cliente, Conta, Corrente, Poupanca, Movimento;

CREATE TABLE Cliente (
	id SERIAL NOT NULL,
	nome VARCHAR(20) NOT NULL,
	email VARCHAR(20) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	
	CONSTRAINT pkCliente PRIMARY KEY(id)
);

CREATE TABLE Conta (
	id SERIAL NOT NULL,
	numero VARCHAR(20) NOT NULL,
	agencia VARCHAR(20) NOT NULL,
	saldo NUMERIC(10,2) NOT NULL,
	
	CONSTRAINT pkConta PRIMARY KEY(id)
);

CREATE TABLE Corrente (
	id SERIAL NOT NULL,
	idConta INTEGER NOT NULL,
	limite NUMERIC(10,2) NOT NULL,
	
	CONSTRAINT pkCorrente PRIMARY KEY(id),
	CONSTRAINT fkConta FOREIGN KEY(idConta) REFERENCES Conta(id)
);

CREATE TABLE Poupanca (
	id SERIAL NOT NULL,
	idConta INTEGER NOT NULL,
	juro NUMERIC(10,2) NOT NULL,
	
	CONSTRAINT pkPoupanca PRIMARY KEY(id),
	CONSTRAINT fkConta FOREIGN KEY(idConta) REFERENCES Conta(id)
);

CREATE TABLE Movimento (
	id SERIAL NOT NULL,
	idConta INTEGER NOT NULL,
	dataEfetuada DATE NOT NULL,
	tipo VARCHAR(20) NOT NULL,
	valor NUMERIC(10,2) NOT NULL,
	
	CONSTRAINT pkMovimento PRIMARY KEY(id),
	CONSTRAINT fkMovimento FOREIGN KEY(idConta) REFERENCES Conta(id)
);