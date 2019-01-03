output "bucket" {
  value = "${aws_s3_bucket.s3-bucket.bucket_domain_name}"
}

output "bucket-arn" {
  value = "${aws_s3_bucket.s3-bucket.arn}"
}

output "bucket-id" {
  value = "${aws_s3_bucket.s3-bucket.id}"
}

output "bucket_domain_name" {
  value = "${aws_s3_bucket.s3-bucket.bucket_domain_name}"
}