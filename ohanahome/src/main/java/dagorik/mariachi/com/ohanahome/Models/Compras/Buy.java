package dagorik.mariachi.com.ohanahome.Models.Compras;

import java.util.List;

/**
 * Created by Dagorik on 05/09/17.
 */

public class Buy {



    private List<Compra> compra;

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "compra=" + compra +
                '}';
    }
}
