create table usuario_seguro(
	id serial not null primary key,
	nome varchar(50) not null,
	nome_usuario varchar(50) not null unique,
	senha varchar(255) not null 
);
