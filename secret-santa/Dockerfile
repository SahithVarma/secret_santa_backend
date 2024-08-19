# Use an official Python runtime as a parent image
FROM python:3.11-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install pipenv
RUN pip install --no-cache-dir pipenv

# Install dependencies with Pipenv, creating a requirements.txt if necessary
RUN if [ ! -f "requirements.txt" ]; then \
        pipenv lock --requirements > requirements.txt; \
    fi && \
    pip install --no-cache-dir -r requirements.txt

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Define environment variable
ENV FLASK_APP=main.py

# Run the application
CMD ["flask", "run", "--host=0.0.0.0", "--port=8081"]
