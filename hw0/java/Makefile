EXE  = a.out
JAVA_CMD = javac -g
DIR = $(HOME)/../public/hw0/java

all: $(EXE)

$(EXE): hw0.class
	echo 'java hw0 $$*' > $(EXE)
	chmod u+x $(EXE)
	
%.class: %.java
	$(JAVA_CMD) $<
	
clean:
	rm -f $(EXE) *.class

new:
	make clean
	make
	
backup: Makefile *.java
	cp Makefile *.java backup

directories:
	mkdir $(HOME)/hw0/java $(HOME)/hw0/java/backup

install:
	cp $(DIR)/hw0.java.empty $(DIR)/.project $(DIR)/.classpath \
	$(DIR)/Makefile $(HOME)/hw0/java

public:
	#make new

	# do we need to create the public directory?
	if [ ! -d $(DIR) ]; then mkdir $(DIR); fi

	# lock public dir
	chmod 700 $(DIR)
	
	# copy files to public directory
	cp $(EXE) *.class hw0.java.empty Makefile .project .classpath $(DIR)

	# set correct permissions on executable
	chmod 755 $(DIR)/$(EXE)

	# set correct permissions on sources
	chmod 644 $(DIR)/hw0.java.empty $(DIR)/Makefile $(DIR)/.project \
	$(DIR)/.classpath $(DIR)/*.class

	# unlock public dir
	chmod 755 $(DIR)
