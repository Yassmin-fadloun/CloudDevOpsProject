def call(String imageName, String tag) {
    sh """
        echo "Scanning Docker image: ${imageName}:${tag}"
        trivy image --exit-code 0 ${imageName}:${tag} || true
    """
}
