package tasklist;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskListServiceConfiguration extends Configuration {

    private int maxLength;

    @JsonProperty
    public int getMaxLength() {
        return maxLength;
    }

    @JsonProperty
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
