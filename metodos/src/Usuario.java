public class Usuario {
    public static void main(String[] args) {
        
        SmartTv tvSala = new SmartTv();

        tvSala.diminuirVolume();
        tvSala.diminuirVolume();
        tvSala.aumentarVolume();


        System.out.println("Canal atual: " + tvSala.canal);

        tvSala.trocarCanal(5);

        System.out.println("Tv ligada? " + tvSala.ligada);
        System.out.println("Canal atual: " + tvSala.canal);
        System.out.println("Volume atual: " + tvSala.volume);

        tvSala.ligar();
        System.out.println("Tv ligada? " + tvSala.ligada);

        tvSala.desligar();
        System.out.println("Tv ligada? " + tvSala.ligada);
    }
}
