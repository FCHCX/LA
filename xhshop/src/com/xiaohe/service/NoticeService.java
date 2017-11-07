package com.xiaohe.service;

import java.util.List;

import com.xiaohe.po.Notice;
import com.xiaohe.po.NoticeControllerVo;

public interface NoticeService {
	//添加文章
	public void addNotice(Notice notice)throws Exception;
	//查询文章
	public List<Notice> qureyAllNotice()throws Exception;
	//删除文章
	public void deleteNotice(Integer notice_id)throws Exception;
	//搜索文章
	public List<NoticeControllerVo> searchNotice()throws Exception;
	//查询文章条数
	public int queryNoticeAllCount()throws Exception;

	
}
