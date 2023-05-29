/*
 * データベーステーブルのカラムと同じフィールドを持ち、
 * 1レコードの実体として機能する
 * (entity)
 * mst_goodsテーブルの1レコードと同じ
 */

package jp.co.internous.ecsite.model.domein;

import java.sql.Timestamp;

public class MstGoods {
	
	private int id;
	
	private String goodsName;
	
	private int price;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

}
