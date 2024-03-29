package com.xiaohunao.equipmentbenediction.capability;

import java.util.List;

public interface IGlossaryCapability {
    boolean isHasGlossary();

    void setHasGlossary(boolean hasGlossary);

    List<String> getGlossaryIDList();

    void addGlossaryID(String id);
    void clearGlossaryIDList();
}
