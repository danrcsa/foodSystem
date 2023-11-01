# foodSystem
Projeto Food system para pos  FIAP.

Primeira versão do projeto para lanchonetes Food System.

Para maior comodidade o projeto pode ser inicado com o comando 

	docker compose up 

Caso deseje execultar o projeto item por item sera necessario alguns comandos 

primeiro sera necessario criar uma network para comunicação entre os containers 

Apos isso inciar um container com mysql 8.0.27

E então inicar o pacote do projeto Food System.

segue lista de comandos necessarios para iniciar o projeto da maneira correta 

Criando a rede para comunicação dos projetos

	docker network create foodsystem

Criando mysql para armazenar dos dados do projeto 

	docker run -d --name mysqldb -p 8082:3306  --network foodsystem -e MYSQL_ROOT_PASSWORD=foodSystem123@ -e MYSQL_DATABASE=foodsystem -e MYSQL_USER=foodsystemuser -e MYSQL_PASSWORD=foodSystem123@ mysql/mysql-server

Para criar a imagem pode seguir o comando abaixo para baixar a imagem do projetog

		docker run -d --name spring-boot -p 8081:8081 --network foodsystem -e SPRING_DATASOURCE_URL=jdbc:mysql://mysqldb:3306/foodsystem?autoReconnect=true -e SPRING_DATASOURCE_USERNAME=foodsystemuser -e SPRING_DATASOURCE_PASSWORD=foodSystem123@ danrcsa/foodsystem:latest
		
1

