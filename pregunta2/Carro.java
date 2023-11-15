package pregunta2;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    // Atributos
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String tipoCarro;
    private int anioFabricacion;
    private String modalidadSeguro;
    private String placa;

    // Constructor
    public Carro(String modelo, String color, boolean pinturaMetalizada,
            String tipoCarro, int anioFabricacion, String modalidadSeguro, String placa) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.tipoCarro = tipoCarro;
        this.anioFabricacion = anioFabricacion;
        this.modalidadSeguro = modalidadSeguro;
        this.placa = placa;
    }

    private static List<Carro> listaCarros = new ArrayList<>();

    public static List<Carro> getListaCarros() {
        return listaCarros;
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

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(String modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
