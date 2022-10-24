/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.anipad;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class AniPad {
    
    private List<Anime> animes = new LinkedList<Anime>();
    
    public void registerAnime(Anime anime){
        animes.add(anime);
    }
    
    /**
     */
    public List<Anime>findToGenre(Genre genre){
        List<Anime> foundAnimes = new LinkedList<Anime>();
        for(Anime anime: animes){
            if(anime.getGenre().compare(genre)){
                foundAnimes.add(anime);
            }
        }   
        return foundAnimes;
    }
    
    public Anime findToName(String name){
        for(Anime anime: animes){
            if(anime.getName().equals(name)){
                return anime;
            }
        }
        return null;
    }
    
    public List<Anime> getAnimes(){
        return animes;
    }        
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
