#Criação de Trigger para remover um item do estoque ao ser vendido.

DELIMITER //
CREATE TRIGGER trigger_atualizacao_itens after insert
on venda FOR EACH ROW
	BEGIN
        update produto set quantidade = quantidade - new.qtde_produto 
        where id= new.id;
    END//
DELIMITER ;