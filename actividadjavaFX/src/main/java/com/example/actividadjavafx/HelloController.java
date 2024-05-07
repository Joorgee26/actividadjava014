import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InicioSesionController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    void iniciarSesion() {
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        // Verifica si el usuario y la contraseña son correctos
        if (usuario.equals("admin@gmail.com") && contrasena.equals("123")) {
            mostrarMensaje("Inicio de Sesión Correcto");
        } else {
            mostrarMensaje("Usuario o Contraseña Incorrectos");
        }
    }

    private void mostrarMensaje(String mensaje) {
        // Muestra un cuadro de diálogo con el mensaje proporcionado
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
