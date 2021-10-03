<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>





<%
	String status = (String) session.getAttribute("status");
	if (status == "success"){     
		out.println("<html><body onload=\"alert('Successfully Added')\"></body></html>");
	}else if (status == "unsuccess"){
		out.println("<html><body onload=\"alert('Something Happened. Try again later.')\"></body></html>");
	}    
	session.setAttribute("status", null);
	
	
	String search_status = (String) session.getAttribute("search_status");
	if (search_status == "unsuccess"){     
		out.println("<html><body onload=\"alert('No Guide found')\"></body></html>");
	}  
	session.setAttribute("search_status", null);
	
	
	String delete_status = (String) session.getAttribute("delete_status");
	if (delete_status == "success"){     
		out.println("<html><body onload=\"alert('Guide deleted successfully')\"></body></html>");
	}  
	session.setAttribute("delete_status", null);
%>





<!doctype html>
<html lang="zxx">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>DIREX</title>
  <!-- google fonts -->
  <link href="//fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap" rel="stylesheet">
  <link href="//fonts.googleapis.com/css2?family=Lato:ital,wght@0,300;0,400;0,700;1,400&display=swap"
    rel="stylesheet">
  <!-- google fonts -->
  <!-- Template CSS -->
  <link rel="stylesheet" href="assets/css/style-starter.css">
  <!-- Template CSS -->
  
  <title>Manage Mangers</title>
  
  
  

  
  
  <style>


.containerr {
  border: 2px solid #656565;
  background-color: #2A2A2A;
  border-radius: 20px;
  padding: 100px;
  
  margin: auto;
  width: 95%;
 
  padding: 10px;
}



.containerr img {
  border-radius: 50%;
}

.containerr span {
  font-size: 20px;
  margin-right: 15px;
}

@media (max-width: 500px) {
  .containerr {
      text-align: center;
    
  }
  .containerr img {
      margin: auto;
  }
}




input[type=submit] {
  width: 40%;
  background-color: DodgerBlue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  
  
}



input[type=submiit]:hover {
  background-color: Gray;
}


input[type=submit]:hover {
  background-color: Gray;
}

.formboader {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}



input[type=submiit] {
  width: 20%;
  padding: 14px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  text-align: center;
  border-radius: 10px;
  border: 2px solid #656565;

  text-align: center;
  align: center; 
}




input[type=text]{
  width: 40%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  text-align: center;
  border-radius: 10px;
  border: 2px solid #656565;

  
}



input[type=email]{  
  width: 40%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  text-align: center;
  border-radius: 10px;
  border: 2px solid #656565;

  
}


.formboader {
  border-radius: 20px;
  border: 2px solid #656565;
  background-color: #2A2A2A;
  padding: 10px;
  width: 95%;
  text-align: center;
  align: center;
  
}


.box {
  position: absolute;
  
  left: 50%;
  transform: translate(-50%, -50%);
}

.box select {
  background-color: #0563af;
  color: white;
  padding: 12px;
  width: 250px;
  border: none;
  font-size: 20px;
  box-shadow: 0 5px 25px rgba(0, 0, 0, 0.2);
  -webkit-appearance: button;
  appearance: button;
  outline: none;
}

.box::before {
  content: "\f13a";
  font-family: FontAwesome;
  position: absolute;
  top: 0;
  right: 0;
  width: 20%;
  height: 100%;
  text-align: center;
  font-size: 28px;
  line-height: 45px;
  color: rgba(255, 255, 255, 0.5);
  background-color: rgba(255, 255, 255, 0.1);
  pointer-events: none;
}

.box:hover::before {
  color: rgba(255, 255, 255, 0.6);
  background-color: rgba(255, 255, 255, 0.2);
}

.box select option {
  padding: 30px;
}
 
    </style>
  
  
  
</head>

