MAIN_CLASS = com.deidaraxc4.App

run: compile
	export MAVEN_OPTS=-Dprism.order-sq; \
	mvn exec:java -Dexec.mainClass="$(MAIN_CLASS)"

compile:
	mvn compile

clean:
	mvn clean

doc:
	mvn javadoc:javadoc