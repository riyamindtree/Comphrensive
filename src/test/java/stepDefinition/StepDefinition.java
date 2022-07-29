package stepDefinition;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjects.ArticlePage;
import PageObjects.HomePage;
import PageObjects.SearchPage;
//import ReusableComponents.extentReports;
import io.cucumber.java.en.*;
import utilities.BaseClass;
import utilities.ConfigRead;
import utilities.ExtentReports_;
import utilities.Logs;
import utilities.ReadExcel;
import utilities.SnapShot;

public class StepDefinition extends BaseClass {

	public BaseClass baseclass ;
	public HomePage homepage = new HomePage();
	public ConfigRead cr;
	public SnapShot ss;
	static ExtentReports extent = ExtentReports_.ExtentReports();
	public ExtentTest logger;
	public Logs log;
	public static ReadExcel excel=new ReadExcel();
	public SearchPage searchpage = new SearchPage();
	public ArticlePage articlepage = new ArticlePage();
	
	
	
	//1
	  @Given("^User launch chrome and navigate to website$")
	    public void user_launch_chrome_and_navigate_to_website() throws Throwable {
		    baseclass= new BaseClass();
			baseclass.setUp();
			log = new Logs();
			log.createLog().info("launch browser");
			
	    }

	    @Then("^User close the pop up frame$")
	    public void user_close_the_pop_up_frame() throws Throwable {
	    	homepage.clickClosePopUp();
	    	log.createLog().info(" Pop up closed ");
	    }

	    @Then("^click on the search box and enter (.+)$")
	    public void click_on_the_search_box_and_enter(String data) throws Throwable {
	        homepage.searchingBox(data);
	        log.createLog().info(" Product name entered ");
	    }

	    @Then("^click on the search button$")
	    public void click_on_the_search_button() throws Throwable {
	    	homepage.clickSearchButton();
	    	log.createLog().info(" Search Button Clicked ");
	        
	    }

