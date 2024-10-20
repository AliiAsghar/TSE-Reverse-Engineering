package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrr {
    private static final xze a = xze.g("BugleFileTransfer", "FilePreviewSizeProvider");
    private final psz b;
    private final psw c;
    private final ryg d;

    public xrr(psz pszVar, ryg rygVar, psw pswVar) {
        this.b = pszVar;
        this.d = rygVar;
        this.c = pswVar;
    }

    public final int a(alog alogVar) {
        Optional f;
        if (alogVar.size() != 1) {
            return ((Integer) acpq.E().k().a()).intValue();
        }
        msh mshVar = (msh) alogVar.get(0);
        if (this.c.a()) {
            psv n = this.d.n(mshVar);
            if (!n.e()) {
                if (!n.h()) {
                    int intValue = ((Integer) acpq.E().l().a()).intValue();
                    xyo c = a.c();
                    c.H("Using pre-UP file transfer preview size:");
                    c.F(intValue);
                    c.H("bytes");
                    c.q();
                    return intValue;
                }
                return ((Integer) acpq.E().k().a()).intValue();
            }
            xyo e = a.e();
            e.H("Capabilities are empty for");
            e.j(mshVar.toString());
            e.H("while trying to determine the file transfer preview size");
            e.q();
            return Math.min(((Integer) acpq.E().l().a()).intValue(), ((Integer) acpq.E().k().a()).intValue());
        }
        try {
            f = this.b.f(mshVar);
        } catch (psx e2) {
            xyo b = a.b();
            b.H("Unable to query capabilities for");
            b.j(mshVar.toString());
            b.H("while trying to determine the file transfer preview size");
            b.r(e2);
        }
        if (f.isEmpty()) {
            xyo e3 = a.e();
            e3.H("Capabilities are empty for");
            e3.j(mshVar.toString());
            e3.H("while trying to determine the file transfer preview size");
            e3.q();
            return Math.min(((Integer) acpq.E().l().a()).intValue(), ((Integer) acpq.E().k().a()).intValue());
        }
        if (!((psv) f.get()).h()) {
            int intValue2 = ((Integer) acpq.E().l().a()).intValue();
            xyo c2 = a.c();
            c2.H("Using pre-UP file transfer preview size:");
            c2.F(intValue2);
            c2.H("bytes");
            c2.q();
            return intValue2;
        }
        return ((Integer) acpq.E().k().a()).intValue();
    }
}
