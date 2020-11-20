package com.riverluoo.music.song;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.riverluoo.music.infra.persistence.mybatisplus.LuooSongMapper;
import com.riverluoo.music.song.representation.SongListRepresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SongApplicationService {

    private final LuooSongMapper luooSongMapper;
    private final SongRepresentationFactory songRepresentationFactory;


    public List<SongListRepresentation> fuzzySearch(Integer volumeId) {
        List<LuooSong> luooSongList = this.luooSongMapper.selectList(new QueryWrapper<LuooSong>().eq("volume_id", volumeId).orderByAsc("id"));

        return luooSongList.stream().map(this.songRepresentationFactory::toSongListRepresentation).collect(Collectors.toList());
    }

}
