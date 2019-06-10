package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\" integrity=\"sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt\" crossorigin=\"anonymous\">-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Oswald:200,300,regular,500,600,700&subset=latin-ext,vietnamese,latin,cyrillic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <title>Online Book Shopping & Renting site</title>\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"scripts/indexJs.js\"></script>\n");
      out.write("        <script src=\"scripts/RegistrationValidation.js\"></script>\n");
      out.write("        <script src=\"scripts/jssor.slider-27.5.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"scripts/validation.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n");
      out.write("        <script src=\"http://code.angularjs.org/1.2.13/angular.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js\"></script>\n");
      out.write("        <script src=\"scripts/RegistrationValidation.js\">\n");
      out.write("                   </script>\n");
      out.write("        <script src=\"scripts/ModuleRouting.js\"></script>\n");
      out.write("        <!--image slaider work-->\n");
      out.write("       <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*jssor slider loading skin spin css*/\n");
      out.write("            .imgs{\n");
      out.write("\n");
      out.write("                height:15rem;\n");
      out.write("            }\n");
      out.write("            .jssorl-009-spin img {\n");
      out.write("                animation-name: jssorl-009-spin;\n");
      out.write("                animation-duration: 1.6s;\n");
      out.write("                animation-iteration-count: infinite;\n");
      out.write("                animation-timing-function: linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes jssorl-009-spin {\n");
      out.write("                from { transform: rotate(0deg); }\n");
      out.write("                to { transform: rotate(360deg); }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*jssor slider bullet skin 052 css*/\n");
      out.write("            .jssorb052 .i {position:absolute;cursor:pointer;}\n");
      out.write("            .jssorb052 .i .b {fill:#000;fill-opacity:0.3;}\n");
      out.write("            .jssorb052 .i:hover .b {fill-opacity:.7;}\n");
      out.write("            .jssorb052 .iav .b {fill-opacity: 1;}\n");
      out.write("            .jssorb052 .i.idn {opacity:.3;}\n");
      out.write("\n");
      out.write("            /*jssor slider arrow skin 053 css*/\n");
      out.write("            .jssora053 {display:block;position:absolute;cursor:pointer;}\n");
      out.write("            .jssora053 .a {fill:none;stroke:#fff;stroke-width:640;stroke-miterlimit:10;}\n");
      out.write("            .jssora053:hover {opacity:.8;}\n");
      out.write("            .jssora053.jssora053dn {opacity:.5;}\n");
      out.write("            .jssora053.jssora053ds {opacity:.3;pointer-events:none;}\n");
      out.write("       \n");
      out.write("       /*contact us modal css*/\n");
      out.write("       /* The Modal (background) */\n");
      out.write(".modal2 {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  padding-top: 100px; /* Location of the box */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write("\n");
      out.write("       </style>\n");
      out.write("\n");
      out.write("    <!--image silder works ended here-->\n");
      out.write("</head>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body ng-app=\"helloworld\" >\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       <!--<hjhg%=(String) session.getAttribute(\"url\")%>-->\n");
      out.write("    <!--<da%=session.getAttribute(\"logInStatus\")%>-->\n");
      out.write("      <nav class=\"navbar navbar-expand-md navbar-light bg-light sticky-top offer\" id=\"fn1\">\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("            <h6  id=\"offer\">30% of on purchase of any book</h6>     \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <!--second navbar---><header>\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-dark bg-dark sticky-top\">\n");
      out.write("            <div class=\"container-fluid\" >\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\" ><img src=\"img/books.png\">BookMine</a>\n");
      out.write("\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-left\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\">   \n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <!--srch box-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"collapse-navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li>\n");
      out.write("                            <button type=\"button\" class=\"srchBtn\" id=\"srchBtn\" onclick=\"search()\"><img src=\"img/srchIcon.png\"  id=\"srchImg\"></button>\n");
      out.write("                        </li>\n");
      out.write("                         <li class=\"nav-item active\">\n");
      out.write("                             <a class=\"nav-link\" href=\"#\"><img src=\"img/home5.png\" alt=\"Home\"> <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("                        <!--//using bootstrap 4 login systemeditable-->\n");
      out.write("                         ");
 if ((String) session.getAttribute("logInStatus") == "in") {
      out.write("\n");
      out.write("                         <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link \" href=\"\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <p  ng-controller=\"UserProfile\" >");
//="Hello" + " " + (String) session.getAttribute("userName")
      out.write("<font color=\"white\">{{fName}}</font></p>\n");
      out.write("                                 \n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <div ng-controller=\"UserProfile\" class=\"dropdown-item\" > <a ui-sref=\"userProfileSection\" ui-sref-active=\"active\" class=\"dropdown-item\">Profile</a></div>\n");
      out.write("           \n");
      out.write("           <a ui-sref=\"userPurchaseSection\" ui-sref-active=\"active\" class=\"dropdown-item\">Your Purchases</a>\n");
      out.write("                                        <!--<a ui-sref=\"userBorrowBooksSection\"  ui-sref-active=\"active\" class=\"dropdown-item\">Borrowed order</a>-->\n");
      out.write("                                        <!--<a ui-sref=\" userRentedBooksSection\" ui-sref-active=\"active\" class=\"dropdown-item\">Rent Book</a>-->\n");
      out.write("                                        <!--<a ui-sref=\"userWalletSection\" ui-sref-active=\"active\" class=\"dropdown-item\">My Wallet</a>-->\n");
      out.write("                                        <form action=\"./SystemLogOut\" method=\"get\"><button class=\"TitleBtn  dropdown-item\">LogOut</button></form>\n");
      out.write("                                  \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("      </li>");
} else {
      out.write("\n");
      out.write("\n");
      out.write("                                <!--<button tye=\"button\" class=\"btnn \" style=\"background-color: #555555;\"   onclick=\"loginForm()\" id=\"logbtn\">LogIn/SignUp</button>-->\n");
      out.write("                       <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"\"    onclick=\"loginForm()\" id=\"logbtn\">LogIn/SignUp <span class=\"sr-only\">(current)</span></a>");
}
      out.write("\n");
      out.write("      </li>\n");
      out.write("                                <!--ended here-->\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("<!--from here login system is build using jsp-->\n");
      out.write("<!--                        <li class=\"nav-item active mr-auto\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"#\" onclick style=\"width:auto;\">\n");
      out.write("                                <//% if ((String) session.getAttribute(\"logInStatus\") == \"in\") {%>\n");
      out.write("                                <div class=\"dropdown nav-item active \">\n");
      out.write("                                    <p class=\"dropbtn\" ng-controller=\"UserProfile\" >");
//="Hello" + " " + (String) session.getAttribute("userName")
      out.write("<font color=\"white\">{{fName}}</font></p>\n");
      out.write("                                    <div class=\"dropdown-content\">\n");
      out.write("                                        <div ng-controller=\"UserProfile\"  > <a ui-sref=\"userProfileSection\" ui-sref-active=\"active\">Profile</a></div>\n");
      out.write("\n");
      out.write("                                        <a ui-sref=\"userPurchaseSection\" ui-sref-active=\"active\">Your Purchases</a>\n");
      out.write("                                        <a ui-sref=\"userBorrowBooksSection\"  ui-sref-active=\"active\">Borrowed order</a>\n");
      out.write("                                        <a ui-sref=\" userRentedBooksSection\" ui-sref-active=\"active\">Rent Book</a>\n");
      out.write("                                        <a ui-sref=\"userWalletSection\" ui-sref-active>My Wallet</a>\n");
      out.write("                                        <form action=\"./SystemLogOut\" method=\"get\"><button class=\"TitleBtn\">LogOut</button></form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div><//%} else {%>\n");
      out.write("\n");
      out.write("                                <button tye=\"button\" class=\"btnn \" style=\"background-color: #555555;\"   onclick=\"loginForm()\" id=\"logbtn\">LogIn/SignUp</button><//%}%>\n");
      out.write("                        </li>-->\n");
      out.write("         <!--jsp login system enden here-->\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"#\"><div class=\"dropdown nav-item active\" ></div>Cart</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"\" id=\"help\"> Help</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--<a class=\"nav-link\" ui-sref=\"home\"  > Borrow Book</a>-->\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"footer\" > Contact Us</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav></header>\n");
      out.write("\n");
      out.write("    <!--search box work--->\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light bg-dark sticky-top offer\" id=\"nav3\">\n");
      out.write("        <form action=\"Search.jsp\" class=\"form-inline justify-content-center\">\n");
      out.write("            <!--write here-->\n");
      out.write("\n");
      out.write("            <div class=\"sample\">\n");
      out.write("                <input type=\"text\" class=\"inputField\" name=\"search\" placeholder=\"Search..\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-outline-primary sm-2\">Search</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-danger\" id=\"cancel\" onclick=\"nav3Show()\">X</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("   <!--this anchor tag is used to containt the url of carts home page called home.jsp-->\n");
      out.write("     <a ui-sref=\"home\" ui-sref-active=\"active\"></a>\n");
      out.write("    <!--<a ui-sref=\"about\" ui-sref-active=\"active\">About</a>-->\n");
      out.write(" \n");
      out.write("\n");
      out.write("   <div ui-view>anurag asthana</div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("   <!--for log in system controller is ng-controller=\"login\"-->\n");
      out.write("     <div id=\"id01\" class=\"modal\" >\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered animate\" >\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header bg-light\">\n");
      out.write("                    <h3>LogIn</h3>\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"closee\" title=\"Close Modal\">\n");
      out.write("                        &times;<!--this is special attribute of html which shows cross elemt on the page study about those attribute--->\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body \">\n");
      out.write("                    <div class=\"form  \">\n");
      out.write("                        <form  action=\"./logInValidation\" method=\"post\" onsubmit=\"return loginValidation()\" class=\"form-group\" >\n");
      out.write("                            <span class=\"badge badge-primary\">Username</span></br>\n");
      out.write("                            <input type=\"text\" name=\"uname\" id=\"username\"  class=\"form-control\" placeholder=\"enter email\" required>\n");
      out.write("                            <span id=\"usernameSpan\" class=\"badge badge-light bg-danger\"></span></br>\n");
      out.write("                            <span class=\"badge badge-primary\">Password</span></br>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"pw\" id=\"password\" placeholder=\"enter password\" required></br>\n");
      out.write("                            <span id=\"passwordSpan\"></span></br>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-outline-primary btn-group-lg ml-auto\"  ng-click=\"logon()\" >LogIn</button>  \n");
      out.write("                            <label>Recover</label> <a href=''> Password</a> or <a href=''> userId</a>\n");
      out.write("         \n");
      out.write("         <input type=\"hidden\"  id=\"hiddentinputatIndex\" value=\"\" name=\"hiddentinputatIndex\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer bg-dark\">\n");
      out.write("                        <label class=\"text-info\">Don't have an account</label> \n");
      out.write("                        <button id=\"reg\"  class=\"text-danger TitleBtn\"  ><b><a ui-sref=\"anurag\" >SignUp</a></b></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div></br>\n");
      out.write("    \n");
      out.write("                         \n");
      out.write("    \n");
      out.write("    <!--/footer-->\n");
      out.write("     <footer class=\"bg-dark \" id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                      <font color=\"white\"><h3>About Us</h3></font>\n");
      out.write("                  <font color=\"white\">  <p> My self Anurag Asthana (B.Tech from the Department Of Computer Science & Engineering) student of Ansal Technical Campus </br>\n");
      out.write("                    <p>  affiliated from Dr. A.P.J. Abdul Kalam Technical University Uttar Pradesh, Lucknow</p>\n");
      out.write("</font>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 list\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Index Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 list\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                        <li><a href=\"#\">Page</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md\">\n");
      out.write("                    <font color=\"white\">  <h5><strong >Contact Info</strong></h5>\n");
      out.write("                    <p><strong>Adress:</strong> xyz\n");
      out.write("                        lucknow<!-- Random Adress -->\n");
      out.write("                    </p>\n");
      out.write("                    <p><strong>Email:</strong> astxxxxxgmail.com</p>\n");
      out.write("                    <p><strong>contact no :</strong> (+91) xxxxxxx582235</p></font>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div></br></br>\n");
      out.write("        <!--  <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md text-center\">\n");
      out.write("        \n");
      out.write("              © 2010-<?php# echo date(\"Y\");?>\n");
      out.write("        \n");
      out.write("            </div> -->\n");
      out.write("\n");
      out.write("        <div>  <ul class=\"ic \">\n");
      out.write("                <li><a href=\"https://www.facebook.com/anurag.asthana.315\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"https://www.linkedin.com/in/raj-kumar-web-designer/\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            </ul></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <!--on scroll top button-->\n");
      out.write("    \n");
      out.write("<button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\"><img src=\"img/top_arrow.png\"></button>\n");
      out.write("<script>\n");
      out.write("// When the user scrolls down 20px from the top of the document, show the button\n");
      out.write("window.onscroll = function() {scrollFunction()};\n");
      out.write("\n");
      out.write("function scrollFunction() {\n");
      out.write("  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"inline-block\";\n");
      out.write("  } else {\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on the button, scroll to the top of the document\n");
      out.write("function topFunction() {\n");
      out.write("  document.body.scrollTop = 0;\n");
      out.write("  document.documentElement.scrollTop = 0;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<!--//contact us modal-->\n");
      out.write("<!-- The Modal -->\n");
      out.write("\n");
      out.write("<!-- Trigger/Open The Modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- The Modal -->\n");
      out.write("<div id=\"myModal5\" class=\"modal5 \">\n");
      out.write("\n");
      out.write("  <!-- Modal content -->\n");
      out.write("  <div class=\"modal5-content bg-light\">\n");
      out.write("   \n");
      out.write("    <div class=\"modal5-header\" \">\n");
      out.write("     <span class=\"close\">&times;</span>\n");
      out.write("    <h2 style=\"font-family: serif\">How May I Help You</h2>\n");
      out.write("  </div></br>\n");
      out.write("      \n");
      out.write("  <center>\n");
      out.write("     <iframe width=\"500\" height=\"315\" src=\"https://www.youtube.com/embed/B202UQwpTOM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("<iframe width=\"500\" height=\"315\" src=\"https://www.youtube.com/embed/ZG0JJeaKJaE\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("     \n");
      out.write("      </center>\n");
      out.write(" \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<style>\n");
      out.write("/* Modal Header */\n");
      out.write(".modal5-header {\n");
      out.write("  padding: 2px 16px;\n");
      out.write("  background-color: #142030;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal5 {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  padding-top: 100px; /* Location of the box */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4);  /*Black w/ opacity */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write(".modal5-content {\n");
      out.write("  position: relative;\n");
      out.write("  background-color: #fefefe;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 0;\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 80%;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("  -webkit-animation-name: animatetop;\n");
      out.write("  -webkit-animation-duration: 0.4s;\n");
      out.write("  animation-name: animatetop;\n");
      out.write("  animation-duration: 0.4s\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button */\n");
      out.write(".close {\n");
      out.write("  color: #aaaaaa;\n");
      out.write("  float: right;\n");
      out.write("  font-size: 28px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: #000;\n");
      out.write("  text-decoration: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("/* Add Animation */\n");
      out.write("@-webkit-keyframes animatetop {\n");
      out.write("  from {top:-300px; opacity:0} \n");
      out.write("  to {top:0; opacity:1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes animatetop {\n");
      out.write("  from {top:-300px; opacity:0}\n");
      out.write("  to {top:0; opacity:1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('myModal5');\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var btn = document.getElementById(\"help\");\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks the button, open the modal \n");
      out.write("btn.onclick = function() {\n");
      out.write("  modal.style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("span.onclick = function() {\n");
      out.write("  modal.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal) {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
