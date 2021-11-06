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
} 
