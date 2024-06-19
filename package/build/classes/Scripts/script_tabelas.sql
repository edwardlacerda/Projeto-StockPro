create table produto
(
	id int not null primary key auto_increment,
    nome varchar (100) not null,
    valor decimal not null,
    fabricante varchar (45) not null,
    validade date,
    quantidade int not null default 0
);

create table vendedor
(
	id int not null primary key auto_increment,
    nome_completo varchar (50) not null,
    num_cracha char (8) not null,
    data_nascimento date not null,
    cpf char (14) not null
);

create table cliente
(
	id int not null primary key auto_increment,
    nome_completo varchar (50) not null,
    data_nascimento date not null,
    cpf char (14) not null
);

create table venda
(
	id int not null primary key auto_increment,
    produto_id int not null,
    vendedor_id int not null,
    cliente_id int not null,
    data date not null,
    qtde_produto int not null,
    foreign key (produto_id) references produto (id),
    foreign key (vendedor_id) references vendedor (id),
    foreign key (cliente_id) references cliente (id)
); 