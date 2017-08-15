package com.baron.api.provider;

import com.baron.common.annotation.SpiderProvider;
import com.baron.common.model.Page;

public interface PipelineProvider extends BaseProvider {
    void pipeline(String providerName, Page page);
}