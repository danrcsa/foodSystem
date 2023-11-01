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

	docker network create foodsystem

	docker run -d --name mysqldb -p 3307:3306  --network foodsystem -e MYSQL_ROOT_PASSWORD=foodSystem123@ -e MYSQL_DATABASE=foodsystem -e MYSQL_USER=foodsystemuser -e MYSQL_PASSWORD=foodSystem123@ mysql/mysql-server

Para criar a imagem a partir do por

		docker run -d --name spring-boot -p 8081:8081 --network foodsystem -e SPRING_DATASOURCE_URL=jdbc:mysql://mysqldb:3306/foodsystem?autoReconnect=true -e SPRING_DATASOURCE_USERNAME=foodsystemuser -e SPRING_DATASOURCE_PASSWORD=foodSystem123@ danrcsa/foodsystem:1.0.1
