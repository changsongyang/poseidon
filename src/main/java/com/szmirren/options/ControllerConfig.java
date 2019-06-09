package com.szmirren.options;

import java.util.ArrayList;
import java.util.List;

import com.szmirren.common.Constant;
import com.szmirren.models.TableAttributeKeyValue;

import javafx.collections.ObservableList;

/**
 * Router属性的配置文件
 * 
 * @author <a href="http://szmirren.com">Mirren</a>
 *
 */
public class ControllerConfig {
	/** 设置的tableItem */
	private List<TableAttributeKeyValue> tableItem = new ArrayList<>();
	/** 生成模板的名字 */
	private String templateName = Constant.TEMPLATE_NAME_ROUTER;
	/** 是否覆盖原文件 */
	private boolean overrideFile = true;

	/**
	 * 初始化
	 */
	public ControllerConfig() {
		super();
	}

	/**
	 * 通过 ObservableList<TableAttributeKeyValue>初始化
	 * 
	 */
	public ControllerConfig(ObservableList<TableAttributeKeyValue> item) {
		super();
		if (item != null && !item.isEmpty()) {
			tableItem.addAll(item);
		}
	}

	/**
	 * 通过 ObservableList<TableAttributeKeyValue>初始化
	 * 
	 */
	public ControllerConfig(ObservableList<TableAttributeKeyValue> item, String templateName, boolean overrideFile) {
		super();
		if (item != null && !item.isEmpty()) {
			tableItem.addAll(item);
		}
		this.templateName = templateName;
		this.overrideFile = overrideFile;
	}

	/**
	 * 初始化默认数据
	 */
	public ControllerConfig initDefaultValue() {
//		tableItem.add(new TableAttributeKeyValue("f_find", "find", "查询所有{C}数据的方法"));
//		tableItem.add(new TableAttributeKeyValue("f_getById", "findOne", "通过id查询{C}数据的方法"));
//		tableItem.add(new TableAttributeKeyValue("f_saveNotNull", "save", "插入{C}属性不为空的数据方法"));
//		tableItem.add(new TableAttributeKeyValue("f_updateNotNull", "update", "更新{C}属性不为空的数据方法"));
//		tableItem.add(new TableAttributeKeyValue("f_deleteById", "delete", "通过id删除{C}数据方法"));

		tableItem.add(new TableAttributeKeyValue("f_index", "index", "查询所有{C}数据的方法"));
		tableItem.add(new TableAttributeKeyValue("f_show", "show", "通过id查询{C}数据的方法"));
		tableItem.add(new TableAttributeKeyValue("f_create", "create", "插入{C}属性不为空的数据方法"));
		tableItem.add(new TableAttributeKeyValue("f_update", "update", "更新{C}属性不为空的数据方法"));
		tableItem.add(new TableAttributeKeyValue("f_delete", "delete", "通过ids删除{C}数据方法"));
		tableItem.add(new TableAttributeKeyValue("f_export", "export", "导出{C}属性数据方法"));
		tableItem.add(new TableAttributeKeyValue("f_statistics", "statistics", "统计方法"));

		tableItem.add(new TableAttributeKeyValue("r_mapping", "/{C}", "路由地址前缀"));
		tableItem.add(new TableAttributeKeyValue("r_index", "/index", "查询所有数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_show", "/show", "通过id查询数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_create", "/create", "插入的数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_update", "/update", "更新的数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_delete", "/delete", "通过ids删除数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_export", "/export", "导出数据的路由地址"));
		tableItem.add(new TableAttributeKeyValue("r_statistics", "/statistics", "统计的路由地址"));

		return this;
	}

	/**
	 * 设置属性集合
	 * 
	 * @return
	 */
	public List<TableAttributeKeyValue> getTableItem() {
		return tableItem;
	}

	/**
	 * 获取属性集合
	 * 
	 * @param tableItem
	 */
	public void setTableItem(List<TableAttributeKeyValue> tableItem) {
		this.tableItem = tableItem;
	}

	/**
	 * 获得模板的名称
	 * 
	 * @return
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * 设置模板的名称
	 * 
	 * @param templateName
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * 获取是否覆盖原文件
	 * 
	 * @return
	 */
	public boolean isOverrideFile() {
		return overrideFile;
	}

	/**
	 * 设置是否覆盖原文件
	 * 
	 * @param overrideFile
	 */
	public void setOverrideFile(boolean overrideFile) {
		this.overrideFile = overrideFile;
	}

	@Override
	public String toString() {
		return "RouterConfig [tableItem=" + tableItem + ", templateName=" + templateName + ", overrideFile=" + overrideFile + "]";
	}

}