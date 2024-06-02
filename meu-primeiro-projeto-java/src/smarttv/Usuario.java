package smarttv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Novo Canal: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
