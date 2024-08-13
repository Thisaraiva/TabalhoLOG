import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {

    private static final Logger logger = LoggerConfig.getLogger();

    public static void main(String[] args) {
        // Configurando o logger
        LoggerConfig.configureLogger();

        // Exemplos de logs em diferentes níveis
        logger.log(Level.INFO, "Este é um log de INFO");
        logger.log(Level.WARNING, "Este é um log de WARNING");
        logger.log(Level.SEVERE, "Este é um log de ERROR");
        logger.log(Level.CONFIG, "Este é um log de DEBUG");
        logger.log(Level.SEVERE, "Este é um log de CRITICAL");
        
        // Log de uma exceção
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Erro: Divisão por zero", e);
            System.out.println(e);
        }
    }
}
