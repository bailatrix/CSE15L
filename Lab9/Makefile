.SUFFIXES: .java .class
.java.class:
	javac $<

IntegerList.class:IntegerListInterface.class
TimeSimpleList.class: IntegerList.class

CLASSES = IntegerListInterface.class IntegerList.class TimeSimpleList.class

test:$(CLASSES)
	java TimeSimpleList 2000 2000 10000 100

versionOne:$(CLASSES)
	java -Xint -DversionOne=1 TimeSimpleList 2000 2000 10000 100 > versionOne.txt
	
versionTwo:$(CLASSES)
	java -Xint -DversionTwo=1 TimeSimpleList 2000 2000 10000 100 > versionTwo.txt

clean:
	rm IntegerList.class TimeSimpleList.class *.txt
