# sumeruni_demo

Example project to showcase Git, Docker and Postman

Download git:
https://git-scm.com/downloads</br>
Download docker:
https://www.docker.com/products/docker-desktop</br>
Download postman:
https://www.postman.com/downloads/</br>
Download intelliJ:
https://www.jetbrains.com/idea/download/#section=windows</br>
Download java 11:
windows: https://corretto.aws/downloads/latest/amazon-corretto-11-x64-windows-jdk.msi</br>
mac: https://corretto.aws/downloads/latest/amazon-corretto-11-x64-macos-jdk.pkg</br>

Build docker image with
`docker build --tag=demo:latest .` </br>
Run it using `docker run --name summeruni_demo -d –p 8080:8080 demo`
