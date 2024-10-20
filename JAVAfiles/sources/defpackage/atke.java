package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atke extends LinkedHashMap {
    public int a;

    public atke() {
        super(16, 0.75f, true);
        this.a = 50000;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (this.a >= 0 && size() > this.a) {
            return true;
        }
        return false;
    }
}
