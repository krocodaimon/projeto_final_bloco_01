package model.repository;

public class LivroTecnico extends Livro {
    private String area;

    public LivroTecnico(String titulo, String autor, String area) {
        super(titulo, autor);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área: " + area;
    }
}