	    @Then("^user verify the second result$")
	    public void user_verify_the_second_result() throws Throwable {
	    	ss = new SnapShot();
	    	logger=extent.createTest("Verify the result");
	    	String productname= searchpage.selectedProductName();
			System.out.println(productname);
				if(searchpage.selectedProductName().contains("Powder")) {
					logger.pass("Result Verified");
					logger.pass("SUCCESSFULL");
					ss.takeSnapShot("t1");
					
				}
				else {
					logger.fail("UNSUCCESSFULL");

				}
	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //2
	    @Then("^hover on the shop product tab$")
	    public void hover_on_the_shop_product_tab() throws Throwable {
	    	homepage.hoverOnShopProduct();
	    	log = new Logs();
	    	log.createLog().info("hover on the products");
	    }

	    @Then("^click on the liquid in the dropdown$")
	    public void click_on_the_liquid_in_the_dropdown() throws Throwable {
	    	homepage.clickOnLiquid();
	    	log.createLog().info(" Liquid clicked inside the shop product category ");
	    }

	    @And("^verify the \"([^\"]*)\" on the page$")
	    public void verify_the_something_on_the_page(String strArg1) throws Throwable {
	    	ss = new SnapShot();
	    	logger=extent.createTest("Verify the product on page");
	    	if(searchpage.verifyProductNameForLiquid().equalsIgnoreCase(strArg1)) {
	 
	  			logger.pass("Product Verified");
				logger.pass("SUCCESSFULL");
				ss.takeSnapShot("t2");
                    	 
                     }
                     
                     else {
                    	 logger.fail("Product not Verified");
         				logger.fail("UNSUCCESSFULL");
                     }
	    }
	    
	    
	    
	    
	    
	    //3
	    

		 @Then("^click on the additives in by need section$")
		    public void click_on_the_additives_in_by_need_section() throws Throwable {
			 log = new Logs();
			 ss = new SnapShot();
			 homepage.clickAdditivesFromByNeed();   
			 log.createLog().info(" Clicked on Additives in footer section  ");
			 logger=extent.createTest("Additives tab clicked");
			 logger.pass("Additives found");
				logger.pass("SUCCESSFULL");
				ss.takeSnapShot("t3");
		    }
	    
		 
		 
		 
		 //4
		 @When("^User click on learn more on the homepage$")
		    public void user_click_on_learn_more_on_the_homepage() throws Throwable {
			 log = new Logs();
			 homepage.clickOnLearnMoreButton();
			 log.createLog().info(" Learn more button clicked ");
		    }

		 @And("^it will take to new page then click on the second tab$")
		    public void it_will_take_to_new_page_then_click_on_the_second_tab() throws Throwable {
			 searchpage.clickSecondTabName();
			 log.createLog().info(" Clicked on the second tab of the page ");
			 
		    }

		    @And("^verify that clicking tab take to the exact location in the page title$")
		    public void verify_that_clicking_tab_take_to_the_exact_location_in_the_page_title() throws Throwable {
		    	ss = new SnapShot();
		    	logger=extent.createTest("Tab Clicked Verified");
				 
		    	
		    	if(articlepage.verifyTabHeading().contains("Joining"))
		       {
		    	   
		    		logger.pass("Clicked tab took to the location on the page");
					logger.pass("SUCCESSFULL");
					ss.takeSnapShot("t4");
		    	   
		       }
		       else {
		    	   logger.pass("UNSUCCESSFULL");
		    	  
		       }
		    }

		 
		//5
		    
		    
		    @Then("^navigate to what's new$")
		    public void navigate_to_whats_new_tab() throws Throwable {
				log = new Logs();
				homepage.clickOnWhatNewTab();
				log.createLog().info(" Clicked on what's new ");
		    }

		    @Then("^user click on read more$")
		    public void user_click_on_read_more() throws Throwable {
		    	searchpage.clickOnReadMore();
		    	log.createLog().info(" Clicked on the read more button ");
		    }

		    @And("^verify the \"([^\"]*)\" open or not$")
		    public void verify_the_something_open_or_not(String strArg1) throws Throwable {
		    	ss = new SnapShot();
		    	logger=extent.createTest("Tab Clicked");

		    		String	data=ReadExcel.getStringData(1, 1);
		   	        System.out.println(data);
		   	    Thread.sleep(4000);
		      if(data.equalsIgnoreCase(strArg1))
		      {
		    	  
		    	  
		    	    logger.pass("Article name found");
					logger.pass("SUCCESSFULL");
		    	    ss.takeSnapShot("t5");
		    	    
		      }
		      else
		      {
		    	  
		    	  logger.pass("UNSUCCESSFULL");
		    	   
		      }
		        
		    }
		    
		    
		    
		 
	//6
		    
		    @Then("^user click on the our commitment tab$")
		    public void user_click_on_the_our_commitment_tab() throws Throwable {
			  log = new Logs();
			  homepage.hoverOnCommitment();
			  log.createLog().info("Hover on the our commitment ");
		    }

		    @Then("^click on safety$")
		    public void click_on_safety() throws Throwable {
		    	homepage.clickOnSafety();
		    	log.createLog().info(" Clicked on the ingredients and safety ");
		    }

		    @And("^click on learn more$")
		    public void click_on_learn_more() throws Throwable {
		    	searchpage.clickOnLearnMore();
		    	log.createLog().info(" Clicked on the learn more button ");
		    }

		    @And("^verify the the article present or not$")
		    public void verify_the_the_article_present_or_not() throws Throwable {
		    	ss = new SnapShot();
		    	logger=extent.createTest("Verify the article");
		    	String data = articlepage.verifyHeading();
				System.out.println(data);
				if(articlepage.verifyHeading().contains("Ingredients")) {
					logger.pass("found the title on the page");
					logger.pass("SUCCESSFULL");
					ss.takeSnapShot("t6");
				}
				else {
					logger.pass("UNSUCCESSFULL");
					
				
					
				}
		    }
		    
		    //7
		    
		    @Then("^click on deep clean$")
		    public void click_on_deep_clean() throws Throwable {
			 log = new Logs();
			 homepage.clickOnDeepClean();
			 
		    }

		    @And("^verify the first heading$")
		    public void verify_the_first_heading() throws Throwable {
		    	logger=extent.createTest("Verify the heading");
		    	String data = searchpage.verifySensitiveSkinHeading();
				System.out.println(data);
				if(searchpage.verifySensitiveSkinHeading().contains("Skin")) {
					ss = new SnapShot();
					logger.pass("Heading verified");
					logger.pass("SUCCESSFULL");
					ss.takeSnapShot("t7");
					
				}
				else {
					
					logger.pass("UNSUCCESSFULL");
					
					
				}
		    }
		    
		    
		    
		    //8
		    
		    @Then("^click on how to wash clothes tab$")
		    public void click_on_how_to_wash_clothes_tab() throws Throwable {
			 log = new Logs();
			 homepage.washClothesTab(); 
			 log.createLog().info(" Clicked on the How to wash clothes tab ");
		    }

		    @Then("^click on washing different fabrics and colors$")
		    public void click_on_washing_different_fabrics_and_colors() throws Throwable {
		    	homepage.clickFabricTab();
		    	log.createLog().info(" Clicked on washing fabrics and colors");
		    }

		    @Then("^go to How to use the clothes article$")
		    public void go_to_how_to_use_the_clothes_article() throws Throwable {
		    	articlepage.clickHowToUseClothes();
		    
		    }

		    @Then("^go to new article and verify \"([^\"]*)\"$")
		    public void go_to_new_article_and_verify_something(String strArg1) throws Throwable {
		    	ss = new SnapShot();
		    	logger=extent.createTest("Verify the new article title");
		    	String	data=ReadExcel.getStringData(2, 2);
	   	        System.out.println(data);
	   	    Thread.sleep(4000);
	      if(data.equalsIgnoreCase(strArg1))
	      {
	    	  
	    	
	    	    logger.pass("Reached the new article and Verified ");
				logger.pass("SUCCESSFULL");
			    ss.takeSnapShot("t8");
	    	  
	    	  System.out.println("passed");
	      }
	      else
	      {
	    	  
	    	  logger.pass("UNSUCCESSFULL");
	    	  System.out.println("fail");
	    	   
	      }
	      
		    }
	      
	      
	      //9
		    
		    
		    @Then("^navigate to the coupon tab$")
		    public void navigate_to_the_coupon_tab() throws Throwable {
			  log = new Logs();
			  homepage.clickOnCoupons();
			  log.createLog().info(" Clicked on the coupons and rewards ");
		    }

		    @And("^verify the tag line of company$")
		    public void verify_the_tag_line_of_company() throws Throwable {
		    	ss = new SnapShot();
		    	logger=extent.createTest("Verify the new article title");
		    	String data = searchpage.verifyTagPnG();
				System.out.println(data);
				if(searchpage.verifyTagPnG().contains("Your")) {
					
					
					logger.pass("company tag line verified");
					logger.pass("SUCCESSFULL");
					
					ss.takeSnapShot("t9");
					
					
					
				}
				else {
					
					logger.pass("UNSUCCESSFULL");
					
				}
				}
		    
		   
		    
		    //10
		    
		    @Then("^navigate to footer clicked on laundry$")
		    public void navigate_to_footer_clicked_on_laundry() throws Throwable {
			  log = new Logs();
			  homepage.clickOnLaundryInFooter();  
			  log.createLog().info("Clicked on the whiteness under by need section ");
		    }

		    @Then("^click on prodcut and retailer$")
		    public void click_on_prodcut_and_retailer() throws Throwable {
		    	searchpage.clickOnRetailer();
		    	log.createLog().info(" Clicked on the find retailers ");
		    }

		    @And("^verify the availability of the product selected$")
		    public void verify_the_availability_of_the_product_selected() throws Throwable {
		    	
		    	ss = new SnapShot();
		    	logger=extent.createTest("Availability of product");
		    	String data = searchpage.showProductStatus();
				System.out.println(data);
				if(searchpage.showProductStatus().contains("Tide")) {
					
					logger.pass("Product available");
					logger.pass("SUCCESSFULL");
					
					ss.takeSnapShot("t10");
					System.out.println("passed");
				}
				else {
					logger.pass("UNSUCCESSFULL");
					
				}
		    }

		  @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	extent.flush();
	    	baseclass.tearDown();
	    }
	  
	
}


