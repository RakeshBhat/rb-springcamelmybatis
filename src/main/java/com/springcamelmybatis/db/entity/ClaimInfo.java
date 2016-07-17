package com.springcamelmybatis.db.entity;

import java.io.Serializable;

public class ClaimInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int clm_id;
	String typ_cde;         
	String clm_num;                   
	String cde;               
	String comt_txt;                  
	String mthd_cde;
	public int getClm_id() {
		return clm_id;
	}
	public void setClm_id(int clm_id) {
		this.clm_id = clm_id;
	}
	public String getTyp_cde() {
		return typ_cde;
	}
	public void setTyp_cde(String typ_cde) {
		this.typ_cde = typ_cde;
	}
	public String getClm_num() {
		return clm_num;
	}
	public void setClm_num(String clm_num) {
		this.clm_num = clm_num;
	}
	public String getCde() {
		return cde;
	}
	public void setCde(String cde) {
		this.cde = cde;
	}
	public String getComt_txt() {
		return comt_txt;
	}
	public void setComt_txt(String comt_txt) {
		this.comt_txt = comt_txt;
	}
	public String getMthd_cde() {
		return mthd_cde;
	}
	public void setMthd_cde(String mthd_cde) {
		this.mthd_cde = mthd_cde;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClaimInfo [clm_id=").append(clm_id).append(", typ_cde=").append(typ_cde).append(", clm_num=")
				.append(clm_num).append(", cde=").append(cde).append(", comt_txt=").append(comt_txt)
				.append(", mthd_cde=").append(mthd_cde).append("]");
		return builder.toString();
	}
	
	
}
