# Use an official Python runtime as a parent image
FROM python:3.9-slim

# Set the working directory in the container
WORKDIR /app

# Install system dependencies (if required)
RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
    && rm -rf /var/lib/apt/lists/*

# Install Python dependencies directly (if you know them)
RUN pip install --no-cache-dir flask gunicorn

# Copy the entire application code to the container
COPY . /app

# Expose the port the app will run on
EXPOSE 5000

# Set environment variables for Flask
ENV FLASK_APP=secret_santa/app.py
ENV FLASK_ENV=production
ENV FLASK_RUN_HOST=0.0.0.0

# Use gunicorn to run the application instead of flask
CMD ["gunicorn", "-b", "0.0.0.0:5000", "secret_santa.app:app"]
