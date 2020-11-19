package com.riverluoo.music.volume.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VolumeUpdateCommand {

    private Integer id;
    private String url;

}
