module org.durusr.java_programmierprojekt.catsvsasians {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.durusr.java_programmierprojekt.catsvsasians to javafx.fxml;
    exports org.durusr.java_programmierprojekt.catsvsasians;
}