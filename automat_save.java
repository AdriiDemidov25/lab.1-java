package automat_save;

public class automat_save {

	public static void main(String[] args) {

		
			save ETI = new save();
			ETI.color = "Колір - чорний";
			ETI.max_paver = "Mаксимальна потужність - 300";
			ETI.min_off = "нижній рівень виключення - 150" ;
			ETI.setKilkist_tumb("Кількість тумблерів - два");
			ETI.setName("ім'я - ETI KZS-2M");
			ETI.kupleno = "куплено - 1";
			ETI.max_kilkist = "на складі - 5";
			save.printStaticQuantity_sold();
			System.out.println(ETI.color);
			System.out.println(ETI.max_paver);
			System.out.println(ETI.min_off);
			System.out.println(ETI.getKilkist_tumb());
			System.out.println(ETI.getName());
			System.out.println(ETI.kupleno );
			System.out.println(ETI.max_kilkist);
			System.out.println("");
			
			save PIPIB = new save();
			PIPIB.color = "Колір - чорний";
			PIPIB.max_paver = "Mаксимальна потужність - 300";
			PIPIB.min_off = "нижній рівень виключення - 150" ;
			PIPIB.setKilkist_tumb("Кількість тумблерів - два");
			PIPIB.setName("ім'я - PIPIB KZS-2M");
			PIPIB.kupleno = "куплено - 1";
			PIPIB.max_kilkist = "на складі - 5";
			save.printStaticQuantity_sold();
			System.out.println(PIPIB.color);
			System.out.println(PIPIB.max_paver);
			System.out.println(PIPIB.min_off);
			System.out.println(PIPIB.getKilkist_tumb());
			System.out.println(PIPIB.getName());
			System.out.println(PIPIB.kupleno );
			System.out.println(PIPIB.max_kilkist);
			System.out.println("");
			
			save CCD = new save();
			CCD.color = "Колір - чорний";
			CCD.max_paver = "Mаксимальна потужність - 300";
			CCD.min_off = "нижній рівень виключення - 150" ;
			CCD.setKilkist_tumb("Кількість тумблерів - два");
			CCD.setName("ім'я - CCD KZS-2M");
			CCD.kupleno = "куплено - 1";
			CCD.max_kilkist = "на складі - 5";
			save.printStaticQuantity_sold();
			System.out.println(CCD.color);
			System.out.println(CCD.max_paver);
			System.out.println(CCD.min_off);
			System.out.println(CCD.getKilkist_tumb());
			System.out.println(CCD.getName());
			System.out.println(CCD.kupleno );
			System.out.println(CCD.max_kilkist);
	}
	}