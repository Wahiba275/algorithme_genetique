# algorithme_genetique
<h1>Table of content</h1>
<ul>
  <li><a href="#introduction">Introduction</a></li>
   <li><a href="#structure">Structure</a></li>
   <li><a href="#main">Main Container</a></li>
   <li><a href="#simple">Simple Container</a></li>
   <li><a href="#jade">Jade Interface</a> </li>
  <li><a href="#demo">Demonstration</a></li>
</ul>
<h1 id = "introduction">Introduction</h1>
<p>Genetic algorithms and multi-agent systems are two powerful techniques in the field of artificial intelligence that have been widely applied to solve complex optimization problems. Individually, genetic algorithms are a search and optimization method inspired by the principles of natural evolution, while multi-agent systems involve the interaction of multiple autonomous agents to achieve a common goal. When combined, genetic algorithms and multi-agent systems offer a synergistic approach to problem-solving, leveraging the benefits of both techniques.</p>
<h1>Structure</h1>
<img src="/capture/structure.PNG" />
<h1 id ="main">Main Container</h1>
<img src="/capture/mainContainer.PNG" />
<p>The provided code initializes and starts the main container in the JADE framework using the MainContainer class. Upon execution, the code creates an instance of the JADE runtime by invoking Runtime.instance(). This runtime instance is responsible for managing the execution of agents. The code then creates a ProfileImpl object and sets the Profile.GUI parameter to "true", enabling the graphical user interface for the main container. Next, the main container is created using the runtime instance and the profile. Finally, the start() method is called on the main container, initiating the execution of the JADE platform. This code serves as the entry point for the JADE application, creating the necessary infrastructure to support the execution of agents in a multi-agent system.</p>
<h1 id="simple">Simple Container </h1>
<img src="/capture/SimpleContainer.PNG" />
<p>The provided code initializes a population size of 100 for a genetic algorithm implementation. It creates a container to hold the agents using the JADE framework. Inside a loop, individual agents are created and started, with each agent representing a potential solution to the optimization problem. The loop iterates 100 times, creating and starting 100 agents. Additionally, there is another agent, the <b>MainAgentGA</b> which is an agent responsible for coordinating the population of individual agents in a genetic algorithm.<br>
  <b>The SimpleContainer</b> class creates and starts individual agents, each representing a potential solution to the optimization problem. The MainAgentGA class, on the other hand, serves as the main coordinator agent for the population. It searches for agents in the population and initializes their fitness values. The MainAgentGA then executes a sequential behavior, where it receives fitness updates from individual agents and stores them. Once it receives fitness values from all agents, it sorts the population based on fitness in descending order and displays the population. The MainAgentGA further performs selection and crossover operations, communicating with individual agents through messages to exchange genetic information and calculate new fitness values. The process continues until a maximum iteration or a maximum fitness value is reached. The code demonstrates the coordination and management of a population of agents in a genetic algorithm using the multi-agent system approach.
</p>
<h1 id ="jade">Jade Interface </h1>
<img src="/capture/Interface Jade.PNG" />
<h1 id="demo">Demonstration</h1>
<img src="/capture/Démo.PNG" />
