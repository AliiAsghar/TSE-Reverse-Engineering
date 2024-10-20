package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class biu {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();

    public final biw a(bit bitVar) {
        return (biw) this.a.get(bitVar);
    }

    public final void b(bit bitVar) {
        biw biwVar = (biw) this.a.get(bitVar);
        if (biwVar != null) {
        }
        this.a.remove(bitVar);
    }
}
