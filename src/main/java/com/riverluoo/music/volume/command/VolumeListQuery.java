package com.riverluoo.music.volume.command;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class VolumeListQuery implements Serializable {

    private String id;

}
