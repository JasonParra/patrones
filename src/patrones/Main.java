package patrones;

public class Main {

	
	public static void main(String[] args){
		
		System.out.println("Iphone ");
		Dispositivo iphone = new Iphone(new Camara10MPfoto(),new ConexionUSA(),600,"blanco");
		
		iphone.encender();
		iphone.ConexionCamaraFoto();
		iphone.ConexionCamaraVideo();
		iphone.Cargar();
		iphone.apagar();
		System.out.println("El precio del dispositivo es: "  + iphone.obtenerPrecio());
		System.out.println("El Color del dispositivo es: "  + iphone.obtenerColor());
		System.out.println();
		
		System.out.println("Samsung ");
		Dispositivo samsung = new Samsung(new Camara10MPvideo(),new ConexionEU(),500,"negro");
		
		samsung.encender();
		samsung.ConexionCamaraVideo();
		samsung.Cargar();
		samsung.apagar();
		System.out.println("El precio del dispositivo es: "  + samsung.obtenerPrecio());
		System.out.println("El color del dispositivo es: "  + samsung.obtenerColor());
		System.out.println();
		
		

		
	}
	
	
	
}
