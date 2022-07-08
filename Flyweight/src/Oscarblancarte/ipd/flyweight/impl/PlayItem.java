/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oscarblancarte.ipd.flyweight.impl;

/**
 *
 * @author frnk_
 */
public class PlayItem {
    private Long id;
    private String songName;
    private byte[] song = new byte[1000000];
    public PlayItem(Long id, String songName) {
        this.id = id;
        this.songName = songName;
    }
    public PlayItem(){
        
    }
    @Override
    public String toString() {
        return "PlayItem{" + "id=" + id + ", songName=" + songName + '}';
    }
}
