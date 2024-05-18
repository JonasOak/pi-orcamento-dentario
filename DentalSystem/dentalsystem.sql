-- Banco de dados: `dentalsystem`
CREATE DATABASE IF NOT EXISTS `dentalsystem`;
USE `dentalsystem`;

-- Estrutura para tabela `cliente`
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `documento` varchar(20) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
);

-- Estrutura para tabela `orcamento`
CREATE TABLE IF NOT EXISTS `orcamento` (
  `id_orcamento` int(11) NOT NULL AUTO_INCREMENT,
  `data_registro` date NOT NULL,
  `data_agendamento` date NOT NULL,
  `plano` varchar(100) NOT NULL,
  `fk_id_cliente` int(11) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_orcamento`),
  KEY `fk_id_cliente` (`fk_id_cliente`),
  CONSTRAINT `orcamento_ibfk_1` FOREIGN KEY (`fk_id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE
);

-- Estrutura para tabela `item_do_orcamento`
CREATE TABLE IF NOT EXISTS `item_do_orcamento` (
  `id_item_orcamento` int(11) NOT NULL AUTO_INCREMENT,
  `fk_id_orcamento` int(11) NOT NULL,
  `servico` varchar(100) NOT NULL,
  `valor` decimal(10,2) NOT NULL,
  `dente` varchar(50) NOT NULL,
  PRIMARY KEY (`id_item_orcamento`),
  KEY `fk_id_orcamento` (`fk_id_orcamento`),
  CONSTRAINT `item_do_orcamento_ibfk_1` FOREIGN KEY (`fk_id_orcamento`) REFERENCES `orcamento` (`id_orcamento`) ON DELETE CASCADE
);

-- Estrutura para tabela `usuario`
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cargo` varchar(100) NOT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `login` (`login`)
);

DELIMITER $$

CREATE TRIGGER IF NOT EXISTS `before_insert_cliente` 
BEFORE INSERT ON `cliente` 
FOR EACH ROW 
BEGIN
    IF NEW.nome = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'nome não pode ser vazio';
    END IF;
    IF NEW.endereco = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'endereco não pode ser vazio';
    END IF;
    IF NEW.uf = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'uf não pode ser vazio';
    END IF;
    IF NEW.telefone = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'telefone não pode ser vazio';
    END IF;
    IF NEW.documento = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'documento não pode ser vazio';
    END IF;
END;
$$

CREATE TRIGGER IF NOT EXISTS `before_update_cliente` 
BEFORE UPDATE ON `cliente` 
FOR EACH ROW 
BEGIN
    IF NEW.nome = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'nome não pode ser vazio';
    END IF;
    IF NEW.endereco = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'endereco não pode ser vazio';
    END IF;
    IF NEW.uf = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'uf não pode ser vazio';
    END IF;
    IF NEW.telefone = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'telefone não pode ser vazio';
    END IF;
    IF NEW.documento = '' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'documento não pode ser vazio';
    END IF;
END;
$$

DELIMITER ;

COMMIT;
