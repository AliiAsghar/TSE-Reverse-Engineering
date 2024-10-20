package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqx extends agmp implements agmq {
    @Deprecated
    public uqx(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, uqz uqzVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, urd.a, agoxVar, akkwVar, uqzVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new uqs();
    }

    public final int c() {
        return getInt(cI(4, urd.a));
    }

    public final Optional e() {
        return rvg.a(getString(cI(1, urd.a)));
    }

    public final String f() {
        return getString(cI(0, urd.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    @Override // defpackage.agmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog fr(defpackage.agoa r20) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqx.fr(agoa):alog");
    }

    public final Date g() {
        return rva.b(getLong(cI(3, urd.a)));
    }

    public final Date h() {
        return rva.b(getLong(cI(2, urd.a)));
    }

    public final boolean i() {
        if (getInt(cI(7, urd.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (getInt(cI(5, urd.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (getInt(cI(6, urd.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (getInt(cI(8, urd.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
