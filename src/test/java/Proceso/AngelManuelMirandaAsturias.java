package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Manuel
 */
public class AngelManuelMirandaAsturias {
    
    // MOCK 1
    @InjectMocks
    private AsignarHorario asignarHorario;
    
    @Mock
    private Carrera carrera;
    @Mock
    private RegistroAcademico registro;
    
    // MOCK 2
    @Mock
    private AsignarHorario asignarHorarioM;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    // MOCK 1
    @Test
    public void verificarDescripcionHorario(){
        try {
            when(registro.cheequearCarnet()).thenReturn(true);
            when(carrera.procesarCarrera()).thenReturn(1);
            
            when(registro.getAnio()).thenReturn(2018);
            try {
                Horario horario;
                horario = asignarHorario.generarHorario(carrera, registro);
                assertEquals("Mixto", horario.getDescripcion());
            } catch (Exception ex) {
                throw ex;
            }
        } catch (Exception ex) {
            Logger.getLogger(AngelManuelMirandaAsturias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MOCK 2
    @Test
    public void verificarVerDescripcion(){
        when(asignarHorarioM.VerDescripcion()).thenReturn("");
        assertEquals("", asignarHorarioM.VerDescripcion());
    }
}
