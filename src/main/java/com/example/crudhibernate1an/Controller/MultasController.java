package com.example.crudhibernate1an.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MultasController {

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnInsertar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableColumn<?, ?> colunmFecha;

    @FXML
    private TableView<?> colunmIdmulta;

    @FXML
    private TableColumn<?, ?> colunmPrecio;

    @FXML
    private DatePicker datePickerFecha;

    @FXML
    private TextField txtIdMulta;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtPrecio;

}

