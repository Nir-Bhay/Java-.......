# Required libraries: selenium, time

from selenium import webdriver
from selenium.webdriver.common.by import By  # Add this import
import time

# Initialize the WebDriver (make sure you have Chrome or Firefox driver installed)
driver = webdriver.Firefox()  # You can use Firefox by changing this line

# Open WhatsApp Web
driver.get("https://web.whatsapp.com/")
input("Scan the QR code and press Enter after logging in...")

# Store profile picture URLs
profile_pics = {}

while True:
    # Get profile picture URLs for all contacts
    contacts = driver.find_elements(By.CSS_SELECTOR, "span[title]")  # Use By.CSS_SELECTOR
    for contact in contacts:
        name = contact.get_attribute("title")
        pic_url = contact.find_element(By.XPATH, "..").find_element(By.TAG_NAME, "img").get_attribute("src")
        if name not in profile_pics or profile_pics[name] != pic_url:
            print(f"Profile picture changed for {name}!")
            # You can add your notification logic here (e.g., send an email)
            profile_pics[name] = pic_url

    # Wait for a few seconds before checking again
    time.sleep(60)  # Adjust the interval as needed
