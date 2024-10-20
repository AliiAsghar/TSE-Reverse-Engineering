package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxw implements gxu {
    private final gid a;
    private final ghp b;

    public gxw(gid gidVar) {
        this.a = gidVar;
        this.b = new gxv(gidVar);
    }

    @Override // defpackage.gxu
    public final Long a(String str) {
        gih a = gih.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, str);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
        try {
            Long l = null;
            if (bC.moveToFirst() && !bC.isNull(0)) {
                l = Long.valueOf(bC.getLong(0));
            }
            return l;
        } finally {
            bC.close();
            a.j();
        }
    }

    @Override // defpackage.gxu
    public final void b(gxt gxtVar) {
        this.a.k();
        this.a.l();
        try {
            this.b.a(gxtVar);
            this.a.o();
        } finally {
            this.a.m();
        }
    }
}
