package it.polito.tdp.Libretto_voti.model;

import java.time.LocalDate;

/**
 * contiene il voto,il nome e la data di un esame
 * @param nome Nome studente 
 * @author lucacampodonico
 *
 */
public class voto {
 private String nome;
 private int voto;
 private LocalDate data;
public String getNome() {
	return nome;
}
public int getVoto() {
	return voto;
}
public LocalDate getData() {
	return data;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public void setData(LocalDate data) {
	this.data = data;
}
public voto(String nome, int voto, LocalDate data) {
	super();
	this.nome = nome;
	this.voto = voto;
	this.data = data;
}
@Override
public String toString() {
	return "voto [nome=" + nome + ", voto=" + voto + ", data=" + data + "]";
}
 
 
}
