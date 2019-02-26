package com.example.exceldemo.mzmall.service;

import com.example.mapper.RegionMapper;
import com.example.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    @Autowired
    RegionMapper regionMapper;

    public Region getRegionByName(String areaName, int areaLevel) {
        return regionMapper.getRegionByName(areaName, areaLevel);
    }
}
