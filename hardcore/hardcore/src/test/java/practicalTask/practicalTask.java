package practicalTask;

import org.openqa.selenium.WebDriver;


 class practicalTask {
    constructor() {
        this.driver = new webdriver.Builder()
                .forBrowser('chrome')
                .build();
    }
    async performTask() {
        try {
            // Step 1: Open https://cloud.google.com/
            await this.driver.get('https://cloud.google.com/');

            // Step 2: By clicking the search button on the portal at the top of the page, enter in the search field "Google Cloud Platform Pricing Calculator"
        const searchButton = await this.driver.findElement(By.css('input[placeholder="search"][name="q"]'));
            await searchButton.click();

            // Step 3: Start the search by clicking the search button.
        const searchField = await this.driver.findElement(By.css('input[type="text"]'));
            await searchField.sendKeys('Google Cloud Platform Pricing Calculator');
            await searchButton.click();

            // Step 4: In the search results, click "Google Cloud Platform Pricing Calculator" and go to the calculator page.
        const searchResult = await this.driver.wait(until.elementLocated(By.linkText('Google Cloud Platform Pricing Calculator')), 5000);
            await searchResult.click();

            // Step 5: Activate the COMPUTE ENGINE section at the top of the page
        const computeEngineSection = await this.driver.wait(until.elementLocated(By.xpath('//button[text()="Compute Engine"]')), 5000);
            await computeEngineSection.click();

            // Step 6: Fill in the form with the following data
            // Number of instances: 4
        const numberOfInstancesField = await this.driver.wait(until.elementLocated(By.xpath('//input[@ng-model="listingCtrl.computeServer.quantity"]')), 5000);
            await numberOfInstancesField.clear();
            await numberOfInstancesField.sendKeys(4);

            // Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS
        const operatingSystemDropdown = await this.driver.wait(until.elementLocated(By.xpath('//select[@ng-model="listingCtrl.computeServer.os"]')), 5000);
            await operatingSystemDropdown.click();
        const freeOption = await this.driver.wait(until.elementLocated(By.xpath('//select[@ng-model="listingCtrl.computeServer.os"]/option[text()="Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)"]')), 5000);
            await freeOption.click();

            // VM Class: Regular
        const vmClassDropdown = await this.driver.wait(until.elementLocated(By.xpath('//select[@ng-model="listingCtrl.computeServer.class"]')), 5000);
            await vmClassDropdown.click();
        const regularOption = await this.driver.wait(until.elementLocated(By.xpath('//select[@ng-model="listingCtrl.computeServer.class"]/option[text()="Regular"]')), 5000);
            await regularOption.click();

            // Select Add GPUs
            // Number of GPUs: 1
            // GPU type: NVIDIA Tesla V100
        const addGpusButton = await this.driver.wait(until.elementLocated(By.xpath('//button[text()="Add GPUs"]')), 5000);
            await addGpusButton.click();
                    const numberOfGpusField = await this.driver.wait(until.elementLocated(
                    By.xpath('//input[@ng-model="listingCtrl.computeServer.gpu.numberOfGpus"]')), 5000);
            await numberOfGpusField.clear();
            await numberOfGpusField.sendKeys(1);

        const gpuTypeDropdown = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.gpu.gpuType"]')), 5000);
            await gpuTypeDropdown.click();
        const nvidiaOption = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.gpu.gpuType"]/option[text()="NVIDIA Tesla V100"]')), 5000);
            await nvidiaOption.click();

            // Local SSD: 2x375 Gb
        const localSsdDropdown = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.localSSD"]')), 5000);
            await localSsdDropdown.click();
        const two375GbOption = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.localSSD"]/option[text()="2x375 GB"]')), 5000);
            await two375GbOption.click();

            // Datacenter location: Frankfurt (europe-west3)
        const datacenterLocationDropdown = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.datacenterLocation"]')), 5000);
            await datacenterLocationDropdown.click();
        const frankfurtOption = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.datacenterLocation"]/option[text()="Frankfurt (europe-west3)"]')), 5000);
            await frankfurtOption.click();

            // Commited usage: 1 Year
        const commitedUsageDropdown = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.committedUsage"]')), 5000);
            await commitedUsageDropdown.click();
        const oneYearOption = await this.driver.wait(until.elementLocated(
                    By.xpath('//select[@ng-model="listingCtrl.computeServer.committedUsage"]/option[text()="1 Year"]')), 5000);
            await oneYearOption.click();

            // Step 7: Click Add to Estimate
        const addToEstimateButton = await this.driver.wait(until.elementLocated(
                    By.xpath('//button[text()="Add to Estimate"]')), 5000);
            await addToEstimateButton.click();

            // Step 8: Select EMAIL ESTIMATE
        const emailEstimateButton = await this.driver.wait(until.elementLocated(By.xpath('//button[text()="Email Estimate"]')), 5000);
            await emailEstimateButton.click();

            // Step 9: In a new tab, open https://10minutemail.com or a similar service for generating temporary emails
            await this.driver.executeScript("window.open()");
        const tabs = await this.driver.getAllWindowHandles();
            await this.driver.switchTo().window(tabs[1]);
            await this.driver.get('https://10minutemail.com/');

            // Step 10: Copy the mailing address generated in 10minutemail
        const emailAddressField = await this.driver.wait(until.elementLocated(By.id('mailAddress')), 5000);
        const emailAddress = await emailAddressField.getAttribute('value');

            // Step 11: Return to the calculator, in the Email field enter the address from the previous paragraph
            await this.driver.switchTo().window(tabs[0]);
        const emailInputField = await this.driver.wait(until.elementLocated(By.xpath('//input[@name="email"]')), 5000);
            await emailInputField.sendKeys(emailAddress);

            // Step 12: Press SEND EMAIL
        const sendEmailButton = await this.driver.wait(until.elementLocated(By.xpath('//button[text()="Send Email"]')), 5000);
            await sendEmailButton.click();

            // Step 13: Wait for the letter with the cost calculation and check that the Total Estimated Monthly Cost in the letter matches what is displayed in the calculator
            // Code to verify the cost calculation in the email can be implemented here.
        } catch (error) {
            console.error(error);
        } finally {
            await this.driver.quit();
        }
    }
