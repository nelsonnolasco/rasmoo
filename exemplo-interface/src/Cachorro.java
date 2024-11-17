public class Cachorro extends Mamifero implements Estimacao, Domestico {

    private String raca;
    private String porte;

    public Cachorro(String raca) {this.raca = raca;}

    public Cachorro(String raca, String porte) {
        this.raca = raca;
        this.porte = porte;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void respirar() {

    }

    @Override
    public void locomover() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void passear() {

    }

    @Override
    public void cuidar() {

    }

    public String getRaca() {return raca;}

    public void setRaca(String raca) {this.raca = raca;}

    public String getPorte() {return porte;}

    public void setPorte(String porte) {this.porte = porte;}

}
