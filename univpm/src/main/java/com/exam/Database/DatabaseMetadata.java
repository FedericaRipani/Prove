package com.exam.Database;
import java.util.ArrayList;


//import com.exam.Interface.Database;
import com.exam.model.*;

public class DatabaseMetadata  //implements Database<Metadati>
{

	private static ArrayList<Metadati> metadata = new ArrayList<Metadati>();
	
	public static ArrayList<Metadati> getAll() {
		metadata.add(new Metadati("data","Data di creazione del twitt","String"));
		metadata.add(new Metadati("idPost","Descrive in modo univoco il post","Integer"));
		metadata.add(new Metadati("textPost","Campo testuale del post","String"));
		metadata.add(new Metadati("idUser","Descrive in modo univoco l'utente","Integer"));
		metadata.add(new Metadati("nameUser","Nome dell'utente","String"));
		metadata.add(new Metadati("numPost","Numero dei tweet di quell'utente","Integer"));
		metadata.add(new Metadati("languagePost","Lingua del twitt","String"));
		metadata.add(new Metadati("userMentions","Descrive gli utenti menzionati","String"));
		metadata.add(new Metadati("hashtag","Descrive gli Hashtag impiegati nel post","String"));
		
		return metadata;
	}

}
