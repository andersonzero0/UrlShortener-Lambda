package com.andersonzero0.redirectUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
