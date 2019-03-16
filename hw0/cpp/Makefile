EXE  = a.out
CPP_CMD = g++ -Wall --pedantic -g
DIR = $(HOME)/../public/hw0/cpp

all: $(EXE)

$(EXE): hw0.o
	$(CPP_CMD) -o $@ $^

purify: hw0.cpp
	purify -cache-dir=$(HOME)/PURIFY $(CPP_CMD) -o $(EXE) $^
	
%.o: %.cpp
	$(CPP_CMD) -c $<
	
clean:
	rm -f $(EXE) *.o
	
new:
	make clean
	make
	
backup: Makefile *.[ch]
	cp *.[ch] Makefile backup

directories:
	mkdir $(HOME)/hw0/cpp $(HOME)/hw0/cpp/backup

install:
	cp $(DIR)/hw0.cpp.empty $(DIR)/Makefile $(DIR)/.*project \
	 $(DIR)/.hw0* $(HOME)/hw0/cpp

public:
	#make new

	# do we need to create the public directory?
	if [ ! -d $(DIR) ]; then mkdir $(DIR); fi

	# lock public dir
	chmod 700 $(DIR)
	
	# copy files to public directory
	cp $(EXE) hw0.cpp.empty Makefile .project .cproject \
	.hw0.sln .hw0.vcproj $(DIR)

	# strip debugging information 
	strip $(DIR)/$(EXE)

	# set correct permissions on executable
	chmod 711 $(DIR)/$(EXE)

	# set correct permissions on sources
	chmod 644 $(DIR)/hw0.cpp.empty $(DIR)/Makefile $(DIR)/.project \
	$(DIR)/.cproject $(DIR)/.hw0.sln $(DIR)/.hw0.vcproj

	# unlock public dir
	chmod 755 $(DIR)
