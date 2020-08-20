
package Logica;

public class Nodo 
{
    private Nodo HI;
    private Value Data;
    private Nodo HD;
    
    public Nodo()
    {
        Data = new Value();
        HI = null;
        HD = null;
    }
    public Nodo( Value dat)
    {
        this.Data = dat;
        //this.Data.setValor(dat.getValor());
        //this.Data.setOperador(dat.getOperator());
        this.HI = null;
        this.HD = null;
    }
    
    public Nodo(Nodo Hisq, Value dat, Nodo Hder)
    {
        this.Data.setValor(dat.getValor());
        this.Data.setOperador(dat.getOperator());
        this.HI = Hisq;
        this.HD = Hder;
    }
    
    public void setData(Value dat)
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
    
    public Value getData()
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
