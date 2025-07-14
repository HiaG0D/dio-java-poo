public class NavegadorInternet {
    private String url;

    public void exibirPagina(String url){
        this.url=url;
        System.out.println("Exibindo a pagina " +url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    }


}
