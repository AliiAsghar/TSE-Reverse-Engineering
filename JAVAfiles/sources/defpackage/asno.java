package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asno {
    public final aslb a;
    public List b;
    public int c;
    public List d;
    public final List e;
    public final asuo f;

    public asno(aslb aslbVar, asuo asuoVar) {
        List m;
        this.a = aslbVar;
        this.f = asuoVar;
        arnv arnvVar = arnv.a;
        this.b = arnvVar;
        this.d = arnvVar;
        this.e = new ArrayList();
        URI f = aslbVar.h.f();
        if (f.getHost() == null) {
            m = asmt.m(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aslbVar.g.select(f);
            if (select != null && !select.isEmpty()) {
                m = asmt.n(select);
            } else {
                m = asmt.m(Proxy.NO_PROXY);
            }
        }
        this.b = m;
        this.c = 0;
        m.getClass();
    }

    public final boolean a() {
        if (!b() && this.e.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.c < this.b.size()) {
            return true;
        }
        return false;
    }
}
