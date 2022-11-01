mvn clean
mvn install
/home/safedb/project/apache-tomcat-8.5.82/bin/shutdown.sh
cp -R target/testweb.war /home/safedb/project/apache-tomcat-8.5.82/webapps/
/home/safedb/project/apache-tomcat-8.5.82/bin/startup.sh
