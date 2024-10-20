package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxt extends agmp<sxt, sxx, sxy, MessagesTable.BindData, sxp> implements agmq {
    @Deprecated
    public sxt(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sxx sxxVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, MessagesTable.a, agoxVar, akkwVar, sxxVar);
    }

    public final Uri A() {
        String string = getString(cI(14, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final qwe B() {
        return riw.m(getString(cI(25, MessagesTable.a)));
    }

    public final ConversationIdType C() {
        return new ConversationIdType(getLong(cI(1, MessagesTable.a)));
    }

    public final ruz D() {
        return new ruz(getString(cI(64, MessagesTable.a)));
    }

    public final MessageIdType E() {
        return new MessageIdType(getLong(cI(0, MessagesTable.a)));
    }

    public final MessageIdType F() {
        return new MessageIdType(getLong(cI(50, MessagesTable.a)));
    }

    public final rve G() {
        return rve.a(getString(cI(43, MessagesTable.a)));
    }

    public final rve H() {
        return rve.a(getString(cI(28, MessagesTable.a)));
    }

    public final tqf I() {
        tqf[] values = tqf.values();
        int i = getInt(cI(56, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqp J() {
        tqp[] values = tqp.values();
        int i = getInt(cI(60, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqp K() {
        tqp[] values = tqp.values();
        int i = getInt(cI(61, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqr L() {
        tqr[] values = tqr.values();
        int i = getInt(cI(30, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqu M() {
        tqu[] values = tqu.values();
        int i = getInt(cI(62, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final utk N() {
        utk[] values = utk.values();
        int i = getInt(cI(65, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xxw O() {
        xxw[] values = xxw.values();
        int i = getInt(cI(55, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final alog P() {
        alob alobVar = new alob();
        while (moveToNext()) {
            E();
            alobVar.h(E());
        }
        return alobVar.g();
    }

    public final apwq Q() {
        byte[] blob = getBlob(cI(47, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwq.a;
        }
    }

    public final Instant R() {
        return uzz.l(getLong(cI(7, MessagesTable.a)));
    }

    public final Optional S() {
        return rvg.a(getString(cI(53, MessagesTable.a)));
    }

    public final Optional T() {
        return rvg.a(getString(cI(66, MessagesTable.a)));
    }

    public final String U() {
        return getString(cI(27, MessagesTable.a));
    }

    public final String V() {
        return getString(cI(48, MessagesTable.a));
    }

    public final String W() {
        return getString(cI(38, MessagesTable.a));
    }

    public final String X() {
        return getString(cI(37, MessagesTable.a));
    }

    public final String Y() {
        return getString(cI(44, MessagesTable.a));
    }

    public final String Z() {
        return getString(cI(49, MessagesTable.a));
    }

    public final int[] aA() {
        return agnc.w(null, dk(getString(cI(54, MessagesTable.a))));
    }

    public final long[] aB() {
        return agnc.y(null, dl(getString(cI(39, MessagesTable.a))));
    }

    public final long[] aC() {
        return agnc.y(null, dl(getString(cI(20, MessagesTable.a))));
    }

    public final long[] aD() {
        return agnc.y(null, dl(getString(cI(21, MessagesTable.a))));
    }

    public final long[] aE() {
        return agnc.y(null, dl(getString(cI(34, MessagesTable.a))));
    }

    public final long[] aF() {
        return agnc.y(null, dl(getString(cI(8, MessagesTable.a))));
    }

    public final long[] aG() {
        return agnc.y(null, dl(getString(cI(46, MessagesTable.a))));
    }

    public final long[] aH() {
        return agnc.y(null, dl(getString(cI(26, MessagesTable.a))));
    }

    public final long[] aI() {
        return agnc.y(null, dl(getString(cI(42, MessagesTable.a))));
    }

    public final long[] aJ() {
        return agnc.y(null, dl(getString(cI(6, MessagesTable.a))));
    }

    public final Uri[] aK() {
        String[] dm = dm(getString(cI(52, MessagesTable.a)));
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i < length) {
                String str = dm[i];
                int i3 = i2 + 1;
                if (str != null && str.length() != 0) {
                    uri = Uri.parse(str);
                }
                uriArr[i2] = uri;
                i++;
                i2 = i3;
            } else {
                return (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            }
        }
    }

    public final Uri[] aL() {
        String[] dm = dm(getString(cI(14, MessagesTable.a)));
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i < length) {
                String str = dm[i];
                int i3 = i2 + 1;
                if (str != null && str.length() != 0) {
                    uri = Uri.parse(str);
                }
                uriArr[i2] = uri;
                i++;
                i2 = i3;
            } else {
                return (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            }
        }
    }

    public final qwe[] aM() {
        String[] dm = dm(getString(cI(25, MessagesTable.a)));
        int length = dm.length;
        qwe[] qweVarArr = new qwe[length];
        for (int i = 0; i < length; i++) {
            qweVarArr[i] = riw.m(dm[i]);
        }
        return (qwe[]) agnc.z(null, qweVarArr, new qwe[0]);
    }

    public final ConversationIdType[] aN() {
        long[] dl = dl(getString(cI(1, MessagesTable.a)));
        int length = dl.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(dl[i]);
        }
        return (ConversationIdType[]) agnc.z(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ruz[] aO() {
        String[] dm = dm(getString(cI(64, MessagesTable.a)));
        int length = dm.length;
        ruz[] ruzVarArr = new ruz[length];
        for (int i = 0; i < length; i++) {
            ruzVarArr[i] = new ruz(dm[i]);
        }
        return (ruz[]) agnc.z(null, ruzVarArr, new ruz[0]);
    }

    public final MessageIdType[] aP() {
        long[] dl = dl(getString(cI(0, MessagesTable.a)));
        int length = dl.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(dl[i]);
        }
        return (MessageIdType[]) agnc.z(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final MessageIdType[] aQ() {
        long[] dl = dl(getString(cI(50, MessagesTable.a)));
        int length = dl.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(dl[i]);
        }
        return (MessageIdType[]) agnc.z(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final rve[] aR() {
        String[] dm = dm(getString(cI(43, MessagesTable.a)));
        int length = dm.length;
        rve[] rveVarArr = new rve[length];
        for (int i = 0; i < length; i++) {
            rveVarArr[i] = rve.a(dm[i]);
        }
        return (rve[]) agnc.z(null, rveVarArr, new rve[0]);
    }

    public final rve[] aS() {
        String[] dm = dm(getString(cI(28, MessagesTable.a)));
        int length = dm.length;
        rve[] rveVarArr = new rve[length];
        for (int i = 0; i < length; i++) {
            rveVarArr[i] = rve.a(dm[i]);
        }
        return (rve[]) agnc.z(null, rveVarArr, new rve[0]);
    }

    public final tqf[] aT() {
        int[] dk = dk(getString(cI(56, MessagesTable.a)));
        tqf[] values = tqf.values();
        int length = values.length;
        tqf[] tqfVarArr = new tqf[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqfVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqf[]) agnc.z(null, tqfVarArr, new tqf[0]);
    }

    public final tqp[] aU() {
        int[] dk = dk(getString(cI(60, MessagesTable.a)));
        tqp[] values = tqp.values();
        int length = values.length;
        tqp[] tqpVarArr = new tqp[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqpVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqp[]) agnc.z(null, tqpVarArr, new tqp[0]);
    }

    public final tqp[] aV() {
        int[] dk = dk(getString(cI(61, MessagesTable.a)));
        tqp[] values = tqp.values();
        int length = values.length;
        tqp[] tqpVarArr = new tqp[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqpVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqp[]) agnc.z(null, tqpVarArr, new tqp[0]);
    }

    public final utk[] aW() {
        int[] dk = dk(getString(cI(65, MessagesTable.a)));
        utk[] values = utk.values();
        int length = values.length;
        utk[] utkVarArr = new utk[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                utkVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (utk[]) agnc.z(null, utkVarArr, new utk[0]);
    }

    public final xxw[] aX() {
        int[] dk = dk(getString(cI(55, MessagesTable.a)));
        xxw[] values = xxw.values();
        int length = values.length;
        xxw[] xxwVarArr = new xxw[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                xxwVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (xxw[]) agnc.z(null, xxwVarArr, new xxw[0]);
    }

    public final apwq[] aY() {
        apwq apwqVar;
        List cY = cY(getString(cI(47, MessagesTable.a)));
        apwq[] apwqVarArr = new apwq[cY.size()];
        Iterator it = cY.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] v = agnc.v((String) it.next());
                int i2 = i + 1;
                if (v == null) {
                    apwqVar = null;
                } else {
                    try {
                        apwqVar = (apwq) apag.parseFrom(apwq.a, v);
                    } catch (Throwable unused) {
                        i = i2;
                        apwqVarArr[i] = null;
                        i++;
                    }
                }
                apwqVarArr[i] = apwqVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (apwq[]) agnc.z(null, apwqVarArr, new apwq[0]);
    }

    public final Instant[] aZ() {
        long[] dl = dl(getString(cI(7, MessagesTable.a)));
        int length = dl.length;
        Instant[] instantArr = new Instant[length];
        for (int i = 0; i < length; i++) {
            instantArr[i] = uzz.l(dl[i]);
        }
        return (Instant[]) agnc.z(null, instantArr, new Instant[0]);
    }

    public final String aa() {
        return getString(cI(19, MessagesTable.a));
    }

    public final String ab() {
        return getString(cI(22, MessagesTable.a));
    }

    public final String ac() {
        return yta.a(getString(cI(17, MessagesTable.a)));
    }

    public final String ad() {
        return getString(cI(18, MessagesTable.a));
    }

    public final String ae() {
        return getString(cI(4, MessagesTable.a));
    }

    public final String af() {
        return getString(cI(33, MessagesTable.a));
    }

    public final String ag() {
        return getString(cI(5, MessagesTable.a));
    }

    public final String ah() {
        return getString(cI(24, MessagesTable.a));
    }

    public final String ai() {
        return getString(cI(2, MessagesTable.a));
    }

    public final String aj() {
        return getString(cI(3, MessagesTable.a));
    }

    public final String ak() {
        return getString(cI(36, MessagesTable.a));
    }

    public final String al() {
        return getString(cI(40, MessagesTable.a));
    }

    public final atok am() {
        byte[] blob = getBlob(cI(59, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (atok) apag.parseFrom(atok.a, blob, aozs.a());
        } catch (Throwable unused) {
            return atok.a;
        }
    }

    public final boolean an() {
        if (getInt(cI(51, MessagesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ao() {
        if (getInt(cI(58, MessagesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ap() {
        if (getInt(cI(32, MessagesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean aq() {
        if (getInt(cI(12, MessagesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ar() {
        if (getInt(cI(13, MessagesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] as() {
        return getBlob(cI(45, MessagesTable.a));
    }

    public final int[] at() {
        return agnc.w(null, dk(getString(cI(57, MessagesTable.a))));
    }

    public final int[] au() {
        return agnc.w(null, dk(getString(cI(11, MessagesTable.a))));
    }

    public final int[] av() {
        return agnc.w(null, dk(getString(cI(63, MessagesTable.a))));
    }

    public final int[] aw() {
        return agnc.w(null, dk(getString(cI(9, MessagesTable.a))));
    }

    public final int[] ax() {
        return agnc.w(null, dk(getString(cI(23, MessagesTable.a))));
    }

    public final int[] ay() {
        return agnc.w(null, dk(getString(cI(29, MessagesTable.a))));
    }

    public final int[] az() {
        return agnc.w(null, dk(getString(cI(31, MessagesTable.a))));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sxm();
    }

    public final Optional[] ba() {
        String[] dm = dm(getString(cI(53, MessagesTable.a)));
        int length = dm.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = rvg.a(dm[i]);
        }
        return (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bb() {
        String[] dm = dm(getString(cI(66, MessagesTable.a)));
        int length = dm.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = rvg.a(dm[i]);
        }
        return (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
    }

    public final String[] bc() {
        return (String[]) agnc.z(null, dm(getString(cI(27, MessagesTable.a))), new String[0]);
    }

    public final String[] bd() {
        return (String[]) agnc.z(null, dm(getString(cI(48, MessagesTable.a))), new String[0]);
    }

    public final String[] be() {
        return (String[]) agnc.z(null, dm(getString(cI(38, MessagesTable.a))), new String[0]);
    }

    public final String[] bf() {
        return (String[]) agnc.z(null, dm(getString(cI(37, MessagesTable.a))), new String[0]);
    }

    public final String[] bg() {
        return (String[]) agnc.z(null, dm(getString(cI(44, MessagesTable.a))), new String[0]);
    }

    public final String[] bh() {
        return (String[]) agnc.z(null, dm(getString(cI(49, MessagesTable.a))), new String[0]);
    }

    public final String[] bi() {
        return (String[]) agnc.z(null, dm(getString(cI(19, MessagesTable.a))), new String[0]);
    }

    public final String[] bj() {
        return (String[]) agnc.z(null, dm(getString(cI(22, MessagesTable.a))), new String[0]);
    }

    public final String[] bk() {
        String[] dm = dm(getString(cI(17, MessagesTable.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bl() {
        return (String[]) agnc.z(null, dm(getString(cI(18, MessagesTable.a))), new String[0]);
    }

    public final String[] bm() {
        return (String[]) agnc.z(null, dm(getString(cI(4, MessagesTable.a))), new String[0]);
    }

    public final String[] bn() {
        return (String[]) agnc.z(null, dm(getString(cI(33, MessagesTable.a))), new String[0]);
    }

    public final String[] bo() {
        return (String[]) agnc.z(null, dm(getString(cI(5, MessagesTable.a))), new String[0]);
    }

    public final String[] bp() {
        return (String[]) agnc.z(null, dm(getString(cI(24, MessagesTable.a))), new String[0]);
    }

    public final String[] bq() {
        return (String[]) agnc.z(null, dm(getString(cI(2, MessagesTable.a))), new String[0]);
    }

    public final String[] br() {
        return (String[]) agnc.z(null, dm(getString(cI(3, MessagesTable.a))), new String[0]);
    }

    public final boolean[] bs() {
        return agnc.A(null, dn(getString(cI(51, MessagesTable.a))));
    }

    public final boolean[] bt() {
        return agnc.A(null, dn(getString(cI(58, MessagesTable.a))));
    }

    public final boolean[] bu() {
        return agnc.A(null, dn(getString(cI(32, MessagesTable.a))));
    }

    public final boolean[] bv() {
        return agnc.A(null, dn(getString(cI(12, MessagesTable.a))));
    }

    public final boolean[] bw() {
        return agnc.A(null, dn(getString(cI(13, MessagesTable.a))));
    }

    public final byte[][] bx() {
        return agnc.B(null, dv(getString(cI(45, MessagesTable.a))));
    }

    public final int c() {
        return getInt(cI(57, MessagesTable.a));
    }

    public final int e() {
        return getInt(cI(11, MessagesTable.a));
    }

    public final int f() {
        return getInt(cI(63, MessagesTable.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long[] jArr;
        Instant[] instantArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean[] zArr;
        boolean[] zArr2;
        Uri[] uriArr;
        int[] iArr4;
        long[] jArr3;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        long[] jArr4;
        long[] jArr5;
        final int i;
        long[] jArr6;
        String[] strArr8;
        String[] strArr9;
        final int i2;
        int[] iArr5;
        int[] iArr6;
        String[] strArr10;
        qwe[] qweVarArr;
        long[] jArr7;
        String[] strArr11;
        rve[] rveVarArr;
        int[] iArr7;
        int[] iArr8;
        String[] strArr12;
        long[] jArr8;
        Instant[] instantArr2;
        tqr[] tqrVarArr;
        int[] iArr9;
        boolean[] zArr3;
        String[] strArr13;
        long[] jArr9;
        int[] iArr10;
        int[] iArr11;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        long[] jArr10;
        long[] jArr11;
        final int i3;
        String[] strArr17;
        long[] jArr12;
        long[] jArr13;
        rve[] rveVarArr2;
        String[] strArr18;
        byte[][] bArr;
        long[] jArr14;
        apwq[] apwqVarArr;
        String[] strArr19;
        String[] strArr20;
        MessageIdType[] messageIdTypeArr2;
        boolean[] zArr4;
        Uri[] uriArr2;
        Optional[] optionalArr;
        int[] iArr12;
        xxw[] xxwVarArr;
        tqf[] tqfVarArr;
        int i4;
        tqf[] tqfVarArr2;
        int[] iArr13;
        int[] iArr14;
        int i5;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        atok[] atokVarArr;
        tqp[] tqpVarArr;
        tqp[] tqpVarArr2;
        tqr[] tqrVarArr2;
        int[] iArr15;
        atok[] atokVarArr2;
        tqp[] tqpVarArr3;
        utk[] utkVarArr;
        tqu[] tquVarArr;
        int[] iArr16;
        ruz[] ruzVarArr;
        utk[] utkVarArr2;
        Optional[] optionalArr2;
        long[] jArr15;
        ConversationIdType[] conversationIdTypeArr2;
        String[] strArr21;
        boolean[] zArr8;
        atok atokVar;
        int[] iArr17;
        agpf agpfVar = agoaVar.a.e;
        final int i6 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            akkw akkwVar = this.i;
            boolean db = db(0);
            boolean z = akkwVar.b;
            if (db) {
                if (z) {
                    messageIdTypeArr = aP();
                } else {
                    messageIdTypeArr = new MessageIdType[]{E()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new swp(this, 16));
            if (db(1)) {
                if (z) {
                    conversationIdTypeArr = aN();
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{C()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length, conversationIdTypeArr, new swp(this, 18));
            if (db(2)) {
                if (z) {
                    strArr = bq();
                } else {
                    strArr = new String[]{ai()};
                }
            } else {
                strArr = null;
            }
            final int i7 = 9;
            agmp.ds(length, strArr, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            int i8 = 3;
            if (db(3)) {
                if (z) {
                    strArr2 = br();
                } else {
                    strArr2 = new String[]{aj()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(4)) {
                if (z) {
                    strArr3 = bm();
                } else {
                    strArr3 = new String[]{ae()};
                }
            } else {
                strArr3 = null;
            }
            final int i9 = 12;
            agmp.ds(length, strArr3, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i9) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(5)) {
                if (z) {
                    strArr4 = bo();
                } else {
                    strArr4 = new String[]{ag()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new sxs(this, i8));
            if (db(6)) {
                if (z) {
                    jArr = aJ();
                } else {
                    jArr = new long[]{w()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sxs(this, i9));
            if (db(7)) {
                if (z) {
                    instantArr = aZ();
                } else {
                    instantArr = new Instant[]{R()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new sxs(this, 13));
            if (db(8)) {
                if (z) {
                    jArr2 = aF();
                } else {
                    jArr2 = new long[]{s()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sxs(this, 14));
            if (db(9)) {
                if (z) {
                    iArr = aw();
                } else {
                    iArr = new int[]{g()};
                }
            } else {
                iArr = null;
            }
            long[] jArr16 = jArr2;
            agmp.dq(length, iArr, new sxs(this, 15));
            if (db(10)) {
                if (z) {
                    iArr17 = agnc.w(null, dk(getString(cI(10, MessagesTable.a))));
                } else {
                    iArr17 = new int[]{n()};
                }
                iArr2 = iArr17;
            } else {
                iArr2 = null;
            }
            int[] iArr18 = iArr;
            final int i10 = 6;
            agmp.dq(length, iArr2, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(11)) {
                if (z) {
                    iArr3 = au();
                } else {
                    iArr3 = new int[]{e()};
                }
            } else {
                iArr3 = null;
            }
            int[] iArr19 = iArr2;
            final int i11 = 17;
            agmp.dq(length, iArr3, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(12)) {
                if (z) {
                    zArr = bv();
                } else {
                    zArr = new boolean[]{aq()};
                }
            } else {
                zArr = null;
            }
            int[] iArr20 = iArr3;
            final int i12 = 7;
            agmp.dt(length, zArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(13)) {
                if (z) {
                    zArr2 = bw();
                } else {
                    zArr2 = new boolean[]{ar()};
                }
            } else {
                zArr2 = null;
            }
            boolean[] zArr9 = zArr;
            final int i13 = 18;
            agmp.dt(length, zArr2, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(14)) {
                if (z) {
                    uriArr = aL();
                } else {
                    uriArr = new Uri[]{A()};
                }
            } else {
                uriArr = null;
            }
            boolean[] zArr10 = zArr2;
            agmp.ds(length, uriArr, new sxs(this, 8));
            if (db(15)) {
                if (z) {
                    iArr4 = agnc.w(null, dk(getString(cI(15, MessagesTable.a))));
                } else {
                    iArr4 = new int[]{m()};
                }
            } else {
                iArr4 = null;
            }
            Uri[] uriArr3 = uriArr;
            agmp.dq(length, iArr4, new sxs(this, 16));
            if (db(16)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(16, MessagesTable.a))));
                } else {
                    jArr3 = new long[]{x()};
                }
            } else {
                jArr3 = null;
            }
            int[] iArr21 = iArr4;
            agmp.dr(length, jArr3, new sxs(this, 17));
            if (db(17)) {
                if (z) {
                    strArr5 = bk();
                } else {
                    strArr5 = new String[]{ac()};
                }
            } else {
                strArr5 = null;
            }
            long[] jArr17 = jArr3;
            agmp.ds(length, strArr5, new sxs(this, 18));
            if (db(18)) {
                if (z) {
                    strArr6 = bl();
                } else {
                    strArr6 = new String[]{ad()};
                }
            } else {
                strArr6 = null;
            }
            String[] strArr22 = strArr5;
            agmp.ds(length, strArr6, new sxs(this, 19));
            if (db(19)) {
                if (z) {
                    strArr7 = bi();
                } else {
                    strArr7 = new String[]{aa()};
                }
            } else {
                strArr7 = null;
            }
            String[] strArr23 = strArr6;
            agmp.ds(length, strArr7, new swp(this, 17));
            if (db(20)) {
                if (z) {
                    jArr4 = aC();
                } else {
                    jArr4 = new long[]{p()};
                }
            } else {
                jArr4 = null;
            }
            String[] strArr24 = strArr7;
            agmp.dr(length, jArr4, new swp(this, 19));
            if (db(21)) {
                if (z) {
                    jArr5 = aD();
                } else {
                    jArr5 = new long[]{q()};
                }
            } else {
                jArr5 = null;
            }
            long[] jArr18 = jArr4;
            agmp.dr(length, jArr5, new swp(this, 20));
            if (db(22)) {
                if (z) {
                    strArr8 = bj();
                    jArr6 = jArr5;
                    i = 1;
                } else {
                    i = 1;
                    strArr8 = new String[]{ab()};
                    jArr6 = jArr5;
                }
            } else {
                i = 1;
                jArr6 = jArr5;
                strArr8 = null;
            }
            agmp.ds(length, strArr8, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(23)) {
                if (z) {
                    iArr5 = ax();
                    strArr9 = strArr8;
                    i2 = 0;
                } else {
                    int[] iArr22 = new int[i];
                    strArr9 = strArr8;
                    i2 = 0;
                    iArr22[0] = h();
                    iArr5 = iArr22;
                }
            } else {
                strArr9 = strArr8;
                i2 = 0;
                iArr5 = null;
            }
            agmp.dq(length, iArr5, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(24)) {
                if (z) {
                    iArr6 = iArr5;
                    strArr10 = bp();
                } else {
                    iArr6 = iArr5;
                    strArr10 = new String[1];
                    strArr10[i2] = ah();
                }
            } else {
                iArr6 = iArr5;
                strArr10 = null;
            }
            final int i14 = 2;
            agmp.ds(length, strArr10, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(25)) {
                if (z) {
                    qweVarArr = aM();
                } else {
                    qweVarArr = new qwe[]{B()};
                }
            } else {
                qweVarArr = null;
            }
            String[] strArr25 = strArr10;
            final int i15 = 3;
            agmp.ds(length, qweVarArr, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(26)) {
                if (z) {
                    jArr7 = aH();
                } else {
                    jArr7 = new long[]{u()};
                }
            } else {
                jArr7 = null;
            }
            qwe[] qweVarArr2 = qweVarArr;
            final int i16 = 4;
            agmp.dr(length, jArr7, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i16) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(27)) {
                if (z) {
                    strArr11 = bc();
                } else {
                    strArr11 = new String[]{U()};
                }
            } else {
                strArr11 = null;
            }
            long[] jArr19 = jArr7;
            final int i17 = 5;
            agmp.ds(length, strArr11, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i17) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(28)) {
                if (z) {
                    rveVarArr = aS();
                } else {
                    rveVarArr = new rve[]{H()};
                }
            } else {
                rveVarArr = null;
            }
            String[] strArr26 = strArr11;
            final int i18 = 7;
            agmp.ds(length, rveVarArr, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i18) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(29)) {
                if (z) {
                    iArr7 = ay();
                } else {
                    iArr7 = new int[]{i()};
                }
            } else {
                iArr7 = null;
            }
            rve[] rveVarArr3 = rveVarArr;
            final int i19 = 8;
            agmp.dq(length, iArr7, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i19) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(30)) {
                if (z) {
                    int[] dk = dk(getString(cI(30, MessagesTable.a)));
                    tqr[] values = tqr.values();
                    iArr8 = iArr7;
                    int length2 = values.length;
                    instantArr2 = instantArr;
                    tqr[] tqrVarArr3 = new tqr[dk.length];
                    strArr12 = strArr4;
                    jArr8 = jArr;
                    for (int i20 = 0; i20 < dk.length; i20++) {
                        int i21 = dk[i20];
                        if (i21 < length2) {
                            tqrVarArr3[i20] = values[i21];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqrVarArr = (tqr[]) agnc.z(null, tqrVarArr3, new tqr[0]);
                } else {
                    iArr8 = iArr7;
                    strArr12 = strArr4;
                    jArr8 = jArr;
                    instantArr2 = instantArr;
                    tqrVarArr = new tqr[]{L()};
                }
            } else {
                iArr8 = iArr7;
                strArr12 = strArr4;
                jArr8 = jArr;
                instantArr2 = instantArr;
                tqrVarArr = null;
            }
            final int i22 = 10;
            agmp.ds(length, tqrVarArr, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i22) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(31)) {
                if (z) {
                    iArr9 = az();
                } else {
                    iArr9 = new int[]{j()};
                }
            } else {
                iArr9 = null;
            }
            final int i23 = 11;
            agmp.dq(length, iArr9, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i23) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(32)) {
                if (z) {
                    zArr3 = bu();
                } else {
                    zArr3 = new boolean[]{ap()};
                }
            } else {
                zArr3 = null;
            }
            final int i24 = 12;
            agmp.dt(length, zArr3, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i24) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(33)) {
                if (z) {
                    strArr13 = bn();
                } else {
                    strArr13 = new String[]{af()};
                }
            } else {
                strArr13 = null;
            }
            final int i25 = 13;
            agmp.ds(length, strArr13, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i25) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(34)) {
                if (z) {
                    jArr9 = aE();
                } else {
                    jArr9 = new long[]{r()};
                }
            } else {
                jArr9 = null;
            }
            String[] strArr27 = strArr13;
            final int i26 = 14;
            agmp.dr(length, jArr9, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i26) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(35)) {
                if (z) {
                    iArr10 = agnc.w(null, dk(getString(cI(35, MessagesTable.a))));
                } else {
                    iArr10 = new int[]{l()};
                }
            } else {
                iArr10 = null;
            }
            long[] jArr20 = jArr9;
            final int i27 = 15;
            agmp.dq(length, iArr10, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i27) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(36)) {
                if (z) {
                    iArr11 = iArr10;
                    strArr14 = (String[]) agnc.z(null, dm(getString(cI(36, MessagesTable.a))), new String[0]);
                } else {
                    iArr11 = iArr10;
                    strArr14 = new String[]{ak()};
                }
            } else {
                iArr11 = iArr10;
                strArr14 = null;
            }
            final int i28 = 16;
            agmp.ds(length, strArr14, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i28) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(37)) {
                if (z) {
                    strArr15 = bf();
                } else {
                    strArr15 = new String[]{X()};
                }
            } else {
                strArr15 = null;
            }
            String[] strArr28 = strArr14;
            final int i29 = 18;
            agmp.ds(length, strArr15, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i29) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(38)) {
                if (z) {
                    strArr16 = be();
                } else {
                    strArr16 = new String[]{W()};
                }
            } else {
                strArr16 = null;
            }
            String[] strArr29 = strArr15;
            final int i30 = 19;
            agmp.ds(length, strArr16, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i30) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(39)) {
                if (z) {
                    jArr10 = aB();
                } else {
                    jArr10 = new long[]{o()};
                }
            } else {
                jArr10 = null;
            }
            String[] strArr30 = strArr16;
            final int i31 = 20;
            agmp.dr(length, jArr10, new alhr(this) { // from class: sxq
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i31) {
                        case 0:
                            return "raw_status:".concat(String.valueOf(this.a.getString(23)));
                        case 1:
                            return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
                        case 2:
                            return "self_id:".concat(String.valueOf(this.a.getString(24)));
                        case 3:
                            return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
                        case 4:
                            return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
                        case 5:
                            return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
                        case 6:
                            return "message_status:".concat(String.valueOf(this.a.getString(10)));
                        case 7:
                            return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
                        case 8:
                            return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
                        case 9:
                            return "sender_id:".concat(String.valueOf(this.a.getString(2)));
                        case 10:
                            return "verification_status:".concat(String.valueOf(this.a.getString(30)));
                        case 11:
                            return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
                        case 12:
                            return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
                        case 13:
                            return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
                        case 14:
                            return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
                        case 15:
                            return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
                        case 16:
                            return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
                        case 17:
                            return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
                        case 18:
                            return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
                        case 19:
                            return "cms_id:".concat(String.valueOf(this.a.getString(38)));
                        default:
                            return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
                    }
                }
            });
            if (db(40)) {
                if (z) {
                    jArr11 = jArr10;
                    strArr17 = (String[]) agnc.z(null, dm(getString(cI(40, MessagesTable.a))), new String[0]);
                    i3 = 0;
                } else {
                    jArr11 = jArr10;
                    i3 = 0;
                    strArr17 = new String[]{al()};
                }
            } else {
                jArr11 = jArr10;
                i3 = 0;
                strArr17 = null;
            }
            agmp.ds(length, strArr17, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(41)) {
                if (z) {
                    jArr12 = agnc.y(null, dl(getString(cI(41, MessagesTable.a))));
                } else {
                    jArr12 = new long[]{y()};
                }
            } else {
                jArr12 = null;
            }
            String[] strArr31 = strArr17;
            final int i32 = 2;
            agmp.dr(length, jArr12, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i32) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(42)) {
                if (z) {
                    jArr13 = aI();
                } else {
                    jArr13 = new long[]{v()};
                }
            } else {
                jArr13 = null;
            }
            long[] jArr21 = jArr12;
            final int i33 = 3;
            agmp.dr(length, jArr13, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i33) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(43)) {
                if (z) {
                    rveVarArr2 = aR();
                } else {
                    rveVarArr2 = new rve[]{G()};
                }
            } else {
                rveVarArr2 = null;
            }
            long[] jArr22 = jArr13;
            final int i34 = 4;
            agmp.ds(length, rveVarArr2, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i34) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(44)) {
                if (z) {
                    strArr18 = bg();
                } else {
                    strArr18 = new String[]{Y()};
                }
            } else {
                strArr18 = null;
            }
            rve[] rveVarArr4 = rveVarArr2;
            final int i35 = 5;
            agmp.ds(length, strArr18, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i35) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(45)) {
                if (z) {
                    bArr = bx();
                } else {
                    bArr = new byte[][]{as()};
                }
            } else {
                bArr = null;
            }
            String[] strArr32 = strArr18;
            final int i36 = 6;
            agmp.ds(length, bArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i36) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(46)) {
                if (z) {
                    jArr14 = aG();
                } else {
                    jArr14 = new long[]{t()};
                }
            } else {
                jArr14 = null;
            }
            byte[][] bArr2 = bArr;
            final int i37 = 8;
            agmp.dr(length, jArr14, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i37) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(47)) {
                if (z) {
                    apwqVarArr = aY();
                } else {
                    apwqVarArr = new apwq[]{Q()};
                }
            } else {
                apwqVarArr = null;
            }
            long[] jArr23 = jArr14;
            final int i38 = 9;
            agmp.ds(length, apwqVarArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i38) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(48)) {
                if (z) {
                    strArr19 = bd();
                } else {
                    strArr19 = new String[]{V()};
                }
            } else {
                strArr19 = null;
            }
            apwq[] apwqVarArr2 = apwqVarArr;
            final int i39 = 10;
            agmp.ds(length, strArr19, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i39) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(49)) {
                if (z) {
                    strArr20 = bh();
                } else {
                    strArr20 = new String[]{Z()};
                }
            } else {
                strArr20 = null;
            }
            String[] strArr33 = strArr19;
            final int i40 = 11;
            agmp.ds(length, strArr20, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i40) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(50)) {
                if (z) {
                    messageIdTypeArr2 = aQ();
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{F()};
                }
            } else {
                messageIdTypeArr2 = null;
            }
            String[] strArr34 = strArr20;
            final int i41 = 13;
            agmp.ds(length, messageIdTypeArr2, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i41) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(51)) {
                if (z) {
                    zArr4 = bs();
                } else {
                    zArr4 = new boolean[]{an()};
                }
            } else {
                zArr4 = null;
            }
            MessageIdType[] messageIdTypeArr3 = messageIdTypeArr2;
            final int i42 = 14;
            agmp.dt(length, zArr4, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i42) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(52)) {
                if (z) {
                    uriArr2 = aK();
                } else {
                    uriArr2 = new Uri[]{z()};
                }
            } else {
                uriArr2 = null;
            }
            boolean[] zArr11 = zArr4;
            final int i43 = 15;
            agmp.ds(length, uriArr2, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i43) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(53)) {
                if (z) {
                    optionalArr = ba();
                } else {
                    optionalArr = new Optional[]{S()};
                }
            } else {
                optionalArr = null;
            }
            Uri[] uriArr4 = uriArr2;
            final int i44 = 16;
            agmp.ds(length, optionalArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i44) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(54)) {
                if (z) {
                    iArr12 = aA();
                } else {
                    iArr12 = new int[]{k()};
                }
            } else {
                iArr12 = null;
            }
            Optional[] optionalArr3 = optionalArr;
            final int i45 = 17;
            agmp.dq(length, iArr12, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i45) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(55)) {
                if (z) {
                    xxwVarArr = aX();
                } else {
                    xxwVarArr = new xxw[]{O()};
                }
            } else {
                xxwVarArr = null;
            }
            int[] iArr23 = iArr12;
            final int i46 = 19;
            agmp.ds(length, xxwVarArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i46) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(56)) {
                if (z) {
                    tqfVarArr = aT();
                } else {
                    tqfVarArr = new tqf[]{I()};
                }
            } else {
                tqfVarArr = null;
            }
            xxw[] xxwVarArr2 = xxwVarArr;
            final int i47 = 20;
            agmp.ds(length, tqfVarArr, new alhr(this) { // from class: sxr
                public final /* synthetic */ sxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i47) {
                        case 0:
                            return "web_id:".concat(String.valueOf(this.a.getString(40)));
                        case 1:
                            return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
                        case 2:
                            return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
                        case 3:
                            return "send_counter:".concat(String.valueOf(this.a.getString(42)));
                        case 4:
                            return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
                        case 5:
                            return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(44)));
                        case 6:
                            return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(45)));
                        case 7:
                            return "seen:".concat(String.valueOf(this.a.getString(12)));
                        case 8:
                            return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(46)));
                        case 9:
                            return "custom_headers:".concat(String.valueOf(this.a.getString(47)));
                        case 10:
                            return "cms_correlation_id:".concat(String.valueOf(this.a.getString(48)));
                        case 11:
                            return "group_private_participant:".concat(String.valueOf(this.a.getString(49)));
                        case 12:
                            return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
                        case 13:
                            return "original_message_id:".concat(String.valueOf(this.a.getString(50)));
                        case 14:
                            return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(51)));
                        case 15:
                            return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(52)));
                        case 16:
                            return "draft_id:".concat(String.valueOf(this.a.getString(53)));
                        case 17:
                            return "result_code:".concat(String.valueOf(this.a.getString(54)));
                        case 18:
                            return "read:".concat(String.valueOf(this.a.getString(13)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(55)));
                        default:
                            return "fallback_reason:".concat(String.valueOf(this.a.getString(56)));
                    }
                }
            });
            if (db(57)) {
                if (z) {
                    iArr13 = at();
                    tqfVarArr2 = tqfVarArr;
                    i4 = 1;
                } else {
                    i4 = 1;
                    iArr13 = new int[]{c()};
                    tqfVarArr2 = tqfVarArr;
                }
            } else {
                i4 = 1;
                tqfVarArr2 = tqfVarArr;
                iArr13 = null;
            }
            agmp.dq(length, iArr13, new sxs(this, i4));
            if (db(58)) {
                if (z) {
                    zArr5 = bt();
                    iArr14 = iArr13;
                    i5 = 0;
                } else {
                    zArr5 = new boolean[i4];
                    iArr14 = iArr13;
                    i5 = 0;
                    zArr5[0] = ao();
                }
            } else {
                iArr14 = iArr13;
                i5 = 0;
                zArr5 = null;
            }
            agmp.dt(length, zArr5, new sxs(this, i5));
            if (db(59)) {
                if (z) {
                    List cY = cY(getString(cI(59, MessagesTable.a)));
                    atok[] atokVarArr3 = new atok[cY.size()];
                    Iterator it = cY.iterator();
                    int i48 = 0;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        try {
                            byte[] v = agnc.v((String) it.next());
                            int i49 = i48 + 1;
                            if (v == null) {
                                zArr8 = zArr5;
                                atokVar = null;
                            } else {
                                zArr8 = zArr5;
                                try {
                                    atokVar = (atok) apag.parseFrom(atok.a, v);
                                } catch (Throwable unused) {
                                    i48 = i49;
                                    atokVarArr3[i48] = null;
                                    i48++;
                                    it = it2;
                                    zArr5 = zArr8;
                                }
                            }
                            atokVarArr3[i48] = atokVar;
                            i48 = i49;
                        } catch (Throwable unused2) {
                            zArr8 = zArr5;
                        }
                        it = it2;
                        zArr5 = zArr8;
                    }
                    zArr6 = zArr3;
                    zArr7 = zArr5;
                    atokVarArr = (atok[]) agnc.z(null, atokVarArr3, new atok[0]);
                } else {
                    zArr6 = zArr3;
                    zArr7 = zArr5;
                    atokVarArr = new atok[]{am()};
                }
            } else {
                zArr6 = zArr3;
                zArr7 = zArr5;
                atokVarArr = null;
            }
            agmp.ds(length, atokVarArr, new sxs(this, 2));
            if (db(60)) {
                if (z) {
                    tqpVarArr = aU();
                } else {
                    tqpVarArr = new tqp[]{J()};
                }
            } else {
                tqpVarArr = null;
            }
            agmp.ds(length, tqpVarArr, new sxs(this, 4));
            if (db(61)) {
                if (z) {
                    tqpVarArr2 = aV();
                } else {
                    tqpVarArr2 = new tqp[]{K()};
                }
            } else {
                tqpVarArr2 = null;
            }
            tqp[] tqpVarArr4 = tqpVarArr;
            agmp.ds(length, tqpVarArr2, new sxs(this, 5));
            if (db(62)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(62, MessagesTable.a)));
                    tqu[] values2 = tqu.values();
                    tqpVarArr3 = tqpVarArr2;
                    int length3 = values2.length;
                    atokVarArr2 = atokVarArr;
                    tqu[] tquVarArr2 = new tqu[dk2.length];
                    tqrVarArr2 = tqrVarArr;
                    iArr15 = iArr9;
                    for (int i50 = 0; i50 < dk2.length; i50++) {
                        int i51 = dk2[i50];
                        if (i51 < length3) {
                            tquVarArr2[i50] = values2[i51];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    utkVarArr = null;
                    tquVarArr = (tqu[]) agnc.z(null, tquVarArr2, new tqu[0]);
                } else {
                    tqrVarArr2 = tqrVarArr;
                    iArr15 = iArr9;
                    atokVarArr2 = atokVarArr;
                    tqpVarArr3 = tqpVarArr2;
                    utkVarArr = null;
                    tquVarArr = new tqu[]{M()};
                }
            } else {
                tqrVarArr2 = tqrVarArr;
                iArr15 = iArr9;
                atokVarArr2 = atokVarArr;
                tqpVarArr3 = tqpVarArr2;
                utkVarArr = null;
                tquVarArr = null;
            }
            agmp.ds(length, tquVarArr, new sxs(this, 6));
            if (db(63)) {
                if (z) {
                    iArr16 = av();
                } else {
                    iArr16 = new int[]{f()};
                }
            } else {
                iArr16 = utkVarArr;
            }
            agmp.dq(length, iArr16, new sxs(this, 7));
            if (db(64)) {
                if (z) {
                    ruzVarArr = aO();
                } else {
                    ruzVarArr = new ruz[]{D()};
                }
            } else {
                ruzVarArr = utkVarArr;
            }
            agmp.ds(length, ruzVarArr, new sxs(this, 9));
            if (db(65)) {
                if (z) {
                    utkVarArr2 = aW();
                } else {
                    utkVarArr2 = new utk[]{N()};
                }
            } else {
                utkVarArr2 = utkVarArr;
            }
            agmp.ds(length, utkVarArr2, new sxs(this, 10));
            if (db(66)) {
                if (z) {
                    optionalArr2 = bb();
                } else {
                    optionalArr2 = new Optional[]{T()};
                }
            } else {
                optionalArr2 = null;
            }
            agmp.ds(length, optionalArr2, new sxs(this, 11));
            alob alobVar = new alob();
            int i52 = 0;
            while (i52 < length) {
                long j = du[i52];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i52]));
                    sxn c = MessagesTable.c();
                    c.aB();
                    long j2 = du[i52];
                    jArr15 = du;
                    if (messageIdTypeArr != null) {
                        c.v(messageIdTypeArr[i52]);
                    }
                    if (conversationIdTypeArr != null) {
                        c.m(conversationIdTypeArr[i52]);
                    }
                    if (strArr != null) {
                        c.af(strArr[i52]);
                    }
                    if (strArr2 != null) {
                        c.ag(strArr2[i52]);
                    }
                    if (strArr3 != null) {
                        c.E(strArr3[i52]);
                    }
                    if (strArr12 != null) {
                        c.Y(strArr12[i52]);
                    }
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    strArr21 = strArr3;
                    if (jArr8 != null) {
                        c.ah(jArr8[i52]);
                    }
                    if (instantArr2 != null) {
                        c.O(instantArr2[i52]);
                    }
                    if (jArr16 != null) {
                        c.X(jArr16[i52]);
                    }
                    if (iArr18 != null) {
                        c.N(iArr18[i52]);
                    }
                    if (iArr19 != null) {
                        c.an(iArr19[i52]);
                    }
                    if (iArr20 != null) {
                        c.y(iArr20[i52]);
                    }
                    if (zArr9 != null) {
                        c.G(zArr9[i52]);
                    }
                    if (zArr10 != null) {
                        c.W(zArr10[i52]);
                    }
                    if (uriArr3 != null) {
                        c.al(uriArr3[i52]);
                    }
                    if (iArr21 != null) {
                        c.am(iArr21[i52]);
                    }
                    if (jArr17 != null) {
                        c.ak(jArr17[i52]);
                    }
                    if (strArr22 != null) {
                        c.C(strArr22[i52]);
                    }
                    if (strArr23 != null) {
                        c.D(strArr23[i52]);
                    }
                    if (strArr24 != null) {
                        c.z(strArr24[i52]);
                    }
                    if (jArr18 != null) {
                        c.A(jArr18[i52]);
                    }
                    if (jArr6 != null) {
                        c.R(jArr6[i52]);
                    }
                    if (strArr9 != null) {
                        c.B(strArr9[i52]);
                    }
                    if (iArr6 != null) {
                        c.P(iArr6[i52]);
                    }
                    if (strArr25 != null) {
                        c.ad(strArr25[i52]);
                    }
                    if (qweVarArr2 != null) {
                        c.F(qweVarArr2[i52]);
                    }
                    if (jArr19 != null) {
                        c.ab(jArr19[i52]);
                    }
                    if (strArr26 != null) {
                        c.h(strArr26[i52]);
                    }
                    if (rveVarArr3 != null) {
                        c.T(rveVarArr3[i52]);
                    }
                    if (iArr8 != null) {
                        c.Q(iArr8[i52]);
                    }
                    if (tqrVarArr2 != null) {
                        c.aq(tqrVarArr2[i52]);
                    }
                    if (iArr15 != null) {
                        c.V(iArr15[i52]);
                    }
                    if (zArr6 != null) {
                        c.w(zArr6[i52]);
                    }
                    if (strArr27 != null) {
                        c.U(strArr27[i52]);
                    }
                    if (jArr20 != null) {
                        c.S(jArr20[i52]);
                    }
                    if (iArr11 != null) {
                        c.ai(iArr11[i52]);
                    }
                    if (strArr28 != null) {
                        c.aj(strArr28[i52]);
                    }
                    if (strArr29 != null) {
                        c.n(strArr29[i52]);
                    }
                    if (strArr30 != null) {
                        c.j(strArr30[i52]);
                    }
                    if (jArr11 != null) {
                        c.k(jArr11[i52]);
                    }
                    if (strArr31 != null) {
                        c.ar(strArr31[i52]);
                    }
                    if (jArr21 != null) {
                        c.ap(jArr21[i52]);
                    }
                    if (jArr22 != null) {
                        c.ae(jArr22[i52]);
                    }
                    if (rveVarArr4 != null) {
                        c.K(rveVarArr4[i52]);
                    }
                    if (strArr32 != null) {
                        c.p(strArr32[i52]);
                    }
                    if (bArr2 != null) {
                        c.o(bArr2[i52]);
                    }
                    if (jArr23 != null) {
                        c.Z(jArr23[i52]);
                    }
                    if (apwqVarArr2 != null) {
                        c.q(apwqVarArr2[i52]);
                    }
                    if (strArr33 != null) {
                        c.i(strArr33[i52]);
                    }
                    if (strArr34 != null) {
                        c.u(strArr34[i52]);
                    }
                    if (messageIdTypeArr3 != null) {
                        c.I(messageIdTypeArr3[i52]);
                    }
                    if (zArr11 != null) {
                        c.f(zArr11[i52]);
                    }
                    if (uriArr4 != null) {
                        c.H(uriArr4[i52]);
                    }
                    if (optionalArr3 != null) {
                        c.r(optionalArr3[i52]);
                    }
                    if (iArr23 != null) {
                        c.aa(iArr23[i52]);
                    }
                    if (xxwVarArr2 != null) {
                        c.l(xxwVarArr2[i52]);
                    }
                    if (tqfVarArr2 != null) {
                        c.t(tqfVarArr2[i52]);
                    }
                    if (iArr14 != null) {
                        c.e(iArr14[i52]);
                    }
                    if (zArr7 != null) {
                        c.g(zArr7[i52]);
                    }
                    if (atokVarArr2 != null) {
                        c.ao(atokVarArr2[i52]);
                    }
                    if (tqpVarArr4 != null) {
                        c.L(tqpVarArr4[i52]);
                    }
                    if (tqpVarArr3 != null) {
                        c.M(tqpVarArr3[i52]);
                    }
                    if (tquVarArr != null) {
                        c.as(tquVarArr[i52]);
                    }
                    if (iArr16 != null) {
                        c.J(iArr16[i52]);
                    }
                    if (ruzVarArr != null) {
                        c.ac(ruzVarArr[i52]);
                    }
                    if (utkVarArr2 != null) {
                        c.s(utkVarArr2[i52]);
                    }
                    if (optionalArr2 != null) {
                        c.x(optionalArr2[i52]);
                    }
                    alobVar.h(c.a());
                } else {
                    jArr15 = du;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    strArr21 = strArr3;
                }
                i52++;
                conversationIdTypeArr = conversationIdTypeArr2;
                du = jArr15;
                strArr3 = strArr21;
            }
            return alobVar.g();
        }
        int i53 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(9, MessagesTable.a));
    }

    public final int h() {
        return getInt(cI(23, MessagesTable.a));
    }

    public final int i() {
        return getInt(cI(29, MessagesTable.a));
    }

    public final int j() {
        return getInt(cI(31, MessagesTable.a));
    }

    public final int k() {
        return getInt(cI(54, MessagesTable.a));
    }

    public final int l() {
        return getInt(cI(35, MessagesTable.a));
    }

    public final int m() {
        return getInt(cI(15, MessagesTable.a));
    }

    public final int n() {
        return getInt(cI(10, MessagesTable.a));
    }

    public final long o() {
        return getLong(cI(39, MessagesTable.a));
    }

    public final long p() {
        return getLong(cI(20, MessagesTable.a));
    }

    public final long q() {
        return getLong(cI(21, MessagesTable.a));
    }

    public final long r() {
        return getLong(cI(34, MessagesTable.a));
    }

    public final long s() {
        return getLong(cI(8, MessagesTable.a));
    }

    public final long t() {
        return getLong(cI(46, MessagesTable.a));
    }

    public final long u() {
        return getLong(cI(26, MessagesTable.a));
    }

    public final long v() {
        return getLong(cI(42, MessagesTable.a));
    }

    public final long w() {
        return getLong(cI(6, MessagesTable.a));
    }

    public final long x() {
        return getLong(cI(16, MessagesTable.a));
    }

    public final long y() {
        return getLong(cI(41, MessagesTable.a));
    }

    public final Uri z() {
        String string = getString(cI(52, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
