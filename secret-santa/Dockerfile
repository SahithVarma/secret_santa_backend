# Use an official Python runtime as a parent image
FROM python:3.9-slim

# Set the working directory in the container
WORKDIR /app

# Install system dependencies (if required)
RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
    && rm -rf /var/lib/apt/lists/*

# Copy the requirements file and install Python dependencies
COPY requirements.txt /app/
RUN pip install --no-cache-dir -r requirements.txt

# Copy the entire application code to the container
COPY . /app

# Expose the port the app will run on
EXPOSE 8081

# Set environment variables for Flask
ENV FLASK_APP=secret_santa/app.py
ENV FLASK_ENV=production
ENV FLASK_RUN_HOST=0.0.0.0

# Run the application
CMD ["flask", "run"]


