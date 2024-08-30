import requests
import os

# GitHub repository details
owner = "kunal-kushwaha"
repo = "DSA-Bootcamp-Java"
path = "lectures"

# Create a session object
session = requests.Session()

# Function to download files
def download_file(url, dest_folder):
    if not os.path.exists(dest_folder):
        os.makedirs(dest_folder)
    local_filename = os.path.join(dest_folder, url.split('/')[-1])
    with session.get(url, stream=True) as r:
        r.raise_for_status()
        with open(local_filename, 'wb') as f:
            for chunk in r.iter_content(chunk_size=8192):
                f.write(chunk)
    return local_filename

# Function to get the list of files in a directory
def get_files_in_directory(owner, repo, path):
    url = f"https://api.github.com/repos/{owner}/{repo}/contents/{path}"
    response = session.get(url)
    response.raise_for_status()
    return response.json()

# Download all PDFs in the directory and subdirectories
def download_all_pdfs(owner, repo, path):
    items = get_files_in_directory(owner, repo, path)
    for item in items:
        if item['type'] == 'file' and item['name'].endswith('.pdf'):
            print(f"Downloading {item['name']}...")
            download_file(item['download_url'], path)
        elif item['type'] == 'dir':
            download_all_pdfs(owner, repo, item['path'])

# Start downloading
download_all_pdfs(owner, repo, path)
