package bastracto.domain;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipofigura){
        this.tipoFigura = tipofigura;
    }

    //La clase padre no define el comportamiento
    public abstract void dibujar();

    public String getTipoFigua() {
        return this.tipoFigura;
    }

    public void setTipoFigua(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String  toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
