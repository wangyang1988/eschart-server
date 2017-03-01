package com.wy.escharts.web;

import com.wy.eschart.model.esinfos.EsinfosDO;
import com.wy.eschart.model.esinfos.EsinfosDOExample;
import com.wy.eschart.model.esinfos.EsinfosDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wangyang on 2016/12/23.
 */
@RestController
public class HomeController {

    @Autowired
    private EsinfosDOMapper esinfosDOMapper;

    @GetMapping(value = "/comments")
    public String home() {
        EsinfosDOExample example = new EsinfosDOExample();
        List<EsinfosDO> esinfosDOList = esinfosDOMapper.selectByExample(example);
        return "home";

    }
}
