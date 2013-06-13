import java.util.Random;


public class TareaImprimir  implements Runnable{

	
	private final int tiempoInactividad;
	private final String nombreTarea;
	private final static Random generador=new Random();
	
	public TareaImprimir(String nombre){
		nombreTarea=nombre;
		tiempoInactividad=generador.nextInt(5000);
	}
	
	@Override
	public void run() {
		try {
			System.out.printf("\n%s va a estar inanctivo durante %d milisegundos /n",nombreTarea,tiempoInactividad);
			Thread.sleep(tiempoInactividad);
		} catch (InterruptedException e) {
			System.out.printf(" %s %s\n",nombreTarea,"Termino en forma prematura, debido a la interrupcion");
		}
		
		System.out.printf("\n%s termino su inactividada\n",nombreTarea);
	}

}
