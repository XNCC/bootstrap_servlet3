<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
<script src="js/Chart.js-1.0.1/Chart.js"></script>
<script src="js/Chart.min.js"></script>
<script src="js/Chart.js"></script>
<script src="js/jquery.min.js"></script>
<style>
.c1{
	width:400px;
	height:400px;
	margin:10px auto;
	}
.c1 p{
	margin:10px auto;
	padding:10px auto;
	font-family:"宋体","仿宋",sans-serif; 
	font-weight: bold;  
	 
	}
</style>
</head>
<body>
<!--//////////////////////////////////////////////////////////////////////////-->
<div class="c1">
<p>1,申报单位统计</p>
<canvas id="myChart1" width="400" height="400"></canvas>
<br/>
<br/>
<p>2,money统计</p>
<canvas id="myChart2" width="400" height="400"></canvas>
<br/>
<br/>
<p>3,月份统计</p>
<canvas id="myChart3" width="400" height="400"></canvas>
<br/>
<br/>
<p>4,项目级别统计</p>
<canvas id="myChart4" width="400" height="400"></canvas>
</div>
<div class="c1">
<script>
var ctx1 = document.getElementById("myChart1");
var myChart1 = new Chart(ctx1, {
    type: 'bar',
    data: {
        labels: ["化学化工学院", "信息工程学院", "外国语学院", "体育学院", "机电工程学院", "数学与统计学院"],
        datasets: [{
            label: '# of Votes',
            data: [<%=request.getAttribute("show41")%>, <%=request.getAttribute("show42")%>, <%=request.getAttribute("show43")%>, <%=request.getAttribute("show44")%>, <%=request.getAttribute("show45")%>, <%=request.getAttribute("show46")%>],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});
</script>
<!--//////////////////////////////////////////////////////////////////////////-->
<script>
var ctx2 = document.getElementById("myChart2");
var myChart2 = new Chart(ctx2, {
    type: 'line',
    data: {
        labels: ["1万", "2万", "3万", "4万", "5万"],
        datasets: [{
           label: '数量',  
            data: [<%=request.getAttribute("show21")%>, <%=request.getAttribute("show22")%>,<%=request.getAttribute("show23")%>, <%=request.getAttribute("show24")%>, <%=request.getAttribute("show25")%>],  
            backgroundColor: [  
                'rgba(255, 99, 132, 0.2)',  
                'rgba(54, 162, 235, 0.2)',  
                'rgba(255, 206, 86, 0.2)',  
                'rgba(75, 192, 192, 0.2)',  
                'rgba(153, 102, 245, 0.2)', 
				'rgba(153, 102, 255, 0.2)',  
                'rgba(255, 159, 64, 0.2)'  
            ],  
            borderColor: [  
                'rgba(255,99,132,1)',  
                'rgba(54, 162, 235, 1)',  
                'rgba(255, 206, 86, 1)',  
                'rgba(75, 192, 192, 1)',  
                'rgba(153, 102, 255, 1)', 
				'rgba(153, 102, 225, 1)',  
                'rgba(255, 159, 64, 1)'  
            ],  
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});
</script>
<!--//////////////////////////////////////////////////////////////////////////-->
<script>
var ctx3 = document.getElementById("myChart3");
var myChart3 = new Chart(ctx3, {
    type: 'bar',
    data: {
         labels: ["1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"],  
        datasets: [{  
            label: '2018年 * 数量',  
            data: [<%=request.getAttribute("show30")%>, <%=request.getAttribute("show31")%>,<%=request.getAttribute("show32")%>,<%=request.getAttribute("show33")%>,<%=request.getAttribute("show34")%>,<%=request.getAttribute("show35")%>,<%=request.getAttribute("show36")%>,<%=request.getAttribute("show37")%>,<%=request.getAttribute("show38")%>,<%=request.getAttribute("show39")%>,<%=request.getAttribute("show310")%>,<%=request.getAttribute("show311")%>],  
            backgroundColor: [  
                'rgba(255, 99, 132, 0.2)',  
                'rgba(54, 162, 235, 0.2)',  
                'rgba(255, 206, 86, 0.2)',  
                'rgba(75, 192, 192, 0.2)',  
                'rgba(153, 102, 245, 0.2)', 
				'rgba(153, 102, 255, 0.2)',  
                'rgba(255, 159, 64, 0.2)'  
            ],  
            borderColor: [  
                'rgba(255,99,132,1)',  
                'rgba(54, 162, 235, 1)',  
                'rgba(255, 206, 86, 1)',  
                'rgba(75, 192, 192, 1)',  
                'rgba(153, 102, 255, 1)', 
				'rgba(153, 102, 225, 1)',  
                'rgba(255, 159, 64, 1)'  
            ],  
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});
</script>
<!--//////////////////////////////////////////////////////////////////////////-->
<script>
	var ctx4 = document.getElementById("myChart4");
	//alert("<%=request.getAttribute("show1")%>");
	var myRadarChart4 = new Chart(ctx4, {
    type: 'radar',
    data: {
    	    labels : ["校级项目","国家级项目","省级项目","企业委托","厅级项目"],  
    datasets: [
	        { 
	        	fillColor : "rgba(151,187,205,0.5)",  
				strokeColor : "rgba(151,187,205,1)",  
				pointColor : "rgba(151,187,205,1)",  
				pointStrokeColor : "#fff", 
	        data : [<%=request.getAttribute("show11")%>,<%=request.getAttribute("show12")%>,<%=request.getAttribute("show13")%>,<%=request.getAttribute("show14")%>,<%=request.getAttribute("show15")%>]  ,
			 borderWidth: 1
			  },
	        
			
			]
			
    },
    options: {
			scale: {
				// Hides the scale
				display: true
			}
}
});

    //ctx.beginPath();
	//ctx.setLineDash([5, 15]);
	//ctx.moveTo(0, 50);
	//ctx.lineTo(300, 50);
	//ctx.stroke();
	 ctx.lineCap = 'round';
	// Solid line
	//ctx.beginPath();
	//ctx.setLineDash([]);
	//ctx.moveTo(0, 100);
	//ctx.lineTo(300, 100);
	//ctx.stroke();
    </script>
</body>
</html>