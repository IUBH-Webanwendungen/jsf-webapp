# JSF-WebApp: A simple Web-app for regular containers that can run JSF

This project has been created within the IPWA series of tutorials at IUBH Fernstudium. It aims at showing a simple but complete web-application that can run java-server-faces even though the servlet container does not serve them.

The project is built with maven (`mvn package`) and deployed within the servlet container.
Alternatively, you can run the web-app with `mvn tomcat:run-war`.

Once installed, you should be able to see the content of the [/jsf-webapp/ URL](src/main/webapp/faces/index.xhtml) with two loaded pictures.

Tested on Tomcat-9.0.37.

The project is an enrichment of [How to configure JSF in Tomcat](https://www.byteslounge.com/tutorials/how-to-configure-jsf-in-tomcat-example) by Gonçalo Marques by Paul Libbrecht and uses two version of [a](https://openclipart.org/detail/323008/are-you-lucky-typography) picture by j4p4n of OpenCliparts.