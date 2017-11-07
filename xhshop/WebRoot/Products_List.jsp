<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" /> 
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/style.css"/>       
        <link rel="stylesheet" href="assets/css/ace.min.css" />
        <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
        <link rel="stylesheet" href="Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
        <link href="Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />   
		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
	    <script src="js/jquery-1.9.1.min.js"></script>   
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<script src="assets/js/jquery.dataTables.min.js"></script>
		<script src="assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="js/H-ui.js"></script> 
        <script type="text/javascript" src="js/H-ui.admin.js"></script> 
        <script src="assets/layer/layer.js" type="text/javascript" ></script>
        <script src="assets/laydate/laydate.js" type="text/javascript"></script>
        <script type="text/javascript" src="Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script> 
        <script src="js/lrtk.js" type="text/javascript" ></script>
<title>产品列表</title>
</head>
<body>
<form action="" name="allMethod" method="post" id="">
<div class=" page-content clearfix">
 <div id="products_style">
    <div class="search_style">
     
      <ul class="search_content clearfix">
     <!--  <form action="" name="search" method="post"> -->
      <li><label class="l_f">商品名称</label><input name="shopinfoCustom.sname" type="text" id="searchInput" class="text_add" placeholder="输入品牌名称"  style=" width:250px"/></li>
     
       <li style="width:90px;"><button type="button" class="btn_search" onclick="searchItems()"><i class="icon-search"></i>查询</button></li>
       按价格：<input type="text" name="left" align="top" ></input> ~ <input type="text" name="right" align="top">
       <li style="width:90px;"><button type="button" class="btn_search" onclick="queryItemsBySize()"><i class="icon-search"></i>筛选</button></li>
       
      
       <!-- </form> -->
      </ul>
    </div>
  <!--   <form action="" id="" name="queryItemsByType" method="post"> -->
    商品类型：
		<select name="shopinfoCustom.stype">
			
				<option value="服装">服装</option>		
				<option value="药品">药品</option>	
				<option value="保健品">保健品</option>	
				<option value="老年运动器械">老年运动器械</option>
				<option value="食品">食品</option>	
				<option value="学习">学习</option>	
				<option value="男装">男装</option>		
				<option value="女装">女装</option>	
				<option value="鞋靴">鞋靴</option>	
				<option value="帽子">帽子</option>								
		</select>
       <li style="width:90px;"><button type="button" class="btn_search" onclick="searchItems1()"><i class="icon-search"></i>查询</button></li>
       <!-- </form> -->
       
     <div class="border clearfix">
       <span class="l_f">
        <a href="picture-add.jsp" title="添加商品" class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
        <button  class="btn btn-danger" onclick="deleteItemsByMoreId()"><i class="icon-trash"></i>批量删除</button>
       </span>
       <span class="r_f">共：<b>${number}</b>件商品</span>
     </div>
     <!--产品列表展示-->
     <div class="h_products_list clearfix" id="products_list">
     	
       <div id="scrollsidebar" class="left_Treeview">
        <div class="show_btn" id="rightArrow"><span></span></div>
        <div class="widget-box side_content" >
         <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
         <div class="side_list"><div class="widget-header header-color-green2"><h4 class="lighter smaller">产品类型列表</h4></div>
         <div class="widget-body">
          <div class="widget-main padding-8"><div id="treeDemo" class="ztree"></div></div>
        </div>
       </div>
      </div>  
     </div>
         <div class="table_menu_list" id="testIframe">
       <table class="table table-striped table-bordered table-hover" id="sample-table">
		<thead>
		
		 <tr>
				<th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="80px">商品 ID</th>
				<th width="80px">商品图片</th>
				<th width="250px">商品名称</th>
			
				<th width="100px">商品明细</th>
				<th width="100px">类型</th>
                <th width="100px">商品价格</th>
                <th width="100px">兑换积分</th>
                <th width="130px">商品上架状态</th>						
				          
				<th width="200px">操作</th>
			</tr>
		</thead>
	<tbody>
	<!-- <form action="" name="deleteMore1" method="post" id=""> -->
	<c:forEach items="${itemsList}" var="item">
     <tr>
     	
        <td width="25px"><label><input type="checkbox" class="ace" name="items_id" value="${item.sid}"><span class="lbl"></span></label></td>
       
         <td width="80px">${item.sid }</td>             
        
         <td width="100px"><img id="img_upload" src="/pic/${item.simgpath}" width="100" /></td>
         <td width="250px"><u  class="text-primary" onclick="">${item.sname }</u></td>
        <td width="100px">${item.sdetail }</td>
        <td width="100px">${item.stype }</td> 
        <td width="100px">${item.sprice }</td>   
        <td width="100px">${item.spoint}</td>       
        <td width="100px">${item.sstatus }</td>
        
        <td class="td-manage">
        
        <a title="修改" onclick="" href="${pageContext.request.contextPath }/items/editItems.action?sid=${item.sid }"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> 
        <button href=""  onclick="deletesingle()" class="btn btn-xs btn-warning" title="删除"><i class="icon-trash  bigger-120"></i></button>
       </td>
	  </tr>
      </c:forEach>
	<!-- </form> -->
    </tbody>
    </table>
    </div>  

  </div>
 </div>
