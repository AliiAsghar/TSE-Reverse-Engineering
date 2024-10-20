package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sna extends agmp<sna, sne, snf, smr, smv> implements agmq {
    @Deprecated
    public sna(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sne sneVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sni.a, agoxVar, akkwVar, sneVar);
    }

    public final ConversationIdType A() {
        return new ConversationIdType(getLong(cI(60, sni.a)));
    }

    public final ConversationIdType B() {
        return new ConversationIdType(getLong(cI(61, sni.a)));
    }

    public final ConversationIdType C() {
        return new ConversationIdType(getLong(cI(0, sni.a)));
    }

    public final MessageIdType D() {
        return new MessageIdType(getLong(cI(5, sni.a)));
    }

    public final tqc E() {
        return tqc.a(getInt(cI(16, sni.a)));
    }

    public final tqh F() {
        tqh[] values = tqh.values();
        int i = getInt(cI(3, sni.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final utj G() {
        return utj.a(getString(cI(73, sni.a)));
    }

    public final utk H() {
        utk[] values = utk.values();
        int i = getInt(cI(72, sni.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final vst I() {
        byte[] blob = getBlob(cI(69, sni.a));
        if (blob == null) {
            return null;
        }
        try {
            return (vst) apag.parseFrom(vst.a, blob, aozs.a());
        } catch (Throwable unused) {
            return vst.a;
        }
    }

    public final vtm J() {
        return new vtm(getLong(cI(58, sni.a)));
    }

    public final vvh K() {
        vvh[] values = vvh.values();
        int i = getInt(cI(70, sni.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xhv L() {
        return xhv.b(getLong(cI(1, sni.a)));
    }

    public final xxw M() {
        xxw[] values = xxw.values();
        int i = getInt(cI(63, sni.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional N() {
        return uxi.g(getLong(cI(66, sni.a)));
    }

    public final Optional O() {
        return uxi.g(getLong(cI(65, sni.a)));
    }

    public final String P() {
        return getString(cI(74, sni.a));
    }

    public final String Q() {
        return getString(cI(51, sni.a));
    }

    public final String R() {
        return getString(cI(26, sni.a));
    }

    public final String S() {
        return getString(cI(14, sni.a));
    }

    public final String T() {
        return yta.a(getString(cI(11, sni.a)));
    }

    public final String U() {
        return yta.a(getString(cI(12, sni.a)));
    }

    public final String V() {
        return getString(cI(19, sni.a));
    }

    public final String W() {
        return getString(cI(2, sni.a));
    }

    public final String X() {
        return yta.a(getString(cI(46, sni.a)));
    }

    public final String Y() {
        return getString(cI(36, sni.a));
    }

    public final String Z() {
        return getString(cI(23, sni.a));
    }

    public final int[] aA() {
        return agnc.w(null, dk(getString(cI(40, sni.a))));
    }

    public final int[] aB() {
        return agnc.w(null, dk(getString(cI(15, sni.a))));
    }

    public final int[] aC() {
        return agnc.w(null, dk(getString(cI(39, sni.a))));
    }

    public final int[] aD() {
        return agnc.w(null, dk(getString(cI(71, sni.a))));
    }

    public final int[] aE() {
        return agnc.w(null, dk(getString(cI(48, sni.a))));
    }

    public final int[] aF() {
        return agnc.w(null, dk(getString(cI(29, sni.a))));
    }

    public final int[] aG() {
        return agnc.w(null, dk(getString(cI(41, sni.a))));
    }

    public final int[] aH() {
        return agnc.w(null, dk(getString(cI(37, sni.a))));
    }

    public final long[] aI() {
        return agnc.y(null, dl(getString(cI(55, sni.a))));
    }

    public final long[] aJ() {
        return agnc.y(null, dl(getString(cI(50, sni.a))));
    }

    public final long[] aK() {
        return agnc.y(null, dl(getString(cI(44, sni.a))));
    }

    public final long[] aL() {
        return agnc.y(null, dl(getString(cI(49, sni.a))));
    }

    public final long[] aM() {
        return agnc.y(null, dl(getString(cI(18, sni.a))));
    }

    public final long[] aN() {
        return agnc.y(null, dl(getString(cI(21, sni.a))));
    }

    public final long[] aO() {
        return agnc.y(null, dl(getString(cI(20, sni.a))));
    }

    public final long[] aP() {
        return agnc.y(null, dl(getString(cI(38, sni.a))));
    }

    public final long[] aQ() {
        return agnc.y(null, dl(getString(cI(56, sni.a))));
    }

    public final long[] aR() {
        return agnc.y(null, dl(getString(cI(17, sni.a))));
    }

    public final Uri[] aS() {
        String[] dm = dm(getString(cI(13, sni.a)));
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

    public final Uri[] aT() {
        String[] dm = dm(getString(cI(8, sni.a)));
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

    public final qpd[] aU() {
        int[] dk = dk(getString(cI(62, sni.a)));
        qpd[] qpdVarArr = new qpd[dk.length];
        for (int i = 0; i < dk.length; i++) {
            qpd b = qpd.b(dk[i]);
            if (b != null) {
                qpdVarArr[i] = b;
            } else {
                throw new IllegalStateException();
            }
        }
        return (qpd[]) agnc.z(null, qpdVarArr, new qpd[0]);
    }

    public final qss[] aV() {
        String[] dm = dm(getString(cI(28, sni.a)));
        int length = dm.length;
        qss[] qssVarArr = new qss[length];
        for (int i = 0; i < length; i++) {
            qssVarArr[i] = qta.d(dm[i]);
        }
        return (qss[]) agnc.z(null, qssVarArr, new qss[0]);
    }

    public final qwe[] aW() {
        String[] dm = dm(getString(cI(27, sni.a)));
        int length = dm.length;
        qwe[] qweVarArr = new qwe[length];
        for (int i = 0; i < length; i++) {
            qweVarArr[i] = riw.m(dm[i]);
        }
        return (qwe[]) agnc.z(null, qweVarArr, new qwe[0]);
    }

    public final ConversationIdType[] aX() {
        long[] dl = dl(getString(cI(60, sni.a)));
        int length = dl.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(dl[i]);
        }
        return (ConversationIdType[]) agnc.z(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] aY() {
        long[] dl = dl(getString(cI(61, sni.a)));
        int length = dl.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(dl[i]);
        }
        return (ConversationIdType[]) agnc.z(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] aZ() {
        long[] dl = dl(getString(cI(0, sni.a)));
        int length = dl.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(dl[i]);
        }
        return (ConversationIdType[]) agnc.z(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final String aa() {
        return getString(cI(31, sni.a));
    }

    public final String ab() {
        return getString(cI(25, sni.a));
    }

    public final String ac() {
        return yta.a(getString(cI(45, sni.a)));
    }

    public final String ad() {
        return getString(cI(35, sni.a));
    }

    public final String ae() {
        return getString(cI(22, sni.a));
    }

    public final String af() {
        return getString(cI(24, sni.a));
    }

    public final String ag() {
        return getString(cI(9, sni.a));
    }

    public final String ah() {
        return yyb.j(getString(cI(53, sni.a)));
    }

    public final String ai() {
        return getString(cI(52, sni.a));
    }

    public final String aj() {
        return getString(cI(64, sni.a));
    }

    public final String ak() {
        return getString(cI(34, sni.a));
    }

    public final String al() {
        return yta.a(getString(cI(6, sni.a)));
    }

    public final String am() {
        return yta.a(getString(cI(7, sni.a)));
    }

    public final String an() {
        return getString(cI(4, sni.a));
    }

    public final boolean ao() {
        if (getInt(cI(59, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ap() {
        if (getInt(cI(67, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean aq() {
        if (getInt(cI(43, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ar() {
        if (getInt(cI(33, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean as() {
        if (getInt(cI(42, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean at() {
        if (getInt(cI(68, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean au() {
        if (getInt(cI(30, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean av() {
        if (getInt(cI(32, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean aw() {
        if (getInt(cI(57, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ax() {
        if (getInt(cI(10, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ay() {
        if (getInt(cI(47, sni.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] az() {
        return getBlob(cI(54, sni.a));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new smr();
    }

    public final String[] bA() {
        return (String[]) agnc.z(null, dm(getString(cI(35, sni.a))), new String[0]);
    }

    public final String[] bB() {
        return (String[]) agnc.z(null, dm(getString(cI(22, sni.a))), new String[0]);
    }

    public final String[] bC() {
        return (String[]) agnc.z(null, dm(getString(cI(24, sni.a))), new String[0]);
    }

    public final String[] bD() {
        return (String[]) agnc.z(null, dm(getString(cI(9, sni.a))), new String[0]);
    }

    public final String[] bE() {
        String[] dm = dm(getString(cI(53, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yyb.j(dm[i]);
        }
        for (int i2 = 0; i2 < dm.length; i2++) {
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bF() {
        return (String[]) agnc.z(null, dm(getString(cI(52, sni.a))), new String[0]);
    }

    public final String[] bG() {
        return (String[]) agnc.z(null, dm(getString(cI(64, sni.a))), new String[0]);
    }

    public final String[] bH() {
        return (String[]) agnc.z(null, dm(getString(cI(34, sni.a))), new String[0]);
    }

    public final String[] bI() {
        String[] dm = dm(getString(cI(6, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bJ() {
        String[] dm = dm(getString(cI(7, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bK() {
        return (String[]) agnc.z(null, dm(getString(cI(4, sni.a))), new String[0]);
    }

    public final boolean[] bL() {
        return agnc.A(null, dn(getString(cI(59, sni.a))));
    }

    public final boolean[] bM() {
        return agnc.A(null, dn(getString(cI(67, sni.a))));
    }

    public final boolean[] bN() {
        return agnc.A(null, dn(getString(cI(43, sni.a))));
    }

    public final boolean[] bO() {
        return agnc.A(null, dn(getString(cI(33, sni.a))));
    }

    public final boolean[] bP() {
        return agnc.A(null, dn(getString(cI(42, sni.a))));
    }

    public final boolean[] bQ() {
        return agnc.A(null, dn(getString(cI(68, sni.a))));
    }

    public final boolean[] bR() {
        return agnc.A(null, dn(getString(cI(30, sni.a))));
    }

    public final boolean[] bS() {
        return agnc.A(null, dn(getString(cI(32, sni.a))));
    }

    public final boolean[] bT() {
        return agnc.A(null, dn(getString(cI(57, sni.a))));
    }

    public final boolean[] bU() {
        return agnc.A(null, dn(getString(cI(10, sni.a))));
    }

    public final boolean[] bV() {
        return agnc.A(null, dn(getString(cI(47, sni.a))));
    }

    public final byte[][] bW() {
        return agnc.B(null, dv(getString(cI(54, sni.a))));
    }

    public final MessageIdType[] ba() {
        long[] dl = dl(getString(cI(5, sni.a)));
        int length = dl.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(dl[i]);
        }
        return (MessageIdType[]) agnc.z(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final tqc[] bb() {
        int[] dk = dk(getString(cI(16, sni.a)));
        tqc[] tqcVarArr = new tqc[dk.length];
        for (int i = 0; i < dk.length; i++) {
            tqc a = tqc.a(dk[i]);
            if (a != null) {
                tqcVarArr[i] = a;
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqc[]) agnc.z(null, tqcVarArr, new tqc[0]);
    }

    public final tqh[] bc() {
        int[] dk = dk(getString(cI(3, sni.a)));
        tqh[] values = tqh.values();
        int length = values.length;
        tqh[] tqhVarArr = new tqh[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqhVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqh[]) agnc.z(null, tqhVarArr, new tqh[0]);
    }

    public final utj[] bd() {
        String[] dm = dm(getString(cI(73, sni.a)));
        int length = dm.length;
        utj[] utjVarArr = new utj[length];
        for (int i = 0; i < length; i++) {
            utjVarArr[i] = utj.a(dm[i]);
        }
        return (utj[]) agnc.z(null, utjVarArr, new utj[0]);
    }

    public final utk[] be() {
        int[] dk = dk(getString(cI(72, sni.a)));
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

    public final vst[] bf() {
        vst vstVar;
        List cY = cY(getString(cI(69, sni.a)));
        vst[] vstVarArr = new vst[cY.size()];
        Iterator it = cY.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] v = agnc.v((String) it.next());
                int i2 = i + 1;
                if (v == null) {
                    vstVar = null;
                } else {
                    try {
                        vstVar = (vst) apag.parseFrom(vst.a, v);
                    } catch (Throwable unused) {
                        i = i2;
                        vstVarArr[i] = null;
                        i++;
                    }
                }
                vstVarArr[i] = vstVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (vst[]) agnc.z(null, vstVarArr, new vst[0]);
    }

    public final vtm[] bg() {
        long[] dl = dl(getString(cI(58, sni.a)));
        int length = dl.length;
        vtm[] vtmVarArr = new vtm[length];
        for (int i = 0; i < length; i++) {
            vtmVarArr[i] = new vtm(dl[i]);
        }
        return (vtm[]) agnc.z(null, vtmVarArr, new vtm[0]);
    }

    public final vvh[] bh() {
        int[] dk = dk(getString(cI(70, sni.a)));
        vvh[] values = vvh.values();
        int length = values.length;
        vvh[] vvhVarArr = new vvh[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                vvhVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (vvh[]) agnc.z(null, vvhVarArr, new vvh[0]);
    }

    public final xhv[] bi() {
        long[] dl = dl(getString(cI(1, sni.a)));
        int length = dl.length;
        xhv[] xhvVarArr = new xhv[length];
        for (int i = 0; i < length; i++) {
            xhvVarArr[i] = xhv.b(dl[i]);
        }
        return (xhv[]) agnc.z(null, xhvVarArr, new xhv[0]);
    }

    public final xxw[] bj() {
        int[] dk = dk(getString(cI(63, sni.a)));
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

    public final Optional[] bk() {
        long[] dl = dl(getString(cI(66, sni.a)));
        int length = dl.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = uxi.g(dl[i]);
        }
        return (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bl() {
        long[] dl = dl(getString(cI(65, sni.a)));
        int length = dl.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = uxi.g(dl[i]);
        }
        return (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
    }

    public final String[] bm() {
        return (String[]) agnc.z(null, dm(getString(cI(74, sni.a))), new String[0]);
    }

    public final String[] bn() {
        return (String[]) agnc.z(null, dm(getString(cI(51, sni.a))), new String[0]);
    }

    public final String[] bo() {
        return (String[]) agnc.z(null, dm(getString(cI(26, sni.a))), new String[0]);
    }

    public final String[] bp() {
        return (String[]) agnc.z(null, dm(getString(cI(14, sni.a))), new String[0]);
    }

    public final String[] bq() {
        String[] dm = dm(getString(cI(11, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] br() {
        String[] dm = dm(getString(cI(12, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bs() {
        return (String[]) agnc.z(null, dm(getString(cI(19, sni.a))), new String[0]);
    }

    public final String[] bt() {
        String[] dm = dm(getString(cI(2, sni.a)));
        for (int i = 0; i < dm.length; i++) {
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bu() {
        String[] dm = dm(getString(cI(46, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] bv() {
        return (String[]) agnc.z(null, dm(getString(cI(36, sni.a))), new String[0]);
    }

    public final String[] bw() {
        return (String[]) agnc.z(null, dm(getString(cI(23, sni.a))), new String[0]);
    }

    public final String[] bx() {
        return (String[]) agnc.z(null, dm(getString(cI(31, sni.a))), new String[0]);
    }

    public final String[] by() {
        return (String[]) agnc.z(null, dm(getString(cI(25, sni.a))), new String[0]);
    }

    public final String[] bz() {
        String[] dm = dm(getString(cI(45, sni.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final int c() {
        return getInt(cI(40, sni.a));
    }

    public final int e() {
        return getInt(cI(15, sni.a));
    }

    public final int f() {
        return getInt(cI(39, sni.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        xhv[] xhvVarArr;
        String[] strArr;
        tqh[] tqhVarArr;
        String[] strArr2;
        MessageIdType[] messageIdTypeArr;
        String[] strArr3;
        String[] strArr4;
        Uri[] uriArr;
        int i;
        Uri[] uriArr2;
        String[] strArr5;
        String[] strArr6;
        boolean[] zArr;
        String[] strArr7;
        String[] strArr8;
        Uri[] uriArr3;
        String[] strArr9;
        int[] iArr;
        tqc[] tqcVarArr;
        long[] jArr;
        long[] jArr2;
        String[] strArr10;
        long[] jArr3;
        long[] jArr4;
        String[] strArr11;
        String[] strArr12;
        final int i2;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        final int i3;
        String[] strArr16;
        String[] strArr17;
        String[] strArr18;
        qwe[] qweVarArr;
        qss[] qssVarArr;
        int[] iArr2;
        boolean[] zArr2;
        String[] strArr19;
        boolean[] zArr3;
        boolean[] zArr4;
        String[] strArr20;
        String[] strArr21;
        String[] strArr22;
        int[] iArr3;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        final int i4;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        final int i5;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        long[] jArr6;
        String[] strArr23;
        String[] strArr24;
        boolean[] zArr8;
        int[] iArr9;
        long[] jArr7;
        long[] jArr8;
        String[] strArr25;
        String[] strArr26;
        String[] strArr27;
        byte[][] bArr;
        long[] jArr9;
        long[] jArr10;
        boolean[] zArr9;
        vtm[] vtmVarArr;
        final int i6;
        vtm[] vtmVarArr2;
        boolean[] zArr10;
        ConversationIdType[] conversationIdTypeArr2;
        ConversationIdType[] conversationIdTypeArr3;
        qpd[] qpdVarArr;
        xxw[] xxwVarArr;
        String[] strArr28;
        Optional[] optionalArr;
        Optional[] optionalArr2;
        boolean[] zArr11;
        boolean[] zArr12;
        vst[] vstVarArr;
        vvh[] vvhVarArr;
        int[] iArr10;
        utk[] utkVarArr;
        utj[] utjVarArr;
        String[] strArr29;
        long[] jArr11;
        ConversationIdType[] conversationIdTypeArr4;
        tqh[] tqhVarArr2;
        agoaVar.a().Q();
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            final int i7 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean j = this.i.j();
                if (db(0)) {
                    if (j) {
                        conversationIdTypeArr = aZ();
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{C()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new slr(this, 14));
                if (db(1)) {
                    if (j) {
                        xhvVarArr = bi();
                    } else {
                        xhvVarArr = new xhv[]{L()};
                    }
                } else {
                    xhvVarArr = null;
                }
                agmp.ds(length, xhvVarArr, new slr(this, 16));
                if (db(2)) {
                    if (j) {
                        strArr = bt();
                    } else {
                        strArr = new String[]{W()};
                    }
                } else {
                    strArr = null;
                }
                final int i8 = 7;
                agmp.ds(length, strArr, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i8) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(3)) {
                    if (j) {
                        tqhVarArr = bc();
                    } else {
                        tqhVarArr = new tqh[]{F()};
                    }
                } else {
                    tqhVarArr = null;
                }
                final int i9 = 19;
                agmp.ds(length, tqhVarArr, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i9) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(4)) {
                    if (j) {
                        strArr2 = bK();
                    } else {
                        strArr2 = new String[]{an()};
                    }
                } else {
                    strArr2 = null;
                }
                final int i10 = 10;
                agmp.ds(length, strArr2, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i10) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(5)) {
                    if (j) {
                        messageIdTypeArr = ba();
                    } else {
                        messageIdTypeArr = new MessageIdType[]{D()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i7) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(6)) {
                    if (j) {
                        strArr3 = bI();
                    } else {
                        strArr3 = new String[]{al()};
                    }
                } else {
                    strArr3 = null;
                }
                final int i11 = 13;
                agmp.ds(length, strArr3, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i11) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(7)) {
                    if (j) {
                        strArr4 = bJ();
                    } else {
                        strArr4 = new String[]{am()};
                    }
                } else {
                    strArr4 = null;
                }
                final int i12 = 20;
                agmp.ds(length, strArr4, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(8)) {
                    if (j) {
                        uriArr = aT();
                    } else {
                        uriArr = new Uri[]{w()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new smz(this, 1));
                if (db(9)) {
                    if (j) {
                        uriArr2 = uriArr;
                        strArr5 = bD();
                        i = 0;
                    } else {
                        i = 0;
                        strArr5 = new String[]{ag()};
                        uriArr2 = uriArr;
                    }
                } else {
                    i = 0;
                    uriArr2 = uriArr;
                    strArr5 = null;
                }
                agmp.ds(length, strArr5, new smz(this, i));
                if (db(10)) {
                    if (j) {
                        zArr = bU();
                        strArr6 = strArr5;
                    } else {
                        strArr6 = strArr5;
                        boolean[] zArr13 = new boolean[1];
                        zArr13[i] = ax();
                        zArr = zArr13;
                    }
                } else {
                    strArr6 = strArr5;
                    zArr = null;
                }
                final int i13 = 4;
                agmp.dt(length, zArr, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(11)) {
                    if (j) {
                        strArr7 = bq();
                    } else {
                        strArr7 = new String[]{T()};
                    }
                } else {
                    strArr7 = null;
                }
                boolean[] zArr14 = zArr;
                final int i14 = 15;
                agmp.ds(length, strArr7, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i14) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(12)) {
                    if (j) {
                        strArr8 = br();
                    } else {
                        strArr8 = new String[]{U()};
                    }
                } else {
                    strArr8 = null;
                }
                String[] strArr30 = strArr7;
                final int i15 = 5;
                agmp.ds(length, strArr8, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i15) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(13)) {
                    if (j) {
                        uriArr3 = aS();
                    } else {
                        uriArr3 = new Uri[]{v()};
                    }
                } else {
                    uriArr3 = null;
                }
                String[] strArr31 = strArr8;
                final int i16 = 16;
                agmp.ds(length, uriArr3, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i16) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(14)) {
                    if (j) {
                        strArr9 = bp();
                    } else {
                        strArr9 = new String[]{S()};
                    }
                } else {
                    strArr9 = null;
                }
                Uri[] uriArr4 = uriArr3;
                final int i17 = 6;
                agmp.ds(length, strArr9, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i17) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(15)) {
                    if (j) {
                        iArr = aB();
                    } else {
                        iArr = new int[]{e()};
                    }
                } else {
                    iArr = null;
                }
                String[] strArr32 = strArr9;
                final int i18 = 17;
                agmp.dq(length, iArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i18) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(16)) {
                    if (j) {
                        tqcVarArr = bb();
                    } else {
                        tqcVarArr = new tqc[]{E()};
                    }
                } else {
                    tqcVarArr = null;
                }
                int[] iArr11 = iArr;
                agmp.ds(length, tqcVarArr, new smz(this, 2));
                if (db(17)) {
                    if (j) {
                        jArr = aR();
                    } else {
                        jArr = new long[]{u()};
                    }
                } else {
                    jArr = null;
                }
                tqc[] tqcVarArr2 = tqcVarArr;
                agmp.dr(length, jArr, new smz(this, 3));
                if (db(18)) {
                    if (j) {
                        jArr2 = aM();
                    } else {
                        jArr2 = new long[]{p()};
                    }
                } else {
                    jArr2 = null;
                }
                long[] jArr12 = jArr;
                agmp.dr(length, jArr2, new smz(this, 4));
                if (db(19)) {
                    if (j) {
                        strArr10 = bs();
                    } else {
                        strArr10 = new String[]{V()};
                    }
                } else {
                    strArr10 = null;
                }
                long[] jArr13 = jArr2;
                agmp.ds(length, strArr10, new slr(this, 15));
                if (db(20)) {
                    if (j) {
                        jArr3 = aO();
                    } else {
                        jArr3 = new long[]{r()};
                    }
                } else {
                    jArr3 = null;
                }
                String[] strArr33 = strArr10;
                agmp.dr(length, jArr3, new slr(this, 17));
                if (db(21)) {
                    if (j) {
                        jArr4 = aN();
                    } else {
                        jArr4 = new long[]{q()};
                    }
                } else {
                    jArr4 = null;
                }
                long[] jArr14 = jArr3;
                agmp.dr(length, jArr4, new slr(this, 18));
                if (db(22)) {
                    if (j) {
                        strArr11 = bB();
                    } else {
                        strArr11 = new String[]{ae()};
                    }
                } else {
                    strArr11 = null;
                }
                long[] jArr15 = jArr4;
                agmp.ds(length, strArr11, new slr(this, 19));
                if (db(23)) {
                    if (j) {
                        strArr12 = bw();
                    } else {
                        strArr12 = new String[]{Z()};
                    }
                } else {
                    strArr12 = null;
                }
                String[] strArr34 = strArr11;
                agmp.ds(length, strArr12, new slr(this, 20));
                if (db(24)) {
                    if (j) {
                        strArr13 = strArr12;
                        strArr14 = bC();
                        i2 = 1;
                    } else {
                        i2 = 1;
                        strArr14 = new String[]{af()};
                        strArr13 = strArr12;
                    }
                } else {
                    i2 = 1;
                    strArr13 = strArr12;
                    strArr14 = null;
                }
                agmp.ds(length, strArr14, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(25)) {
                    if (j) {
                        strArr16 = by();
                        strArr15 = strArr14;
                        i3 = 0;
                    } else {
                        strArr16 = new String[i2];
                        strArr15 = strArr14;
                        i3 = 0;
                        strArr16[0] = ab();
                    }
                } else {
                    strArr15 = strArr14;
                    i3 = 0;
                    strArr16 = null;
                }
                agmp.ds(length, strArr16, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(26)) {
                    if (j) {
                        strArr18 = bo();
                        strArr17 = strArr16;
                    } else {
                        strArr17 = strArr16;
                        String[] strArr35 = new String[1];
                        strArr35[i3] = R();
                        strArr18 = strArr35;
                    }
                } else {
                    strArr17 = strArr16;
                    strArr18 = null;
                }
                final int i19 = 2;
                agmp.ds(length, strArr18, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i19) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(27)) {
                    if (j) {
                        qweVarArr = aW();
                    } else {
                        qweVarArr = new qwe[]{z()};
                    }
                } else {
                    qweVarArr = null;
                }
                String[] strArr36 = strArr18;
                final int i20 = 3;
                agmp.ds(length, qweVarArr, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i20) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(28)) {
                    if (j) {
                        qssVarArr = aV();
                    } else {
                        qssVarArr = new qss[]{y()};
                    }
                } else {
                    qssVarArr = null;
                }
                qwe[] qweVarArr2 = qweVarArr;
                final int i21 = 5;
                agmp.ds(length, qssVarArr, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i21) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(29)) {
                    if (j) {
                        iArr2 = aF();
                    } else {
                        iArr2 = new int[]{i()};
                    }
                } else {
                    iArr2 = null;
                }
                qss[] qssVarArr2 = qssVarArr;
                final int i22 = 6;
                agmp.dq(length, iArr2, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i22) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(30)) {
                    if (j) {
                        zArr2 = bR();
                    } else {
                        zArr2 = new boolean[]{au()};
                    }
                } else {
                    zArr2 = null;
                }
                int[] iArr12 = iArr2;
                final int i23 = 8;
                agmp.dt(length, zArr2, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i23) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(31)) {
                    if (j) {
                        strArr19 = bx();
                    } else {
                        strArr19 = new String[]{aa()};
                    }
                } else {
                    strArr19 = null;
                }
                boolean[] zArr15 = zArr2;
                final int i24 = 9;
                agmp.ds(length, strArr19, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i24) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(32)) {
                    if (j) {
                        zArr3 = bS();
                    } else {
                        zArr3 = new boolean[]{av()};
                    }
                } else {
                    zArr3 = null;
                }
                String[] strArr37 = strArr19;
                final int i25 = 10;
                agmp.dt(length, zArr3, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i25) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(33)) {
                    if (j) {
                        zArr4 = bO();
                    } else {
                        zArr4 = new boolean[]{ar()};
                    }
                } else {
                    zArr4 = null;
                }
                boolean[] zArr16 = zArr3;
                final int i26 = 11;
                agmp.dt(length, zArr4, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i26) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(34)) {
                    if (j) {
                        strArr20 = bH();
                    } else {
                        strArr20 = new String[]{ak()};
                    }
                } else {
                    strArr20 = null;
                }
                boolean[] zArr17 = zArr4;
                final int i27 = 12;
                agmp.ds(length, strArr20, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i27) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(35)) {
                    if (j) {
                        strArr21 = bA();
                    } else {
                        strArr21 = new String[]{ad()};
                    }
                } else {
                    strArr21 = null;
                }
                String[] strArr38 = strArr20;
                final int i28 = 13;
                agmp.ds(length, strArr21, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i28) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(36)) {
                    if (j) {
                        strArr22 = bv();
                    } else {
                        strArr22 = new String[]{Y()};
                    }
                } else {
                    strArr22 = null;
                }
                String[] strArr39 = strArr21;
                final int i29 = 14;
                agmp.ds(length, strArr22, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i29) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(37)) {
                    if (j) {
                        iArr3 = aH();
                    } else {
                        iArr3 = new int[]{k()};
                    }
                } else {
                    iArr3 = null;
                }
                String[] strArr40 = strArr22;
                final int i30 = 16;
                agmp.dq(length, iArr3, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i30) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(38)) {
                    if (j) {
                        jArr5 = aP();
                    } else {
                        jArr5 = new long[]{s()};
                    }
                } else {
                    jArr5 = null;
                }
                int[] iArr13 = iArr3;
                final int i31 = 17;
                agmp.dr(length, jArr5, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i31) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(39)) {
                    if (j) {
                        iArr4 = aC();
                    } else {
                        iArr4 = new int[]{f()};
                    }
                } else {
                    iArr4 = null;
                }
                long[] jArr16 = jArr5;
                final int i32 = 18;
                agmp.dq(length, iArr4, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i32) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(40)) {
                    if (j) {
                        iArr5 = aA();
                    } else {
                        iArr5 = new int[]{c()};
                    }
                } else {
                    iArr5 = null;
                }
                int[] iArr14 = iArr4;
                final int i33 = 20;
                agmp.dq(length, iArr5, new alhr(this) { // from class: smw
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i33) {
                            case 0:
                                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
                            case 1:
                                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
                            case 2:
                                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
                            case 3:
                                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
                            case 4:
                                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
                            case 5:
                                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
                            case 6:
                                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
                            case 7:
                                return "name:".concat(String.valueOf(this.a.getString(2)));
                            case 8:
                                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
                            case 9:
                                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
                            case 10:
                                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
                            case 11:
                                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
                            case 12:
                                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
                            case 13:
                                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
                            case 14:
                                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
                            case 15:
                                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
                            case 16:
                                return "source_type:".concat(String.valueOf(this.a.getString(37)));
                            case 17:
                                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
                            case 18:
                                return "join_state:".concat(String.valueOf(this.a.getString(39)));
                            case 19:
                                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
                            default:
                                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
                        }
                    }
                });
                if (db(41)) {
                    if (j) {
                        iArr7 = aG();
                        iArr6 = iArr5;
                        i4 = 1;
                    } else {
                        i4 = 1;
                        iArr7 = new int[]{j()};
                        iArr6 = iArr5;
                    }
                } else {
                    i4 = 1;
                    iArr6 = iArr5;
                    iArr7 = null;
                }
                agmp.dq(length, iArr7, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i4) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(42)) {
                    if (j) {
                        zArr5 = bP();
                        iArr8 = iArr7;
                        i5 = 0;
                    } else {
                        zArr5 = new boolean[i4];
                        iArr8 = iArr7;
                        i5 = 0;
                        zArr5[0] = as();
                    }
                } else {
                    iArr8 = iArr7;
                    i5 = 0;
                    zArr5 = null;
                }
                agmp.dt(length, zArr5, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(43)) {
                    if (j) {
                        zArr7 = bN();
                        zArr6 = zArr5;
                    } else {
                        zArr6 = zArr5;
                        boolean[] zArr18 = new boolean[1];
                        zArr18[i5] = aq();
                        zArr7 = zArr18;
                    }
                } else {
                    zArr6 = zArr5;
                    zArr7 = null;
                }
                final int i34 = 2;
                agmp.dt(length, zArr7, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i34) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(44)) {
                    if (j) {
                        jArr6 = aK();
                    } else {
                        jArr6 = new long[]{n()};
                    }
                } else {
                    jArr6 = null;
                }
                boolean[] zArr19 = zArr7;
                final int i35 = 3;
                agmp.dr(length, jArr6, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i35) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(45)) {
                    if (j) {
                        strArr23 = bz();
                    } else {
                        strArr23 = new String[]{ac()};
                    }
                } else {
                    strArr23 = null;
                }
                long[] jArr17 = jArr6;
                final int i36 = 4;
                agmp.ds(length, strArr23, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i36) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(46)) {
                    if (j) {
                        strArr24 = bu();
                    } else {
                        strArr24 = new String[]{X()};
                    }
                } else {
                    strArr24 = null;
                }
                String[] strArr41 = strArr23;
                final int i37 = 6;
                agmp.ds(length, strArr24, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i37) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(47)) {
                    if (j) {
                        zArr8 = bV();
                    } else {
                        zArr8 = new boolean[]{ay()};
                    }
                } else {
                    zArr8 = null;
                }
                String[] strArr42 = strArr24;
                final int i38 = 7;
                agmp.dt(length, zArr8, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i38) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(48)) {
                    if (j) {
                        iArr9 = aE();
                    } else {
                        iArr9 = new int[]{h()};
                    }
                } else {
                    iArr9 = null;
                }
                boolean[] zArr20 = zArr8;
                final int i39 = 8;
                agmp.dq(length, iArr9, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i39) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(49)) {
                    if (j) {
                        jArr7 = aL();
                    } else {
                        jArr7 = new long[]{o()};
                    }
                } else {
                    jArr7 = null;
                }
                int[] iArr15 = iArr9;
                final int i40 = 9;
                agmp.dr(length, jArr7, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i40) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(50)) {
                    if (j) {
                        jArr8 = aJ();
                    } else {
                        jArr8 = new long[]{m()};
                    }
                } else {
                    jArr8 = null;
                }
                long[] jArr18 = jArr7;
                final int i41 = 11;
                agmp.dr(length, jArr8, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i41) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(51)) {
                    if (j) {
                        strArr25 = bn();
                    } else {
                        strArr25 = new String[]{Q()};
                    }
                } else {
                    strArr25 = null;
                }
                long[] jArr19 = jArr8;
                final int i42 = 12;
                agmp.ds(length, strArr25, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i42) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(52)) {
                    if (j) {
                        strArr26 = bF();
                    } else {
                        strArr26 = new String[]{ai()};
                    }
                } else {
                    strArr26 = null;
                }
                String[] strArr43 = strArr25;
                final int i43 = 13;
                agmp.ds(length, strArr26, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i43) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(53)) {
                    if (j) {
                        strArr27 = bE();
                    } else {
                        strArr27 = new String[]{ah()};
                    }
                } else {
                    strArr27 = null;
                }
                String[] strArr44 = strArr26;
                final int i44 = 14;
                agmp.ds(length, strArr27, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i44) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(54)) {
                    if (j) {
                        bArr = bW();
                    } else {
                        bArr = new byte[][]{az()};
                    }
                } else {
                    bArr = null;
                }
                String[] strArr45 = strArr27;
                final int i45 = 15;
                agmp.ds(length, bArr, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i45) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(55)) {
                    if (j) {
                        jArr9 = aI();
                    } else {
                        jArr9 = new long[]{l()};
                    }
                } else {
                    jArr9 = null;
                }
                byte[][] bArr2 = bArr;
                final int i46 = 17;
                agmp.dr(length, jArr9, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i46) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(56)) {
                    if (j) {
                        jArr10 = aQ();
                    } else {
                        jArr10 = new long[]{t()};
                    }
                } else {
                    jArr10 = null;
                }
                long[] jArr20 = jArr9;
                final int i47 = 18;
                agmp.dr(length, jArr10, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i47) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(57)) {
                    if (j) {
                        zArr9 = bT();
                    } else {
                        zArr9 = new boolean[]{aw()};
                    }
                } else {
                    zArr9 = null;
                }
                long[] jArr21 = jArr10;
                final int i48 = 19;
                agmp.dt(length, zArr9, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i48) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(58)) {
                    if (j) {
                        vtmVarArr = bg();
                    } else {
                        vtmVarArr = new vtm[]{J()};
                    }
                } else {
                    vtmVarArr = null;
                }
                boolean[] zArr21 = zArr9;
                final int i49 = 20;
                agmp.ds(length, vtmVarArr, new alhr(this) { // from class: smx
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i49) {
                            case 0:
                                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
                            case 1:
                                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
                            case 2:
                                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
                            case 3:
                                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
                            case 4:
                                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
                            case 5:
                                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
                            case 6:
                                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
                            case 7:
                                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
                            case 8:
                                return "open_count:".concat(String.valueOf(this.a.getString(48)));
                            case 9:
                                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
                            case 10:
                                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
                            case 11:
                                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
                            case 12:
                                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
                            case 13:
                                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
                            case 14:
                                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
                            case 15:
                                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
                            case 16:
                                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
                            case 17:
                                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
                            case 18:
                                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
                            case 19:
                                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
                            default:
                                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
                        }
                    }
                });
                if (db(59)) {
                    if (j) {
                        zArr10 = bL();
                        vtmVarArr2 = vtmVarArr;
                        i6 = 1;
                    } else {
                        i6 = 1;
                        zArr10 = new boolean[]{ao()};
                        vtmVarArr2 = vtmVarArr;
                    }
                } else {
                    i6 = 1;
                    vtmVarArr2 = vtmVarArr;
                    zArr10 = null;
                }
                agmp.dt(length, zArr10, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i6) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(60)) {
                    if (j) {
                        conversationIdTypeArr2 = aX();
                    } else {
                        conversationIdTypeArr2 = new ConversationIdType[i6];
                        conversationIdTypeArr2[0] = A();
                    }
                } else {
                    conversationIdTypeArr2 = null;
                }
                boolean[] zArr22 = zArr10;
                final int i50 = 2;
                agmp.ds(length, conversationIdTypeArr2, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i50) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(61)) {
                    if (j) {
                        conversationIdTypeArr3 = aY();
                    } else {
                        conversationIdTypeArr3 = new ConversationIdType[]{B()};
                    }
                } else {
                    conversationIdTypeArr3 = null;
                }
                ConversationIdType[] conversationIdTypeArr5 = conversationIdTypeArr2;
                final int i51 = 3;
                agmp.ds(length, conversationIdTypeArr3, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i51) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(62)) {
                    if (j) {
                        qpdVarArr = aU();
                    } else {
                        qpdVarArr = new qpd[]{x()};
                    }
                } else {
                    qpdVarArr = null;
                }
                ConversationIdType[] conversationIdTypeArr6 = conversationIdTypeArr3;
                final int i52 = 4;
                agmp.ds(length, qpdVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i52) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(63)) {
                    if (j) {
                        xxwVarArr = bj();
                    } else {
                        xxwVarArr = new xxw[]{M()};
                    }
                } else {
                    xxwVarArr = null;
                }
                qpd[] qpdVarArr2 = qpdVarArr;
                final int i53 = 5;
                agmp.ds(length, xxwVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i53) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(64)) {
                    if (j) {
                        strArr28 = bG();
                    } else {
                        strArr28 = new String[]{aj()};
                    }
                } else {
                    strArr28 = null;
                }
                xxw[] xxwVarArr2 = xxwVarArr;
                final int i54 = 7;
                agmp.ds(length, strArr28, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i54) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(65)) {
                    if (j) {
                        optionalArr = bl();
                    } else {
                        optionalArr = new Optional[]{O()};
                    }
                } else {
                    optionalArr = null;
                }
                String[] strArr46 = strArr28;
                final int i55 = 8;
                agmp.ds(length, optionalArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i55) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(66)) {
                    if (j) {
                        optionalArr2 = bk();
                    } else {
                        optionalArr2 = new Optional[]{N()};
                    }
                } else {
                    optionalArr2 = null;
                }
                Optional[] optionalArr3 = optionalArr;
                final int i56 = 9;
                agmp.ds(length, optionalArr2, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i56) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(67)) {
                    if (j) {
                        zArr11 = bM();
                    } else {
                        zArr11 = new boolean[]{ap()};
                    }
                } else {
                    zArr11 = null;
                }
                Optional[] optionalArr4 = optionalArr2;
                final int i57 = 10;
                agmp.dt(length, zArr11, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i57) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(68)) {
                    if (j) {
                        zArr12 = bQ();
                    } else {
                        zArr12 = new boolean[]{at()};
                    }
                } else {
                    zArr12 = null;
                }
                boolean[] zArr23 = zArr11;
                final int i58 = 11;
                agmp.dt(length, zArr12, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i58) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(69)) {
                    if (j) {
                        vstVarArr = bf();
                    } else {
                        vstVarArr = new vst[]{I()};
                    }
                } else {
                    vstVarArr = null;
                }
                boolean[] zArr24 = zArr12;
                final int i59 = 12;
                agmp.ds(length, vstVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i59) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(70)) {
                    if (j) {
                        vvhVarArr = bh();
                    } else {
                        vvhVarArr = new vvh[]{K()};
                    }
                } else {
                    vvhVarArr = null;
                }
                vst[] vstVarArr2 = vstVarArr;
                final int i60 = 14;
                agmp.ds(length, vvhVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i60) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(71)) {
                    if (j) {
                        iArr10 = aD();
                    } else {
                        iArr10 = new int[]{g()};
                    }
                } else {
                    iArr10 = null;
                }
                vvh[] vvhVarArr2 = vvhVarArr;
                final int i61 = 15;
                agmp.dq(length, iArr10, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i61) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(72)) {
                    if (j) {
                        utkVarArr = be();
                    } else {
                        utkVarArr = new utk[]{H()};
                    }
                } else {
                    utkVarArr = null;
                }
                int[] iArr16 = iArr10;
                final int i62 = 16;
                agmp.ds(length, utkVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i62) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(73)) {
                    if (j) {
                        utjVarArr = bd();
                    } else {
                        utjVarArr = new utj[]{G()};
                    }
                } else {
                    utjVarArr = null;
                }
                utk[] utkVarArr2 = utkVarArr;
                final int i63 = 18;
                agmp.ds(length, utjVarArr, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i63) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(74)) {
                    if (j) {
                        strArr29 = bm();
                    } else {
                        strArr29 = new String[]{P()};
                    }
                } else {
                    strArr29 = null;
                }
                final int i64 = 19;
                agmp.ds(length, strArr29, new alhr(this) { // from class: smy
                    public final /* synthetic */ sna a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i64) {
                            case 0:
                                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
                            case 1:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
                            case 2:
                                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
                            case 3:
                                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
                            case 4:
                                return "error_state:".concat(String.valueOf(this.a.getString(62)));
                            case 5:
                                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
                            case 6:
                                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
                            case 7:
                                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
                            case 8:
                                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
                            case 9:
                                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
                            case 10:
                                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
                            case 11:
                                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
                            case 12:
                                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
                            case 13:
                                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
                            case 14:
                                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
                            case 15:
                                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
                            case 16:
                                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
                            case 17:
                                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
                            case 18:
                                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
                            case 19:
                                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
                            default:
                                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                alob alobVar = new alob();
                int i65 = 0;
                while (i65 < length) {
                    long j2 = du[i65];
                    if (j2 > 0 && !hashSet.contains(Long.valueOf(j2))) {
                        hashSet.add(Long.valueOf(du[i65]));
                        smt d = sni.d();
                        d.aB();
                        long j3 = du[i65];
                        jArr11 = du;
                        if (conversationIdTypeArr != null) {
                            d.B(conversationIdTypeArr[i65]);
                        }
                        if (xhvVarArr != null) {
                            d.ar(xhvVarArr[i65]);
                        }
                        if (strArr != null) {
                            d.M(strArr[i65]);
                        }
                        if (tqhVarArr != null) {
                            d.N(tqhVarArr[i65]);
                        }
                        if (strArr2 != null) {
                            d.ax(strArr2[i65]);
                        }
                        if (messageIdTypeArr != null) {
                            d.I(messageIdTypeArr[i65]);
                        }
                        if (strArr3 != null) {
                            d.as(strArr3[i65]);
                        }
                        if (strArr4 != null) {
                            d.aw(strArr4[i65]);
                        }
                        if (uriArr2 != null) {
                            d.ae(uriArr2[i65]);
                        }
                        if (strArr6 != null) {
                            d.ad(strArr6[i65]);
                        }
                        if (zArr14 != null) {
                            d.ap(zArr14[i65]);
                        }
                        if (strArr30 != null) {
                            d.s(strArr30[i65]);
                        }
                        if (strArr31 != null) {
                            d.t(strArr31[i65]);
                        }
                        if (uriArr4 != null) {
                            d.r(uriArr4[i65]);
                        }
                        if (strArr32 != null) {
                            d.q(strArr32[i65]);
                        }
                        if (iArr11 != null) {
                            d.p(iArr11[i65]);
                        }
                        if (tqcVarArr2 != null) {
                            d.c(tqcVarArr2[i65]);
                        }
                        conversationIdTypeArr4 = conversationIdTypeArr;
                        tqhVarArr2 = tqhVarArr;
                        if (jArr12 != null) {
                            d.at(jArr12[i65]);
                        }
                        if (jArr13 != null) {
                            d.H(jArr13[i65]);
                        }
                        if (strArr33 != null) {
                            d.A(strArr33[i65]);
                        }
                        if (jArr14 != null) {
                            d.X(jArr14[i65]);
                        }
                        if (jArr15 != null) {
                            d.O(jArr15[i65]);
                        }
                        if (strArr34 != null) {
                            d.ab(strArr34[i65]);
                        }
                        if (strArr13 != null) {
                            d.R(strArr13[i65]);
                        }
                        if (strArr15 != null) {
                            d.ac(strArr15[i65]);
                        }
                        if (strArr17 != null) {
                            d.W(strArr17[i65]);
                        }
                        if (strArr36 != null) {
                            d.k(strArr36[i65]);
                        }
                        if (qweVarArr2 != null) {
                            d.j(qweVarArr2[i65]);
                        }
                        if (qssVarArr2 != null) {
                            d.o(qssVarArr2[i65]);
                        }
                        if (iArr12 != null) {
                            d.Y(iArr12[i65]);
                        }
                        if (zArr15 != null) {
                            d.S(zArr15[i65]);
                        }
                        if (strArr37 != null) {
                            d.T(strArr37[i65]);
                        }
                        if (zArr16 != null) {
                            d.U(zArr16[i65]);
                        }
                        if (zArr17 != null) {
                            d.C(zArr17[i65]);
                        }
                        if (strArr38 != null) {
                            d.aq(strArr38[i65]);
                        }
                        if (strArr39 != null) {
                            d.aa(strArr39[i65]);
                        }
                        if (strArr40 != null) {
                            d.Q(strArr40[i65]);
                        }
                        if (iArr13 != null) {
                            d.au(iArr13[i65]);
                        }
                        if (jArr16 != null) {
                            d.al(jArr16[i65]);
                        }
                        if (iArr14 != null) {
                            d.E(iArr14[i65]);
                        }
                        if (iArr6 != null) {
                            d.i(iArr6[i65]);
                        }
                        if (iArr8 != null) {
                            d.ao(iArr8[i65]);
                        }
                        if (zArr6 != null) {
                            d.D(zArr6[i65]);
                        }
                        if (zArr19 != null) {
                            d.z(zArr19[i65]);
                        }
                        if (jArr17 != null) {
                            d.F(jArr17[i65]);
                        }
                        if (strArr41 != null) {
                            d.Z(strArr41[i65]);
                        }
                        if (strArr42 != null) {
                            d.P(strArr42[i65]);
                        }
                        if (zArr20 != null) {
                            d.av(zArr20[i65]);
                        }
                        if (iArr15 != null) {
                            d.V(iArr15[i65]);
                        }
                        if (jArr18 != null) {
                            d.G(jArr18[i65]);
                        }
                        if (jArr19 != null) {
                            d.m(jArr19[i65]);
                        }
                        if (strArr43 != null) {
                            d.f(strArr43[i65]);
                        }
                        if (strArr44 != null) {
                            d.ah(strArr44[i65]);
                        }
                        if (strArr45 != null) {
                            d.af(strArr45[i65]);
                        }
                        if (bArr2 != null) {
                            d.ay(bArr2[i65]);
                        }
                        if (jArr20 != null) {
                            d.h(jArr20[i65]);
                        }
                        if (jArr21 != null) {
                            d.am(jArr21[i65]);
                        }
                        if (zArr21 != null) {
                            d.ak(zArr21[i65]);
                        }
                        if (vtmVarArr2 != null) {
                            d.ag(vtmVarArr2[i65]);
                        }
                        if (zArr22 != null) {
                            d.d(zArr22[i65]);
                        }
                        if (conversationIdTypeArr5 != null) {
                            d.n(conversationIdTypeArr5[i65]);
                        }
                        if (conversationIdTypeArr6 != null) {
                            d.u(conversationIdTypeArr6[i65]);
                        }
                        if (qpdVarArr2 != null) {
                            d.x(qpdVarArr2[i65]);
                        }
                        if (xxwVarArr2 != null) {
                            d.g(xxwVarArr2[i65]);
                        }
                        if (strArr46 != null) {
                            d.aj(strArr46[i65]);
                        }
                        if (optionalArr3 != null) {
                            d.an(optionalArr3[i65]);
                        }
                        if (optionalArr4 != null) {
                            d.ai(optionalArr4[i65]);
                        }
                        if (zArr23 != null) {
                            d.y(zArr23[i65]);
                        }
                        if (zArr24 != null) {
                            d.J(zArr24[i65]);
                        }
                        if (vstVarArr2 != null) {
                            d.l(vstVarArr2[i65]);
                        }
                        if (vvhVarArr2 != null) {
                            d.L(vvhVarArr2[i65]);
                        }
                        if (iArr16 != null) {
                            d.K(iArr16[i65]);
                        }
                        if (utkVarArr2 != null) {
                            d.w(utkVarArr2[i65]);
                        }
                        if (utjVarArr != null) {
                            d.v(utjVarArr[i65]);
                        }
                        if (strArr29 != null) {
                            d.e(strArr29[i65]);
                        }
                        alobVar.h(d.a());
                    } else {
                        jArr11 = du;
                        conversationIdTypeArr4 = conversationIdTypeArr;
                        tqhVarArr2 = tqhVarArr;
                    }
                    i65++;
                    conversationIdTypeArr = conversationIdTypeArr4;
                    tqhVarArr = tqhVarArr2;
                    du = jArr11;
                }
                return alobVar.g();
            }
        }
        return alog.q();
    }

    public final int g() {
        return getInt(cI(71, sni.a));
    }

    public final int h() {
        return getInt(cI(48, sni.a));
    }

    public final int i() {
        return getInt(cI(29, sni.a));
    }

    public final int j() {
        return getInt(cI(41, sni.a));
    }

    public final int k() {
        return getInt(cI(37, sni.a));
    }

    public final long l() {
        return getLong(cI(55, sni.a));
    }

    public final long m() {
        return getLong(cI(50, sni.a));
    }

    public final long n() {
        return getLong(cI(44, sni.a));
    }

    public final long o() {
        return getLong(cI(49, sni.a));
    }

    public final long p() {
        return getLong(cI(18, sni.a));
    }

    public final long q() {
        return getLong(cI(21, sni.a));
    }

    public final long r() {
        return getLong(cI(20, sni.a));
    }

    public final long s() {
        return getLong(cI(38, sni.a));
    }

    public final long t() {
        return getLong(cI(56, sni.a));
    }

    public final long u() {
        return getLong(cI(17, sni.a));
    }

    public final Uri v() {
        String string = getString(cI(13, sni.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri w() {
        String string = getString(cI(8, sni.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final qpd x() {
        return qpd.b(getInt(cI(62, sni.a)));
    }

    public final qss y() {
        return qta.d(getString(cI(28, sni.a)));
    }

    public final qwe z() {
        return riw.m(getString(cI(27, sni.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
