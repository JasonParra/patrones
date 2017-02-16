package patrones;

public class Iphone extends Dispositivo{
	
	private CamaraFoto camara;
	private Conexion conexion;
	private int precio;
	private String color;
	
	
	public Iphone(CamaraFoto _camara, Conexion _conexion, int _precio, String _color){
		
		this.camara = _camara;
		this.conexion = _conexion;
		this.setPrecio(_precio);
		this.setColor(_color);		
		
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El Dispositivo  se ha encendido. ");
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("El Dispositivo se ha apagado. ");
		
	}

	@Override
	public void ConexionCamaraFoto() {
		// TODO Auto-generated method stub
		
		camara.tirarFoto();
		Disco.guardandoFoto();
		
	}

	@Override
	public void ConexionCamaraVideo() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void Cargar() {
		// TODO Auto-generated method stub
		conexion.cargar();
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int obtenerPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	public String obtenerColor() {
		// TODO Auto-generated method stub
		return this.color;
	}






}
