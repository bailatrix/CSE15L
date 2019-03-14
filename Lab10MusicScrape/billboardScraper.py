# STEP ONE
import requests
from bs4 import BeautifulSoup

billboard_webpage = 'http://www.billboard.com/charts/hot-100'
request = requests.get( billboard_webpage )
soup = BeautifulSoup( request.text, 'html.parser' )

titles = []
artists = []
titles_HTML = []
artists_HTML = []

# prettyString = soup.prettify().encode( 'utf-8' ).strip()
# print prettyString

for i in soup.find_all( 'span', attrs={'class': 'chart-list-item__title-text'} ):
	titles_HTML.append(i)
for i in soup.find_all( 'div', attrs={'class': 'chart-list-item__artist'} ):
	artists_HTML.append(i)
for title in titles_HTML:
	titles.append( title.text.strip() )

for artist in artists_HTML:
	artists.append( artist.text.strip() )

top10Titles = titles[:10]
top10Artists = artists[:10]

def getSongAndArtist ( song, artist ):
	return song + "by " + artist

for i in range(10):
	song = titles[i]
	artist = artists[i]
	print( getSongAndArtist( song, artist ) )
