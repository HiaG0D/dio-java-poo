public class MusicPlayer {
    private String musicname;
    private int volume;
    private boolean tocando = false;
    
    public MusicPlayer(String musicname){
        this.musicname=musicname;
        volume = 20;
    }

    public void tocar(){
        System.out.println("A musica " + musicname + " está tocando agora no volume " + volume);
        tocando=true;
    }

    public void pausar(){
        System.out.println(" A musica " + musicname + " foi pausada");
        tocando=false;
    }

    public void selecionarMusica(String musica){
        musicname=musica;
        System.out.println("Música " +musica+ " foi selecionada");
        volume=20;
    }


}
