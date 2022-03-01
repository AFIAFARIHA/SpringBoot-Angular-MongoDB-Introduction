//package com.vinternship.mcmsbackend.controllers;
//import com.vinternship.mcmsbackend.models.Language;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import com.vinternship.mcmsbackend.repositories.Language;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//@RequestMapping("/api")
//public class Language{
//    @Autowired
//    LanguageRepository languageRepository;
//    @GetMapping("/languages")
//    public ResponseEntity<List<Language>> getAllGenres(@RequestParam(required = false) String name) {
//        try {
//            List<Language> languages = new ArrayList<Language>();
//
//            if (name == null) {
//                languageRepository.findAll().forEach(languages::add);
//            } else {
//                languageRepository.findLanguageByNameContaining(name).forEach(languages::add);
//            }
//
//            if (languages.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(languages, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
