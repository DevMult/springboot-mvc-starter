FROM tomcat:10-jdk21

# Optional: clean default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file into Tomcat's webapps directory
COPY target/spring-mvc.war /usr/local/tomcat/webapps/spring-mvc.war

#http://localhost:9091/spring-mvc/webpage/welcome