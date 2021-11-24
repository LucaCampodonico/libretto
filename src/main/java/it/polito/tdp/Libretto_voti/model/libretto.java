package it.polito.tdp.Libretto_voti.model;


import java.util.*;
public class libretto {
 private List<voto> voti;
 private Map<String, voto> votimap;
 
 public libretto()
 {
	 this.voti=new ArrayList<voto>();
	 this.votimap=new HashMap<>();
 }
 public void add(voto v)
 {
	 this.voti.add(v);
	 this.votimap.put(v.getNome(), v);
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
 
 public boolean isduplicato(voto v)
 { 
	 
//	 for(voto a: this.voti)
//	 {
//		 if(a.getNome().equals(v.getNome()) && a.getVoto()==v.getVoto())
//		 {
//			 return true;
//		 }
//	 }
//	 return false;
	 voto trovato=this.votimap.get(v.getNome());
	 if(trovato==null)
		 return false;
	if(trovato.getVoto()==v.getVoto())
		return true;
	else 
		return false;
 }
 
 
 public boolean existConfict(voto v)
 {
//	 for(voto a: this.voti)
//	 {
//		 if(a.getNome().equals(v.getNome()) && a.getVoto()!=v.getVoto())
//		 {
//			 return true;
//		 }
//	 }
//	 return false;
	 voto trovato=this.votimap.get(v.getNome());
	 if(trovato==null)
		 return false;
	if(trovato.getVoto()!=v.getVoto())
		return true;
	else 
		return false;
 }
 
 public voto ricercacorso(String nomecorso)
 {
//	 voto ris=null;
//	 for(voto v: this.voti)
//	 {
////		 if(v.getNome().compareTo(nomecorso)==0) MENO CORRETTO DATO CHE GLI OGGETTI POSSONO ESSERE NON ORDINABILI
//		 if(v.getNome().equals(nomecorso))
//		 {
//			 ris = v;
//		 }
//	 }
//	 return ris;
	 return this.votimap.get(nomecorso);
 }

} 
