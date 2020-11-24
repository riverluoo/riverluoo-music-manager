package com.riverluoo.music.song;


import com.riverluoo.music.song.command.SongUpdateCommand;
import com.riverluoo.music.song.representation.SongListRepresentation;
import org.springframework.stereotype.Component;

@Component
public class SongRepresentationFactory {

    public SongListRepresentation toSongListRepresentation(LuooSong luooSong) {
        return SongListRepresentation
                .builder()
                .id(luooSong.getId())
                .volumeId(luooSong.getVolumeId())
                .sequence(luooSong.getSequence())
                .album(luooSong.getAlbum())
                .song(luooSong.getSong())
                .artist(luooSong.getArtist())
                .lyric(luooSong.getLyric())
                .time(luooSong.getTime())
                .music(luooSong.getMusic())
                .url(luooSong.getUrl())
                .build();
    }

    public LuooSong toLuooSong(SongUpdateCommand songUpdateCommand) {
        return LuooSong
                .builder()
                .id(songUpdateCommand.getId())
                .url(songUpdateCommand.getUrl())
                .build();
    }


}
