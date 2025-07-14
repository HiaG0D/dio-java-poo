```mermaid
flowchart TD
    A["iPhone"] --> B(["ReprodutorMusical"]) & c(["AparelhoTelefonico"]) & d(["NavegadorInternet"])
    B --> n1["tocar()"] & n5["pausar()"] & n6["selecionarMusica()"]
    c --> n2["ligar(String numero)"] & n7["atender()"] & n8["iniciarCorreioVoz()"]
    d --> n3["exibirPagina(String url)"] & n9["adicionarNovaAba()"] & n10["atualizarPagina()"]
    n1 --> n11["System.out.println('A musica ' + musicname + ' está tocando agora no volume ' + volume);"]
    n5 --> n12["System.out.println('A musica ' + musicname + ' foi pausada');"]
    n6 --> n13["musicname=musica;\nSystem.out.println('Música ' + musica + ' foi selecionada');"]
    n2 --> n14["this.numero=numero;\nSystem.out.println('Ligando para o numero ' + numero);"]
    n7 --> n15["System.out.println('Atendendo...');\nSystem.out.println('Chamada em andamento!');"]
    n8 --> n16["System.out.println('Sua chamada foi encaminhada para o correio de voz');"]
    n3 --> n17["this.url=url;\nSystem.out.println('Exibindo a pagina ' + url);"]
    n9 --> n18["System.out.println('Nova aba aberta');"]
    n10 --> n19["System.out.println('Atualizando pagina...');"]
