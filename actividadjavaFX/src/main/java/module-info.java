module com.example.actividadjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.actividadjavafx to javafx.fxml;
    exports com.example.actividadjavafx;
}