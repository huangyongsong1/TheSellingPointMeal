package com.song.collect.controller;

import com.song.collect.service.CollectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author song
 */
@RestController
@RequestMapping("/collect")
public class CollectController {

    @Resource
    CollectService collectService;


}
