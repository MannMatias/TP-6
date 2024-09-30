package com.example.inicial1.controllers;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.LibroServiceImpl;
import com.example.inicial1.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}
