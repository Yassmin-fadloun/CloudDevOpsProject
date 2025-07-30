def call(String imageName, String tag) {
    sh """
        echo "Deleting local Docker image: ${imageName}:${tag}"
        docker rmi ${imageName}:${tag} || true
    """
}
