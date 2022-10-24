/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import main.anipad.AniPad;
import main.anipad.Anime;
import main.anipad.Genre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class Testes {
    
    public Testes() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public void testes(){
        AniPad anipad = new AniPad();
		
	// 1 classe de equival�ncia: 0 animes, lista vazia
        assertEquals(anipad.getAnimes().size(), 0);
        
        // 1 classe de equival�ncia para registrar um anime(objeto)
	anipad.registerAnime(new Anime("DBZ", new Genre("Acao", "Aventura", "Shounen"), "oi eu sou o goku", "dbz.com"));		
	assertEquals(anipad.getAnimes().size(), 1);
        
        // 1 classe de equival�ncia para registrar n animes(objetos)
		anipad.registerAnime(new Anime("Tokyo Ghoul", new Genre("Acao", "Terror", "Sobrenatural"), "quanto � 1000 - 7", "tokyoghoul.com"));
		anipad.registerAnime(new Anime("Naruto", new Genre("Acao", "Aventura", "Fantasia"), "esse � meu jeito ninja", "naruto.com"));
		
		assertEquals(anipad.getAnimes().size(), 3);
		
		// Testes de classe de equivalência para o método findToGenre()
		
		//1 classe de equivalência: 0 animes encontrados (estou testando “lista vazia”)
		List<Anime> founds = anipad.findToGenre(new Genre("Dramático", "Romance", "Slice of life"));
		
		assertEquals(founds.size(), 0);
		
		//1 classe de equivalência: 1 animes encontrados (guardando 1 objeto)
		List<Anime> founds2 = anipad.findToGenre(new Genre("Acao", "Terror", "Sobrenatural"));
		assertEquals(founds2.size(), 1);
		
		//1 classe de equivalência: n animes encontrados (guardando n objetos)
		
		anipad.registerAnime(new Anime("Jujutsu Kaisen", new Genre("Acao", "Terror", "Sobrenatural"), "feiticeiro jujutsu", "jujutsukaisen.com"));
		anipad.registerAnime(new Anime("Noragami", new Genre("Acao", "Terror", "Sobrenatural"), "Seki", "noragami.com"));

		List<Anime> founds3 = anipad.findToGenre(new Genre("Acao", "Aventura", "Sobrenatural"));
		
		assertEquals(founds3.size(),0);

		//Testes de Classes de Equivalencia para o método findToName()
		//1 classe de equivalencia retorna 1 anime
		Anime anime1 = anipad.findToName("Noragami");
		assertEquals(anime1.getGenre().getSecondGenre(), "Terror");
		assertEquals(anime1.getGenre().getThirdGenre(), "Sobrenatural");
		
		//1 classe de equivalencia retorna null
		Anime anime2 = anipad.findToName("Bleach");
		assertEquals(anime2, null);
    }
}
