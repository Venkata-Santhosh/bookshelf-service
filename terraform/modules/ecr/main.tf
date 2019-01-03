resource "aws_ecr_repository" "ecr-repository" {
    name = "${var.ecr-repository-name}"
}

resource "aws_ecr_lifecycle_policy" "expire-old-containers" {
  repository = "${aws_ecr_repository.ecr-repository.name}"

  policy = <<EOF
{
    "rules": [
        {
            "rulePriority": 1,
            "description": "Limit image count to 30 max",
            "selection": {
                "tagStatus": "any",
                "countType": "imageCountMoreThan",
                "countNumber": 30
            },
            "action": {
                "type": "expire"
            }
        }
    ]
}
EOF
}