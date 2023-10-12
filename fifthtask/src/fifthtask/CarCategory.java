package fifthtask;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class CarCategory {
	
	public static void main(String[]args)
	{
		Car Car1 = new Car(7,"VW Passat", 2015,"grey",10000.75,"MK2076");
		Car Car2 = new Car(25,"Toyota Corolla", 2020,"grey",5300,"MK2999");
		Car Car3 = new Car(89,"Toyota Corolla", 2009,"black",2045.89,"RN5733");
		Car Car4 = new Car(66,"VW Passat", 2009,"white",26003,"HN4598");
		Car Car5 = new Car(8,"Chevrolet optra", 2009,"brown",1000,"KO9076");
		Car []Cars_array = {Car1,Car2,Car3,Car4,Car5};
		
		try
		{
		FileWriter myWriter = new FileWriter("Cars_list_brand.txt");
		FileWriter myWriter1 = new FileWriter("Cars_list_model.txt");
		FileWriter myWriter2 = new FileWriter("Cars_list_year.txt");
		FileWriter myWriter3 = new FileWriter("Cars_list_price.txt");
		for(int i=0;i<Array.getLength(Cars_array);i++)
		{
			if((Cars_array[i].Model).equals("VW Passat"))
			{
				myWriter.write("The id(s) of the car are "+ Cars_array[i].id);
				myWriter.write("\n");
			}
			if((Cars_array[i].Model).equals("Toyota Corolla") && (Math.subtractExact(2023, Cars_array[i].year)>=4))	
			{
				myWriter1.write("The id(s) of the car are "+ Cars_array[i].id);
				myWriter1.write("\n");
			}
			if((Cars_array[i].year)==2009)
			{
				myWriter2.write("The id(s) of the car are "+ Cars_array[i].id);
				myWriter2.write("\n");
			}
			if((Cars_array[i].year)==2009 && Cars_array[i].price>1000)
			{
				myWriter3.write("The id(s) of the car are "+ Cars_array[i].id);
				myWriter3.write("\n");
			}
			
		}
	      myWriter.close();
	      myWriter1.close();
	      myWriter2.close();
	      myWriter3.close();
		}
		catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
		
		
	}

}
