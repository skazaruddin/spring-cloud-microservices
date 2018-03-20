Steps to install redis on docker:

1) Install docker and run Linux containers
2) Run command 'docker pull redis'
	
3) Run command 'docker run -dit --restart unless-stopped -p 6379:6379 -p 50000:50000 redis redis-server  --appendonly yes --requirepass password'. 

This will start redis in 6379 port with password set as 'password'.
start with persistent storage as --appendonly yes is given
$ docker run --name some-redis -d redis redis-server --appendonly yes

4) docker run --name some-zookeeper --restart always -d zookeeper

This image includes EXPOSE 2181 2888 3888 (the zookeeper client port, follower port, election port respectively), 
so standard container linking will make it automatically available to the linked containers. 
Since the Zookeeper "fails fast" it's better to always restart it.