package Swing.MVC.formular;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            UserModel model = new UserModel();
            UserView view = new UserView();
            new UserController(model, view);
            view.setVisible(true);
        });
    }
}
