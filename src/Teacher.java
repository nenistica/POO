public class Teacher extends Person {
    //Atributos
    private String area;
    private String matter;

    //Metodo
    public void setArea (String area) {
        this.area = area;
    }
    public void setMatter (String matter) {
        this.matter = matter;
    }
    public String getArea () {return area;}
    public String getMatter () {return matter;}
}
