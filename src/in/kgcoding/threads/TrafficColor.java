package src.in.kgcoding.threads;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private int ontimeInMil;

    TrafficColor(int ontimeInMil) {
        this.ontimeInMil = ontimeInMil;
    }

    public int getOntimeInMil() {
        return ontimeInMil;
    }
}
