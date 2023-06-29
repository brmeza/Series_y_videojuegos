public class Videojuego implements Entregable{
    private String titulo;
    private  int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    private static final int HORAS_ESTIMADAS_PD=10;
    private static final boolean ENTREGADO_PD=false;


    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas=HORAS_ESTIMADAS_PD;
        this.entregado = ENTREGADO_PD;
        this.genero = "";
        this.compania = "";

    }

    public Videojuego(java.lang.String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO_PD;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(java.lang.String titulo, int horasEstimadas, java.lang.String genero, java.lang.String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public java.lang.String getGenero() {
        return genero;
    }

    public java.lang.String getCompania() {
        return compania;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }

    public void setCompania(java.lang.String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
    this.entregado=false;
    }

    @Override
    public boolean isEntegado() {
        if (this.entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}
