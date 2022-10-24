/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.anipad;

/**
 *
 * @author Aluno
 */
public class Genre {
    private String first;
    private String second;
    private String third;

    public Genre(String first, String second, String third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public String getFirstGenre() {
        return first;
    }
    public void setFirstGenre(String newFirst) {
        first = newFirst;
    }


    public String getSecondGenre() {
        return second;
    }
    public void setSecondGenre(String newSecond) {
        second = newSecond;
    }


    public String getThirdGenre() {
        return third;
    }
    public void setThirdGenre(String newThird) {
        third = newThird;
    }
    
    
    public boolean compare(Genre genre) {
        return this.first.equals(genre.first) &&
                this.second.equals(genre.second) &&
                this.third.equals(genre.third);
    }
}
