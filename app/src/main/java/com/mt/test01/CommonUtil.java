package com.mt.test01;

import android.widget.CheckBox;

import java.util.List;

public class CommonUtil {
    /**
     * 取消checkbox选中状态
     *
     * @param checkBoxList 复选框列表
     */
    public static void unCheck(List<CheckBox> checkBoxList) {
        for (CheckBox chb : checkBoxList) {
            chb.setChecked(false);
        }
    }

    /**
     * 获取单选值
     *
     * @param checkBoxList
     * @return String 单选值
     */
    public static String getOne(List<CheckBox> checkBoxList) {
        String tag = "";
        for (CheckBox chb : checkBoxList) {
            if (chb.getTag() == null) {
                continue;
            }
            if (chb.isChecked()) {
                tag = chb.getTag().toString();
                break;
            }
        }
        return tag;
    }

}
