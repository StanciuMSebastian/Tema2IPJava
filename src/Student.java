public class Student implements Human{
    private String nume;
    private String prenume;
    private String facultate;
    private Integer varsta;
    private Integer an_studiu;

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

    public Integer getAn_studiu() {
        return an_studiu;
    }

    public void setAn_studiu(Integer an_studiu) {
        this.an_studiu = an_studiu;
    }

    @Override
    public String toString()
    {
        return "Sd. " + this.nume + " " + this.prenume + ", Anul " + this.an_studiu + ", Fac. " +
                this.facultate + ", Varsta " + this.varsta;
    }

    public Student(String nume, String prenume, String facultate, Integer varsta, Integer an_studiu) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.an_studiu = an_studiu;
    }

    @Override
    public void doWork()
    {
        System.out.println("Studentul " + this.nume + " produce munca.\n");
    }

    @Override
    public void greeting()
    {
        System.out.println("Studentul " + this.nume + " te saluta.\n");
    }

    @Override
    public int compareTo(Human o) {
        return this.varsta.compareTo(o.getVarsta());
    }
}
