package com.morais.socialcommerce.core.dataprovider;

import com.morais.socialcommerce.core.domain.Group;
import java.util.List;
import java.util.Optional;

public interface FindAllGroups {
    Optional<List<Group>> findAll();
}
