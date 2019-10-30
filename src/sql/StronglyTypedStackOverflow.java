package sql;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.*;

import static org.apache.spark.sql.functions.*;

public class StronglyTypedStackOverflow {

    public static void main(String args[]) {
        // Sets ERROR-only logging
        Logger.getLogger("org").setLevel(Level.ERROR);

        // inicializando sessao com duas threads
        SparkSession session = SparkSession.builder().appName("houseprice").master("local[2]").getOrCreate();

        // parando a sessão
        session.stop();

    }

}
