package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoz extends agmp implements agmq {
    @Deprecated
    public xoz(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, xpb xpbVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, xpf.a, agoxVar, akkwVar, xpbVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new xow();
    }

    public final qep c() {
        byte[] blob = getBlob(cI(4, xpf.a));
        if (blob == null) {
            return null;
        }
        try {
            return (qep) apag.parseFrom(qep.a, blob, aozs.a());
        } catch (Throwable unused) {
            return qep.a;
        }
    }

    public final qep e() {
        byte[] blob = getBlob(cI(5, xpf.a));
        if (blob == null) {
            return null;
        }
        try {
            return (qep) apag.parseFrom(qep.a, blob, aozs.a());
        } catch (Throwable unused) {
            return qep.a;
        }
    }

    public final qeq f() {
        byte[] blob = getBlob(cI(3, xpf.a));
        if (blob == null) {
            return null;
        }
        try {
            return (qeq) apag.parseFrom(qeq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return qeq.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02ab  */
    @Override // defpackage.agmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog fr(defpackage.agoa r21) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xoz.fr(agoa):alog");
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cI(0, xpf.a)));
    }

    public final xpg h() {
        xpg[] values = xpg.values();
        int i = getInt(cI(2, xpf.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cI(6, xpf.a));
    }

    public final String j() {
        return getString(cI(1, xpf.a));
    }

    public final byte[] k() {
        return getBlob(cI(7, xpf.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
