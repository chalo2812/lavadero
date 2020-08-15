FROM node:lts-slim

WORKDIR /opt
COPY . .
RUN npm i -q --no-audit --no-warnings --silent
RUN npm run build
ENV NODE_ENV=production
ENV PATH /opt/node_modules/.bin:$PATH
CMD ["npm","run","serve"]
