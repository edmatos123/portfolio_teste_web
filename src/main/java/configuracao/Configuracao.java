package configuracao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracao {
	
	private static Properties properties = new Properties();
		
static {	
		
		try {	
			
		FileInputStream file = new FileInputStream("src/test/resources/config.properties");			
			
		properties.load(file);
		
		}catch(IOException e) {
			
			throw new RuntimeException("Erro ao carregar o arquivo config.properties");
		}
		

	}


public static String getString(String chave) {
	
	return properties.getProperty(chave);
	
}

public static int getInt(String chave) {
	
	return Integer.parseInt(properties.getProperty(chave));
	
}
	

}
