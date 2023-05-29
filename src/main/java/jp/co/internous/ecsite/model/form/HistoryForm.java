/*
 * フロントエンド(ブラウザ)で入力された情報が自動で渡される
 */

package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable {
	
	private int userId;
	
	public int getUserId () {
		return userId;
	}
	
	public void setUserId (int userId) {
		this.userId = userId;
	}

}
