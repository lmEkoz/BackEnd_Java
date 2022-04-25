package semana2.hilos;

public class HilosT extends Thread{

    @Override//Runnable
    public void run() {
        System.out.println("El hilo se esta ejecutando");
    }

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); //Entra al state new
        hilo.start();

    }
}