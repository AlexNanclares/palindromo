package co.com.service.palindromo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PalindromoServiceImplTest {

    @InjectMocks
    private PalindromoServiceImpl palindromoService;

    private String cadena = "abcc";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void encontrarMayorPalindromo() {
        assertNotNull(palindromoService.encontrarMayorPalindromo(cadena));
    }
}