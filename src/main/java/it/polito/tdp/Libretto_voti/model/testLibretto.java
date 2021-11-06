package it.polito.tdp.Libretto_voti.model;

import java.time.LocalDate;

public class testLibretto {

	public static void main (String[] args)
	{
	libretto libretto=new libretto ();
    voto voto1=new voto("Analisi 1", 30 ,LocalDate.of(2019, 2, 18));
     libretto.add(voto1);
     libretto.add(new voto("Analisi 2", 30 ,LocalDate.of(2019, 2, 18)));
     libretto.add(new voto("Analisi 3", 30 ,LocalDate.of(2019, 2, 18)));
     String s=libretto.toString();
     System.out.println(s);
	}
}
