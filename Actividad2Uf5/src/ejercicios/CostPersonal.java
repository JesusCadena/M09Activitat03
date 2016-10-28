package ejercicios;

import java.util.Collection;

public class CostPersonal extends Treballador{

	static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		
		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			
			if (treballador.getTipusTreballador() == Treballador.DIRECTOR||treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal = costFinal + treballador.getNomina();
			} else {
				costFinal = costFinal + treballador.getNomina() + (treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}
}