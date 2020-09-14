# PubSub Springboot

Implementasi PubSub menggunakan Springboot

## Step implementasi

 1. buat project pada Google Cloud
 2. akses via google SDK (via Docker jika tidak ingin install SDK di PC)


## Google SDK Command

Google SDK Command kita menggunakan docker

### Docker
run using : 


`docker run --rm -it --name gcp-dev  --user 1100:1100 -v "C:\Worksite\Lab\Docker\GCP\dotboto\.boto":/.boto:rw -v "C:\Worksite\Lab\Docker\GCP\config":/.config  -v "C:\Worksite\Lab\Docker\GCP\workspace":/home/suryo/workspace google/cloud-sdk:308.0.0 /bin/bash`



### init

```
## login ke google cloud 
gcloud auth login

## initiate google cloud config
gcloud init

# enable the Pub/Sub API
gcloud services enable pubsub.googleapis.com
```

### PubSub

Create topic and subscription in pubsub

```
# create a new Pub/Sub topic
gcloud pubsub topics create hello-pubsub

# create a subscription for the topic
gcloud pubsub subscriptions create --topic hello-pubsub hello-pubsub-subscription

```


### Auth/credential

```
# create a new service account with a descriptive name
# just know that a service account name must be between 6 and 30 characters (inclusive), must begin with
# a lowercase letter, and consist of lowercase alphanumeric characters that can be separated by hyphens.

gcloud iam service-accounts create hello-spring-cloud-gcp-app


# add the appropriate roles to your service account
# for more info on roles, check https://cloud.google.com/iam/docs/understanding-roles
# for our app, we only need the Pub/Sub Publisher and Subscriber roles

# setting these up just to improve readability of the following commands

###  project id harus sertakan nomor id nya, yaitu contoh dibawah ini adalah suffix -288905

PROJECT_ID=hello-spring-cloud-gcp-xxxxx
SERVICE_ACCOUNT_NAME=hello-spring-cloud-gcp-app

# add the Pub/Sub Publisher role
$ gcloud projects add-iam-policy-binding ${PROJECT_ID}\
    --member "serviceAccount:${SERVICE_ACCOUNT_NAME}@${PROJECT_ID}.iam.gserviceaccount.com"\
    --role "roles/pubsub.publisher"

# add the Pub/Sub Subscriber role
gcloud projects add-iam-policy-binding ${PROJECT_ID}\
    --member "serviceAccount:${SERVICE_ACCOUNT_NAME}@${PROJECT_ID}.iam.gserviceaccount.com"\
    --role "roles/pubsub.subscriber"


# download a key file containing your credentials
gcloud iam service-accounts keys create ${SERVICE_ACCOUNT_NAME}.json\
    --iam-account ${SERVICE_ACCOUNT_NAME}@${PROJECT_ID}.iam.gserviceaccount.com



```

json file tersebut dibikin base64   

`cat ./hello-spring-cloud-gcp-app.json | base64 -w0`


lalu saat run pada application.yaml:

```

spring:
  main:
    banner-mode: "off"
  cloud.gcp.credentials.encoded-key: "${GCP_KEY_FILE_BASE64}"

```
nanti lempar variable `GCP_KEY_FILE_BASE64` ke container yang berisi base64 string dari file json yng didownload tersebut.


### Publish using gconsole sdk

ini test subscriber yg dibuat 

``` 

# list pub/sub topics (in case you don't remeber the your topic's name)
gcloud pubsub topics list

# setting up topic (just for readability purposes)
PUBSUB_TOPIC=projects/hello-spring-cloud-gcp/topics/hello-pubsub

# publish to topic
gcloud pubsub topics publish ${PUBSUB_TOPIC}\
    --message "Hello, Pub/Sub"

```

