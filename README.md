# BADESC - Linhas de Crédito - Automação de Testes

Projeto que contém os scripts de casos de teste automatizados do SISBADESC2

## Começando

As instruções abaixo irão levá-lo a instalar uma cópia do projeto e por em funcionamento em sua máquina local para fins de desenvolvimento e teste. Para fins de implantação em homologação e produção consulte a guia **Deployment**.

### Prerequisitos

```
Maven
JDK 8+
Intellij (o passo a passo está pensando para o Intellij)
```

### Instalação

Um step by step para instalação completa do projeto (no Windows)


#### Maven Install
Faça o download e instalação do Maven para a maquina
* [Maven](https://maven.apache.org/) - Gerenciador de dependencias


#### Faça do download do Projeto
* [Repositório](https://github.com/oliveirafellipe/automation) - Projeto no Github


#### Configure-o no IntelliJ
```
Abra o IntelliJ
Clique em Open
Navegue até a raiz do diretório e selecione o projeto
```

## Rodando os testes

Abaixo duas formas de rodas os testes em desenvolvimento

### 	Linha de Comando

Abra o cmd na pasta raiz do projeto e digite o comando

```
mvn clean test
```

irá todar todos os testes do projeto. Você pode acompanhar o output direto do console ou dentro da pasta **target/surefile-reports**

### 	Dentro do projeto

O projeto foi estruturado usando PageObjets, metodologia que tem como padrão as classes de teste com o sufixo Test. 
Exemplos de classes de teste deste projeto:
```
LoginTest
AddLinhaCreditoTest
PerfilTest
```
Todos os testes estão centralizados no package tests.

Para rodar um teste específico localize e rode algum método com a anotação
```
@Test
```

## Deployment

Soon...

## Built With

* [jUnit 5](https://junit.org/junit5/) - Test framework used
* [Maven](https://maven.apache.org/) - Gerenciador de dependencias

## Contributing

Soon...

## Versioning

Soon...

## Authors

* **Fellipe Oliveira de Lima** - *Analista de Testes* - [GitHub](https://github.com/oliveirafellipe)

Aqui os demais [contribuidores](https://github.com/oliveirafellipe/automation/contributors) que ajudaram no projeto.
