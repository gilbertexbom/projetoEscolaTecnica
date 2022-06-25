drop database if exists EscolaTecnica;

create database EscolaTecnica;

use EscolaTecnica;

create table Estudante(
    RM char(5) not null primary key,
    Nome varchar(50) not null
);

create table ComponenteCurricular(
    Sigla char(5) not null primary key,
    Componente varchar(50) not null,
    CargaHoraria int
);

create table Curso(
    RM char(5) not null,
    Sigla char(5) not null,
    Nota char(2),
    Frequencia double,
    constraint PK_Curso
        primary key(RM, Sigla),
    constraint FK_Estudante_Curso
        foreign key(RM) references Estudante(RM),
    constraint FK_ComponenteCurricular_Curso
        foreign key(Sigla) references ComponenteCurricular(Sigla)
);

