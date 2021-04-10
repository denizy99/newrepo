package proje1_yeşilMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YeşilMarket {
	
	public static List <String> ürünler = new ArrayList<>();  // Global
	public static List <Double> fiyatlar = new ArrayList<>();
	
	public static List <String> sepetÜrünler = new ArrayList<>();
	public static List <Double> sepetKg = new ArrayList<>();
	public static List <Double> sepetFiyatlar = new ArrayList<>();
	
		
	public static void main(String[] args) {
		
		/* Yeşil Market alış-veriş programı.
		 * 
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL 
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
					package day45_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class C1_LinkedList01 {
    public static void main(String[] args) {
        // linked bagli demektir
        // linked list'te tum elemanlarlar tren gibi birbirine baglidir
        
        // Collections'da obje olustururken 
        // olusturmak istedigimiz collection'in class mi yoksa interface'mi polduguna bakmaliyiz
        // Eger olusturmak istedigimiz collection interface ise
        // data turu olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz
        // Simdiye kadar List(interface) olustururken constructor olarak ArrayList() seciyorduk
        
        
        List<String> liste=new ArrayList<>();
        liste.add("X");
        liste.add("Y");//[X, Y]
        
        LinkedList<String> ll1=new LinkedList<>();
        
        ll1.add("A");
        ll1.add("B");
        System.out.println(ll1); // [A, B]
        ll1.add(1, "C");
        System.out.println(ll1); // [A, C, B]
        ll1.addAll(liste); //
        System.out.println(ll1); // [A, C, B, X, Y]
        
        ll1.addAll(2, liste);
        System.out.println(ll1); // [A, C, X, Y, B, X, Y]
        
        
        
        
        
        
    }
}
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
		 */
		Scanner scan = new Scanner(System.in);
		
		ürünler.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç",
				                     "Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
		
		
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));	
		String devam ;
		
		do {
			ürünListele();
			System.out.println("Ürününüzü numaraya göre seçiniz:");
			int ürünNo = scan.nextInt();
			System.out.println("Ağırlık giriniz:");
			double kg = scan.nextDouble();
			sepeteEkle(ürünNo, kg);
			sepeteYazdır();
			System.out.println("Alış verişe deam etmek istermisiniz:");
			devam = scan.next();
		}while(devam.equalsIgnoreCase("e"));
				
		
		
	}
	
	public static void ürünListele() {
		System.out.println("No\t Ürünler \tFiyatlar");
		System.out.println("===\t ======== \t========");
		
		for (int i = 0; i<ürünler.size(); i++) {
			System.out.println(" "+ i + "\t" + ürünler.get(i) + "\t \t   " + fiyatlar.get(i));
		}
	}
	
	public static void sepeteEkle(int ürünNo, double kg) {
		sepetÜrünler.add(ürünler.get(ürünNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(ürünNo) * kg);
	}
	
	public static void sepeteYazdır() {
		
		double fiyatToplamı = 0.0;
		double kgToplamı = 0.0;
		
		System.out.println("ürün adı \tKG \tFiyatı");
		System.out.println("=================================");
		for(int i=0 ; i < sepetÜrünler.size() ; i++ ) {
			System.out.println(sepetÜrünler.get(i) + "\t \t" + sepetKg.get(i) + "\t" + sepetFiyatlar.get(i));
			fiyatToplamı +=  sepetFiyatlar.get(i);
			kgToplamı += sepetKg.get(i);
		}
		
		System.out.println("=================================");
		System.out.println("\t TOPLAM:" + kgToplamı + "\t" + fiyatToplamı);
	}
	
	
	
	
	
	

}