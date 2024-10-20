package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpm implements adul {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (agkx.W().longValue() > ((adpe) it.next()).k) {
                it.remove();
            }
        }
    }
}
