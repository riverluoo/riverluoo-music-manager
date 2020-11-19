package com.riverluoo.music.volume;

import com.riverluoo.music.volume.command.VolumeUpdateCommand;
import com.riverluoo.music.volume.representation.VolumeListRepresentation;
import org.springframework.stereotype.Component;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:53
 */
@Component
public class RepresentationFactory {

    public VolumeListRepresentation toVolumeListRepresentation(LuooVolume luooVolume) {
        return VolumeListRepresentation
                .builder()
                .id(luooVolume.getId())
                .title(luooVolume.getTitle())
                .caption(luooVolume.getCaption())
                .url(luooVolume.getUrl())
                .releaseTime(luooVolume.getReleaseTime())
                .author(luooVolume.getAuthor())
                .star(luooVolume.getStar())
                .remark(luooVolume.getRemark())
                .thank(luooVolume.getThank())
                .number(luooVolume.getNumber())
                .build();
    }

    public LuooVolume toLuooVolume(VolumeUpdateCommand volumeUpdateCommand){
        return LuooVolume
                .builder()
                .id(volumeUpdateCommand.getId())
                .url(volumeUpdateCommand.getUrl())
                .build();
    }


}
