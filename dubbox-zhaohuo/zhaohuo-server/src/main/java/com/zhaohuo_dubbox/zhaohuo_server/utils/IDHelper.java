package com.zhaohuo_dubbox.zhaohuo_server.utils;

public class IDHelper {
	/**
	 * 获取主键ID
	 * 
	 * @return
	 * @throws Exception
	 */
	public static synchronized long getUniqueID() throws Exception {
		if (Constant.SERVER_ID <= 0) {
			throw new Exception("server id error, please check config file!");
		}

		long destID = System.currentTimeMillis() - Constant.ID_BEGIN_TIME;
		destID = (destID << 8) | Constant.SERVER_ID;
		Thread.sleep(1);
		return destID;
	}
}
