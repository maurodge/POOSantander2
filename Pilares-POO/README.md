# Pilares da Programação Orientada a Objetos

- Parte teórica

Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professor ![Gleyson Sampaio](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums).

![Material UML](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/uml) - convenções para diagrama de projeto.

## POO

A programação orientada a objetos é muito eficiente nas aplicações atuais no mercado pois possibilita a **reutilização de blocos de códigos** e também por conseguir representar um sistema muito próximo ao mundo real.

Para uma linguagem ser considerada orientada a objetos, ela deve seguir os 4 pilares da POO, que são:

- **Encapsulamento:** Nem tudo precisa estar visível. Grande parte do algoritmo pode ser distribuído em métodos com finalidades específicas que complementam uma ação na app, não sendo necessário a apresentação desses metodos aos usuários.

Exemplo: quando deixa um **metodo private** em classe, mesmo que eles precisem ser acionados dentro de outro **método publico** na mesma classe que é chamado na **classe principal.** Os métodos de conferencia para o método ligar na classe carro do exemplo de código.

- **Herança:** Características e comportamentos comuns podem ser compartilhados/reutilizados através de uma hierarquia de objetos.

Exemplo: quando uma classe mais específica **extends** uma outra classe mais genérica. Podendo assim chamar seus métodos na classe principal.

- **Abstração:** A indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto. Quando existe mais de uma maneira de realizar a mesma operação ---> polimorfismo.

Exemplo: A **classe genérica** contempla um **método** que possui diferentes formas de ser executado dependendo da **classe especifica**. Neste caso usa-se **abstract** no método informando o polimorfismo. Metodo ligar nas classes veiculo, moto e carro do exemplo de código

- **Polimorfismo:** São as várias maneiras de se realizar uma mesma ação. É comum o uso do modificador de acesso protected ou default em casos de polimorfismo, assim a classe pai (mais generica e abstrata) pode compartilhar métodos com as classes filhas sem disponibilizá-los à classe principal.

![Link exemplo de código](https://github.com/maurodge/POOSantander2/tree/main/Pilares-POO/Autodromo/src)...

### Interface

É o nível maior de abstração dentro da linguagem.

Por exemplo, imagine que tenhamos uma impressora, uma fotocopiadora, uma digitalizadora e queremos gerar uma impressora multiuso (copia, digitaliza e imprime). Como em java não é permitido herança multipla (a multiuso herdar/extend as tres classes), usa-se o conceito de interface. Como isso é feito? Os métodos imprimir, copiar e digitalizar ficam dentro de interfaces independentes. Essas interfaces podem ser chamadas a cada objeto criado, e cada objeto pode usufruir de uma ou mais interfaces.

As interfaces atribuem caracteristicas de responsabilidade/utilidade de uma classe. No exemplo, significa dizer que uma multifuncional pode ser copiadora, pode ser digitalizadora e pode ser impressora, porem uma impressora só pode ser impressora, uma copiadora só pode ser uma copiadora e uma digitalizadora só pode ser uma digitalizadora.

![exemplo do codigo usando interface](https://github.com/maurodge/POOSantander2/tree/main/Pilares-POO/exemplo-interfaces/src)

Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professor ![Gleyson Sampaio](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums).
