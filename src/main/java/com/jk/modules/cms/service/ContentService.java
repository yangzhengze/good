package com.jk.modules.cms.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.jk.modules.cms.model.Content;

/**
 * @author cuiP
 * Created by JK on 2017/4/19.
 */
public interface ContentService extends IService<Content> {

    /**
     * @methodName: findPage
     * @param: [pageNum, pageSize, catId, title, startTime, endTime]
     * @description: 分页查询
     * @return: com.github.pagehelper.PageInfo<com.jk.model.Content>
     * @author: cuiP
     * @date: 2017/7/28 15:09
     * @version: V1.0.0
     */
    Page<Content> findPage(Integer pageNum, Integer pageSize, Long catId, String title, String startTime, String endTime);

    /**
     * 分页根据新闻类型查询新闻列表
     * @param catId
     * @return
     */
    Page<Content> findPageNews(Integer pageNum, Integer pageSize, Long catId);

    /**
     * @methodName: findTop3ByCatId
     * @param: [catId]
     * @description: 根据内容分类倒序查询前3条内容
     * @return: com.github.pagehelper.PageInfo<com.jk.model.Content>
     * @author: cuiP
     * @date: 2017/7/28 15:34 
     * @version: V1.0.0
     */
    Page<Content> findTop3ByCatId(Long catId);
}
