package com.riverluoo.music.volume;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class LuooVolume {

    @TableId(type = IdType.ASSIGN_ID)
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
    private LocalDateTime  updateTime;


    public void update(){
        this.updateTime=LocalDateTime.now();
    }




}
