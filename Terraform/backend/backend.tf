terraform {
  backend "s3" {
    bucket         = "terraform-state-yassmin"
    key            = "dev/terraform.tfstate"
    region         = "us-east-1"
    encrypt        = true
    dynamodb_table = "terraform-locks"
  }
}