<body>
  <!--header-->
  <header id="site-header" class="fixed-top">
    <div class="container">
      <nav class="navbar navbar-expand-lg stroke">
        <a class="navbar-brand" href="index.html">
            <img src="assets/images/logo 2.png"  style="height:25px;" />
        </a> 
        <button class="navbar-toggler  collapsed bg-gradient" type="button" data-toggle="collapse"
          data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false"
          aria-label="Toggle navigation">
          <span class="navbar-toggler-icon fa icon-expand fa-bars"></span>
          <span class="navbar-toggler-icon fa icon-close fa-times"></span>
          </span>
        </button>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="about.html">Accommodation</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="services.html">Destinations</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="services.html">Foreign Packages</a>
              </li>
    
            <li class="nav-item">
              <a class="nav-link" href="contact.html">Tickets</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="contact.html">Payments</a>
              </li>

          </ul>
        </div>

        <!-- toggle switch for light and dark theme -->
        <div class="mobile-position">
          <nav class="navigation">
            <div class="theme-switch-wrapper">
              <label class="theme-switch" for="checkbox">
                <input type="checkbox" id="checkbox">
                <div class="mode-container">
                  <i class="gg-sun"></i>
                  <i class="gg-moon"></i>
                </div>
              </label>
            </div>
          </nav>
        </div>
        <!-- //toggle switch for light and dark theme -->



    </header>
        
 
  <!-- //header -->
   

<br>
<br>
<br>
<br>
<br>



<hr align="center" style="background: #656565; height: 1px; width: 100%" />


<h2 style="line-height: 45px" ><font face="Arial"  style="color: white"><center>Direx Tourism</center></font></h2>

<p><span style="font-family:Arial,Helvetica,sans-serif;"><center>Happiness is Traveling</center></span></p>

<hr align="center" style="background: #656565; height: 1px; width: 100%" />


<h2 style="line-height: 45px" ><font face="Arial"  style="color: white"><center>Financial Management</center></font></h2>
<br>
<br>

<div class="containerr">



<br>
<br>



<br>
<br>




<center>
<div class="formboader"><center>

   <h4 style="text-align: center;"><span style="color:#3399ff;"><strong>Search Payment by Payment ID</strong></span></h4>
      
   <form action="paymentidd" method="post" onSubmit="return validateSearch()"><center>
   
   


   <input type="text" name="paymentid" placeholder="Enter Payment ID" ><br>
   
  <input type="submit" name="submit" value="Search">
  
  </center>
  </form>
  
   </div>
   <br> 
   

   
       <br> <br> 
   
  
<hr align="center" style="background: #656565; height: 5px; width: 100%" />
    
    
    <br> <br> 
    

   
   
		
<div class="formboader">


  <form action="getpayment" method="post"><center>
  
    <h4 style="text-align: center;"><span style="color:#3399ff;"><strong>Payment Information</strong></span></h4>
    
    
              
      <h6 style="text-align: center;"><span style="color:white;"><strong>Payment ID</strong></span></h6>
  <center>
    
    
    <input type="text" name="paymentID" id="paymentID" placeholder="payment ID"  required value="${payment.getpaymentid()}"><br>
   
       <h6 style="text-align: center;"><span style="color:white;"><strong>Customer ID</strong></span></h6>
          
   <input class="text" type="text" name="customerid" placeholder="Customer id" class="form-control" required value="${payment.getcustomerid()}"><br>
   
         <h6 style="text-align: center;"><span style="color:white;"><strong>customer Name</strong></span></h6>
   
      <input class="text" type="text" name="customername" placeholder="Customer Name" class="form-control" value="${payment.getcustomername()}"><br>
      
         <h6 style="text-align: center;"><span style="color:white;"><strong>Accommodation price</strong></span></h6>

   <input class="text" type="text" name="accprice" placeholder="Accommodation price" class="form-control" value="${payment.getaccprice()}"><br>
   
      <h6 style="text-align: center;"><span style="color:white;"><strong>Transportation price</strong></span></h6>
   
   <input class="text" type="text" name="transprice" placeholder="Transportation price" class="form-control" value="${payment.gettransprice()}">
   <br>
     <h6 style="text-align: center;"><span style="color:white;"><strong>Tour Guide price</strong></span></h6>
   
   <input class="text" type="text" name="tourprice" placeholder="Tour Guide price" class="form-control" value="${payment.gettourprice()}">
   <br>
   
     <h6 style="text-align: center;"><span style="color:white;"><strong>Total</strong></span></h6>
   
   <input class="text" type="text" name="total" placeholder="Total" class="form-control" value="${payment.gettotal()}">
   <br>
   
     <h6 style="text-align: center;"><span style="color:white;"><strong>Payment date</strong></span></h6>
   
   <input class="text" type="text" name="paymentdate" placeholder="Payment date" class="form-control" value="${payment.getpaymentdate()}">
   <br>


    
         
       <br>   <br>   
           
 
