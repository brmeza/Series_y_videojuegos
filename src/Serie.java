public class Serie implements Entregable{
    private String titulo;
    private int num_temporada;
    private boolean entregado;
    private String genero;
    private String creador;

    private static final int NUM_TEMP_PD=3;
    private static final boolean ENTREGADO_PD=false;

    public Serie() {
        this.titulo = "";
        this.num_temporada = NUM_TEMP_PD;
        this.entregado = ENTREGADO_PD;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.num_temporada = num_temporada;
        this.entregado = ENTREGADO_PD;
        this.genero = genero;
    }

    public Serie(java.lang.String titulo, int num_temporada, String genero, java.lang.String creador) {
        this.titulo = titulo;
        this.num_temporada = num_temporada;
        this.genero = genero;
        this.creador = creador;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public int getNum_temporada() {
        return num_temporada;
    }

    public void setNum_temporada(int num_temporada) {
        this.num_temporada = num_temporada;
    }

    public java.lang.String getGenero() {
        return genero;
    }

    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
