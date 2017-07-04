package me.hehaiyang.codegen.model;

import java.io.Serializable;

/**
 * Desc: 模版数据
 * Mail: hehaiyang@terminus.io
 * Date: 2017/4/7
 */
public class CodeTemplate implements Serializable {

    private static final long serialVersionUID = -329690965910519848L;

    public CodeTemplate() {
    }

    public CodeTemplate(String id, String display, String extension, String filename, String template, String subPath, Boolean isResources) {
        this.id = id;
        this.display = display;
        this.extension = extension;
        this.filename = filename;
        this.template = template;
        this.subPath = subPath;
        this.isResources = isResources;
    }

    /**
     * 模版ID，取 UUID 值
     */
    private String id;

    /**
     * 模版名称
     */
    private String display;

    /**
     * 扩展名
     */
    private String extension;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 模版内容
     */
    private String template;

    /**
     * 子目录
     */
    private String subPath;

    /**
     * 是否是静态资源
     */
    private Boolean isResources;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public Boolean getResources() {
        return isResources;
    }

    public void setResources(Boolean resources) {
        isResources = resources;
    }

}
