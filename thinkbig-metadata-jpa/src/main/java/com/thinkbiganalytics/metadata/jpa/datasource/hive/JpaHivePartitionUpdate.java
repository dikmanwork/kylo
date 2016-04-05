/**
 * 
 */
package com.thinkbiganalytics.metadata.jpa.datasource.hive;

import java.io.Serializable;
import java.util.List;

import com.thinkbiganalytics.metadata.api.datasource.hive.HivePartitionUpdate;

/**
 *
 * @author Sean Felten
 */
public class JpaHivePartitionUpdate implements HivePartitionUpdate {

    private String columnName;
    private List<Serializable> values;
    
    /* (non-Javadoc)
     * @see com.thinkbiganalytics.metadata.api.datasource.hive.HivePartitionUpdate#getColumnName()
     */
    public String getColumnName() {
        return this.columnName;
    }

    /* (non-Javadoc)
     * @see com.thinkbiganalytics.metadata.api.datasource.hive.HivePartitionUpdate#getValuses()
     */
    public List<Serializable> getValues() {
        return this.values;
    }

}
