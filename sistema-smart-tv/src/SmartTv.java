public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

// LIGAR|DESLIGAR TV 
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

// AUMENTAR|DIMINUIR VOLUME 
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volme para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volme para: " + volume);
    }

// MUDAR DE CANAL  
    public void aumentarCanal(){
        volume ++;
    }

    public void diminuirCanal(){
        volume --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}