
##  POO - Desafio - Lançamento iPhone 2007

Como desafio do Bootcamp Santander 2023 foi realizada a Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Baseado no vídeo de lançamento do iPhone foi elabora em uma ferramenta de UML com uso de IA a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. Logo após, foi implementada as classes e interfaces no formato de arquivos .java

### Comportamentos implementados:

    Repodutor Musicial: tocar, pausar, selecionarMusica
    Aparelho Telefônico: ligar, atender, iniciarCorreioVoz
    Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina


```mermaid
classDiagram
    class iPhone {
    }

    class ReprodutorMusical {
        + tocarMusica(): void
        + pausarMusica(): void
        + selecionarMusica(): void
    }

    class AparelhoTelefonico {
        + fazerChamada(): void
        + atenderChamada(): void
        + iniciarCorreioVoz(): void

    }

    class NavegadorInternet {
        + exibirPagina(): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }
    class User {
         - Usuario: String
         - SmartPhone: iPhone
    }

    iPhone *-- ReprodutorMusical
    iPhone *-- AparelhoTelefonico
    iPhone *-- NavegadorInternet
    User   *-- iPhone
```

![image](https://github.com/Silvanors/BC-Santander-DesafioClasses-Iphone/assets/107227311/4d3259a6-c1e5-41f7-8248-8b15750c577a)


**reproduzido by** [Silvano Rodrigues 🖖](https://github.com/Silvanors)
