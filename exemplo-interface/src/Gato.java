public class Gato extends Mamifero {

    private String raca;

    public Gato(String raca) {this.raca = raca;}

    @Override
    public void alimentar(){}

    @Override
    public void respirar(){}

    @Override
    public void locomover(){}

    @Override
    public void amamentar(){}

    public String getRaca() {return raca;}

    public void setRaca(String raca) {this.raca = raca;}
}