</div>

</form>



    
</form>
   <br>
      <br>   <br>
      <br>
      


<br>

<a href="report.jsp"> <input type="submit" class="b" name="submit"  value="Generate Report"> </a>

<br>

</div>



  <center>
   <a href="Adminhome.jsp"> <input type="submiit" name="submt"  value="BACK"> </a>
</center>

</div>

<p style="text-align: center;">&nbsp;</p>





<p>&nbsp;</p>



<p style="text-align: center;">&nbsp;</p>



<p>&nbsp;</p>








<br>


  <footer>
    <!-- footer -->
    <section class="w3l-footer">
      <div class="w3l-footer-16-main py-5">
        <div class="container">
          <div class="row">
            <div class="col-lg-6 column">
              <div class="row">
                <div class="col-md-4 column">
                  <h3>Company</h3>
                  <ul class="footer-gd-16">
                    <li><a href="index.html">Home</a></li>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="services.html">Services</a></li>
                    <li><a href="blog.html">Feedback</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                  </ul>
                </div>
                <div class="col-md-4 column mt-md-0 mt-4">
                  <h3>Contact Us</h3>
                  <ul class="footer-gd-16">
                    <li><b>Hotline</b> </li>
                    <li>+9411 2 404 333</li>
                    <li><b>DIREX Tours Head Office</b> </li>
                    <li>+9411 2 404 232   +9411 2 404 878</li>
                    <li><b>Address</b></li>
                    <li>No 65, Galle Road, Colombo 03.</li>
                  </ul>
                </div>
                <div class="col-md-4 column mt-md-0 mt-4">
                  <h3>About Us</h3>
                  <ul class="footer-gd-16">
                    <li>With DIREX Tours,
                         you can make a direct connection with some of the world’s most frequent travel guiders.
                          Our readers are actively researching and planning for your next trip, 
                          and come to us for travel ideas and inspiration.
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-lg-6 col-md-12 column pl-lg-5 column4 mt-lg-0 mt-5">
              <h3>Newsletter </h3>
              <div class="end-column">
                <h4>Get latest updates and offers.</h4>
                <form action="#" class="subscribe" method="post">
                  <input type="email" name="email" placeholder="Email Address" required="">
                  <button type="submit">Submit</button>
                </form>
                <p>Sign up for our latest news & articles. We won’t give you spam mails.</p>
              </div>
            </div>
          </div>
          <div class="d-flex below-section justify-content-between align-items-center pt-4 mt-5">
            <div class="columns text-lg-left text-center">
              <p>&copy; 2021 DIREX Tours. All rights reserved. Design by DIREX </p>
            </div>
            <div class="columns-2 mt-lg-0 mt-3">
              <ul class="social">
                <li><a href="#facebook"><span class="fa fa-facebook" aria-hidden="true"></span></a>
                </li>
                <li><a href="#linkedin"><span class="fa fa-linkedin" aria-hidden="true"></span></a>
                </li>
                <li><a href="#twitter"><span class="fa fa-twitter" aria-hidden="true"></span></a>
                </li>
                <li><a href="#google"><span class="fa fa-google-plus" aria-hidden="true"></span></a>
                </li>
                <li><a href="#github"><span class="fa fa-github" aria-hidden="true"></span></a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
  
      <!-- move top -->
      <button onclick="topFunction()" id="movetop" title="Go to top">
        <span class="fa fa-angle-up"></span>
      </button>
      <script>
        // When the user scrolls down 20px from the top of the document, show the button
        window.onscroll = function () {
          scrollFunction()
        };
  
        function scrollFunction() {
          if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
            document.getElementById("movetop").style.display = "block";
          } else {
            document.getElementById("movetop").style.display = "none";
          }
        }
  
        // When the user clicks on the button, scroll to the top of the document
        function topFunction() {
          document.body.scrollTop = 0;
          document.documentElement.scrollTop = 0;
        }
      </script>
      <!-- //move top -->
      <script>
        $(function () {
          $('.navbar-toggler').click(function () {
            $('body').toggleClass('noscroll');
          })
        });
      </script>
    </section>
    <!-- //footer -->
  </footer>
  <!-- Template JavaScript -->
  <script src="assets/js/jquery-3.3.1.min.js"></script>
  <script src="assets/js/theme-change.js"></script>
  <!--/slider-js-->
  <script src="assets/js/jquery.min.js"></script>
  <script src="assets/js/modernizr-2.6.2.min.js"></script>
  <script src="assets/js/jquery.zoomslider.min.js"></script>
  <!--//slider-js-->
  <script src="assets/js/owl.carousel.js"></script>
  <!-- script for tesimonials carousel slider -->
  <script>
    $(document).ready(function () {
      $("#owl-demo1").owlCarousel({
        loop: true,
        margin: 20,
        nav: false,
        responsiveClass: true,
        responsive: {
          0: {
            items: 1,
            nav: false
          },
          736: {
            items: 1,
            nav: false
          },
          1000: {
            items: 1,
            nav: false,
            loop: true
          }
        }
      })
    })
  </script>
  <!-- //script for tesimonials carousel slider -->
  <!-- stats number counter-->
  <script src="assets/js/jquery.waypoints.min.js"></script>
  <script src="assets/js/jquery.countup.js"></script>
  <script>
    $('.counter').countUp();
  </script>
  <!-- //stats number counter -->

  <!--/MENU-JS-->
  <script>
    $(window).on("scroll", function () {
      var scroll = $(window).scrollTop();

      if (scroll >= 80) {
        $("#site-header").addClass("nav-fixed");
      } else {
        $("#site-header").removeClass("nav-fixed");
      }
    });

    //Main navigation Active Class Add Remove
    $(".navbar-toggler").on("click", function () {
      $("header").toggleClass("active");
    });
    $(document).on("ready", function () {
      if ($(window).width() > 991) {
        $("header").removeClass("active");
      }
      $(window).on("resize", function () {
        if ($(window).width() > 991) {
          $("header").removeClass("active");
        }
      });
    });
  </script>
  <!--//MENU-JS-->
  
  
    <!--//new-JS-->
  
  <script>
	function validateForm() {
	  var country = document.forms["add_guide"]["country"].value;
	  var name = document.forms["add_guide"]["name"].value;
	  var email = document.forms["add_guide"]["email"].value;
	  var description = document.forms["add_guide"]["description"].value;
	  if (name == "") {
	    alert("Name must be filled out");
	    return false;
	  }else if (email == "") {
			alert("Email must be filled out");
		   	return false;
		  }else if (country == "") {
				alert("Country must be filled out");
			   	return false;
			  }else if (description == "") {
					alert("Description must be filled out");
				   	return false;
				  } 
	}
	
	function validateSearch() {
		  var id = document.forms["search_guide"]["id"].value;
		  
		  if (id == "") {
		    alert("ID must be filled out");
		    return false;
		  }
		}
</script>
  
  
  

  <script src="assets/js/bootstrap.min.js"></script>

</body>

</html>