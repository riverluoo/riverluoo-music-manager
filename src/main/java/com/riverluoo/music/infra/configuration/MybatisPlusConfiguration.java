package com.riverluoo.music.infra.configuration;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangyang
 * @since: 2020-11-13 14:20
 */
@Configuration
@MapperScan("com.riverluoo.music.infra.persistence.mybatisplus")
public class MybatisPlusConfiguration {

    public IdentifierGenerator identifierGenerator(){
        return  new DefaultIdentifierGenerator();
    }
}
