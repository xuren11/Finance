package com.manager.utils;

/**
 * 该枚举描述仅供参考  本项目中没有使用该方法
 */

/**
 * 枚举接口
 */
interface CommonEnum {
    //此处对应枚举的字段,如状态枚举StatusEnum定义了code,name,desc
    //那么这里定义这个三个字段的get方法,可以获取到所有的字段
    int getCode();

    String getName();

    String getDesc();

}


// 示例:

///**
// * 状态枚举
// */
//public enum StatusEnum implements CommonEnum {
//
//    WAITTING(0, "WAITTING", "等待"),
//    STARTED(1, "STARTED", "开始"),
//    END(2, "END", "结束");
//
//    private int code;
//    private String name;
//    private String desc;
//
//    StatusEnum(int code, String name, String desc) {
//        this.code = code;
//        this.name = name;
//        this.desc = desc;
//    }

//    @overwrite
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    @overwrite
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @overwrite
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//}
//
//
//public class EnumUtils {
//
//    /**
//     * 返回指定编码的'枚举'
//     *
//     * @param code
//     * @return SharedObjTypeEnum
//     * @throws
//     */
//    public static <T> T getEnumBycode(Class<T> clazz, int code) {
//        for (T _enum : clazz.getEnumConstants())
//            if (code == _enum.getCode())
//                return _enum;
//        return null;
//    }
//
//    /**
//     * 返回指定名称的'枚举'
//     *
//     * @param name
//     * @return SharedObjTypeEnum
//     * @throws
//     */
//    public static <T extends CommonEnum> T getEnumByName(Class<T> clazz, String name) {
//        for (T _enum : clazz.getEnumConstants())
//            if (_enum.getCode().equals(name))
//                return _enum;
//        return null;
//    }
//
//    /**
//     * 返回指定描述的'枚举'
//     *
//     * @param desc
//     * @return SharedObjTypeEnum
//     * @throws
//     */
//    public static <T extends CommonEnum> T getEnumByDesc(Class<T> clazz, String desc) {
//        for (T _enum : clazz.getEnumConstants())
//            if (_enum.getCode().equals(desc))
//                return _enum;
//        return null;
//    }
//}
//
//
//    //使用方法
//    StatusEnum statusEnum = EnumUtil.getEnumBycode(StatusEnum.class, 1);
//
//    StatusEnum statusEnum = EnumUtil.getEnumByName(StatusEnum.class, "END");
//
//    StatusEnum statusEnum = EnumUtil.getEnumByDesc(StatusEnum.class, "开始");
//
