package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public class dol {
    public final doe a;
    public final AtomicReference b = new AtomicReference(null);

    public dol(doe doeVar) {
        this.a = doeVar;
    }

    public final dov a() {
        return (dov) this.b.get();
    }
}
