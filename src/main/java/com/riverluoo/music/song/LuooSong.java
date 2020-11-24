package com.riverluoo.music.song;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class LuooSong {

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
    private LocalDateTime updateTime;


    public void update() {
        this.updateTime = LocalDateTime.now();
    }


}
