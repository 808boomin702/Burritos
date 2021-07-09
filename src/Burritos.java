import java.util.Random;

public class Burritos
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        //Get INGREDIENTS
        String[] Rice = {"White", "Brown", "None", "All"};
        String[] Meat = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggie", "None", "All"};
        String[] Beans = {"Pinto", "Black", "None", "All"};
        String[] Salsa = {"Mild", "Medium", "Hot", "None", "All"};
        String[] Veggies = {"Lettuce", "Fajita", "None", "All"};
        String[] Cheese = {"Yes", "No"};
        String[] Guac = {"Yes", "No"};
        String[] Queso = {"Yes", "No"};
        String[] SourCream = {"Yes", "No"};

        //SAVE INGREDIENTS FOR BURRITOS
        int[][] Burritos = new int[25][9];
        //SAVE PRICE FOR BURRITOS
        double[] Price = new double[25];

        //BURRITOS ARRAY
        for(int row=0;row<25;row++)
        {
            Burritos[row][0] = 2;
            Burritos[row][1] = 6;
            Burritos[row][2] = 2;
            Burritos[row][3] = 3;
            Burritos[row][4] = 2;
            Burritos[row][5] = 1;
            Burritos[row][6] = 1;
            Burritos[row][7] = 1;
            Burritos[row][8] = 1;
        }

        //PRICE
        for(int row=0;row<25;row++)
            Price[row]=0.00;

        //lOOP FOR ALL BURRITOS
        int ingd_cntr = 0;
        double price = 3.00;
        for(int burr_cntr=0; burr_cntr<25; burr_cntr++)
        {
            // random number generator
            int total_ingd = rand.nextInt(5)+5;
            // Initializing a counter for ingredients
            ingd_cntr = 0;
            price = 3.00;

            // rice
            int choice_rice = rand.nextInt(Rice.length);
            Burritos[burr_cntr][0] = choice_rice;
            if(!"None".equals(Rice[choice_rice]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // meat
            int choice_meat = rand.nextInt(Meat.length);
            Burritos[burr_cntr][1] = choice_meat;
            if(!"None".equals(Meat[choice_meat]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // beans
            int choice_beans = rand.nextInt(Beans.length);
            Burritos[burr_cntr][2] = choice_beans;
            if(!"None".equals(Beans[choice_beans]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // salsa
            int choice_salsa = rand.nextInt(Salsa.length);
            Burritos[burr_cntr][3] = choice_salsa;
            if(!"None".equals(Salsa[choice_salsa]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // veggies
            int choice_veggies = rand.nextInt(Veggies.length);
            Burritos[burr_cntr][4] = choice_veggies;
            if(!"None".equals(Veggies[choice_veggies]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // cheese
            int choice_cheese = rand.nextInt(Cheese.length);
            Burritos[burr_cntr][5] = choice_cheese;
            if(!"No".equals(Cheese[choice_cheese]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // guac
            int choice_guac = rand.nextInt(Guac.length);
            Burritos[burr_cntr][6] = choice_guac;
            if(!"No".equals(Guac[choice_guac]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // queso
            int choice_queso = rand.nextInt(Queso.length);
            Burritos[burr_cntr][7] = choice_queso;
            if(!"No".equals(Queso[choice_queso]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            // sour cream
            int choice_cream = rand.nextInt(SourCream.length);
            Burritos[burr_cntr][8] = choice_cream;
            if(!"No".equals(SourCream[choice_cream]))
            {
                price += 0.50;
                ingd_cntr++;
            }

            Price[burr_cntr] = price;
        }

        int tmp_indx=0;
        //PRINT ALL 25 BURRITOS
        for(int burr_cntr=0; burr_cntr<25; burr_cntr++)
        {
            System.out.println("Burrito #" + (burr_cntr+1) + " (Price: $" + Price[burr_cntr] + ")");

            tmp_indx = Burritos[burr_cntr][0];
            System.out.print("\tRice: " + Rice[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][1];
            System.out.print("\tMeat: " + Meat[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][2];
            System.out.print("\tBeans: " + Beans[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][3];
            System.out.print("\tSalsa: " + Salsa[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][4];
            System.out.println("\tVeggies: " + Veggies[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][5];
            System.out.print("\tCheese: " + Cheese[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][6];
            System.out.print("\tGuac: " + Guac[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][7];
            System.out.print("\tQueso: " + Queso[tmp_indx]);
            tmp_indx = Burritos[burr_cntr][8];
            System.out.println("\tSour Cream: " + SourCream[tmp_indx]);
        }

    }
}