</div>
	</form>
</body>
</html>
<script>
jQuery(function($) {
		var oTable1 = $('#sample-table').dataTable( {
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,3,4,5,8,9]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			});
 laydate({
    elem: '#start',
    event: 'focus' 
});
$(function() { 
	$("#products_style").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		spacingw:30,//设置隐藏时的距离
	    spacingh:260,//设置显示时间距
	});
});
</script>
<script type="text/javascript">
//初始化宽度、高度  
 $(".widget-box").height($(window).height()-215); 
$(".table_menu_list").width($(window).width()-260);
 $(".table_menu_list").height($(window).height()-215);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$(".widget-box").height($(window).height()-215);
	 $(".table_menu_list").width($(window).width()-260);
	  $(".table_menu_list").height($(window).height()-215);
	})
 
/*******树状图*******/
var setting = {
	view: {
		dblClickExpand: false,
		showLine: false,
		selectedMulti: false
	},
	data: {
		simpleData: {
			enable:true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: ""
		}
	},
	callback: {
		beforeClick: function(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree");
			if (treeNode.isParent) {
				zTree.expandNode(treeNode);
				return false;
			} else {
				demoIframe.attr("src",treeNode.file + ".html");
				return true;
			}
		}
	}
};

var zNodes =[
	{ id:1, pId:0, name:"商城分类列表", open:true},
	{ id:11, pId:1, name:"食品"},
	{ id:111, pId:11, name:"维生素类"},
	{ id:112, pId:11, name:"活性菌类"},
	{ id:113, pId:11, name:"微量元素"},
	
	{ id:12, pId:1, name:"药品"},
	{ id:121, pId:12, name:"减肥 "},
	{ id:122, pId:12, name:"健美 "},
	{ id:13, pId:1, name:"用品"},
	{ id:131, pId:13, name:"健身器 "},
	{ id:132, pId:13, name:"按摩器 "},
	{ id:133, pId:13, name:"衣服"},
	{ id:134, pId:13, name:"鞋"},
	{ id:14, pId:1, name:"化妆品"},
	{ id:141, pId:14, name:"防晒 "},
	{ id:42, pId:14, name:"染发 "},
];
		
var code;
		
function showCode(str) {
	if (!code) code = $("#code");
	code.empty();
	code.append("<li>"+str+"</li>");
}
		
$(document).ready(function(){
	var t = $("#treeDemo");
	t = $.fn.zTree.init(t, setting, zNodes);
	demoIframe = $("#testIframe");
	demoIframe.bind("load", loadReady);
	var zTree = $.fn.zTree.getZTreeObj("tree");
	zTree.selectNode(zTree.getNodeByParam("id",'11'));
});	
/*产品-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*产品-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*产品-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}

/*产品-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form').on('click', function(){
	var cname = $(this).attr("title");
	var chref = $(this).attr("href");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe').html(cname);
    parent.$('#iframe').attr("src",chref).ready();;
	parent.$('#parentIframe').css("display","inline-block");
	parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
    parent.layer.close(index);
	
});

function searchItems(){
	//提交form
	document.allMethod.action="${pageContext.request.contextPath }/items/searchItems.action";
	
	document.allMethod.submit();
	
	//window.location = "${pageContext.request.contextPath }/items/searchItems.action?shopinfoCustom.sname="+document.getElementById("searchInput").value;
}

function deleteItemsByMoreId(){
	//提交form
	document.allMethod.action="${pageContext.request.contextPath }/items/deleteItemsByMoreId.action";
	
	document.allMethod.submit();
	//window.location = "${pageContext.request.contextPath }/items/deleteItemsByMoreId.action?items_id="+document.getElementById("deleteByMoreId").value;
}

function deletesingle(){
	//提交form
	
	document.allMethod.action="${pageContext.request.contextPath }/items/deleteSingle.action";
	
	document.allMethod.submit();
	//window.location = "${pageContext.request.contextPath }/items/deleteItemsByMoreId.action?items_id="+document.getElementById("deleteByMoreId").value;
}
function queryItemsBySize(){
	//提交form
	document.allMethod.action="${pageContext.request.contextPath }/items/queryItemsByBetweenSize.action";
	
	document.allMethod.submit();
	//window.location = "${pageContext.request.contextPath }/items/deleteItemsByMoreId.action?items_id="+document.getElementById("deleteByMoreId").value;
}
function searchItems1(){
	//提交form
	document.allMethod.action="${pageContext.request.contextPath }/items/queryItemsByType.action";
	
	document.allMethod.submit();
	
	//window.location = "${pageContext.request.contextPath }/items/searchItems.action?shopinfoCustom.sname="+document.getElementById("searchInput").value;
}
	
</script>
