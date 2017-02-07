import java.util.ArrayList;

/**
 * Created by a on 06/02/17.
 */
public class Distributor implements ConvenienceStore {

    private ArrayList<Product> Products = new ArrayList<>();

    @Override
    public Boolean Sell(Product product) {


        if(Products.contains(product)){

            Products.remove(product);

            return true;
        }else{

        return false;

        }

    }

    @Override
    public Boolean Filled(ArrayList<Product> Products) {

        if(Products.size() >= 5){
            return true;
        }else{
            return false;
        }
    }
}
