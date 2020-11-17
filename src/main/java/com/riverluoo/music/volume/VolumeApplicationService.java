package com.riverluoo.music.volume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.riverluoo.music.infra.persistence.mybatisplus.LuooVolumeMapper;
import com.riverluoo.music.volume.command.VolumeListQuery;
import com.riverluoo.music.volume.representation.VolumeListRepresentation;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:44
 */
@RequiredArgsConstructor
@Service
public class VolumeApplicationService {

    private final LuooVolumeMapper luooVolumeMapper;
    private final RepresentationFactory representationFactory;


    public Page<VolumeListRepresentation> fuzzySearch(Page page, VolumeListQuery volumeListQuery) {
        Page selectPage = this.luooVolumeMapper.selectPage(page, new QueryWrapper<LuooVolume>().eq(StringUtils.isNotBlank(volumeListQuery.getId()), "id", volumeListQuery.getId()));
        List<LuooVolume> luooVolumeList = selectPage.getRecords();

        return  selectPage.setRecords(luooVolumeList.stream().map(luooVolume -> this.representationFactory.toVolumeListRepresentation(luooVolume)).collect(Collectors.toList()));
    }


}
