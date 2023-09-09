/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author kopilakei5
 */
public class peminjaman {

   
private ArrayList<Buku> bukuCollection;

    
    public peminjaman() {
        bukuCollection = new ArrayList<>();
        bukuCollection.add(new Buku("Sherlock Holmes"));
        bukuCollection.add(new Buku("Topeng Kaca"));
        bukuCollection.add(new Buku("Doraemon"));
        bukuCollection.add(new Buku("Petualangan Doraemon"));
        bukuCollection.add(new Buku("Thomas and Friends"));
        bukuCollection.add(new Buku("The Return of Sherlock Holmes"));
        bukuCollection.add(new Buku("The Adventure of Sherlock Holmes"));
    }
}
