<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="entity.user_insert"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width" />
    <title>BootStrap Table 查询使用</title>
    
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="../js/jquery-1.8.2.min.js"></script>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
     <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <style type="text/css">
    .root_fenye span {
       float:left;  
    }
    </style>
</head>
<body>
    <div class="panel-body" style="padding-bottom:0px;">
        <div class="panel panel-default">
            <div class="panel-heading">查询条件</div>
            
             <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_show" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>统计
            </button>
            
            <div class="panel-body">
            
                <form action="service.admin_Selects_Service1"  method="get" id="formSearch" class="form-horizontal">
                    <div class="form-group" style="margin-top:15px">
                        <label class="control-label col-sm-1" for="txt_search_departmentname">开始时间</label>
                        <div class="col-sm-3">
                            <input type="date" class="form-control" id="txt_search_departmentname" name="starttime">
                        </div>
                        <label class="control-label col-sm-1" for="txt_search_statu">结束时间</label>
                        <div class="col-sm-3">
                            <input type="date" class="form-control" id="txt_search_statu" name="endtime">
                        </div>
                        <div class="col-sm-4" style="text-align:left;">
                            <button type="submit" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                        </div>
                    </div>
                </form>
                
                <!-- 申报单位查询-->
				<form action="service.admin_Selects_Service3" method="get">
					<select name="sbdwdm1" data-style="btn-info" size="1.3" style="width:65.5%; background: gray;border-radius:5px">
					        <option value ="1">化学化工学院</option>
						    <option value ="2">信息工程学院</option>
						    <option value="3">外国语学院</option>
							<option value ="4">体育学院</option>
						    <option value ="5">建筑工程学院</option>
						    <option value="6">机电工程学院</option>
						    <option value="7">数学与统计学院</option>
					</select>
						<input type="submit"
						value="申报单位查询"  style="margin-left:50px" id="btn_query" class="btn btn-primary"/>
						
				</form>
				<!-- 项目级别查询-->
				<form action="service.admin_Selects_Service5" method="get">
					<select name="ktjbdm1" data-style="btn-info" size="1.3" style="width:65.5%; background: gray;border-radius:5px">
						<option value ="1">校级项目</option>
						<option value ="2">国家级项目</option>
						<option value ="3">省部级项目</option>
						<option value ="4">企事业委托</option>
						<option value ="5">厅级项目</option>						  
					</select>
                    <input type="submit"
						value="项目级别查询" style="margin-left:50px" id="btn_query" class="btn btn-primary"/>
						
				</form>
				<!-- 经费查询-->
				<form action="service.admin_Selects_Service7" method="get">
					<input type="text" name="zjf1" value="" /> 
					<input type="submit"
						value="经费查询" style="margin-left:50px" id="btn_query" class="btn btn-primary"/>
						
				</form>
                
            </div>
        </div>       

        <div id="toolbar" class="btn-group">
           <!--   <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            -->
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
            <button  id="cancel" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove-circle"   aria-hidden="true"></span>取消选择
            </button>
             <button id="btn_save" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span>保存
            </button>
        </div>
        
        <div style=" overflow:scroll; width:2000px; height:460px;">
        <table id="tb_departments" class="table table-bordered table-hover table-striped ">
                   <thead>
						<th>项目批号11111111111111</th>
						<th>项目名称</th>
						<th>负责人工号</th>
						<th>负责人</th>
						<th>课题级别</th>
						<th>课题属性</th>
						<th>课题类别</th>
						<th>课题方向</th>
						<th>学科分类</th>
						<th>结题方式</th>
						<th>申报单位</th>
						<th>经费来源</th>
						<th>拨付途径</th>
						<th>批准时间</th>
						<th>完成时间</th>
						<th>总经费</th>
						<th>参与人1</th>
						<th>参与人2</th>
						<th>参与人3</th>
						<th>参与人4</th>
						<th>参与人5</th>
						<th>是否提交</th>
						<th>是否立项</th>
						<th>修改</th>
						<th>删除</th>
					</thead>
		<%		
		if ((List<user_insert>) request.getAttribute("list") != null) {
			List<user_insert> list = (List<user_insert>) request.getAttribute("list");
			//session.setAttribute("data", users);
				     
					%>
					
		<%
		if(list.size()>10){
		for(int i=0;i<10;i++) {%>			
        <tr>
          <td><%=list.get(i).getProjectno() %></td>
          <td><%=list.get(i).getProjectname() %></td>
          <td><%=list.get(i).getHostid() %></td>
          <td><%=list.get(i).getHostname() %></td>
          <td><%=list.get(i).getKtjbdm() %></td>
          <td><%=list.get(i).getKtsxdm() %></td>
          <td><%=list.get(i).getKtlbdm()%></td>
          <td><%=list.get(i).getKtfxdm() %></td>
          <td><%=list.get(i).getXkfldm() %></td>
          <td><%=list.get(i).getJtfsdm() %></td>
          <td><%=list.get(i).getSbdwdm() %></td>
          <td><%=list.get(i).getJflydm() %></td>
          <td><%=list.get(i).getBftjdm() %></td>
          <td><%=list.get(i).getPzsj() %></td>
          <td><%=list.get(i).getWcsj() %></td>
          <td><%=list.get(i).getZjf() %></td>
          <td><%=list.get(i).getMenber1() %></td>
          <td><%=list.get(i).getMenber2() %></td>
          <td><%=list.get(i).getMenber3() %></td>
          <td><%=list.get(i).getMenber4() %></td>
          <td><%=list.get(i).getMenber5() %></td>
          <td><%=list.get(i).getSftj() %></td>
          <td><%=list.get(i).getSflx() %></td>   
          <td><a href="table_update.jsp?projectno=<%=list.get(i).getProjectno()%>&hostname=<%=list.get(i).getHostname()%>">修改</a></td>
          <td><a href="service.table_delete?projectno=<%=list.get(i).getProjectno()%>">删除</a></td>   
        </tr>
        <%
       }}
		else{
			for(int i=0;i<list.size();i++) {
		%>
		
			<tr>
        
         <td><%=list.get(i).getProjectno() %></td>
          <td><%=list.get(i).getProjectname() %></td>
          <td><%=list.get(i).getHostid() %></td>
          <td><%=list.get(i).getHostname() %></td>
          <td><%=list.get(i).getKtjbdm() %></td>
          <td><%=list.get(i).getKtsxdm() %></td>
          <td><%=list.get(i).getKtlbdm()%></td>
          <td><%=list.get(i).getKtfxdm() %></td>
          <td><%=list.get(i).getXkfldm() %></td>
          <td><%=list.get(i).getJtfsdm() %></td>
          <td><%=list.get(i).getSbdwdm() %></td>
          <td><%=list.get(i).getJflydm() %></td>
          <td><%=list.get(i).getBftjdm() %></td>
          <td><%=list.get(i).getPzsj() %></td>
          <td><%=list.get(i).getWcsj() %></td>
          <td><%=list.get(i).getZjf() %></td>
          <td><%=list.get(i).getMenber1() %></td>
          <td><%=list.get(i).getMenber2() %></td>
          <td><%=list.get(i).getMenber3() %></td>
          <td><%=list.get(i).getMenber4() %></td>
          <td><%=list.get(i).getMenber5() %></td>
          <td><%=list.get(i).getSftj() %></td>
          <td><%=list.get(i).getSflx() %></td>    
          <td><a href="table_update.jsp?projectno=<%=list.get(i).getProjectno()%>&hostname=<%=list.get(i).getHostname()%>">修改</a></td>
          <td><a href="service.table_delete?projectno=<%=list.get(i).getProjectno()%>">删除</a></td>  
        </tr>
        
        <% 
        }}
		
			}
		
			%>
			
        </table>
     </div>  
    </div>
    <div class="root_fenye">
    <span>
       &nbsp;&nbsp;&nbsp;&nbsp;
       <input type="button" value="上一页" id="btn1"/> 
       <input type="button" value="下一页" id="btn2"/> 
                  总${total}记录数  共${yeshu}页 当前第${idd}页
     </span>
    
    </div>
    <div id="div" style="width: 200px;height:200px"> 
