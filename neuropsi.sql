-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01/09/2023 às 16:55
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `neuropsi`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `citacao`
--

CREATE TABLE `citacao` (
  `idcitacao` int(11) NOT NULL,
  `fonte` varchar(100) DEFAULT NULL,
  `descricao` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `citacao_tag`
--

CREATE TABLE `citacao_tag` (
  `idcitacao_tag` int(11) NOT NULL,
  `citacao` int(11) DEFAULT NULL,
  `tag` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `paciente`
--

CREATE TABLE `paciente` (
  `idpaciente` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `lateralidade` varchar(45) DEFAULT NULL,
  `dn` date DEFAULT NULL,
  `ln` varchar(45) DEFAULT NULL,
  `escolaridade` varchar(45) DEFAULT NULL,
  `curso` varchar(45) DEFAULT NULL,
  `profissao` varchar(45) DEFAULT NULL,
  `estado_civil` varchar(45) DEFAULT NULL,
  `filhos` int(11) DEFAULT NULL,
  `comentario` text DEFAULT NULL,
  `data` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `paciente`
--

INSERT INTO `paciente` (`idpaciente`, `nome`, `sexo`, `lateralidade`, `dn`, `ln`, `escolaridade`, `curso`, `profissao`, `estado_civil`, `filhos`, `comentario`, `data`) VALUES
(6, 'Felipe Fernandes', 'Masculino', 'Canhoto', '1985-08-28', 'Porto Alegre', 'Mestrado', 'Psicologia', 'Psicólogo', 'Solteiro(a)', 0, '', NULL),
(10, 'Maria', 'Feminino', 'Destro', '2000-05-06', 'Em algum lugar', 'Pós-Doutorado', 'Algum', 'Alguma', 'Namorando(a)', 10, '', NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `paciente_sintoma`
--

CREATE TABLE `paciente_sintoma` (
  `idpaciente_sintoma` int(11) NOT NULL,
  `idpaciente` int(11) DEFAULT NULL,
  `idsintoma` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `sintoma`
--

CREATE TABLE `sintoma` (
  `idsintoma` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `descricao` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `tag`
--

CREATE TABLE `tag` (
  `idtag` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `teste`
--

CREATE TABLE `teste` (
  `idtestes` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `testes_aplicados`
--

CREATE TABLE `testes_aplicados` (
  `idtestes_aplicados` int(11) NOT NULL,
  `idteste` int(11) DEFAULT NULL,
  `idpaciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `transtorno`
--

CREATE TABLE `transtorno` (
  `idtranstorno` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `citacao`
--
ALTER TABLE `citacao`
  ADD PRIMARY KEY (`idcitacao`);

--
-- Índices de tabela `citacao_tag`
--
ALTER TABLE `citacao_tag`
  ADD PRIMARY KEY (`idcitacao_tag`),
  ADD KEY `citacao_tag_citacao_idx` (`citacao`),
  ADD KEY `citacao_tag_tag_idx` (`tag`);

--
-- Índices de tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idpaciente`);

--
-- Índices de tabela `paciente_sintoma`
--
ALTER TABLE `paciente_sintoma`
  ADD PRIMARY KEY (`idpaciente_sintoma`),
  ADD KEY `idpaciente_paciente_sintoma_idx` (`idpaciente`),
  ADD KEY `idsintoma_paciente_sintoma_idx` (`idsintoma`);

--
-- Índices de tabela `sintoma`
--
ALTER TABLE `sintoma`
  ADD PRIMARY KEY (`idsintoma`);

--
-- Índices de tabela `tag`
--
ALTER TABLE `tag`
  ADD PRIMARY KEY (`idtag`);

--
-- Índices de tabela `teste`
--
ALTER TABLE `teste`
  ADD PRIMARY KEY (`idtestes`);

--
-- Índices de tabela `testes_aplicados`
--
ALTER TABLE `testes_aplicados`
  ADD PRIMARY KEY (`idtestes_aplicados`),
  ADD KEY `idteste_idx` (`idteste`),
  ADD KEY `idpaciente_idx` (`idpaciente`);

--
-- Índices de tabela `transtorno`
--
ALTER TABLE `transtorno`
  ADD PRIMARY KEY (`idtranstorno`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `citacao`
--
ALTER TABLE `citacao`
  MODIFY `idcitacao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `citacao_tag`
--
ALTER TABLE `citacao_tag`
  MODIFY `idcitacao_tag` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idpaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `paciente_sintoma`
--
ALTER TABLE `paciente_sintoma`
  MODIFY `idpaciente_sintoma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `sintoma`
--
ALTER TABLE `sintoma`
  MODIFY `idsintoma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tag`
--
ALTER TABLE `tag`
  MODIFY `idtag` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `teste`
--
ALTER TABLE `teste`
  MODIFY `idtestes` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `testes_aplicados`
--
ALTER TABLE `testes_aplicados`
  MODIFY `idtestes_aplicados` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `transtorno`
--
ALTER TABLE `transtorno`
  MODIFY `idtranstorno` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `citacao_tag`
--
ALTER TABLE `citacao_tag`
  ADD CONSTRAINT `citacao_tag_citacao` FOREIGN KEY (`citacao`) REFERENCES `citacao` (`idcitacao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `citacao_tag_tag` FOREIGN KEY (`tag`) REFERENCES `tag` (`idtag`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `paciente_sintoma`
--
ALTER TABLE `paciente_sintoma`
  ADD CONSTRAINT `idpaciente_paciente_sintoma` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idsintoma_paciente_sintoma` FOREIGN KEY (`idsintoma`) REFERENCES `sintoma` (`idsintoma`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `testes_aplicados`
--
ALTER TABLE `testes_aplicados`
  ADD CONSTRAINT `idpaciente_testes_aplicados` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idteste_testes_aplicados` FOREIGN KEY (`idteste`) REFERENCES `teste` (`idtestes`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
