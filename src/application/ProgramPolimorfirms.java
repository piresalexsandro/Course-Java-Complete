package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.ImportedProduct;
import br.com.udemy.entities.ProductPolimorfism;
import br.com.udemy.entities.UsedProduct;

public class ProgramPolimorfirms {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<ProductPolimorfism> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println("Product #" + i +  " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new ProductPolimorfism(name, price));
			} else {
				if (type == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date data  = sdf.parse(sc.next()); //formata a data digitada para o formato declarado SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					list.add(new UsedProduct(name, price, data));
				}else {
					if (type == 'i') {
						System.out.print("Customs fee: ");
						double customFree = sc.nextDouble();
						list.add(new ImportedProduct(name, price, customFree));
					}
				}
			}
		}
		
		System.out.println();
		for (ProductPolimorfism pp : list) {
			System.out.println(pp.priceTag());
		}
		
		sc.close();
	}

}
