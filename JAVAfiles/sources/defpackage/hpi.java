package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpi implements Iterable {
    public final List a;

    public hpi(List list) {
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hpi b() {
        return new hpi(new ArrayList(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(hxd hxdVar) {
        return this.a.contains(new hph(hxdVar, hyn.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<hph> iterator() {
        return this.a.iterator();
    }

    public hpi() {
        this(new ArrayList(2));
    }
}
