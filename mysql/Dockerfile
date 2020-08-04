FROM mysql/mysql-server:latest

ENV MYSQL_USER=mysql \
    MYSQL_VERSION=5.7.26 \
    MYSQL_DATA_DIR=/var/lib/mysql \
    MYSQL_RUN_DIR=/run/mysqld \
    MYSQL_LOG_DIR=/var/log/mysql \
    MYSQL_ROOT_PASSWORD=user
#COPY entrypoint.sh /sbin/entrypoint.sh

#RUN chmod 755 /sbin/entrypoint.sh

EXPOSE 3306 3306

#ENTRYPOINT ["/sbin/entrypoint.sh"]

CMD ["mysqld"]