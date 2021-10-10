--create table

CREATE TABLE Jaegers (
	id          SERIAL PRIMARY KEY,
	modelName   TEXT,
	mark        CHAR(6),
	height      DECIMAL,
	weight      DECIMAL,
	status      TEXT,
	origin      TEXT,
	launch      DATE,
	kaijuKill   INTEGER
);