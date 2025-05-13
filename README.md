# 📦 Consulta de Endereço via API (ViaCEP)

[![Linguagem](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)

Este projeto foi desenvolvido em **Java**, com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)** e **integração com APIs externas**. A aplicação realiza consultas na API do **ViaCEP**, permitindo ao usuário buscar informações de um CEP e salvar os dados em um arquivo `.json`.

---

## 📌 Objetivo do Projeto

Este projeto foi desenvolvido como parte do curso **Curso Java consumindo API: gravando arquivos e lidando com erros** da [Alura](https://www.alura.com.br/), e visa aplicar os seguintes conceitos:

- Consumo de APIs REST com Java
- Manipulação de JSON
- Criação de arquivos via código
- Utilização de `records` no Java
- Organização do código com POO
- Leitura de dados do usuário via terminal

---

## ⚙️ Funcionalidades da Aplicação

- Leitura do CEP informado pelo usuário via console
- Consulta da API pública [ViaCEP](https://viacep.com.br/)
- Conversão automática da resposta JSON para objeto Java
- Escrita dos dados do endereço consultado em um arquivo `.json`
- Tratamento básico de erros (CEP inválido ou fora do padrão)

---

## 🧱 Estrutura do Projeto

- `Principal.java`: classe principal, responsável pela interação com o usuário.
- `ConsultaCep.java`: responsável por fazer a requisição HTTP à API do ViaCEP.
- `Endereço.java`: classe `record` que representa os dados do endereço retornado pela API.
- `GeradorDeArquivos.java`: responsável por gerar e salvar o arquivo `.json` com os dados do endereço.

---

## 🖥️ Tecnologias Utilizadas

- Java 17 (ou superior)
- IntelliJ IDEA
- Biblioteca `java.net.http` para chamadas HTTP
- Manipulação de JSON com `Gson` (Google)
- Programação Orientada a Objetos (POO)

---

## 🚀 Como executar o projeto
1. Clone este repositório:
git clone https://github.com/ThawanST/DesafioAlura-APIViaCEP.git

2. Abra o projeto no IntelliJ IDEA.

3. Execute o método main da classe Principal.java.

## 📚 Aprendizados
Projeto educacional. Desenvolvido com o propósito de aprender integração com APIs e manipulação de arquivos JSON usando Java.

---
