package com.entity.model;

import com.entity.JiangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖惩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-06
 */
public class JiangchengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 奖惩类型
     */
    private Integer jiangchengTypes;


    /**
     * 详细内容
     */
    private String jiangchengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：奖惩类型
	 */
    public Integer getJiangchengTypes() {
        return jiangchengTypes;
    }


    /**
	 * 设置：奖惩类型
	 */
    public void setJiangchengTypes(Integer jiangchengTypes) {
        this.jiangchengTypes = jiangchengTypes;
    }
    /**
	 * 获取：详细内容
	 */
    public String getJiangchengContent() {
        return jiangchengContent;
    }


    /**
	 * 设置：详细内容
	 */
    public void setJiangchengContent(String jiangchengContent) {
        this.jiangchengContent = jiangchengContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
