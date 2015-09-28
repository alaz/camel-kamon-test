FROM library/java:openjdk-8

ENV DEBIAN_FRONTEND noninteractive
ENV LC_ALL C

RUN \
  apt-get update && \
  apt-get install -y --no-install-recommends apt-transport-https

RUN \
  echo "deb https://dl.bintray.com/sbt/debian /" > /etc/apt/sources.list.d/sbt.list && \
  apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 642AC823 && \
  apt-get update && \
  apt-get install -y --no-install-recommends sysstat sbt

VOLUME ["/test"]
