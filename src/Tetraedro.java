
    public class  Tetraedro extends Poliedro {


        public Tetraedro (double arista, long id)
        {
            super(id, arista);
        }

        public double calculaVolumen () {return (Math.sqrt(2) / 12) * (Math.pow(arista,3)) ;}

        @Override
        public String toString() {
            return "Tetraedro{" +
                    "id=" + id +
                    ", arista=" + arista +
                    "}";
        }

    }

