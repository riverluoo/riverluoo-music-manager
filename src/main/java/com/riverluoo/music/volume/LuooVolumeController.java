package com.riverluoo.music.volume;

import com.riverluoo.music.infra.HttpResult.HttpResult;
import com.riverluoo.music.volume.representation.VolumeListRepresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:28
 */
@RestController
@RequestMapping("/song")
@RequiredArgsConstructor
public class LuooVolumeController {

    private final VolumeApplicationService volumeApplicationService;

    @GetMapping("/list/fuzzy-search")
    public HttpResult<List<VolumeListRepresentation>> fuzzySearch(String id) {

        return HttpResult.success(this.volumeApplicationService.fuzzySearch(id));
    }


}
