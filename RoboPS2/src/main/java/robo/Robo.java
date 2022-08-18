package robo;

public class Robo implements Controle {
    @Override
    public void Andar() {
        System.out.println("O Robô está caminhando!");
    }


    @Override
    public void Virar() {
        System.out.println("O Robô está mudando a direção!");
    }


    @Override
    public void Falar() {
        System.out.println("O Robô está falando!");
    }
}
