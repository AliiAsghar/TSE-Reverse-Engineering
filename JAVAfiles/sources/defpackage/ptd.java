package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptd implements psz {
    private static final xze a = xze.g("Bugle", "RcsContactsTransportProxy");
    private final alor b;
    private final armf c;
    private final vbu d;

    public ptd(Map map, armf armfVar, vbu vbuVar) {
        this.b = alor.j(map);
        this.c = armfVar;
        this.d = vbuVar;
    }

    private final psz a() {
        amuk d = ((xtj) this.c.b()).d();
        armf armfVar = (armf) this.b.get(d);
        d.name();
        armfVar.getClass();
        return (psz) armfVar.b();
    }

    private final boolean e(msh mshVar) {
        String n;
        boolean equals;
        akrh e = aktp.e("RcsContactsTransportProxy::isOwnMsisdn");
        try {
            vbu vbuVar = this.d;
            int i = vbuVar.g;
            if (i == -2) {
                a.bE(vbuVar.h, aktp.ah(new uql(vbuVar, 4), vbuVar.d));
                n = "";
            } else {
                Optional optional = (Optional) vbuVar.f.get(Integer.valueOf(i));
                if (optional != null) {
                    n = (String) vbu.g(optional).orElseGet(new mcg(vbuVar, i, 15));
                } else {
                    n = vbuVar.n(i);
                }
            }
            String n2 = mshVar.n();
            if (albo.ah(n)) {
                equals = false;
            } else {
                equals = n.equals(n2);
            }
            xyo a2 = a.a();
            a2.H("Checking isOwnNumber for: ");
            a2.j(n);
            a2.H(" = ");
            a2.j(n2);
            a2.H(", result: ");
            a2.I(equals);
            a2.q();
            e.close();
            return equals;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.psz
    public final akul b(msh mshVar) {
        akul b;
        akrh e = aktp.e("RcsContactsTransportProxy::getCapabilities");
        try {
            if (mshVar.e().isEmpty()) {
                b = aktp.ag(psv.c());
            } else if (e(mshVar)) {
                b = aktp.ag(psv.c());
            } else {
                b = a().b(mshVar);
                e.b(b);
            }
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.psz
    public final akul c(msh mshVar) {
        akul c;
        akrh e = aktp.e("RcsContactsTransportProxy::getOnlineStatus");
        try {
            if (e(mshVar)) {
                c = aktp.ag(psy.NOT_RCS);
            } else {
                c = a().c(mshVar);
                e.b(c);
            }
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.psz
    public final ammd d(msh mshVar) {
        return a().d(mshVar);
    }

    @Override // defpackage.psz
    public final Optional f(msh mshVar) {
        Optional f;
        akrh e = aktp.e("RcsContactsTransportProxy::getCachedCapabilities");
        try {
            if (mshVar.e().isEmpty()) {
                f = Optional.of(psv.c());
            } else if (e(mshVar)) {
                f = Optional.of(psv.c());
            } else {
                f = a().f(mshVar);
            }
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.psz
    public final Optional g(msh mshVar) {
        Optional g;
        akrh e = aktp.e("RcsContactsTransportProxy::getCachedCapabilitiesFromLocalCache");
        try {
            if (mshVar.e().isEmpty()) {
                g = Optional.of(psv.c());
            } else if (e(mshVar)) {
                g = Optional.of(psv.c());
            } else {
                g = a().g(mshVar);
            }
            e.close();
            return g;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
