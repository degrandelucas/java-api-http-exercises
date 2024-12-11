package dto;

import java.util.List;

public record VolumeInfo(String title, List<String> authors, Integer pageCount, List<String> categories) {
}
