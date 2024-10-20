package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes5.dex */
final class h extends i {
    private final Set d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.i
    protected final e c(String str) {
        if (this.d.contains(str)) {
            return new e(TimeZone.getTimeZone(str));
        }
        throw new RuntimeException("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.i
    protected final Set d() {
        return this.d;
    }
}
