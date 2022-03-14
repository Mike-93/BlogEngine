package BlogEngine.controller;

import BlogEngine.api.response.InitResponse;
import BlogEngine.api.response.SettingsResponse;
import BlogEngine.service.SettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiGeneralController {

    private final SettingsService settingsService;
    private final InitResponse initResponse;

    @GetMapping("/init")
    private InitResponse init(){
        return initResponse;
    }

    @GetMapping("/settings")
    private SettingsResponse settings(){
        return settingsService.getGlobalSettings();
    }
}
