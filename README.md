# CloudDevOpsProject

## Project Description
The project delivers a fully automated DevOps pipeline on AWS, where Terraform provisions the infrastructure and Ansible configures the servers. Jenkins builds, scans, and pushes Docker images to Docker Hub, then updates Kubernetes manifests in GitHub. ArgoCD continuously syncs those manifests to a Kubernetes cluster running on private EC2 nodes. The result is a secure, hands‑off CI/CD workflow that takes code from commit to production automatically.

## Project Architecture
![CloudDevOpsProject](Screenshots/CloudDevOpsProject.png)

## Project Structure
```bash
.
├── Dockerfile
├── K8s/
│ ├── deployment.yaml
│ └── service.yaml
├── Terraform/
│ ├── network/
│ ├── server/
│ ├── main.tf
│ └── variables.tf
├── Ansible/
│ ├── roles/
│ ├── playbook.yml
│ └── inventory/
├── jenkins-pipeline/
│ ├── Jenkinsfile
│ └── vars/
├── argocd/
│ └── application.yaml
└── README.md
```
##Containerization with Docker

### Clone the application source code
```bash 
git clone https://github.com/Ibrahim-Adel15/FinalProject.git app-source
cd app-source
```
### <img src="https://www.docker.com/wp-content/uploads/2022/03/Moby-logo.png" alt="Docker Logo" width="30"> Create a Dockerfile 
[Dockerfile](Docker/Dockerfile)

### Build and test Docker image locally
```bash
docker build -t my-dockerhub-user/myapp:v1.0.0 .
docker run -p 5000:5000 my-dockerhub-user/myapp:v1.0.0
```
![web.png](Screenshots/web.png)

## Container Orchestration with Kubernetes

### Create Kubernetes namespace
```bash 
kubectl create namespace ivolve
```
### Apply deployment and service manifests
```bash 
kubectl apply -f K8s/deployment.yaml -n ivolve
kubectl apply -f K8s/service.yaml -n ivolve
```
###  Verify deployment
```bash
kubectl get pods -n ivolve
kubectl get svc -n ivolve
```
![allnodes.png](Screenshots/allnodes.png)
![pods.png](Screenshots/pods.png)
![apply-service](Screenshots/apply-service.png)

## Infrastructure Provisioning with Terraform
```bash
 terraform plan
```
![ter-plan.png](Screenshots/ter-plan.png)
```bash
 terraform apply 
```
![ter-apply.png](Screenshots/ter-apply.png)
### Instance
![instance.png](Screenshots/instance.png)
### VPC
![vpc.png](Screenshots/vpc.png)
### Subnet
![subnet.png](Screenshots/subnet.png)
### Internet Gateway
![igw.png](Screenshots/igw.png)
### Route Tables 
![routetable.png](Screenshots/routetable.png)
### Network ACLs 
![netacl.png.png](Screenshots/netacl.png)

## Configuration Management with Ansible
### Run playbook to configure EC2
```bash
ansible-playbook -i inventory/aws_ec2.yml playbook.yml
```
## Continuous Integration with Jenkins
![jen.png](Screenshots/jen.png)
![stage.png](Screenshots/stage.png)

## Continuous Deployment with ArgoCD
![argo.png](Screenshots/argo.png)
