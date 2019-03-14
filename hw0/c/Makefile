EXE  = a.out
CC_CMD = gcc -Wall --pedantic -g -O0
DIR = $(HOME)/../public/hw0/c

all: $(EXE)

$(EXE): hw0.o
	$(CC_CMD) -o $@ $^

purify: hw0.c
	purify -cache-dir=$(HOME)/PURIFY $(CC_CMD) -o $(EXE) $^

valgrind: hw0.c
	make all
	/usr/bin/valgrind --read-var-info=yes --leak-check=yes --show-reachable=yes ./$(EXE)

%.o: %.c
	$(CC_CMD) -c $<
	
clean:
	rm -f $(EXE) *.o
	
new:
	make clean
	make
	
backup: Makefile *.[ch]
	cp *.[ch] Makefile backup

directories:
	mkdir $(HOME)/hw0/c $(HOME)/hw0/c/backup

install:
	cp $(DIR)/hw0.c.empty $(DIR)/.*project $(DIR)/.hw0* \
	$(DIR)/Makefile $(HOME)/hw0/c

public:
	#make new

	# do we need to create the public directory?
	if [ ! -d $(DIR) ]; then mkdir $(DIR); fi

	# lock public dir
	chmod 700 $(DIR)
	
	# copy files to public directory
	cp $(EXE) hw0.c.empty Makefile .project .cproject \
	 .hw0.sln .hw0.vcproj $(DIR)

	# strip debugging information 
	strip $(DIR)/$(EXE)

	# set correct permissions on executable
	chmod 711 $(DIR)/$(EXE)

	# set correct permissions on sources
	chmod 644 $(DIR)/hw0.c.empty $(DIR)/Makefile $(DIR)/.project \
	$(DIR)/.cproject $(DIR)/.hw0.sln $(DIR)/.hw0.vcproj

	# unlock public dir
	chmod 755 $(DIR)
