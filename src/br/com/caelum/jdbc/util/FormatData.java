package br.com.caelum.jdbc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatData {

private FormatData(){
		
	}
	
	public static Calendar formataDataDDMMYYYY(String data){
		Calendar dataNascimento = null;
		// fazendo a conversão da data
		try{
			
			Date date =	new SimpleDateFormat("dd/MM/yyyy").parse(data);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			
			return dataNascimento;
		
		}catch (ParseException e) {
			throw new RuntimeException("Erro de conversão de data", e);
		}
		
	}
}
