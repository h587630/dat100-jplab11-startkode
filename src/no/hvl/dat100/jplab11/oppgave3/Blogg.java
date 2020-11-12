package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteledig; // antallet innlegg du har
	

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}
	
	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		nesteledig= 0;
	}
//En metode public int getAntall() som returnerer antall innlegg-objekt som 
	//aktuelt er lagret i tabellen.
	public int getAntall() {
		return nesteledig;
	}
	
	//En metode public Innlegg[] getSamling() som returnerer en peker til
	//tabellen av innlegg-objekt.
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	
	
	public int finnInnlegg(Innlegg innlegg) {
		int Innlegg= 0;
		while (Innlegg < nesteledig) {
			if (innleggtabell[Innlegg].erLik(innlegg)) {
				return Innlegg;
			} else {
				Innlegg++;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		int Innlegg = finnInnlegg(innlegg);
		if (Innlegg >= 0) {
			return true;
		}
		return false;
	}
		

	public boolean ledigPlass() {
		if(innleggtabell.length > nesteledig) {
			return true;
		}
		return false;
		
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;
		if (ny && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}
	
	}
	
	public String toString() {
		String s = ""+nesteledig+"\n";
		for(Innlegg x : innleggtabell) {
			if(x!=null) {
				s+=x.toString();	
			}
			
		}
		return s;
	}

	// valgfrie oppgaver nedenfor
	
    public void utvid() {
	throw new UnsupportedOperationException(TODO.method());
  }

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}