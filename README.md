<h1 align="center"> DsMeta </h1>

<p align="center">FullStack application focused on integrad the back and the frontend in a monorepo</p>


<h4 align="center"> 
	🚧  DsMeta 🚀 Done 🚧
</h4>

<p align="center">
 <a href="#objective">Objective</a> •
 <a href="#tecnologies">Tecnologies</a> • 
 <a href="#contribuition">Contribuition</a> • 
 <a href="#licence">Licence</a> • 
 <a href="#author">Author</a> •
</p>


# Objective

This project has the objective to integrate a frontend and a backend in a monorepo and deploy those in different services. This is a training project, and all final data is in Portuguese

<br>

# 🛠 Tecnologies

These tecnologies are used in this project:

- [Node.js](https://nodejs.org/en/)
- [React](https://pt-br.reactjs.org/)
- [TypeScript](https://www.typescriptlang.org/)
- [Axios](https://axios-http.com/docs/intro)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/html/main.html)
- [Twilio](www.twilio.com/docs)

<br>

# :warning: If you are using the deployed version on Netlify, wait to the data loads from Heroku, because the server are on sleep mode.

# Development

Before start, you gonna need install those tools:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/),
[Java 8+](https://www.java.com/en), [Maven](https://maven.apache.org)
I recommend you to install [VsCode](https://code.visualstudio.com/) to work in the frontend
and [IntelliJ](https://www.jetbrains.com/idea/) to work in the backend

##  Run 🏃‍♂️

### In the /frontend

```bash
# Install al dependencies
$ yarn

# Run in development mode
$ yarn dev

# The app gonna run in the port on your terminal
```

### In the /backend

```bash
# Reload the maven changes
$ mvn clean install -U

# Compile in development mode
$ mvn clean package

# You can run by the IDE play button or using
$ mvn spring-boot:run

# The server gonna run on the port:8080
```

### After run the backend and the frontend, you gonna see something similar to this

![Entire screen](/img/fullScreen.png)


### You can change the dates to fetch new data

![Date picker](/img/datepicker.png)


### New card after change the date

![New card](/img/newCard.png)

### Clicking on the "Notificar" button, a SMS will be send to my cellphone with the data of the "Vendedor"

![Vendedor info](/img/smsScreenshot.jpg)

### The user will be notified by a toast if the message has been succesfully

![Succesful toast](/img/succesfulSms.png)

<br>

# License

MIT License ©

<br>

# Author


<a href="https://github.com/Filipey">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/85424389?s=400&u=417925037da99d2637c3714599830ae00c07c99a&v=4" width="100px;" alt=""/>
 <br />
  
 <sub><b> Filipe Moura</b></sub></a>

Made with ❤️ by Filipe Moura 👋🏽 Contact!

[![Linkedin Badge](https://img.shields.io/badge/-Filipe-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/filipeasm/)](https://www.linkedin.com/in/filipeasm/)
[![Gmail Badge](https://img.shields.io/badge/-filipeasm18@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:filipeasm18@gmail.com)](mailto:filipeasm18@gmail.com)
