package com.riverluoo.music.volume;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.riverluoo.music.infra.HttpResult.HttpResult;
import com.riverluoo.music.volume.command.VolumeListQuery;
import com.riverluoo.music.volume.command.VolumeUpdateCommand;
import com.riverluoo.music.volume.representation.VolumeListRepresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:28
 */
@RestController
@RequestMapping("/volume")
@RequiredArgsConstructor
public class LuooVolumeController {

    private final VolumeApplicationService volumeApplicationService;

    @GetMapping("/list/fuzzy-search")
    public HttpResult<Page<VolumeListRepresentation>> fuzzySearch(
            @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            VolumeListQuery volumeListQuery) {

        Page<VolumeListRepresentation> page = new Page<>(pageIndex, pageSize);

        return HttpResult.success(this.volumeApplicationService.fuzzySearch(page, volumeListQuery));
    }


    @PutMapping
    public HttpResult<Void> update(@RequestBody VolumeUpdateCommand volumeUpdateCommand){
        this.volumeApplicationService.update(volumeUpdateCommand);

        return HttpResult.success();
    }

}
