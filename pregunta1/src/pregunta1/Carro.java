package pregunta1;

public class Carro {

    // Atributos
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String tipoCarro;
    private int añoFabricacion;
    private String modalidadSeguro;

    // Constructor
    public Carro(String modelo, String color, boolean pinturaMetalizada,
            String tipoCarro, int añoFabricacion, String modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.tipoCarro = tipoCarro;
        this.añoFabricacion = añoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    // Métodos getter y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(String modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }
}
