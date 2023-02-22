When performing the task, use the capabilities of Selenium WebDriver, the unit testing framework and the Page Object concept. Automate the following script:

1. Open https://cloud.google.com/

2. By clicking the search button on the portal at the top of the page, enter in the search field "Google Cloud Platform Pricing Calculator"

3. Start the search by clicking the search button.

4. In the search results, click "Google Cloud Platform Pricing Calculator" and go to the calculator page.

5. Activate the COMPUTE ENGINE section at the top of the page

6. Fill in the form with the following data:

    * Number of instances: 4

    * What are these instances for ?: leave blank

    * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS

    * VM Class: Regular

    * Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

    * Select Add GPUs

        * Number of GPUs: 1

        * GPU type: NVIDIA Tesla V100

    * Local SSD: 2x375 Gb

    * Datacenter location: Frankfurt (europe-west3)

    * Commited usage: 1 Year

7. Click Add to Estimate

8. Select EMAIL ESTIMATE

9. In a new tab, open https://10minutemail.com or a similar service for generating temporary emails

10. Copy the mailing address generated in 10minutemail

11. Return to the calculator, in the Email field enter the address from the previous paragraph

12. Press SEND EMAIL

13. Wait for the letter with the cost calculation and check that the Total Estimated Monthly Cost in the letter matches what is displayed in the calculator
