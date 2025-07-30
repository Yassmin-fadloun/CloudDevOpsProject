def call(String imageName, String tag) {
    sh """
        echo "Building Docker image: ${imageName}:${tag}"
        docker build -t ${imageName}:${tag} .
    """
}
