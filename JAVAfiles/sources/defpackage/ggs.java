package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggs extends gvf {
    public final no a;
    private final ecd b;
    private final qdq c;

    public ggs(ghj ghjVar, qdq qdqVar, no noVar, ecd ecdVar) {
        boolean z;
        ghjVar.m(this);
        d.s(true);
        if (noVar != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(true);
        this.c = qdqVar;
        this.a = noVar;
        this.b = ecdVar;
    }

    @Override // defpackage.gvf
    public final void a(Object obj, boolean z) {
        int A = this.c.A(obj);
        if (A < 0) {
            Objects.toString(obj);
            Log.w("EventsRelays", "Item change notification received for unknown item: ".concat(String.valueOf(obj)));
        } else {
            this.b.accept(new ebm(this, A, 3, null));
        }
    }
}
