resource "aws_instance" "jenkins" {
  ami                    = "ami-04b70fa74e45c3917"  # Amazon Linux 2023 (verify region)
  instance_type          = var.instance_type
  subnet_id              = module.network.subnet_id
  associate_public_ip_address = true

  tags = {
    Name = "Jenkins-Server"
  }
}
