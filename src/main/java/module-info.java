module com.calculatorfx.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens com.calculatorfx.calculatorjavafx to javafx.fxml;
    exports com.calculatorfx.calculatorjavafx;
}

