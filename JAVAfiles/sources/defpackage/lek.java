package defpackage;

import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lek {
    public static final xze a = xze.g("BuglePlacesApiHelper", "PlacesApiHelper");
    public static final Object b = new Object();
    public final Optional e;
    public final anen f;
    public final armf g;
    public final armf h;
    public volatile lei i;
    public WeakReference c = new WeakReference(null);
    public final Object d = new Object();
    public volatile List j = new ArrayList();

    public lek(Optional optional, anen anenVar, armf armfVar, armf armfVar2) {
        this.e = optional;
        this.f = anenVar;
        this.g = armfVar;
        this.h = armfVar2;
    }

    public final void a() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((lei) it.next()).a();
        }
        this.j.clear();
    }
}
