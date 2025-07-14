public class AparelhoTelefonico {
    private String numero;

    public void ligar(String numero){
        this.numero=numero;
        System.out.println("Ligando para o numero "+numero);
    }

    public void atender(){
        System.out.println("Atendendo...");
        System.out.println("Chamada em andamento!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Sua chamada foi encaminhada para o correio de voz");
    }

}
