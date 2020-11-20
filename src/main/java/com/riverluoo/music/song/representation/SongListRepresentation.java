package com.riverluoo.music.song.representation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SongListRepresentation {

    private Integer id;
    private Integer volumeId;
    private Integer sequence;
    private String album;
    private String song;
    private String artist;
    private String lyric;
    private Double time;
    private String music;
    private String url;


}
