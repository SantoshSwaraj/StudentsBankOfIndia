<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>StudentsBankOfIndia</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		
		<link rel="stylesheet" href="./styles/index.css"/>
    <link rel="stylesheet" href="./styles/footer.css"/>

		<script type="text/javascript" src="./scripts/index.js"></script>
	</head>
<body>
<!--=========================================================================================================================-->
<!--=========================================================================================================================-->
<!--=========================================================================================================================-->

<!--========================================================Bannner Starts============================================-->
	<div class="container-fluid">
		<div class="hero">
        <hgroup>
            <h1>Students Bank Of India</h1>        
            <h4><em>(India's First International Bank for Students)</em></h4>
        </hgroup>
        <br/><br/>
        <a href="#login"><button class="btn btn-success btn-lg" role="button">Login</button></a>
      </div>
    </div>
	</div>
  <!--=========================================================================================================================-->
  <!--=========================================================================================================================-->
  <!--=========================================================================================================================-->
  <!--=======================================LogIn Form Starts=========================================-->
	<div class="container">
	<div class="row" style="margin-top:20px" id="login">
	    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
			<form role="form">
				<fieldset>
					<h2>Please Sign In</h2>
					<hr class="colorgraph">
					<div class="form-group">
	                    <input type="username" name="username" id="username" class="form-control input-lg" placeholder="User Name"  required>
					</div>
					<div class="form-group">
	                    <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" required>
					</div>
					<span class="button-checkbox">
						<button type="button" class="btn" data-color="info">Remember Me</button>
	                    <input type="checkbox" name="remember_me" id="remember_me" checked="checked" class="hidden">
						<a href="" class="btn btn-link pull-right">Forgot Password?</a>
					</span>
					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-6 col-sm-6 col-md-6">
	                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Sign In">
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<a href="Registration.html" class="btn btn-lg btn-primary btn-block">Register</a>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	</div>
	<br/><br/>
  <!--=========================================================================================================================-->
  <!--=========================================================================================================================-->
  <!--=========================================================================================================================-->
  <!--============================================Footer Starts===============================================-->
  <!--footer start from here-->
	<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-sm-6 footerleft ">
        <div class="logofooter"> Logo</div>
        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>
        <p><i class="fa fa-map-pin"></i> 210, Aggarwal Tower, Rohini sec 9, New Delhi -        110085, INDIA</p>
        <p><i class="fa fa-phone"></i> Phone (India) : +91 9999 878 398</p>
        <p><i class="fa fa-envelope"></i> E-mail : info@webenlance.com</p>
        
      </div>
      <div class="col-md-2 col-sm-6 paddingtop-bottom">
        <h6 class="heading7">GENERAL LINKS</h6>
        <ul class="footer-ul">
          <li><a href="#"> Career</a></li>
          <li><a href="#"> Privacy Policy</a></li>
          <li><a href="#"> Terms & Conditions</a></li>
          <li><a href="#"> Client Gateway</a></li>
          <li><a href="#"> Ranking</a></li>
          <li><a href="#"> Case Studies</a></li>
          <li><a href="#"> Frequently Ask Questions</a></li>
        </ul>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <h6 class="heading7">LATEST POST</h6>
        <div class="post">
          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>
          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>
          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>
        </div>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <div class="fb-page" data-href="https://www.facebook.com/facebook" data-tabs="timeline" data-height="300" data-small-header="false" style="margin-bottom:15px;" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true">
          <div class="fb-xfbml-parse-ignore">
            <blockquote cite="https://www.facebook.com/facebook"><a href="https://www.facebook.com/facebook">Facebook</a></blockquote>
          </div>
        </div>
      </div>
    </div>
  </div>
</footer>


<div class="copyright">
  <div class="container">
    <div class="col-md-6">
      <p>© 2016 - All Rights with Webenlance</p>
    </div>
    <div class="col-md-6">
      <ul class="bottom_ul">
        <li><a href="#">webenlance.com</a></li>
        <li><a href="#">About us</a></li>
        <li><a href="#">Blog</a></li>
        <li><a href="#">Faq's</a></li>
        <li><a href="#">Contact us</a></li>
        <li><a href="#">Site Map</a></li>
      </ul>
    </div>
  </div>
</div>
</body>
</html>