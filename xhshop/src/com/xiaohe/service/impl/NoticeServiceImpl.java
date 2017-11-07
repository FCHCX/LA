package com.xiaohe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.NoticeMapperCustom;
import com.xiaohe.po.Notice;
import com.xiaohe.po.NoticeControllerVo;
import com.xiaohe.service.NoticeService;

public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeMapperCustom noticeMapperCustom;
	
	@Override
	//添加文章
	public void addNotice(Notice notice)throws Exception{
		// TODO Auto-generated method stub
		noticeMapperCustom.addNotice(notice);
	}
	//查询所有文章
	@Override
	public List<Notice> qureyAllNotice() throws Exception {
		// TODO Auto-generated method stub
		noticeMapperCustom.qureyAllNotice();
		return null;
	}
	//删除文章
	@Override
	public void deleteNotice(Integer notice_id) throws Exception {
		// TODO Auto-generated method stub
		noticeMapperCustom.deleteNotice(notice_id);		
	}
	//修改文章
	
	//搜索文章
	@Override
	public List<NoticeControllerVo> searchNotice() throws Exception {
		// TODO Auto-generated method stub
		return noticeMapperCustom.searchNotice();
	}
	//查询文章条数
	@Override
	public int queryNoticeAllCount() throws Exception {
		// TODO Auto-generated method stub
		return noticeMapperCustom.queryNoticeAllCount();
	}
}
