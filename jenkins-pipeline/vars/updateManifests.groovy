def call(String manifestsPath, String imageName, String tag) {
    sh """
        echo "Updating manifests in ${manifestsPath}"
        sed -i 's|image:.*|image: ${imageName}:${tag}|' ${manifestsPath}/*.yaml
    """
}
