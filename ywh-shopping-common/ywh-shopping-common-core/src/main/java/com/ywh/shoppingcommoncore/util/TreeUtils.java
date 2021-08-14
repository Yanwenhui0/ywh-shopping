package com.ywh.shoppingcommoncore.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ywh.shoppingcommoncore.dto.TreeNode;
import org.apache.commons.lang3.StringUtils;

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
        dataList.forEach(data -> {
            List<T> children = dataByParentIdMap.getOrDefault(data.getParentId(), Lists.newArrayList());
            children.add(data);
            dataByParentIdMap.put(data.getParentId(), children);
        });
        dataList.forEach(data-> data.setChildren(dataByParentIdMap.get(data.getId())));
        return dataList.stream()
                .filter(data -> null == data.getParentId()
                        || StringUtils.isBlank(data.getParentId().toString())
                        || StringUtils.equals(data.getParentId().toString(), "0"))
                .collect(Collectors.toList());
    }

}
