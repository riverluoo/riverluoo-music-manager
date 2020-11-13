package com.riverluoo.music.volume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.riverluoo.music.infra.persistence.mybatisplus.LuooVolumeMapper;
import com.riverluoo.music.volume.representation.VolumeListRepresentation;
import lombok.RequiredArgsConstructor;
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


    public List<VolumeListRepresentation> fuzzySearch(String id) {
        List<LuooVolume> luooVolumeList = this.luooVolumeMapper.selectList(new QueryWrapper<LuooVolume>().eq("id", id));

        return luooVolumeList.stream().map(luooVolume -> this.representationFactory.toVolumeListRepresentation(luooVolume)).collect(Collectors.toList());
    }


}
