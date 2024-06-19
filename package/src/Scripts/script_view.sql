#Criação de View 

create view cpf_cliente as
select id,nome_completo,cpf from cliente;

select * from cpf_cliente;

