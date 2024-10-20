package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyx {
    public final armf a;
    long b = -1;
    long c = -1;
    private final armf d;

    public wyx(armf armfVar, armf armfVar2) {
        this.d = armfVar;
        this.a = armfVar2;
    }

    public final Collection a(long j) {
        Stream map = Collection.EL.stream(((rtz) this.d.b()).L(xhv.b(j))).filter(new wjl(6)).map(new wki(this, 12));
        int i = alog.d;
        return (java.util.Collection) map.collect(alls.a);
    }
}
