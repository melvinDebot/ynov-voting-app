FROM python:3.9-slim

# add apache bench (ab) tool
RUN apt-get update \
<<<<<<< HEAD
  && apt-get install -y --no-install-recommends \
  apache2-utils \
  && rm -rf /var/lib/apt/lists/*
=======
    && apt-get install -y --no-install-recommends \
    apache2-utils \
    && rm -rf /var/lib/apt/lists/*
>>>>>>> 29fdf04acdb86f5765b65ac4c96d4818c3d0c2c0

WORKDIR /seed

COPY . .

# create POST data files with ab friendly formats
RUN python make-data.py

CMD /seed/generate-votes.sh