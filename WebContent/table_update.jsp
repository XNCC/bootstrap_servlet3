<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="entity.user_insert"%>
<%@ page import="dao.table_select_dao"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="UTF-8" http-equiv="X-UA-Compatible"
	content="IE=edge,chrome=1" />
<title>Tables - Ready Bootstrap Dashboard</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
	name='viewport' />
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
<link rel="stylesheet" href="assets/css/ready.css">
<link rel="stylesheet" href="assets/css/demo.css">



<link
	href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdn.bootcss.com/bootstrap-select/1.12.4/css/bootstrap-select.min.css"
	rel="stylesheet">

<style>
.overflow {
	overflow: scroll;
}

.table {
	table-layout: fixed;
}

td {
	wide: 500px;
}

.i_left {
	margin-left: 20px;
}
</style>
</head>
<body>


	
		<!-- 左下角对应的table_insert填写包表的部分-->
		<div class="main-panel">
			<div class="content">
				更新部分，，在下列表中填入更新数据,项目批号负责人名称不能更改
				<form action="service.table_update" method="post">
					<%!List<user_insert> users;
	String id;%>
					<%--
						if (session.getAttribute("start_time") != null && session.getAttribute("end_time") != null&& session.getAttribute("username")!=null) {
							String start_time = (String) session.getAttribute("start_time");
							String end_time = (String) session.getAttribute("end_time");
							String username = (String) session.getAttribute("username");
							table_select_dao table_select_dao = new table_select_dao();
							users = table_select_dao.select(start_time, end_time,username);
						}
					--%>
					<%--
						id = request.getParameter("id");
						int a = Integer.parseInt(id);
					--%>
					<table class="table table-responsive">
						<table class="table table-responsive">
							<tr>
								<td><strong>项目批号</strong>&nbsp;&nbsp;&nbsp; <input
									name="projectno" type="text"
									value="<%=request.getParameter("projectno")%> " readonly="readonly"><strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td colspan="2"><strong>项目名称</strong>&nbsp;&nbsp;&nbsp;<input
									type="text" size="57px" name="projectname"></td>
							</tr>
							<tr>
								<td><strong>课题类别</strong>&nbsp;&nbsp;&nbsp; 
		         <select id="sel" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px"
									name="ktlbdm">


										<option value="1">基础性研究</option>
										<option value="2"">应用性研究</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>课题属性</strong>&nbsp;&nbsp;&nbsp; <select
									name="ktsxdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">

										<option value="1">科研项目</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>课题级别</strong>&nbsp;&nbsp;&nbsp; <select
									name="ktjbdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">


										<option value="1">校级项目</option>
										<option value="2">国家级项目</option>
										<option value="3">省部级项目</option>
										<option value="4">企事业委托</option>
										<option value="5">厅级项目</option>

								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
							</tr>
							<tr>
								<td><strong>学科分类</strong>&nbsp;&nbsp;&nbsp; <select
									name="xkfldm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">化学工程</option>
										<option value="2">物理学</option>
										<option value="3">语言学</option>
										<option value="4">体育科学</option>
										<option value="5">信息科学与系统科学</option>
										<option value="6">土木建筑工程</option>
										<option value="7">电子与通信技术</option>
										<option value="8">机械工程</option>
										<option value="9">食品科学技术</option>
										<option value="10">数学</option>
										<option value="11">艺术学</option>
								</select>
								<td><strong>课题方向</strong>&nbsp;&nbsp;&nbsp; <select
									name="ktfxdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">纵向</option>
										<option value="2">横向</option>

								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>负责人&nbsp;&nbsp;&nbsp;&nbsp;</strong>&nbsp;&nbsp;&nbsp;
									<input name="hostname" type="text"
									value="<%=request.getParameter("hostname")%>" readonly="readonly"><strong>&nbsp;&nbsp;&nbsp;*</strong></td>
							</tr>
							<tr>
								<td><strong>经费来源</strong>&nbsp;&nbsp;&nbsp; <select
									name="jflydm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">安徽省科技厅</option>
										<option value="2">安徽省教育厅科研处</option>
										<option value="3">科研处</option>
										<option value="4">国家自然基金</option>
										<option value="5">教育部</option>
										<option value="6">安徽省社科规划办</option>
										<option value="7">企事业</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>

								<td><SPAN><strong>负责人电话</strong><input name="hostid"
										type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><br />&nbsp;
										</strong></SPAN></td>
								<td><strong>结题方式</strong>&nbsp;&nbsp;&nbsp; <select
									name="jtfsdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">论文</option>
										<option value="2">专著</option>
										<option value="3">发明专利</option>
										<option value="4">设计方案</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
							</tr>
							<tr>
								<td><strong>拨付途径</strong>&nbsp;&nbsp;&nbsp; <select
									name="bftjdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">外单位</option>
										<option value="2">学校</option>

								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>批准时间</strong>&nbsp;&nbsp;&nbsp; <input
									name="pzsj" type="date"><strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>研究周期</strong>&nbsp;&nbsp;&nbsp; <input
									name="wcsj" type="date"><strong>&nbsp;&nbsp;&nbsp;*</strong></td>
							</tr>
							<tr>
								<td><strong>总经费(万)</strong> <input name="zjf" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>申报单位</strong>&nbsp;&nbsp;&nbsp; <select
									name="sbdwdm" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">化学化工学院</option>
										<option value="2">信息工程学院</option>
										<option value="3">外国语学院</option>

										<option value="4">体育学院</option>
										<option value="5">建筑工程学院</option>
										<option value="6">机电工程学院</option>
										<option value="7">数学与统计学院</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>

								<td><SPAN><strong>项目第一&nbsp;&nbsp;&nbsp; <input
											name="member1" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><br />参与人
									</strong></SPAN></td>
							</tr>
							<tr>
								<td><SPAN><strong>项目第二&nbsp;&nbsp;&nbsp; <input
											name="member2" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><br />参与人
									</strong></SPAN></td>
								<td><SPAN><strong>项目第三&nbsp;&nbsp;&nbsp; <input
											name="member3" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><BR />参与人
									</strong></SPAN></td>
								<td><SPAN><strong>项目第四&nbsp;&nbsp;&nbsp; <input
											name="member4" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><br />参与人
									</strong></SPAN></td>

							</tr>
							<tr>
								<td><SPAN><strong>项目第五&nbsp;&nbsp;&nbsp; <input
											name="member5" type="text"><strong>&nbsp;&nbsp;&nbsp;*</strong><br />参与人
									</strong></SPAN><</td>
								<td><strong>是否立项</strong>&nbsp;&nbsp;&nbsp; <select
									name="sflx" data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">是</option>
										<option value="0">否</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>
								<td><strong>是否提交</strong>&nbsp;&nbsp; <select name="sftj"
									data-style="btn-info" size="1.3"
									style="width: 65.5%; background: gray; border-radius: 5px">
										<option value="1">是</option>
										<option value="0">否</option>
								</select> <strong>&nbsp;&nbsp;&nbsp;*</strong></td>

							</tr>
							<tr>

							</tr>
							<tr>

								<td><input type="submit" value="更新提交"
									class="btn btn-primary"></td>



							</tr>
						</table>
						</form>

						</div>
						</div>

						</div>
						</div>
						</div>
						</div>
