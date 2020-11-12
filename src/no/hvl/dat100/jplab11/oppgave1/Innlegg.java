package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	
	
	public Innlegg(int id, String bruker, String dato) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
	}
	
	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		
	}
	
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return dato;
		
		
	}

	public void setDato(String dato) {
		this.dato=dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	//Implementer metoden void doLike() som øker antall 
	//likes for innlegget med 1.
	public void doLike () {
		likes++;
	}
	//Implementer metoden public boolean erLik(Innlegg innlegg) som 
	//returnerer true hvis og kun hvis innlegget har samme id som 
	//innlegget innlegg git med som parameter.
	public boolean erLik(Innlegg innlegg) {
		if(innlegg.getId()==this.id )
			return true;
		else {
			return false;
		}

	}
	
	@Override
	public String toString() {
		return id + "\n" + bruker + "\n" + dato + "\n" + likes+"\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
