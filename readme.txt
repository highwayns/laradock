#command for mobilestudio
docker-compose up -d nginx mysql phpmyadmin redis workspace

#command for kafka
docker-compose up -d zookeeper kafka kafka-manager

#command for beanstalkd
docker-compose up -d beanstalkd

#command for rabbitmq
docker-compose up -d rabbitmq

#command for airflow
docker-compose up -d flower airflow-cli airflow-init airflow-triggerer airflow-worker airflow-scheduler airflow-webserver