</body>
<script src="assets/js/core/jquery.3.2.1.min.js"></script>
<script src="assets/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="assets/js/core/popper.min.js"></script>
<script src="assets/js/core/bootstrap.min.js"></script>
<script src="assets/js/plugin/chartist/chartist.min.js"></script>
<script
	src="assets/js/plugin/chartist/plugin/chartist-plugin-tooltip.min.js"></script>
<script src="assets/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>
<script src="assets/js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>
<script src="assets/js/plugin/jquery-mapael/jquery.mapael.min.js"></script>
<script src="assets/js/plugin/jquery-mapael/maps/world_countries.min.js"></script>
<script src="assets/js/plugin/chart-circle/circles.min.js"></script>
<script src="assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
<script src="assets/js/ready.min.js"></script>
<script>
	$('#displayNotif')
			.on(
					'click',
					function() {
						var placementFrom = $(
								'#notify_placement_from option:selected').val();
						var placementAlign = $(
								'#notify_placement_align option:selected')
								.val();
						var state = $('#notify_state option:selected').val();
						var style = $('#notify_style option:selected').val();
						var content = {};

						content.message = 'Turning standard Bootstrap alerts into "notify" like notifications';
						content.title = 'Bootstrap notify';
						if (style == "withicon") {
							content.icon = 'la la-bell';
						} else {
							content.icon = 'none';
						}
						content.url = 'index.html';
						content.target = '_blank';

						$.notify(content, {
							type : state,
							placement : {
								from : placementFrom,
								align : placementAlign
							},
							time : 1000,
						});
					});
</script>
<!--自己的js-->
<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap-select/1.12.4/js/i18n/defaults-zh_CN.min.js"></script>
</html>