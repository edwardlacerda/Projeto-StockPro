# Criação de Index.

create index idx_cpf on cliente (cpf);

explain select * from cliente where cpf='227%';

# Criação de Index Composto.

create index idx_num_vendas on venda(vendedor_id, qtde_produto);

explain select vendedor_id, qtde_produto from venda;