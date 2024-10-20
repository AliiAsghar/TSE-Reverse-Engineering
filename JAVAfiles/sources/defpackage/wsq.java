package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsq extends agmp implements agmq {
    @Deprecated
    public wsq(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, wsr wsrVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, wsu.a, agoxVar, akkwVar, wsrVar);
    }

    public final byte[] A() {
        return getBlob(cI(101, wsu.a));
    }

    public final byte[] B() {
        return getBlob(cI(51, wsu.a));
    }

    public final int[] C() {
        return agnc.w(null, dk(getString(cI(97, wsu.a))));
    }

    public final long[] D() {
        return agnc.y(null, dl(getString(cI(104, wsu.a))));
    }

    public final long[] E() {
        return agnc.y(null, dl(getString(cI(111, wsu.a))));
    }

    public final long[] F() {
        return agnc.y(null, dl(getString(cI(107, wsu.a))));
    }

    public final tqd[] G() {
        int[] dk = dk(getString(cI(86, wsu.a)));
        tqd[] values = tqd.values();
        int length = values.length;
        tqd[] tqdVarArr = new tqd[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqdVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqd[]) agnc.z(null, tqdVarArr, new tqd[0]);
    }

    public final String[] H() {
        return (String[]) agnc.z(null, dm(getString(cI(98, wsu.a))), new String[0]);
    }

    public final String[] I() {
        return (String[]) agnc.z(null, dm(getString(cI(108, wsu.a))), new String[0]);
    }

    public final String[] J() {
        return (String[]) agnc.z(null, dm(getString(cI(77, wsu.a))), new String[0]);
    }

    public final String[] K() {
        return (String[]) agnc.z(null, dm(getString(cI(105, wsu.a))), new String[0]);
    }

    public final boolean[] L() {
        return agnc.A(null, dn(getString(cI(103, wsu.a))));
    }

    public final boolean[] M() {
        return agnc.A(null, dn(getString(cI(110, wsu.a))));
    }

    public final byte[][] N() {
        return agnc.B(null, dv(getString(cI(113, wsu.a))));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new wsn();
    }

    public final int c() {
        return getInt(cI(63, wsu.a));
    }

    public final long e() {
        return getLong(cI(45, wsu.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cI(7, wsu.a)));
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cI(87, wsu.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cI(2, wsu.a)));
    }

    public final utk i() {
        utk[] values = utk.values();
        int i = getInt(cI(71, wsu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xxw j() {
        xxw[] values = xxw.values();
        int i = getInt(cI(61, wsu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final apwq k() {
        byte[] blob = getBlob(cI(53, wsu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwq.a;
        }
    }

    public final Instant l() {
        return uzz.l(getLong(cI(5, wsu.a)));
    }

    public final Optional m() {
        return rvg.a(getString(cI(59, wsu.a)));
    }

    public final String n() {
        return getString(cI(99, wsu.a));
    }

    public final String o() {
        return getString(cI(125, wsu.a));
    }

    public final String p() {
        return getString(cI(33, wsu.a));
    }

    public final String q() {
        return getString(cI(109, wsu.a));
    }

    public final String r() {
        return getString(cI(54, wsu.a));
    }

    public final String s() {
        return getString(cI(100, wsu.a));
    }

    public final String t() {
        return getString(cI(44, wsu.a));
    }

    public final String u() {
        return getString(cI(43, wsu.a));
    }

    public final String v() {
        return getString(cI(50, wsu.a));
    }

    public final boolean w() {
        if (getInt(cI(57, wsu.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (getInt(cI(115, wsu.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (getInt(cI(64, wsu.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] z() {
        return getBlob(cI(102, wsu.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
