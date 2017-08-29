package dagorik.mariachi.com.ohanahome.Models;

import java.util.List;

/**
 * Created by Dagorik on 28/08/17.
 */

public class Porcentaje {


    private String name;
    private List<Porsentajes> porsentajes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Porsentajes> getPorsentajes() {
        return porsentajes;
    }

    public void setPorsentajes(List<Porsentajes> porsentajes) {
        this.porsentajes = porsentajes;
    }

    @Override
    public String toString() {
        return "Porcentaje{" +
                "name='" + name + '\'' +
                ", porsentajes=" + porsentajes +
                '}';
    }
}
