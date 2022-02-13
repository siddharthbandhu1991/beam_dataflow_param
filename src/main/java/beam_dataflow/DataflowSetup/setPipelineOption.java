package beam_dataflow.DataflowSetup;

import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.ValueProvider;

public interface setPipelineOption extends PipelineOptions {

 	ValueProvider<String> getProjectName();
    void setProjectName(ValueProvider<String> projectName);
    
    ValueProvider<String> getBucketName();
    void setBucketName(ValueProvider<String> bucketName);
    
    ValueProvider<String> getConfigFilePath();
    void setConfigFilePath(ValueProvider<String> configFilePath);
    
    ValueProvider<String> getFeedId();
    void setFeedId(ValueProvider<String> feedId);
      
  }

