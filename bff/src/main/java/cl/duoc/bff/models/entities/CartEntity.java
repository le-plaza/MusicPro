package cl.duoc.bff.models.entities;

public class CartEntity {
    
    private int idCarrito;
    private int idUsuario;
    private int idInstrumento;
    private String nombreInstrumento;
    private int precioInstrumento;

    public CartEntity() {

    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(int idInstrumento) {
        this.idInstrumento = idInstrumento;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public int getPrecioInstrumento() {
        return precioInstrumento;
    }

    public void setPrecioInstrumento(int precioInstrumento) {
        this.precioInstrumento = precioInstrumento;
    }
}
