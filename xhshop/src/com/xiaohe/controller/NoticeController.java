package com.xiaohe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.xiaohe.po.Notice;
import com.xiaohe.po.NoticeControllerVo;
import com.xiaohe.service.NoticeService;


@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	//添加文章
	@RequestMapping("/addNotice")
	
	public String  AddNotice(Notice notice,Model model)throws Exception{
		noticeService.addNotice(notice);
		return "redirect:/Notice/qureyAllNotice.action";
	}
	
	//查询文章
	@RequestMapping("/qureyAllNotice")
	public List<Notice> qureyNotice()throws Exception{
		List<Notice> NoticeList = noticeService.qureyAllNotice();
		return NoticeList;
		
	}
	//删除单个文章
	@RequestMapping("/deleteNotice")
	public void deleteNotice(Integer  notice_id)throws Exception{
		noticeService.deleteNotice(notice_id);	
	}
	
	//文章搜索
	@RequestMapping("/searchNotice")
	public String searchNotice(Model model)throws Exception{
		List<NoticeControllerVo> NoticeList = noticeService.searchNotice();
		model.addAttribute("NoticeList",NoticeList);
		int number = noticeService.queryNoticeAllCount();
		System.out.println(NoticeList);
		System.out.println(number);
		model.addAttribute("number", number);
		return "article_list";
	}			
}
