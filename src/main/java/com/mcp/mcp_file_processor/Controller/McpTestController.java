package com.mcp.mcp_file_processor.Controller;

import com.mcp.mcp_file_processor.Services.McpTestService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class McpTestController {

    private final McpTestService mcpTestService;

    public McpTestController(McpTestService mcpTestService) {
        this.mcpTestService = mcpTestService;
    }

    @Operation(summary = "Test endpoint for MCP server")
    @GetMapping("/ping")
    public String ping() {
        log.info("Request received on /api/test/ping");
        return mcpTestService.getPingResponse();
    }
}
