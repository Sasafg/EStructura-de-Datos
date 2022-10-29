package semana7.semana7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
	lista Lista1 = new lista();
        Lista1.insertar(new persona(1,"P"));
        Lista1.insertar(new persona(2,"P"));
        Lista1.insertar(new persona(3,"P"));
        Lista1.insertar(new persona(4,"P"));
        Lista1.imprimirLista();
            
            
	}

}
