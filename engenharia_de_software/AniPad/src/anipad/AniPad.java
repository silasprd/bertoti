package anipad;

import java.util.LinkedList;
import java.util.List;

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
    
}




