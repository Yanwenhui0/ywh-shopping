package com.ywh.shoppingcommoncore.dto;

import java.util.List;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/19
 */
public class TreeNode<P, T> {

    P id;

    P parentId;

    List<T> children;

    public P getId() {
        return id;
    }

    public void setId(P id) {
        this.id = id;
    }

    public P getParentId() {
        return parentId;
    }

    public void setParentId(P parentId) {
        this.parentId = parentId;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
}
