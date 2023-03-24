package ss16_io_text.doc_file;

public class NationClass {
    private int id;
    private String tenTat;
    private String name;

    public NationClass() {
    }

    public NationClass(int id, String tenTat, String name) {
        this.id = id;
        this.tenTat = tenTat;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTat() {
        return tenTat;
    }

    public void setTenTat(String tenTat) {
        this.tenTat = tenTat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NationClass{" +
                "id=" + id +
                ", tenTat='" + tenTat + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String getInfoToCsv() {
        return id + "," + tenTat + "," + name;
    }
}
