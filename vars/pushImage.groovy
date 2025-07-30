def call(String imageName, String tag) {
    sh """
        echo "Pushing Docker image: ${imageName}:${tag}"
        docker push ${imageName}:${tag}
    """
}
