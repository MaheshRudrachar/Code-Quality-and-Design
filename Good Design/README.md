# About Microservices Project Extract

### Use case

The sample application has two services namely microservice-a and microservice-b. Each of the service has its own database service-one-db and service-two-db respectively. During the startup of the services, it persists the service name and an auto generated UUID in its perspective database and sends the data to the RabbitMQ exchange which then broadcasts the data to all the queues based on the routing key. Every microservices listens to its own RabbitMQ queue and keeps updating the database as and when it receives the data.

#### Docker

Microservices are deployed into containerized platfrom using Docker Swarm to take advantage of replication, volume mount, rolling update and desired cluster state retention in the production platform.

#### Service Registration

During the initialization of a service, it would get registered to the discovery and registration server (which in this project is Hashicorp's Consul).

#### Service Discovery

When one service (say api-gateway) needs to access a resource from another service (say microservice-a), all it has to do is ask discovery and registration server (Consul) to give one of the microservice-a's instance information.

#### Zuul with Ribbon

For routing/proxying the requests to the appropriate service instances and load balancing.

#### Centralized Log Management

Logstash is used to collect microservices logs and drain it into Elasticsearch for indexing and searching. For visualization Kiaban UI is used with X-Pack configured for notification, graphs and security

#### Rabbit MQ

For event driven architecture and eventual consistency in a distributed environment, message bus RMQ is used for notification and replication.

#### Security using OAuth2

All microservices are protected using OAuth2 JWT tokens.

#### Stateful Services

Stateful services like MySQL, RabbitMQ and ElasticSearch are clustered using docker swarm to enable scale, performance and resilience in the PaaS platform.

#### Cloud Config

Application specific configurations which are dynamic in nature are moved to cloud config using git as the source control so that there is no need to restart app server to relfect the configuration changes.

#### API Versioning

Rolling upgrades and side-by-side deployment of different microservice versions will be simpler by mainting api versioning.

### Architecture

Enclosed high level architecture

### Technology

* [SpringBoot] - Application framework
* [Zuul] - API Gateway (Load Balancer)
* [Consul] - Service registration and Discovery
* [Docker] - Containerization platform
* [RabbitMQ] - asynchronous microservices messaging.
* [Logstash] - Log collector
* [Elasticsearch] - Log indexer
* [Kibana] - Data visualization
* [Angular] - HTML enhanced for web apps!
* [Bootstrap] - great UI boilerplate for modern web apps
* [jQuery] - HTML document traversal and manipulation
* [Swagger] - API documentation


