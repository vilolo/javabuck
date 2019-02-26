package com.example.settledemo.modules.goods.serviceimpl.mybatis;

import com.example.settledemo.modules.goods.entity.Goods;
import com.example.settledemo.modules.goods.dao.mapper.GoodsMapper;
import com.example.settledemo.modules.goods.service.mybatis.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author xiaomalover
 * @since 2019-02-26
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
