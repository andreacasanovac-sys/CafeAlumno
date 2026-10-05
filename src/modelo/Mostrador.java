package modelo;

public class Mostrador {
    
    public Mostrador(){}
    public int hacerPago(Articulo precio, Alumno ptsDisp){
        if(ptsDisp.getPuntos() < precio.getPrecio()){
            System.err.println("Fondos insuficientes. No es posible realizar la transacción");
            return -1;
        }
        int saldoFinal = ptsDisp.getPuntos() - precio.getPrecio();
        ptsDisp.setPuntos(saldoFinal);
        return saldoFinal;
    }
}
