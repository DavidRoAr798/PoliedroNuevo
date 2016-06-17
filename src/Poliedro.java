public abstract class Poliedro {
    protected long id;
    private String color;
    protected double arista;

    public Poliedro(long id, String color, double arista) {
        this.id = id;
        this.color = color;
        this.arista = arista;
    }

    public Poliedro(long id, double arista) {
        this.id = id;
        this.color = "blue";
        this.arista= arista;
    }
    public long getId() {
        return id;
    }

    public abstract double calculaVolumen();


    }

