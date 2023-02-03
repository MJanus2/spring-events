package com.springevents.springevents.service;

import com.springevents.springevents.event.ProductRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductImageManager implements ApplicationListener<ProductRegisteredEvent> {

    @Override
    public void onApplicationEvent(ProductRegisteredEvent event) {
        log.info(String.format("Provided %f and %f, result of the calculation is %f",
                event.getFirstNumber(), event.getSecondNumber(), event.getResult()));
    }

}