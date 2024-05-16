-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16/05/2024 às 10:18
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dentalsystem`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `documento` varchar(20) NOT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Acionadores `cliente`
--
DELIMITER $$
CREATE TRIGGER `before_insert_cliente` BEFORE INSERT ON `cliente` FOR EACH ROW BEGIN
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
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `before_update_cliente` BEFORE UPDATE ON `cliente` FOR EACH ROW BEGIN
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
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura para tabela `item_do_orcamento`
--

CREATE TABLE `item_do_orcamento` (
  `id_item_orcamento` int(11) NOT NULL,
  `fk_id_orcamento` int(11) NOT NULL,
  `servico` varchar(100) NOT NULL,
  `valor` decimal(10,2) NOT NULL,
  `dente` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `orcamento`
--

CREATE TABLE `orcamento` (
  `id_orcamento` int(11) NOT NULL,
  `data_registro` date NOT NULL,
  `data_agendamento` date NOT NULL,
  `plano` varchar(100) NOT NULL,
  `fk_id_cliente` int(11) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cargo` varchar(100) NOT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `item_do_orcamento`
--
ALTER TABLE `item_do_orcamento`
  ADD PRIMARY KEY (`id_item_orcamento`),
  ADD KEY `fk_id_orcamento` (`fk_id_orcamento`);

--
-- Índices de tabela `orcamento`
--
ALTER TABLE `orcamento`
  ADD PRIMARY KEY (`id_orcamento`),
  ADD KEY `fk_id_cliente` (`fk_id_cliente`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `login` (`login`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `item_do_orcamento`
--
ALTER TABLE `item_do_orcamento`
  MODIFY `id_item_orcamento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `orcamento`
--
ALTER TABLE `orcamento`
  MODIFY `id_orcamento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `item_do_orcamento`
--
ALTER TABLE `item_do_orcamento`
  ADD CONSTRAINT `item_do_orcamento_ibfk_1` FOREIGN KEY (`fk_id_orcamento`) REFERENCES `orcamento` (`id_orcamento`) ON DELETE CASCADE;

--
-- Restrições para tabelas `orcamento`
--
ALTER TABLE `orcamento`
  ADD CONSTRAINT `orcamento_ibfk_1` FOREIGN KEY (`fk_id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
