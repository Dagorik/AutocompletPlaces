package dagorik.mariachi.com.ohanahome.Models.Compras;

public class Compra {
    private String name;
    private String description;
    private String person;
    private String check;
    private String total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", person='" + person + '\'' +
                ", check='" + check + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
