public class Conta {
    
    int agencia;
    int numero;
    Cliente titular;
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }
    boolean sacar (double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    void transferir (Conta destino, double valor){
        boolean conseguiuSacar = this.sacar(valor);
        if(conseguiuSacar){
            destino.depositar(valor);
        }

    }

    

}
