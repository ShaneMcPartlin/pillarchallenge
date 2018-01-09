
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		Babysitter.java \
		BabysitterTest.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class