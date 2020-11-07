/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author FERMI
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul film : " + filmName);
        System.out.println("Genre film : " + filmGenre);
        System.out.println("Rating film : " + filmRating);
        System.out.println("Duration film : " + filmDuration + " menit\n");
    }
}
