import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerConfig {

    private static Logger logger = Logger.getLogger(LoggerConfig.class.getName());

    public static void configureLogger() {
        try {
            // Criar o diretório "log" se não existir
            File logDir = new File("log");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }

            // Configurando o FileHandler para salvar logs em um arquivo
            FileHandler fileHandler = new FileHandler("log/app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Definindo o nível de log (pode ser alterado conforme necessário)
            logger.setLevel(Level.ALL);

            // Desativando logs no console
            logger.setUseParentHandlers(false);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Erro ao configurar o logger", e);
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
