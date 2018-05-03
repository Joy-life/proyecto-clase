    DROP TABLE Perfil CASCADE CONSTRAINTS;

CREATE TABLE Perfil(
Id_perfil NUMBER (1) GENERATED ALWAYS AS IDENTITY, 
Nombre VARCHAR2 (45) NOT NULL,
CONSTRAINT Perf_perfid_pk PRIMARY KEY (Id_perfil),
-- Administrador, due�o, usuario
CONSTRAINT Perf_nom_ck Check (Nombre = INITCAP(Nombre))
);
INSERT INTO Perfil (Nombre) VALUES ('Admin');
INSERT INTO Perfil (Nombre) VALUES ('Due�o');

   DROP TABLE Persona CASCADE CONSTRAINTS;

CREATE TABLE Persona(
Id_persona NUMBER (4) GENERATED ALWAYS AS IDENTITY, --Autoincremental
Nombre VARCHAR2 (45) NOT NULL,
Apellido1 VARCHAR2 (45) NOT NULL,
Apellido2 VARCHAR2 (45),
Fecha_alta DATE NOT NULL,
Usuario VARCHAR2 (45) NOT NULL,
Contrasenna VARCHAR2 (255) NOT NULL,
Email VARCHAR2 (60),
Id_perfil  INTEGER NOT NULL,
CONSTRAINT Pers_persid_pk PRIMARY KEY (Id_persona),
CONSTRAINT Pers_perfid_fk FOREIGN KEY (Id_perfil) REFERENCES Perfil (Id_perfil)
);

INSERT INTO Persona (Nombre, Apellido1, Fecha_alta, Usuario, Contrasenna, Id_perfil) VALUES ('due�o1','ape1',TO_DATE(SYSDATE,'DD/MM/YYYY'), 'SuperDue�o1','sd1',2);

    DROP TABLE Equipo CASCADE CONSTRAINTS;

CREATE TABLE Equipo(
Id_equipo NUMBER (2)GENERATED ALWAYS AS IDENTITY,
Nombre VARCHAR2 (45) NOT NULL,
Fecha_creacion DATE NOT NULL,
Comentario VARCHAR2 (150),
Id_persona INTEGER NOT NULL,
CONSTRAINT Equi_equid_pk PRIMARY KEY (Id_equipo),
CONSTRAINT Equi_persid_fk FOREIGN KEY (Id_persona) REFERENCES Persona (Id_persona)
);

INSERT INTO Equipo (Nombre,FECHA_CREACION,COMENTARIO,Id_persona) VALUES ('Equipo1',TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son rosas',1);

    DROP TABLE Jugador CASCADE CONSTRAINTS;

CREATE TABLE Jugador(
Id_jugador NUMBER (3)GENERATED ALWAYS AS IDENTITY,
Dni VARCHAR2 (9) NOT NULL,
Nombre VARCHAR2 (45) NOT NULL,
Apellido1 VARCHAR2 (45) NOT NULL,
Apellido2 VARCHAR2 (45) NOT NULL,
Nickname VARCHAR2 (20) NOT NULL,
Sueldo NUMBER (8,2) NOT NULL,
Fecha_alta DATE NOT NULL,
Comentario VARCHAR2 (150),
Id_equipo INTEGER ,
CONSTRAINT Jug_jugid_pk PRIMARY KEY (Id_jugador),
CONSTRAINT Jug_equid_fk FOREIGN KEY (Id_equipo) REFERENCES Equipo (Id_equipo)
);

INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario,ID_EQUIPO) VALUES ('72848256A','Mikel','Ferreiro','Guridi','Joylife',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son rosas',1);
INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario) VALUES ('62348256A','Yaiza','dasfo','Guridi','jaiz',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son rojas');
INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario) VALUES ('56878256A','JonXu','asd','Guridi','gold',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son amarillas');
INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario) VALUES ('42898256A','Imanol','fgh','Guridi','ima',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son azules');
INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario,ID_EQUIPO) VALUES ('35842556A','Mikel2','Ferreiro2','Guridi2','Joylife2',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son rosas2',1);
INSERT INTO Jugador (Dni,Nombre,Apellido1,Apellido2,Nickname,Sueldo,Fecha_alta,Comentario,ID_EQUIPO) VALUES ('25842553A','Mikel3','Ferreiro3','Guridi3','Joylife3',30000,TO_DATE(SYSDATE,'DD/MM/YYYY'),'Las rosas son rosas3',1);

    DROP TABLE Jornada CASCADE CONSTRAINTS;

CREATE TABLE Jornada(
Id_jornada NUMBER (2)GENERATED ALWAYS AS IDENTITY,
CONSTRAINT Jorn_jornid_pk PRIMARY KEY (Id_jornada)
);

    DROP TABLE Partido CASCADE CONSTRAINTS;

CREATE TABLE Partido(
Id_partido NUMBER (4) GENERATED ALWAYS AS IDENTITY,
Fecha DATE NOT NULL,
Lugar VARCHAR2 (30) NOT NULL,
Id_jornada INTEGER NOT NULL,
CONSTRAINT Part_partid_fk PRIMARY KEY (Id_partido),
CONSTRAINT Part_jornid_fk FOREIGN KEY (Id_jornada) REFERENCES Jornada (Id_jornada)
);

    DROP TABLE Marcador CASCADE CONSTRAINTS;

CREATE TABLE Marcador(
Id_marcador NUMBER (3) GENERATED ALWAYS AS IDENTITY,
Puntuacion INTEGER NOT NULL,
Visitante NUMBER(1),
Id_partido INTEGER NOT NULL,
Id_equipo INTEGER NOT NULL,
CONSTRAINT Marc_marcid_pk PRIMARY KEY (Id_marcador),
CONSTRAINT Marc_partid_fk FOREIGN KEY (Id_partido) REFERENCES Partido (Id_partido),
CONSTRAINT Marc_equi_fk FOREIGN KEY (Id_equipo) REFERENCES Equipo (Id_equipo),
CONSTRAINT Marc_vis_ck CHECK (Visitante = 0 or Visitante = 1)
);


