package com.ywh.shoppingcommoncore.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ywh.shoppingcommoncore.dto.TreeNode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/21
 */
public class TreeUtils {

    /**
     * list 2 tree
     * @param dataList 数据列表
     * @param <P> id 类型
     * @param <T> 节点 类型
     * @return
     */
    public static  <P, T extends TreeNode<P, T>> List<T> buildTree(List<T> dataList) {
        Map<P, List<T>> dataByParentIdMap = Maps.newHashMapWithExpectedSize(dataList.size());
        dataList.forEach(category -> {
            List<T> children = dataByParentIdMap.getOrDefault(category.getParentId(), Lists.newArrayList());
            children.add(category);
            dataByParentIdMap.put(category.getParentId(), children);
        });
        dataList.forEach(category-> category.setChildren(dataByParentIdMap.get(category.getId())));
        return dataList.stream()
                .filter(category -> category.getParentId().equals(0))
                .collect(Collectors.toList());
    }

}
