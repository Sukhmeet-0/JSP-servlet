
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Page</title>
        <style>
            .container{
                width: 30%;
                border: 1px solid black;
                margin: auto;
                padding: 30px;
                font-size:20px;
            }
            #myform table tr td input{
                font-size: 20px;
            }
            
        </style>
    </head>
    <body>
        <h1>Form</h1>
        <div class="container">
            <form id="myform" action="RegisterServlet" method="post">
                <table>
                    <tr>
                        <td>Enter name:</td>
                        <td><input type="text" name="username" placeholder="Enter here.." required/></td>
                           
                    </tr>
                    <tr>
                        <td>Enter your password</td>
                        <td><input type="password" name="userpass" placeholder="Enter password.."required></td>
                    </tr>
                    <tr>
                        <td>Enter email:</td>
                        <td><input type="email" name="useremail" placeholder="Enter your email.."required></td>
                    </tr>
                    <tr>
                        <td>Select Gender</td>
                        <td><input type="radio" name="usergender" value="male"> Male </td>
                        <td><input type="radio" name="usergender" value="female" > Female </td>
                    </tr>
                    <tr>
                        <td>
                            Select your course : 
                        </td>
                        <td>
                            <select name="usercourse" required>
                                <option value="java">Java</option>
                                <option value="Python">Python</option>
                                <option value="Cpp">Cpp</option>
                                <option value="Go">Go</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right">
                            <input type="checkbox" value="checked" name="condition" required>
                        </td>
                        <td>I agree terms and conditions</td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                        <td>
                            <button type="submit">Register</button>
                            <button type="reset">Reset</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
