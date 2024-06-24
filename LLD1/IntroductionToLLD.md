> To understand lld, let's first look at HLD in short,
>
> - HLD is nothing but an overview (Bird's Eye View) of how a software system will look like.
> - Overview of how different infrastructure layer that work together to serve an application at scale with desired efficiency.
> - Each system (eg: your load balancers, servers, databases and caches etc) are nothing but a computer which acts per what program is running on them.
> - Details of a software system will describe the code or program that is running on them (eg: on db we might have mysql programming)

## What is LLD?

- So, LLD is nothing but details of the code that you will write.
- It is a component-level design process that follows a step by step refinement process.
- It is a phase in the software development process where detailed system components and their interactions are specified.

## Why LLD?

- For an average software engineer, 12 % of their time is spent on writing the code.
- Other time goes in,
    - Documentation (Design and Research)
    - Debugging the code
    - Optimising the code
    - Understanding the code
    - Meetings
    - Testing
    - Code Reviews
- In most of the tasks, we are reading and understanding the code.
- LLD helps us to write the code which is,
    - Readable / Understandable
    - Reusable
    - Extensible
    - Maintainable
    - Modular
- Extensibility of code is very important because it defines how easy it is for our system to be modified when new requirements come.
- Maintainable code will help in doing faster,
    - Bugs fixes
    - Optimisations
- The goal of LLD or a low-level design (LLD) is to give the internal logical design of the actual program code.
- Low-level design is created based on the high-level design.
- LLD describes the class diagrams with the methods and relations between classes and program specs.
- It describes the modules so that the programmer can directly code the program from the document.
- A good low-level design document makes the program easy to develop.

**Ultimately, LLD has the following goals:**

- Low level implementation details of a system
- organisation of code
- write good software

## What is a good software?

A good software is a software that is

- easy to maintain
- easy to scale.
- easy to extend

### Maintainability

Software is not static. If you build a valuable product that works perfectly but is difficult to modify and adapt to new requirements, it will not survive in today’s market. Maintainability is a long-term aspect that describes how easily software can evolve and change, which is especially important in today’s agile environment.

The ease with which a software system or component can be modified to correct faults, improve performance or other attributes, or adapt to a changed environment

[ISO 25010](https://iso25000.com/index.php/en/iso-25000-standards/iso-25010?limit=3&start=6) states that a highly maintainable software system must possess the following qualities:

- `Modularity` - The product is composed of discrete components such that a change to one component has minimal impact on other components.
- `Reusability` - The product makes use of assets that can be re-used in building other assets or in other systems.
- `Analyzability` - The impact of an intended change on the product, diagnosis of deficiencies, causes of failures or identification of the components that need to be changed can be analyzed effectively and efficiently.
- `Modifiability` - The product can be effectively and efficiently modified without introducing defects or degrading existing product quality.
- `Testability` - The test criteria can be established effectively and efficiently, and the product can be tested to determine whether those criteria have been met.

Scenarios -

- How easy it is for a new developer to contribute to the product?
- Can I add a new feature to the product without impacting existing functionality?
- Can I get an insight into the product’s performance?

### Scalability

Software scalability is an attribute of a tool or a system to increase its capacity and functionalities based on its users’ demand. Scalable software can remain stable while adapting to changes, upgrades, overhauls, and resource reduction.

Scenarios -

- You just expanded your business to North America and Europe. Will your software be able to handle the users?
- How will your application perform when it has multiple users using it at the same time?
- Does your application provide a good user experience?

### Extensibility

> Extensibility is a software engineering and systems design principle that provides for future growth. Extensibility is a measure of the ability to extend a system and the level of effort required to implement the extension. Extensions can be through the addition of new functionality or through modification of existing functionality. The principle provides for enhancements without impairing existing system functions.
>

Scenarios -

1. Your application uses PayTM for payment, and you want to add a new payment method. It can be a very simple task based on how your software is structured.
2. You use AWS for deployment and now a client wants to use your application on their own server. Again, will your code be able to handle this?
3. If I change my backend code, will my frontend code be affected?

### Extensibility vs Reusability

> Extensibility and reusability have many emphasised properties in common, including low coupling, modularity and high risk elements’ ability to construct for many different software systems, which is motivated by the observation of software systems often sharing common elements. Reusability together with extensibility allows a technology to be transferred to another project with less development and maintenance time, as well as enhanced reliability and consistency
>