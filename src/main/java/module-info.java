/**
 * Modulo info dipendenze programma
 */
module com.gestionalednd {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires mongo.java.driver;
    requires annotations;
    requires java.desktop;

    opens com.gestionalednd to javafx.fxml;
    exports com.gestionalednd;
    exports com.utilities;
    exports com.utilities.scheda;
    exports com.utilities.dizionari;
    exports com.utilities.dizionari.base;
}