package com.grupoBC05.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class MetodoFechasTest {

    // Año divisible por 400 → bisiesto
    @Test
    void testDivisiblePor400() {
        assertTrue(MetodoFechas.verBisiesto(2000));
    }

    // Año divisible por 4 pero no por 100 → bisiesto
    @Test
    void testDivisiblePor4No100() {
        assertTrue(MetodoFechas.verBisiesto(2012));
    }

    // Año divisible por 100 pero no por 400 → NO bisiesto
    @Test
    void testDivisiblePor100No400() {
        assertFalse(MetodoFechas.verBisiesto(2100));
    }

    // Año no divisible por 4 → NO bisiesto
    @Test
    void testNoDivisiblePor4() {
        assertFalse(MetodoFechas.verBisiesto(2019));
    }

    // Año menor a 1866 → lanza excepción
    @Test
    void testAntes1866() {
        assertThrows(IllegalArgumentException.class,
            () -> MetodoFechas.verBisiesto(1800)
        );
    }

    // Año adicional para cubrir la última instrucción return false
    @Test
    void testNoBisiestoOtraRama() {
        assertFalse(MetodoFechas.verBisiesto(1900));
    }

    // ---------------------------
    // TESTEO DEL MÉTODO MAIN
    // ---------------------------

    @Test
    void testMainBisiesto() {
        // Simula introducir "2000"
        String input = "2000\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Captura la salida por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MetodoFechas.main(new String[]{});

        String salida = out.toString();
        assertTrue(salida.contains("El año es bisiesto"));
    }

    @Test
    void testMainNoBisiesto() {
        // Simula introducir "2019"
        String input = "2019\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Captura la salida por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MetodoFechas.main(new String[]{});

        String salida = out.toString();
        assertTrue(salida.contains("El año no es bisiesto"));
    }
}
