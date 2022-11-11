public class Profesor implements Human{
    private String nume;
    private String prenume;
    private String facultate;
    private Integer varsta;
    private String materie;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    @Override
    public String toString()
    {
        return "Prof. " + this.nume + " " + this.prenume + ", Fac. " +
                this.facultate + ", Varsta " + this.varsta + ", Materie predata- " + this.materie;
    }

    public Profesor(String nume, String prenume, String facultate, Integer varsta, String materie) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.materie = materie;
    }

    @Override
    public void doWork()
    {
        System.out.println("Prof. " + this.nume + " produce munca.\n");
    }

    @Override
    public void greeting()
    {
        System.out.println("Prof. " + this.nume + " te saluta.\n");
    }

    @Override
    public int compareTo(Human o) {
        return this.varsta.compareTo(o.getVarsta());
    }
}
