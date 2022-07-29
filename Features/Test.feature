Feature: Tide Website Working 

@Regression
Scenario Outline: Search for the product

	Given User launch chrome and navigate to website
	
	Then User close the pop up frame
	
	Then click on the search box and enter <data>
	
	Then click on the search button
	
	Then user verify the second result
	
	And close the browser
	
	
Examples:
|data  |
|Powder|

@Regression
Scenario: Actions On the Shop Product Tab

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then hover on the shop product tab
       
       Then click on the liquid in the dropdown
       
       And verify the "Studio by Tide Delicates" on the page
       
       And close the browser
       
 @Regression     
Scenario: Navigate to the By Need tab

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
      
       Then click on the additives in by need section
      
       And close the browser
       
       
@Regression      
Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       When User click on learn more on the homepage
       
       And it will take to new page then click on the second tab
       
       And verify that clicking tab take to the exact location in the page title
       
       And close the browser  

   
   
@Regression  
Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then navigate to what's new 
       
       Then user click on read more
       
       And verify the "How to Wash Curtains" open or not
       
       And close the browser     
 
 
@Regression
Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then user click on the our commitment tab
       
       Then click on safety
       
       And click on learn more 
       
       And verify the the article present or not
       
       And close the browser 
       
@Regression
Scenario: Navigate things on footer

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then click on deep clean 
       
       And verify the first heading
       
        And close the browser
        
@Regression
Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then click on how to wash clothes tab
       
       Then click on washing different fabrics and colors
       
       Then go to How to use the clothes article
       
       Then go to new article and verify "How to Use and Care for Cloth Diapers" 
       
       And close the browser       	
	
@Regression
Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then navigate to the coupon tab
       
       And verify the tag line of company
       
       And close the browser
       
       
       
 @Regression
 Scenario: Navigate things on homepage

       Given User launch chrome and navigate to website
       
       Then User close the pop up frame
       
       Then navigate to footer clicked on laundry
       
       Then click on prodcut and retailer
       
       And verify the availability of the product selected
       
        And close the browser 	