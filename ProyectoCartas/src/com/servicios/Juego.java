package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	// Atributos
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	public Juego(ArrayList<String> arrayList) {
		this.naipe = new Naipe();
		this.cartasJugadores = new ArrayList<>();
		this.naipeBarajado = naipe.barajar(); // Barajar el naipe y guardar el resultado

		for (int i = 0; i < arrayList.size(); i++) {
			ArrayList<Carta> cartasParaJugador = new ArrayList<>();
			cartasJugadores.add(cartasParaJugador);
		}
	}

	// Metogo get para cartasJugadores
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int cartasEntregadas = 0;

		while (cartasEntregadas < cartasPorJugador) {
			for (int i = 0; i < cartasJugadores.size(); i++) {
				if (cartasEntregadas < naipeBarajado.size()) {
					Carta carta = naipeBarajado.get(cartasEntregadas);
					cartasJugadores.get(i).add(carta);
					cartasEntregadas++;
				}
			}
		}
	}

	public int devolverTotal(String idJugador) {
		int total = 0;
		// Buscar el índice del jugador correspondiente al id
		int jugadorIndex = -1;
		for (int i = 0; i < cartasJugadores.size(); i++) {
			if (("jugador " + (i + 1)).equals(idJugador)) {
				jugadorIndex = i;
				break;
			}
		}

		if (jugadorIndex != -1) {
			ArrayList<Carta> cartas = cartasJugadores.get(jugadorIndex);
			for (int j = 0; j < cartas.size(); j++) {
				Carta carta = cartas.get(j);
				total += carta.getNumero().getValor();
			}
		}

		return total;
	}

	public String determinarGanador() {
		String idGanador = "";
		int sumaGanador = -1;

		for (int i = 0; i < cartasJugadores.size(); i++) {
			int sumaJugador = devolverTotal("jugador " + (i + 1));
			if (sumaJugador >= sumaGanador) {
				sumaGanador = sumaJugador;
				idGanador = "jugador " + (i + 1);
			}
		}

		return idGanador;
	}

}
