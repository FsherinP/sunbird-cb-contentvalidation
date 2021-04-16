package org.sunbird.contentvalidation.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@UserDefinedType("india_map_analysis")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfanityIndiaMapAnalysis {
    @Column("image_no")
    private Integer imageNo;

    @Column("probability")
    private float probability;
}