LUCAS NIGUTI DOS SANTOS / RA: 22019975-2

# Projeto: Adapter para Leitura de Pessoas via CSV

## Objetivo
Este projeto demonstra o uso do design pattern **Adapter** para adaptar arquivos `.csv` legados a um novo sistema baseado em objetos.

## Componentes

- `Pessoa`: representa uma pessoa com nome, idade e email.
- `RepositorioDePessoas`: interface que define o método `listarPessoas()`.
- `PessoaCsvAdapter`: adapter que implementa `RepositorioDePessoas` e lê dados de um arquivo `.csv`.
- `Main`: classe principal que executa a leitura e exibe os dados no console.

## Execução

Coloque o arquivo `pessoas.csv` no diretório do projeto e execute a classe `Main`.

## Exemplo de Arquivo CSV

```
nome, idade, email
Ana Silva, 29, ana.silva@email.com
Carlos Souza, 35, carlos.souza@email.com
```
