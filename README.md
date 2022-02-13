# beam_dataflow_param


mvn clean 
mvn -Pdataflow-runner compile exec:java \
-Dexec.mainClass=beam_dataflow.main_module \
-Dexec.args="--project=mindtree-gcp-dataflow \
--jobName=gcs2bq \
--runner=DataflowRunner \
--region=us-east1 \
--stagingLocation=gs://mayuri_120199/temp/ \
--tempLocation=gs://mayuri_120199/temp/ \
--serviceAccount=dataflow-temp@mindtree-gcp-dataflow.iam.gserviceaccount.com \
--projectName=mindtree-gcp-dataflow \
--bucketName=mayuri_120199 \
--configFilePath=config/m_config.yaml \
--feedId=ALL"
