module "non-prod-ecr" {
  source = "../modules/ecr"
  ecr-repository-name = "bookshelf-repository"
}

module "non-prod-s3" {
  source = "../modules/s3"
  s3-bucket-name = "bookshelf-s3"
  acl = "private"
  s3-bucket-display-name = "bookshelf-s3"
  
}

output "output" {
  value = "${module.non-prod-ecr.repository_url}"
}
