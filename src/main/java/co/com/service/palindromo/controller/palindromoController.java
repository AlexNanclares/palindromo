package co.com.service.palindromo.controller;

import co.com.service.palindromo.dto.Palindromo;
import co.com.service.palindromo.exceptions.PalindromoException;
import co.com.service.palindromo.service.PalindromoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class palindromoController {
    private final PalindromoService palindromoService;

    @GetMapping("/palindromo/{cadena}")
    public Palindromo mayorPalindromoConAutorizacion(@PathVariable String cadena){

        if (cadena.trim().equals(""))
            throw new PalindromoException("Debe ingresar una cadena de caracteres", HttpStatus.BAD_REQUEST);

        return palindromoService.encontrarMayorPalindromo(cadena);
    }

    @GetMapping("/{cadena}")
    public Palindromo mayorPalindromoSinAutorizacion(@PathVariable String cadena){

        if (cadena.trim().equals(""))
            throw new PalindromoException("Debe ingresar una cadena de caracteres", HttpStatus.BAD_REQUEST);

        return palindromoService.encontrarMayorPalindromo(cadena);
    }

}
