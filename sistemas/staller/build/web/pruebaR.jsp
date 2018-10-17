

<%@page import="java.util.Iterator"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%

try
{
     String s[]=null;
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pvdv", "root", "987565");

Statement st1=con.createStatement();
ResultSet rs=st1.executeQuery("select * from clientes");
  List li = new ArrayList();

        while(rs.next())
        {
            li.add(rs.getString(1));
        }

        String[] str = new String[li.size()];
        Iterator it = li.iterator();

        int i = 0;
       while(it.hasNext())
       {
           String p = (String)it.next();
           str [i] = p; str[i] = p;
           i ++; i++;
        }

    // inicio relacionado con jQuery //jQuery related start
      String query = (String)request.getParameter("q");

       int cnt=1;
       for(int j=0;j<str.length;j++)
       { 
            if(str[j].toUpperCase().startsWith(query.toUpperCase()))
           { 
               out.print(str[j]+"\n");
               if(cnt>=5)// 5=How many results have to show while we are typing(auto suggestions)
               break;
            cnt++;
             }
        }
    // jQuery relacionado con el final //jQuery related end

 rs.close();
 st1.close();
 con.close();

 }
  catch(Exception e){
e.printStackTrace (); e.printStackTrace();
 }

//www.java4s.com //www.java4s.com
  
%>
