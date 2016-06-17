
public class Octaedro extends Poliedro {


    public Octaedro (double arista, long id)
    {
        super(id, arista);
    }

    public double calculaVolumen () {return (Math.sqrt(2) / 3) * (Math.pow(arista,3)) ;}

    @Override
    public String toString() {
        return "Octaedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }

}

