create database Ecommerce;
use Ecommerce;
create table Usuario(
id_usuario int auto_increment primary key,
nome varchar(100),
cpf varchar(12),
telefone int(12),
email varchar(30),
senha varchar(30),
endereco text
);
create table Cliente(
id_cliente  int auto_increment primary key,
data_Cadastro_Cliente date
);
create table Vendedor(
id_vendedor int auto_increment primary key,
data_Admissao date
);
create table Administrador(
id_administrador  int auto_increment primary key,
data_Admissao date
);
create table Produto(
codigo  int auto_increment primary key,
nome varchar(100),
valor float,
estoque int,
descricao text,
data_Cadastro_Produto date
);

create table Roupa(
id_roupa  int auto_increment primary key,
tamanho char(4),
cor varchar(30)
);
create table Eletronico(
id_Eletronico  int auto_increment primary key,
voltagem int,
garantia_Mes int
);
create table Livro(
id_livro  int auto_increment primary key,
editora varchar(100),
numero_Paginas int
);

create table Pedido(
id_Pedido  int auto_increment primary key,
dataSaida date,
status varchar(50),
valorTotal float
);

create table Avaliacao(
id_Avaliacao  int auto_increment primary key,
nota int(2),
comentario text
);

