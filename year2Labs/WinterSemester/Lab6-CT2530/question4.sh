
#!/bin/bash



for i in `ls -1 /home/`
do

if [ -d /home/$1 ]
 then
	if [ -d /home/$1/public_html ]
		then
			mkdir /home/$1/public_html
			chmod 755 /home/$1/public_html
	fi	
fi


echo '<html><body>user_names Home Page</body></html>' > /home/$1/public_html/index.html
	chmod 644  /home/$1/public_html/index.html

done	
 