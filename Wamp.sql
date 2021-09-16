create table E2(
ID int not null auto_increment,
PrimeiroNome varchar(20) not null,
SobreNome varchar(20) not null,
DataDeEnter date,
Profissao varchar(50) not null,
Pais varchar(20) not null,
primary key (ID)
)default charset = utf8;

insert into E2 (PrimeiroNome, SobreNome, DataDeEnter, Profissao, Pais)
values
('Augusto', 'Dumes', '2021-07-27', 'Estudante', 'Brasil'),
('Beatriz', 'Oliveira', '2021-01-01', 'Estudante', 'Brasil'),
('Jonh', 'Petter', '2020-07-01', 'Engenheiro', 'Canadá'),
('Jack', 'Doe', '2000-10-31', 'Analista Forense', 'EUA');

select * from aula20.E2;
where
ID >1 and ID<3;

update aula20.e2
SET Profissao = 'Analista Forense'
where PrimeiroNome = 'Jack';