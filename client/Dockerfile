FROM node:lts-slim

WORKDIR /opt
COPY . .
RUN npm install --quiet
RUN npm run build
ENV NODE_ENV=production
ENV PATH /opt/node_modules/.bin:$PATH
CMD ["npm","run","serve"]
