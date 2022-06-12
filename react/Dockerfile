FROM node:14

WORKDIR /usr/src/app/react

COPY package*.json ./

RUN yarn
#RUN npm install -D sass && npm install

EXPOSE 3000

CMD ["npm", "start"]