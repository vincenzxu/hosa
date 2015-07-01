/*
 * Automatically generated
 */

package com.hosa.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hosa.core.base.BaseEntity;
import com.hosa.core.utils.DateConvertUtils;

@Entity
public class UserFavoriteRelation extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UserFavoriteRelation";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_FAVORITE_ID = "favoriteId";
	public static final String ALIAS_CREATED_AT = "createdAt";
	
	//date formats
	public static final String FORMAT_CREATED_AT = DATE_FORMAT;
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Id	
	private java.lang.Long id;
    /**
     * userId       db_column: user_id 
     */	
	
	private java.lang.Long userId;
    /**
     * favoriteId       db_column: favorite_id 
     */	
	
	private java.lang.Long favoriteId;
    /**
     * createdAt       db_column: created_at 
     */	
	
	private java.util.Date createdAt;
	//columns END

	public UserFavoriteRelation(){
	}

	public UserFavoriteRelation(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setUserId(java.lang.Long value) {
		this.userId = value;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}
	public void setFavoriteId(java.lang.Long value) {
		this.favoriteId = value;
	}
	
	public java.lang.Long getFavoriteId() {
		return this.favoriteId;
	}
	public String getCreatedAtString() {
		return DateConvertUtils.format(getCreatedAt(), FORMAT_CREATED_AT);
	}
	public void setCreatedAtString(String value) {
		setCreatedAt(DateConvertUtils.parse(value, FORMAT_CREATED_AT,java.util.Date.class));
	}
	
	public void setCreatedAt(java.util.Date value) {
		this.createdAt = value;
	}
	
	public java.util.Date getCreatedAt() {
		return this.createdAt;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("FavoriteId",getFavoriteId())
			.append("CreatedAt",getCreatedAt())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UserFavoriteRelation == false) return false;
		if(this == obj) return true;
		UserFavoriteRelation other = (UserFavoriteRelation)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

