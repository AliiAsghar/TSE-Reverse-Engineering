package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aehd extends aehf {
    private final Map a;

    public aehd(Map map) {
        this.a = map;
    }

    @Override // defpackage.aehf, defpackage.aehj
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.aehj
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aehj) {
            aehj aehjVar = (aehj) obj;
            if (aehjVar.b() == 1 && alzz.am(this.a, aehjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConfigDataMapOrSyncFailureReason{configDataMap=" + alzz.ai(this.a) + "}";
    }
}
