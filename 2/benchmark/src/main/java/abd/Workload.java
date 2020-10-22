package abd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Workload {
    public static void populate(Random rand, Connection c) throws Exception {
        Statement s = c.createStatement();

        // Criar tabelas e inserir valores

        s.close();
    }

    public static void transaction(Random rand, Connection c) throws Exception {
        Statement s = c.createStatement();
        int result = rand.nextInt(3);
        
        // Executar operação, usar o random para gerar 0 1 ou 2, basicamente para as tres operaçoes do guiao
        
        switch(result){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("uh-oh");
                break;
        }


        s.close();
    }

}
