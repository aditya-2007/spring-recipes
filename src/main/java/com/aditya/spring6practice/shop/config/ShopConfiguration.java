package com.aditya.spring6practice.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import com.aditya.spring6practice.shop.BannerLoader;

@Configuration
public class ShopConfiguration {

	@Value("classpath:banner.txt")
	private Resource banner;

    @Bean
    BannerLoader bannerLoader() {
        return new BannerLoader(banner);
    }
}
