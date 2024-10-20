package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tca extends agmp implements agmq {
    @Deprecated
    public tca(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tcc tccVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tcf.a, agoxVar, akkwVar, tccVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tbw();
    }

    public final int c() {
        return getInt(cI(9, tcf.a));
    }

    public final long e() {
        return getLong(cI(7, tcf.a));
    }

    public final long f() {
        return getLong(cI(6, tcf.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x047b  */
    @Override // defpackage.agmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog fr(defpackage.agoa r30) {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tca.fr(agoa):alog");
    }

    public final long g() {
        return getLong(cI(10, tcf.a));
    }

    public final rve h() {
        return rve.a(getString(cI(0, tcf.a)));
    }

    public final tqn i() {
        tqn[] values = tqn.values();
        int i = getInt(cI(11, tcf.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final apwq j() {
        byte[] blob = getBlob(cI(12, tcf.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwq.a;
        }
    }

    public final String k() {
        return getString(cI(15, tcf.a));
    }

    public final String l() {
        return getString(cI(4, tcf.a));
    }

    public final String m() {
        return getString(cI(14, tcf.a));
    }

    public final String n() {
        return getString(cI(3, tcf.a));
    }

    public final String o() {
        return getString(cI(5, tcf.a));
    }

    public final String p() {
        return getString(cI(1, tcf.a));
    }

    public final String q() {
        return getString(cI(2, tcf.a));
    }

    public final String r() {
        return getString(cI(8, tcf.a));
    }

    public final boolean s() {
        if (getInt(cI(16, tcf.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (getInt(cI(17, tcf.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (getInt(cI(13, tcf.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
