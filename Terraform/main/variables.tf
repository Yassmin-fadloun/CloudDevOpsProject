variable "vpc_cidr" {
  default = "10.0.0.0/16"
}

variable "public_subnet_cidr" {
  default = "10.0.1.0/24"
}

variable "ami_id" {
  default = "ami-0c7217cdde317cfec"
}

variable "instance_type" {
  default = "t3.small"
}
