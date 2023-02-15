package Dados_Loja;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String Name;
	private String email;
	private Date birthDate;
	
	public Cliente(String name, String email, Date birthDate) {
		
		Name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String toString() {
		return "Client:" + Name + " (" + sdf.format(birthDate) + ") - " + email;
	}



	
	
}
