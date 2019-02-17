.SUFFIXES: .java .class
.java.class:
	javac $<

IntegerList.class:IntegerListInterface.class
IntegerListTester.class:IntegerList.class

CLASSES = IntegerListInterface.class IntegerListTester.class IntegerList.class

prep_good:
	cp Good/IntegerListInterface.class .
	cp Good/IntegerList.class .
	cp Good/IntegerListTester.class .

test:$(CLASSES)
	java IntegerListTester
