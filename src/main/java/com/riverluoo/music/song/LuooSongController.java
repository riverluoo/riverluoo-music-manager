package com.riverluoo.music.song;

import com.riverluoo.music.infra.HttpResult.HttpResult;
import com.riverluoo.music.song.representation.SongListRepresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/song")
@RequiredArgsConstructor
public class LuooSongController {

    private final SongApplicationService songApplicationService;

    @GetMapping("/list/fuzzy-search")
    public HttpResult<List<SongListRepresentation>> fuzzySearch(@RequestParam Integer volumeId) {

        return HttpResult.success(this.songApplicationService.fuzzySearch(volumeId));
    }

}
