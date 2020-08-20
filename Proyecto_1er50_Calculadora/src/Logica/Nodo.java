
package Logica;

public class Nodo 
{
    private Nodo HI;
    private Valor Data;
    private Nodo HD;
    
    public Nodo()
    {
        Data = new Valor();
        HI = null;
        HD = null;
    }
    public Nodo( Valor dat)
    {
        this.Data = dat;
        //this.Data.setValor(dat.getValor());
        //this.Data.setOperador(dat.getOperator());
        this.HI = null;
        this.HD = null;
    }
    
    public Nodo(Nodo Hisq, Valor dat, Nodo Hder)
    {
        this.Data.setValor(dat.getValor());
        this.Data.setOperador(dat.getOperator());
        this.HI = Hisq;
        this.HD = Hder;
    }
    
    public void setData(Valor dat)
    {
        this.Data.setValor(dat.getValor());
        this.Data.setOperador(dat.getOperator());
    }
    
    public void setHI(Nodo Hisq)
    {
        this.HI = Hisq;
    }
    
    public void setHD(Nodo Hder)
    {
        this.HD = Hder;
    }
    
    public Valor getData()
    {
        return this.Data;
    }
    
    public Nodo getHI()
    {
        return this.HI;
    }
    
    public Nodo getHD()
    {
        return this.HD;
    }
    
}
