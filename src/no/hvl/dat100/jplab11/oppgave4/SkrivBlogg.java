package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
           PrintWriter skriver = new PrintWriter(mappe+ filnavn);
           skriver.write(samling.toString());
           skriver.close();
           return true;
           
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

		}
           
//           if(!skriver.exists()) {
//   			skriver.createNewFile();
//   			skriver.close();
//   			return true;
   			
