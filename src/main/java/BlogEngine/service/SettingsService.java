package BlogEngine.service;

import BlogEngine.api.response.SettingsResponse;
import BlogEngine.models.GlobalSettings;
import BlogEngine.repository.SettingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SettingsService {

    private final SettingsRepository settingsRepository;

    public SettingsResponse getGlobalSettings() {
        SettingsResponse settingsResponse = new SettingsResponse();
        Iterable<GlobalSettings> settings = settingsRepository.findAll();
        for (GlobalSettings s : settings) {
            settingsResponse.setMultiuserMode(s.getCode().equals("MULTIUSER_MODE") && s.getValue().equals("YES"));
            settingsResponse.setPostPremoderation(s.getCode().equals("POST_PREMODERATION") && s.getValue().equals("YES"));
            settingsResponse.setStatisticsIsPublic(s.getCode().equals("STATISTICS_IS_PUBLIC") && s.getValue().equals("YES"));
        }
        return settingsResponse;
    }
}
