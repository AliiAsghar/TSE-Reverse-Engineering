package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class st extends ta {
    public final HashMap a = new HashMap();

    @Override // defpackage.ta
    public final sw a(Object obj) {
        return (sw) this.a.get(obj);
    }

    @Override // defpackage.ta
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
