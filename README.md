
# Sistema de Cadastro e Gerenciamento de Contas Bancárias

Este projeto implementa um sistema básico para o cadastro e gerenciamento de contas bancárias, seguindo as seguintes regras de negócio:




- O cadastro de uma conta requer o número da conta, o nome do titular e, opcionalmente, um valor de depósito inicial. Caso o depósito inicial não seja informado, o saldo inicial será zero.
- Após o cadastro, o número da conta não pode ser alterado. No entanto, o nome do titular pode ser atualizado.
- O saldo da conta só pode ser modificado por meio de depósitos ou saques. Saques estão sujeitos a uma taxa fixa de $5.00.
-  O saldo pode ficar negativo caso não haja fundos suficientes para cobrir o saque e/ou a taxa.

## O Sitema permite:
    1. Cadastrar uma conta bancária.
    2. Realizar depósitos e saques.
    3. Exibir os dados atualizados da conta após cada operação.

O projeto foi desenvolvido em Java 10, utilizando duas classes principais:
- **Program**: localizada no pacote _application_, é responsável pela execução principal do programa.
- **Client**: localizada no pacote _entities_   , define a estrutura da conta bancária e suas operações.

Este repositório é ideal para quem deseja aprender sobre encapsulamento, manipulação de classes e implementação de regras de negócio em Java.


## 🚀 About Me
Sou um desenvolvedor backend especializado em Java, apaixonado por tecnologia e sempre em busca de aprimorar minhas habilidades. Tenho interesse em resolver problemas complexos e criar soluções eficientes que impactem positivamente a vida das pessoas.


## License

[MIT](https://choosealicense.com/licenses/mit/)

