package com.riverluoo.music.volume.representation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:41
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VolumeListRepresentation {
    private Integer id;
    private String title;
    private String caption;
    private String url;
    private String releaseTime;
    private String author;
    private Integer star;
    private Integer remark;
    private Integer thank;
    private Integer number;


}
