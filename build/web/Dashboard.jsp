<%-- 
    Document   : Dashboard
    Created on : Nov 29, 2017, 12:19:13 PM
    Author     : kapil
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ page import="javax.servlet.http.*" %>
<%@ page import="myproject.TwitterSentimentAnalysis" %>
<%@ page import="myproject.getset" %>

 <!DOCTYPE html>
<html lang="en">
<head>
  <title> Dashboard </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
      <div class="col-sm-3 sidenav" style="height:200px;">
      <h4>Welcome Admin</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="index.html">Home</a></li>
        
      </ul><br>
      <form action="getValue">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search here..." name="search_me">
        <span class="input-group-btn">
          <input class="btn btn-default" type="submit" value="ok">
            <span class="glyphicon glyphicon-search"></span>
          
        </span>
      </div>
          </form>
    </div>
    
      <h4>Searched Posts</h4>
      <%
          int countmy=0;
          String value=(String)request.getSession().getAttribute("data");
          //int cnt=(int)request.getSession().getAttribute("counte");
          //if(cnt>0)
          {
        
              %>
              <h2>You have selected : <%=(String)request.getSession().getAttribute("data") %>
            
         </h2> 
              <%    
                  getset.setValue(value);
                  getset.callmain();
          }
     
      %>
              
      <hr>
    
    
      <%
       if(myproject.TwitterSentimentAnalysis.status==1)
{
    ArrayList<String> tweets =myproject.TwitterSentimentAnalysis.getTweets(value);
    try
    {
         for(String args:tweets)
    {
      %>
      
          <table class="table">
    <thead>
      <tr>
        <th>Tweet Number</th>
        <th>Tweets</th>
      </tr>
    </thead>
    <tbody>
      <tr>
          <td><%=countmy++%></td>
        <td><%=args%></td>
        
      </tr>
    </tbody>
  </table>
    
      <%
      }
      }catch(Exception r){}
      }
       %>
</div>
</div>


</body>
</html>
