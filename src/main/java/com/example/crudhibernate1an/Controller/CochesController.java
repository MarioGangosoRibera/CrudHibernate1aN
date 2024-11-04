package com.example.crudhibernate1an.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CochesController {

    @FXML
    private TableView<?> TableView;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnInsertar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnVerMultas;

    @FXML
    private ComboBox<String> cbTipo;

    @FXML
    private TableColumn<?, ?> columnMatricula;

    @FXML
    private TableColumn<?, ?> columnTipo;

    @FXML
    private TableColumn<?, ?> colunmMarca;

    @FXML
    private TableColumn<?, ?> colunmModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtModelo;

}
