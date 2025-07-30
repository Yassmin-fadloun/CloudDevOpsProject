def call(String manifestsRepoPath) {
    sh """
        echo "Pushing manifests changes"
        cd ${manifestsRepoPath}
        git add .
        git commit -m "Updated manifests with new image tag"
        git push origin main
    """
}
