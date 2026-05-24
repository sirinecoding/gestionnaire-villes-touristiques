package igfinal.controller;

import igfinal.model.VilleTouristique;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {
    @FXML
    private ListView<VilleTouristique> villesListView;

    @FXML
    private Label nomLabel;

    @FXML
    private Label paysLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label visiteeLabel;

    @FXML
    public void initialize() {

        VilleTouristique paris = new VilleTouristique("Paris", "France", "Capitale française", true);

        VilleTouristique rome = new VilleTouristique("Rome", "Italie", "Ville historique", false);

        VilleTouristique tokyo = new VilleTouristique("Tokyo", "Japon", "Grande ville moderne", false);

        villesListView.getItems().add(paris);

        villesListView.getItems().add(rome);

        villesListView.getItems().add(tokyo);

        villesListView.getSelectionModel().selectedItemProperty().addListener((observable, ancienneVille, nouvelleVille) -> {

                    if (nouvelleVille != null) {

                        nomLabel.setText(nouvelleVille.getNom());

                        paysLabel.setText(nouvelleVille.getPays());

                        descriptionLabel.setText(nouvelleVille.getDescription());

                        if (nouvelleVille.isVisitee()) {
                            visiteeLabel.setText("Oui");
                        } else {
                            visiteeLabel.setText("Non");
                        }
                    }
                });

    }


}
