#!/bin/bash

#letsencrypt certonly --webroot -w /var/www/letsencrypt -d "$MOBILESTDIO" --agree-tos --email "$EMAIL" --non-interactive --text
#letsencrypt certonly --webroot -w /var/www/letsencrypt -d "$PAYMENTGATEWAY" --agree-tos --email "$EMAIL" --non-interactive --text
#letsencrypt certonly --webroot -w /var/www/letsencrypt -d "$PARK" --agree-tos --email "$EMAIL" --non-interactive --text

#cp /etc/letsencrypt/archive/"$MOBILESTDIO"/cert1.pem /var/certs/"$MOBILESTDIO"-cert1.pem
#cp /etc/letsencrypt/archive/"$MOBILESTDIO"/chain1.pem /var/certs/chain1.pem
#cp /etc/letsencrypt/archive/"$MOBILESTDIO"/fullchain1.pem /var/certs/fullchain1.pem
#cp /etc/letsencrypt/archive/"$MOBILESTDIO"/privkey1.pem /var/certs/"$MOBILESTDIO"-privkey1.pem

#cp /etc/letsencrypt/archive/"$PAYMENTGATEWAY"/cert1.pem /var/certs/"$PAYMENTGATEWAY"-cert1.pem
#cp /etc/letsencrypt/archive/"$PAYMENTGATEWAY"/privkey1.pem /var/certs/"$PAYMENTGATEWAY"-privkey1.pem

#cp /etc/letsencrypt/archive/"$PARK"/cert1.pem /var/certs/"$PARK"-cert1.pem
#cp /etc/letsencrypt/archive/"$PARK"/privkey1.pem /var/certs/"$PARK"-privkey1.pem
