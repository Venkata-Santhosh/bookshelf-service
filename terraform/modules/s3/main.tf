resource "aws_s3_bucket" "s3-bucket" {
    bucket = "${var.s3-bucket-name}"
    acl = "${var.acl}"

    tags {
        Name = "${var.s3-bucket-display-name}"
    }
}