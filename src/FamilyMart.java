import java.util.ArrayList;

/**
 * Created by a on 06/02/17.
 */
public class FamilyMart implements ConvenienceStore
{
    private ArrayList<Product> Products = new ArrayList<>();
    private int NumEmp;


    @Override
    public Boolean Sell(Product product) {


        if(Products.contains(product) && NumEmp > 0){

            Products.remove(product);

            return true;
        }else{

            return false;

        }

    }


    public Boolean Filled(ArrayList<Product> Products) {

        if(Products.size() >= 2){
            return true;
        }else{
            return false;
        }
    }
}
