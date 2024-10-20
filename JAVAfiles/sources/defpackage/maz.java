package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class maz extends mav {
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.mav
    public final boolean a(mbu mbuVar) {
        mbt b = mbt.b(mbuVar.b);
        if (b == null) {
            b = mbt.LOG_SPEC_UNSPECIFIED;
        }
        if (((Boolean) Map.EL.putIfAbsent(this.a, b, true)) == null) {
            return true;
        }
        return false;
    }
}
