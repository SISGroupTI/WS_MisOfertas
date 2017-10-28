
package Entity;

public class OfertaBI {
    private String nombre_empresa;
    private int numero_empresa;
    private int numero_local;
    private String rubro;
    private String producto;
    private int id_oferta;
    private String titulo_oferta;
    private int precio_oferta;
    private String fecha_creacion;
    private String fecha_publicacion;
    private String fecha_finalizacion;
    private int cant_valoraciones_negativas;
    private int cant_valoraciones_medias;
    private int cant_valoraciones_positivas;
    private int cant_valoraciones_total;
    private int cant_visitas;

    public OfertaBI() {
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getNumero_empresa() {
        return numero_empresa;
    }

    public void setNumero_empresa(int numero_empresa) {
        this.numero_empresa = numero_empresa;
    }

    public int getNumero_local() {
        return numero_local;
    }

    public void setNumero_local(int numero_local) {
        this.numero_local = numero_local;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public String getTitulo_oferta() {
        return titulo_oferta;
    }

    public void setTitulo_oferta(String titulo_oferta) {
        this.titulo_oferta = titulo_oferta;
    }

    public int getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(int precio_oferta) {
        this.precio_oferta = precio_oferta;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(String fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

   

    public int getCant_valoraciones_negativas() {
        return cant_valoraciones_negativas;
    }

    public void setCant_valoraciones_negativas(int cant_valoraciones_negativas) {
        this.cant_valoraciones_negativas = cant_valoraciones_negativas;
    }

    public int getCant_valoraciones_medias() {
        return cant_valoraciones_medias;
    }

    public void setCant_valoraciones_medias(int cant_valoraciones_medias) {
        this.cant_valoraciones_medias = cant_valoraciones_medias;
    }

    public int getCant_valoraciones_positivas() {
        return cant_valoraciones_positivas;
    }

    public void setCant_valoraciones_positivas(int cant_valoraciones_positivas) {
        this.cant_valoraciones_positivas = cant_valoraciones_positivas;
    }

    public int getCant_valoraciones_total() {
        return cant_valoraciones_total;
    }

    public void setCant_valoraciones_total(int cant_valoraciones_total) {
        this.cant_valoraciones_total = cant_valoraciones_total;
    }

    public int getCant_visitas() {
        return cant_visitas;
    }

    public void setCant_visitas(int cant_visitas) {
        this.cant_visitas = cant_visitas;
    }

    @Override
    public String toString() {
        return "OfertaBI{" + "nombre_empresa=" + nombre_empresa + ", numero_empresa=" + numero_empresa + ", numero_local=" + numero_local + ", rubro=" + rubro + ", producto=" + producto + ", id_oferta=" + id_oferta + ", titulo_oferta=" + titulo_oferta + ", precio_oferta=" + precio_oferta + ", fecha_creacion=" + fecha_creacion + ", fecha_publicacion=" + fecha_publicacion + ", fecha_finalizacion=" + fecha_finalizacion + ", cant_valoraciones_negativas=" + cant_valoraciones_negativas + ", cant_valoraciones_medias=" + cant_valoraciones_medias + ", cant_valoraciones_positivas=" + cant_valoraciones_positivas + ", cant_valoraciones_total=" + cant_valoraciones_total + ", cant_visitas=" + cant_visitas + '}';
    }
    

    
    
}
