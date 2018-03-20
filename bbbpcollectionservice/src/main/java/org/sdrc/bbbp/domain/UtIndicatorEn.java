package org.sdrc.bbbp.domain;

/**
 * @author Sheikh Azaruddin
 * 
 */

public class UtIndicatorEn{

	private int indicator_NId;

	private byte highIsGood;

	private String indicator_Info;

	private String indicator_Name;

	private Integer indicator_Order;

	private String short_Name;

	private String indicatorType;

	private String denominatorOrMaxScore;

	private String columnName;

	public int getIndicator_NId() {
		return this.indicator_NId;
	}

	public void setIndicator_NId(int indicator_NId) {
		this.indicator_NId = indicator_NId;
	}

	public byte getHighIsGood() {
		return this.highIsGood;
	}

	public void setHighIsGood(byte highIsGood) {
		this.highIsGood = highIsGood;
	}

	public String getIndicator_Info() {
		return this.indicator_Info;
	}

	public void setIndicator_Info(String indicator_Info) {
		this.indicator_Info = indicator_Info;
	}

	public String getIndicator_Name() {
		return this.indicator_Name;
	}

	public void setIndicator_Name(String indicator_Name) {
		this.indicator_Name = indicator_Name;
	}

	public Integer getIndicator_Order() {
		return this.indicator_Order;
	}

	public void setIndicator_Order(Integer indicator_Order) {
		this.indicator_Order = indicator_Order;
	}

	public String getShort_Name() {
		return this.short_Name;
	}

	public void setShort_Name(String short_Name) {
		this.short_Name = short_Name;
	}

	public String getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDenominatorOrMaxScore() {
		return denominatorOrMaxScore;
	}

	public void setDenominatorOrMaxScore(String denominatorOrMaxScore) {
		this.denominatorOrMaxScore = denominatorOrMaxScore;
	}

}