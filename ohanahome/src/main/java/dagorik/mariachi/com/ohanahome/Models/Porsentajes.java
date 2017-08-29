package dagorik.mariachi.com.ohanahome.Models;

public class Porsentajes {
    private String name;
    private int porsent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPorsent() {
        return porsent;
    }

    public void setPorsent(int porsent) {
        this.porsent = porsent;
    }

    @Override
    public String toString() {
        return "Porsentajes{" +
                "name='" + name + '\'' +
                ", porsent=" + porsent +
                '}';
    }
}
