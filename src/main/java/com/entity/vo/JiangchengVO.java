package com.entity.vo;

import com.entity.JiangchengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖惩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-06
 */
@TableName("jiangcheng")
public class JiangchengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 奖惩类型
     */

    @TableField(value = "jiangcheng_types")
    private Integer jiangchengTypes;


    /**
     * 详细内容
     */

    @TableField(value = "jiangcheng_content")
    private String jiangchengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：奖惩类型
	 */
    public Integer getJiangchengTypes() {
        return jiangchengTypes;
    }


    /**
	 * 获取：奖惩类型
	 */

    public void setJiangchengTypes(Integer jiangchengTypes) {
        this.jiangchengTypes = jiangchengTypes;
    }
    /**
	 * 设置：详细内容
	 */
    public String getJiangchengContent() {
        return jiangchengContent;
    }


    /**
	 * 获取：详细内容
	 */

    public void setJiangchengContent(String jiangchengContent) {
        this.jiangchengContent = jiangchengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
