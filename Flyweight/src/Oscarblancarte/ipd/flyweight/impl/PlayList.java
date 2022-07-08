/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oscarblancarte.ipd.flyweight.impl;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author frnk_
 */
public class PlayList {
    private String playListName;
    private List<PlayItem> playItems = new ArrayList<>();
    
    public PlayList(String playListName) {
        this.playListName = playListName;
    }
    public void addPlayItem(String songName) {
        playItems.add(PlayItemFactory.createPlayItem(songName));
    }
    public void printList() {
        String out = "\nPlayList > " + playListName;
        for (PlayItem playItem : playItems) {
            out += "\n\t" + playItem.toString();
        }
        System.out.println(out);
    }
}
