package it.polito.tdp.Libretto_voti.model;

import java.util.ArrayList;
import java.util.List;
public class libretto {
 private List<voto> voti;
 
 public libretto()
 {
	 this.voti=new ArrayList<voto>();
 }
 public void add(voto v)
 {
	 this.voti.add(v);
 }
 public String toString()
 {
	 String s="";
	 for(voto v : voti)
	 {
		 s+=v.toString()+"\n";
	 }
	 return s;
 }
 
// public void votiuguali1(int punteggio)
// {
////	 voti buttati in console, INUTILE se voglio usare interfaccia 
// }
// public String votiuguali2(int punteggio)
// {
//	return null;
////	 una volta sputata la stringa non posso piu gestire ordine
// }
// 
 public List<voto> votiuguali(int punteggio)
 {
//	 restituisce voti in modo ordinato ma mostro all'esterno 
//	 la struttura interna che potrebbe variare nel tempo
	List<voto> ris=new ArrayList<>();
	for(voto v:this.voti)
	{
		if(v.getVoto()==punteggio)
		{
			ris.add(v);
		}
	}
	 return ris;
 }
 
 public libretto votiUguali(int punteggio)
 {
	libretto lib=new libretto();
	for(voto v : this.voti)
	{
		if(v.getVoto()==punteggio)
		{
			lib.add(v);
		}
	}	
	return lib; 
 }
 


} 
