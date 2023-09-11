# Pilares da Programação Orientada a Objetos

- Parte teórica - Exemplos em SRC

Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professor ![Gleyson Sampaio](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums).

## POO

A programação orientada a objetos é muito eficiente nas aplicações atuais no mercado pois possibilita a **reutilização de blocos de códigos** e também por conseguir representar um sistema muito próximo ao mundo real.

Para uma linguagem ser considerada orientada a objetos, ela deve seguir os 4 pilares da POO, que são:

- **Encapsulamento:** Nem tudo precisa estar visível. Grande parte do algoritmo pode ser distribuído em métodos com finalidades específicas que complementam uma ação na app, não sendo necessário a apresentação desses metodos aos usuários.

Exemplo: quando deixa um **metodo private** em classe, mesmo que eles precisem ser acionados dentro de outro **método publico** na mesma classe que é chamado na **classe principal.** Os métodos de conferencia para o método ligar na classe carro do exemplo de código.

- **Herança:** Características e comportamentos comuns podem ser compartilhados através de uma hierarquia de objetos.

Exemplo: quando uma classe mais específica **extends** uma outra classe mais genérica. Podendo assim chamar seus métodos na classe princiapl.

- **Abstração:** A indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto. Quando existe mais de uma maneira de realizar a mesma operação ---> polimorfismo.

Exemplo: A **classe genérica** contempla um **método** que possui diferentes formas de ser executado dependendo da **classe especifica**. Neste caso usa-se **abstract** no método informando o polimorfismo. Metodo ligar nas classes veiculo, moto e carro do exemplo de código

- **Polimorfismo:** São as várias maneiras de se realizar uma mesma ação.

![Link exemplo de código](inserir endereço)...
