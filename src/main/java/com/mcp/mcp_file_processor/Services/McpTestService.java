package com.mcp.mcp_file_processor.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class McpTestService {

    public String getPingResponse() {
        log.info("Response from McpTestService");
        return "MCP Server is running!";
    }
}

