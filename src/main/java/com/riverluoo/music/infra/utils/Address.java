package com.riverluoo.music.infra.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {

    private String province;
    private String city;
    private String detail;

    public static Address of(String province, String city, String detail) {
        return new Address(province, city, detail);
    }


}
