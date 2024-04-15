module com.example.javafxuicontrols {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxuicontrols to javafx.fxml;
    exports com.example.javafxuicontrols;

    //to run another package with JavaFX libraries
    opens uicontrols to javafx.fxml;
    exports uicontrols;
}