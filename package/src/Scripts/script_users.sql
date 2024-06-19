# Criação de usuários do stockpro+sales

# Criação do user gerencia, que tem acesso a todo o banco de dados.

create user 'gerencia'@'localhost' identified by 'GeRenCia@2023';

grant all on stockpro_plus_sales_db.* to 'gerencia'@'localhost';

flush privileges;


# Criação do role vendedores e user vendedor.

create role 'vendedores';

grant select on stock_pro_plus_sales_db.produto to 'vendedores';
grant select, insert on stock_pro_plus_sales_db.cliente to 'vendedores';

flush privileges;

create user 'vendedor'@'localhost' identified by 'VenDas@2023';

grant 'vendedores' to 'vendedor'@'localhost';

flush privileges;


# Criação do role 'estoquista e do user estoque.

create role 'estoquista';

grant select, insert, update on stock_pro_plus_sales_db.produto to 'estoquista';

create user 'estoque'@'locahost' identified by 'Stock@2023';

flush privileges; 
