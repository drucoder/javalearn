package letscode.javalearn.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@ToString(of = {"id", "child"})
public class Department {
    private final int id;
    private final int parent;
    private final String name;

    private Set<Department> child = new HashSet<>();
}
