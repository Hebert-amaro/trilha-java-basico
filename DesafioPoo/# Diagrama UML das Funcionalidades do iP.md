# Diagrama UML das Funcionalidades do iPhone

```mermaid
classDiagram
    direction LR

    %% Interfaces
    class ReprodutorMusical {
        <<interface>>
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    %% Classe que implementa as interfaces (ex: IPhone)
    class IPhone {
        + modelo: String
        + sistemaOperacional: String
        + exibirTelaInicial()
    }

    %% Relações de Implementação
    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico
    IPhone --|> NavegadorInternet