</div> 
</body>
<script>

$(function(){ 
	// 
	 alert("123");
	$("#btn_add").click(function () {
		  alert("123");
		  $.post("user_insert.jsp", {  }, function () { location.href = "user_insert.jsp"; });

	});

	$("#btn_show").click(function () {
		 alert("456");
		//window.location="service.admin_show_service";
		 $.post("service.admin_show_service", {  }, function () { location.href = "service.admin_show_service"; });
		//window.location.href=contextPath+"/service.admin_show_service";
	});  
	});


///ajax请求
$(function(){	
    	 var idd=1;
    	 var pagecurrent=1;	
    	 var number = parseInt(${yeshu});
    
    	 $("#btn1").click(function(){
        	if(pagecurrent>=2){
        		pagecurrent--;
        		//idd--;
            // get方式的Ajax请求
            $.get("${ pageContext.request.contextPath}/service.admin_Selects_Service"+${flag}+"",{"idd":pagecurrent}
            ,function(data){
           //构建html
           $("#tb_departments td").hide();
           dealAndDecoration(data);  
            });
        	 }else{}
        	//
        });
       
        //下一页
        $("#btn2").click(function(){
        	if(number>=pagecurrent){
        		pagecurrent++;
        		//idd++;
        		// get方式的Ajax请求
                $.get("${ pageContext.request.contextPath}/service.admin_Selects_Service"+${flag}+"",{"idd":pagecurrent}
                ,function(data){
                //构建html
                 $("#tb_departments td").hide();
                /*
                */      
              // console.log(data);
               dealAndDecoration(data);     
                });
        	}else{ }//
        });
        ///////////////
        
        
        
      //取消事件  
        var $rads = $("input[name=rad]"); 
    	var $cancel = $("#cancel"); 
    	$cancel.click(function(e){ 
    	$rads.attr("checked",false); 
    	}); 
       //插入事件
    	
    	
    	
    });
    
    
	//数据格式处理加样式展示
	function dealAndDecoration(data){
		 //数据分割
        console.log(data);
        data=data.substring(1);
        data=","+data;
        var s1=data.split("?");
       // console.log(s1);
        
        for(var i=0;i<s1.length-1;i++){
        var s2=s1[i].split(",");
        $("#tb_departments").append('<tr></td> <td>'+s2[1]+'</td> <td>'+s2[2]+'</td> <td>'+s2[3]+'</td> <td>'+s2[4]+'</td> <td>'+s2[5]+'</td> <td>'+s2[6]+'</td> <td>'+s2[7]+'</td> <td>'+s2[8]+'</td> <td>'+s2[9]+'</td> <td>'+s2[10]+'</td> <td>'+s2[11]+'</td> <td>'+s2[12]+'</td> <td>'+s2[13]+'</td> <td>'+s2[14]+'</td> <td>'+s2[15]+'</td> <td>'+s2[16]+'</td> <td>'+s2[17]+'</td> <td>'+s2[18]+'</td> <td>'+s2[19]+'</td> <td>'+s2[20]+'</td> <td>'+s2[21]+'</td> <td>'+s2[22]+'</td> <td>'+s2[23]+'</td> <td><a href="table_update.jsp?projectno='+s2[1]+'&hostname='+s2[4]+'">修改</a></td> <td><a href="service.table_delete?projectno='+s2[1]+'">删除</a></td> </tr> ');               
        }
	}
	
/*
*/
</script>
</html>