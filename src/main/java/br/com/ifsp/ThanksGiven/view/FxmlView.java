package br.com.ifsp.ThanksGiven.view;

import java.util.ResourceBundle;

public enum FxmlView {
    USER {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("application.title");
        }

        @Override
        public String getFxmlFile() {
            return "/FXML/User.fxml";
        }
    },
    LOGIN {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("application.title");
        }

        @Override
        public String getFxmlFile() {
            return "/FXML/LoginView.fxml";
        }
    };

    public abstract String getTitle();
    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }
}
