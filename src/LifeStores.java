import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by a on 06/02/17.
 */
public class LifeStores {

    public static void main(String[] args)

    {

        ArrayList<Product> listProducts = new ArrayList<Product>();

        BufferedReader file = new BufferedReader(new FileReader("Products.csv"));

        String line,name;
        float price;

        while ((line = file.readLine()) != null) {

            name = line.substring(0,line.indexOf(","));

            price = Float.parseFloat((line.substring(line.indexOf(",")+1,line.length())));

            listProducts.add(new Product(name,price));

        }

        file.close();

     catch (Exception e) {

        e.printStackTrace();

    }

    private String Pproduct;
     float Pprice¨;



        // le distributeur vend l'aquarius

        if(Distributor.Sell(Product.getName("aquarius") ))   System.out.println("Le distributeur a vendu l'aquarius");

        else                     System.out.println("Le distributeur n'a pas vendu l'aquarius");


    }







    }
}
