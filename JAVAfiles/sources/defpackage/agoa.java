package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agoa {
    public final agoz a;
    public final agmh b;
    public final agmh c;
    public final String d;
    public final String e;
    public final boolean f;
    public final agpw g;
    public int h;
    public final int i;

    public agoa(agoz agozVar, agmh agmhVar, agmh agmhVar2, String str, agpw agpwVar, int i, boolean z, String str2) {
        this.a = agozVar;
        if (!z && agmhVar != null && !agmhVar.a.f) {
            throw new IllegalArgumentException(a.bX(agmhVar, "join on ", " without index"));
        }
        this.b = agmhVar;
        this.c = agmhVar2;
        this.d = str;
        this.g = agpwVar;
        this.i = i;
        this.e = str2;
        boolean z2 = true;
        if (agmhVar != null) {
            agmh c = agmhVar.c();
            if (agmhVar.f() || (c != null && c.f())) {
                z2 = false;
            }
        }
        this.f = z2;
    }

    public final agoz a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(agnw agnwVar, agmp agmpVar, akkw akkwVar, boolean z) {
        agnz agnzVar;
        Stream stream = Collection.EL.stream(alzz.ap(agmpVar.d));
        int i = 0;
        if (z) {
            agnzVar = new agnz(i);
        } else {
            agnzVar = new agnz(2);
        }
        agoz agozVar = this.a;
        agmpVar.f.put(this.e, agozVar.e(agnwVar, agmpVar, (String[]) ((ArrayList) stream.map(agnzVar).collect(Collectors.toCollection(new agmr(9)))).toArray(new String[0]), null, akkwVar.h(this.e), akkwVar));
        alog i2 = this.a.n.i();
        int i3 = ((alsx) i2).c;
        while (i < i3) {
            ((agoa) i2.get(i)).b(agnwVar, agmpVar, akkwVar, z);
            i++;
        }
    }
}
