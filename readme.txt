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

#command for saleor
docker-compose up -d saleor_api saleor_dashboard saleor_worker saleor_storefront

#command for terra
docker-compose up -d terradnode0 terradnode1 terradnode2 terradnode3 terra_finder terra_station terra_relayer terra_extension

#command for swagger
docker-compose up -d swagger-editor swagger-ui

#command for activiti
docker-compose up -d keycloak example-runtime-bundle example-cloud-connector activiti-cloud-query activiti-cloud-modeling activiti-cloud-modeling-backend