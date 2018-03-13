# About Monolith Project Extract

### Use case

Team is developing a server-side enterprise application. It must support a variety of different clients including desktop browsers, mobile browsers and native mobile applications. The application might also expose an API for 3rd parties to consume. It might also integrate with other applications via either web services or a message broker. The application handles requests (HTTP requests and messages) by executing business logic; accessing a database; exchanging messages with other systems; and returning a HTML/JSON/XML response. There are logical components corresponding to different functional areas of the application.

#### VM/Physical Deployment

A single Java monolith WAR file is deployed

#### Architecture

Enclosed high level architecture

#### Resulting context
This solution has a number of benefits:

1. Simple to develop - the goal of current development tools and IDEs is to support the development of monolithic applications
2. Simple to deploy - you simply need to deploy the WAR file (or directory hierarchy) on the appropriate runtime
3. Simple to scale - you can scale the application by running multiple copies of the application behind a load balancer

* However, once the application becomes large and the team grows in size, this approach has a number of drawbacks that become increasingly significant:

* Shared database and resulting in overload of I/O

* Initialization of the system may be tricky or laborious.

* Procrastination of refactoring

* Premature optimization, especially a tendency to performance perfectionism or Puritanism

* Code not written for Survivability/WAN Survivability

* Functionality implemented by part of the system cannot be reused without using the entire system.

* The large monolithic code base intimidates developers, especially ones who are new to the team. The application can be difficult to understand and modify. As a result, development typically slows down. Also, because there are not hard module boundaries, modularity breaks down over time. Moreover, because it can be difficult to understand how to correctly implement a change the quality of the code declines over time. It’s a downwards spiral.

* Overloaded web container - the larger the application the longer it takes to start up. This had have a huge impact on developer productivity because of time wasted waiting for the container to start. It also impacts deployment too.

* Scaling the application can be difficult - a monolithic architecture is that it can only scale in one dimension. On the one hand, it can scale with an increasing transaction volume by running more copies of the application. Some clouds can even adjust the number of instances dynamically based on load. But on the other hand, this architecture can’t scale with an increasing data volume. Each copy of application instance will access all of the data, which makes caching less effective and increases memory consumption and I/O traffic. Also, different application components have different resource requirements - one might be CPU intensive while another might memory intensive. With a monolithic architecture we cannot scale each component independently

* Requires a long-term commitment to a technology stack 