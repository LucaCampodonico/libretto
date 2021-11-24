package it.polito.tdp.Libretto_voti;
import it.polito.tdp.Libretto_voti.model.*;
import java.net.URL;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
 
public class FXMLController {
	
	private libretto model;
	public void setModel(libretto model) {
	this.model=model; 
	}
	  @FXML
	    private TextArea tris;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker tdata;

    @FXML
    private TextField tnome;

    @FXML
    private TextField tvoto;

    @FXML
    void inserisci(ActionEvent event) {
//    leggi e controlla dati 
    	String nome=tnome.getText();
    	if(nome.length()==0)
    		{tris.setText("ERRORE: campo nome vuoto");
    	return;}
    	String voto=tvoto.getText();
    	int votoI=0; 
    	try
    	{
    		votoI=Integer.parseInt(voto);
    	}catch(NumberFormatException e) {
    		tris.setText("Errore: il voto deve essere numerico");
    		return;
    	}
    	if(votoI<18 || votoI>30)
    	{
    		tris.setText("Errore: il voto deve essere compreso tra 18 e 30");
    		return;
    	}
    	
    	LocalDate dataE= tdata.getValue();
        if(dataE==null)
        {
        	tris.setText("Errore: campo data vuoto");
        	return;
        }
////    	try {
////    		data= LocalDate.parse(dataE);
////    	}catch(DateTimeParseException e)
//    	{
//    		tris.setText("Errore: la data non e nel formato corretto");
//    	}
////    	TODO aggiungere tutti i controlli
    	//    	eseguo azione
    	voto v= new voto(nome, votoI, dataE);
    	model.add(v);
//    	aggiorno la view
    	tris.setText(model.toString());
    }

    
}
