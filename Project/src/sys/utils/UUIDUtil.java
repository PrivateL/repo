package sys.utils;

import java.util.UUID;

/**
 * 生成随机字符串
 * @author huangkai
 *
 */
public class UUIDUtil {
	/**
	 * 获取随机字符串
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
