package faangschool.magic.collection;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CompositeKey {

    private final String faculty;
    private final int year;


}


