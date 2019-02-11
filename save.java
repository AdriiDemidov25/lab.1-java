package automat_save;

public class save{ 
//Створити клас “Автомат електрозахисту” котрий містить поля:
		//- максимальна потужність, кВт 
		//- нижній рівень виключення, Вольт
		//- колір


String color;
String max_paver;
String min_off; 
private String kilkist_tumb;
private String name;
protected String kupleno;
protected String max_kilkist;
static int quantity_sold=0;

public save () {
	quantity_sold++;
}

 String getKilkist_tumb() {
	return kilkist_tumb;
}

 void setKilkist_tumb(String kilkist_tumb) {
	this.kilkist_tumb = kilkist_tumb;
}

 String getName() {
	return name;
}
 void setName(String name) {
	this.name = name;
}
 public save(String color,String max_paver,String min_off , String kilkist_tumb ) {
	 this.color = color;
	 this.max_paver = max_paver;
	 this.min_off = min_off;
	 this.kilkist_tumb = kilkist_tumb;
}
public save (String color, String max_paver, String min_off, String kilkist_tumb, String name, String kupleno, String max_kilkist) {
	this(color,max_paver,min_off, kilkist_tumb);
	this.name = name;
	this.kupleno = kupleno;
	this.max_kilkist = max_kilkist;
	}
public static void printStaticQuantity_sold() {
	System.out.println(quantity_sold + "куплено ETI KZS-2M");
}
public String toString (){
	 String information = "\nInformation about machine:\n";
	 information += "color"+ color + "/n";
	 information += "max_paver"+ max_paver + "/n";
	 information += "min_off"+ min_off + "/n";
	 information += "kilkist_tumb"+ kilkist_tumb + "/n";
	 information += "name"+ name + "/n";
	 information += "kupleno"+ kupleno + "/n";
	 information += "max_kilkist"+ max_kilkist + "/n";
	 return information;
}
public void resetValues (String color,String max_paver,String min_off,String kilkist_tumb,String name,String kupleno,String max_kilkist) {
this.color = color;
this.max_paver = max_paver;
this.min_off = min_off;
this.kilkist_tumb = kilkist_tumb;
this.name = name;
this.kupleno = kupleno;
this.max_kilkist = max_kilkist;
}
}
