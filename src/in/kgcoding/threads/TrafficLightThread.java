package src.in.kgcoding.threads;

public class TrafficLightThread extends Thread{

    private final TrafficColor color;


    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n",color);
        try {
            Thread.sleep(color.getOntimeInMil());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is inactive\n", color);
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);
        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();
    }
}
