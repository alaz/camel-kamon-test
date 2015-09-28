> How to use Docker test environment.

## Prepare

```
docker build -t kamon-test .
docker run --rm -it --privileged -v /Users/alaz/projects/camel-kamon-test:/test kamon-test /bin/bash
```

## Without Kamon

```
sbt 'run -ac kamon-off.xml'
^Z
bg
ps
pidstat -w -p <PID> 5
```

## With Kamon

```
sbt 'run -ac kamon-on.xml'
^Z
bg
ps
pidstat -w -p <PID> 5
```
