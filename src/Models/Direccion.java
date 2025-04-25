package Models;

public class Direccion {
    private String Calle;
    private int NumeroDeCalle;
    private int codigo;
    public Direccion(String calle, int numeroDeCalle, int codigo) {
        Calle = calle;
        NumeroDeCalle = numeroDeCalle;
        this.codigo = codigo;
    }
    public String getCalle() {
        return Calle;
    }
    public void setCalle(String calle) {
        Calle = calle;
    }
    public int getNumeroDeCalle() {
        return NumeroDeCalle;
    }
    public void setNumeroDeCalle(int numeroDeCalle) {
        NumeroDeCalle = numeroDeCalle;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Calle+   " "+NumeroDeCalle+" "+codigo;
    }
    
}
