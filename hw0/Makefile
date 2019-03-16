DIR = $(HOME)/../public/hw0

all:
	make -C c
	make -C cpp
	make -C java
	
clean:
	make -C c clean
	make -C cpp clean
	make -C java clean
	
new:
	make clean
	make

backup:
	make -C c backup
	make -C cpp backup
	make -C java backup

directories:
	rm -rf $(HOME)/hw0
	mkdir $(HOME)/hw0
	make -C c directories
	make -C cpp directories
	make -C java directories

install:
	cp $(DIR)/Makefile $(DIR)/README.empty $(HOME)/hw0
	make -C c install
	make -C cpp install
	make -C java install
	
public:		
	# do we need to create the public directory?
	if [ ! -d $(DIR) ]; then  mkdir $(DIR); fi
	
	# lock public directory
	chmod 700 $(DIR)
	
	# copy files to public directory
	cp Makefile README.empty $(DIR)

	# set correct permissions on sources
	chmod 644 $(DIR)/Makefile $(DIR)/README.empty

	# tell sub-assignments to make public
	make -C c public
	make -C cpp public
	make -C java public
	
	# install in tracker's directory
	# rm -rf $(HOME)/../cs12xzz/hw0
	# scp -pr . cs12xzz@ieng6.ucsd.edu:~/hw0

	#unlock public directory
	chmod 755 $(DIR)
