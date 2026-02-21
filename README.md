# Sistema de Gerenciamento de Academia

Projeto desenvolvido em **Java** com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, organização em camadas e aplicação de regras de negócio.

O sistema simula o gerenciamento de uma academia, permitindo o cadastro e controle de alunos e planos.

---

## Funcionalidades

- Cadastro de planos  
- Cadastro de alunos vinculados a um plano  
- Validação para impedir cadastro de aluno sem plano  
- Controle de status do aluno (ativo/inativo)
- Função para Trocar o plano do aluno  
- Aplicação de regras de negócio  
- Estrutura organizada em camadas  

---

## Conceitos Aplicados

- Programação Orientada a Objetos (POO)
  - Encapsulamento  
  - Construtores  
  - Getters e Setters  
- Estruturas condicionais (`if/else`)  
- Organização em pacotes (`model`, `service`, `repository`)  
- Separação de responsabilidades  
- Aplicação de regras de negócio na camada de serviço  

---

## Estrutura do Projeto

```
src/
 ├── model/
 │     ├── Aluno.java
 │     ├── Plano.java
 │     └── Pagamentos.java
 │
 ├── repository/
 │     ├── AlunoRepository.java
 │     ├── PlanoRepository.java
 │     └── PagamentosRepository.java
 │
 ├── service/
 │     ├── AlunoSevice.java
 │     ├── PlanoSevice.java
 │     └── PagamentosService.java
 │
 └── Main.java
```

---

## Regras de Negócio

- Um aluno **não pode ser cadastrado sem um plano**  
- Se não existir plano cadastrado, o sistema bloqueia o cadastro de alunos  
- O pagamento altera o status do aluno para **pago**
- Um aluno pode trocar de plano quantas vezes quiser

---


## Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com foco em:

- Praticar lógica de programação  
- Consolidar conceitos de POO  
- Trabalhar regras de negócio  
- Melhorar organização de projetos Java  

---

## Autor

Desenvolvido por **Lucas Gabriel**