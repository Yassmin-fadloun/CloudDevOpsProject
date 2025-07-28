output "instance_ip" {
  description = "Public IP of the EC2 instance"
  value       = module.server.instance_public_ip
}
