package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbd extends agmp implements agmq {
    @Deprecated
    public sbd(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sbe sbeVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sbi.a, agoxVar, akkwVar, sbeVar);
    }

    public final long A() {
        return getLong(cI(15, sbi.a));
    }

    public final long B() {
        return getLong(cI(23, sbi.a));
    }

    public final long C() {
        return getLong(cI(4, sbi.a));
    }

    public final long D() {
        return getLong(cI(156, sbi.a));
    }

    public final long E() {
        return getLong(cI(3, sbi.a));
    }

    public final long F() {
        return getLong(cI(12, sbi.a));
    }

    public final long G() {
        return getLong(cI(45, sbi.a));
    }

    public final Uri H() {
        String string = getString(cI(138, sbi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri I() {
        String string = getString(cI(46, sbi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri J() {
        String string = getString(cI(93, sbi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri K() {
        String string = getString(cI(10, sbi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final pyz L() {
        return pzm.a(getString(cI(84, sbi.a)));
    }

    public final ConversationIdType M() {
        return new ConversationIdType(getLong(cI(1, sbi.a)));
    }

    public final ConversationIdType N() {
        return new ConversationIdType(getLong(cI(50, sbi.a)));
    }

    public final MessageIdType O() {
        return new MessageIdType(getLong(cI(0, sbi.a)));
    }

    public final MessageIdType P() {
        return new MessageIdType(getLong(cI(155, sbi.a)));
    }

    public final MessageIdType Q() {
        return new MessageIdType(getLong(cI(126, sbi.a)));
    }

    public final MessageIdType R() {
        return new MessageIdType(getLong(cI(154, sbi.a)));
    }

    public final MessageIdType S() {
        return new MessageIdType(getLong(cI(147, sbi.a)));
    }

    public final MessageIdType T() {
        return new MessageIdType(getLong(cI(37, sbi.a)));
    }

    public final MessageIdType U() {
        return new MessageIdType(getLong(cI(107, sbi.a)));
    }

    public final MessageIdType V() {
        return new MessageIdType(getLong(cI(113, sbi.a)));
    }

    public final rve W() {
        return rve.a(getString(cI(29, sbi.a)));
    }

    public final rve X() {
        return rve.a(getString(cI(19, sbi.a)));
    }

    public final tqa Y() {
        return wch.I(getString(cI(52, sbi.a)));
    }

    public final tqa Z() {
        return wch.I(getString(cI(51, sbi.a)));
    }

    public final String aA() {
        return getString(cI(133, sbi.a));
    }

    public final String aB() {
        return yta.a(getString(cI(130, sbi.a)));
    }

    public final String aC() {
        return getString(cI(132, sbi.a));
    }

    public final String aD() {
        return getString(cI(131, sbi.a));
    }

    public final String aE() {
        return getString(cI(173, sbi.a));
    }

    public final String aF() {
        return yta.a(getString(cI(129, sbi.a)));
    }

    public final String aG() {
        return yta.a(getString(cI(172, sbi.a)));
    }

    public final String aH() {
        return getString(cI(80, sbi.a));
    }

    public final String aI() {
        return getString(cI(95, sbi.a));
    }

    public final String aJ() {
        return getString(cI(16, sbi.a));
    }

    public final String aK() {
        return yta.a(getString(cI(13, sbi.a)));
    }

    public final String aL() {
        return getString(cI(136, sbi.a));
    }

    public final String aM() {
        return aabr.bb(getString(cI(88, sbi.a)));
    }

    public final String aN() {
        return aabr.bb(getString(cI(159, sbi.a)));
    }

    public final String aO() {
        return getString(cI(139, sbi.a));
    }

    public final String aP() {
        return getString(cI(35, sbi.a));
    }

    public final String aQ() {
        return getString(cI(57, sbi.a));
    }

    public final String aR() {
        return getString(cI(142, sbi.a));
    }

    public final String aS() {
        return getString(cI(18, sbi.a));
    }

    public final String aT() {
        return aabr.bb(getString(cI(89, sbi.a)));
    }

    public final String aU() {
        return getString(cI(2, sbi.a));
    }

    public final String aV() {
        return getString(cI(25, sbi.a));
    }

    public final String aW() {
        return getString(cI(146, sbi.a));
    }

    public final String aX() {
        return getString(cI(127, sbi.a));
    }

    public final String aY() {
        return getString(cI(170, sbi.a));
    }

    public final atok aZ() {
        byte[] blob = getBlob(cI(33, sbi.a));
        if (blob == null) {
            return null;
        }
        try {
            return (atok) apag.parseFrom(atok.a, blob, aozs.a());
        } catch (Throwable unused) {
            return atok.a;
        }
    }

    public final tqf aa() {
        tqf[] values = tqf.values();
        int i = getInt(cI(32, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqi ab() {
        tqi[] values = tqi.values();
        int i = getInt(cI(86, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tql ac() {
        tql[] values = tql.values();
        int i = getInt(cI(48, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqq ad() {
        tqq[] values = tqq.values();
        int i = getInt(cI(85, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqr ae() {
        tqr[] values = tqr.values();
        int i = getInt(cI(102, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqr af() {
        tqr[] values = tqr.values();
        int i = getInt(cI(21, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final voe ag() {
        byte[] blob = getBlob(cI(148, sbi.a));
        if (blob == null) {
            return null;
        }
        try {
            return (voe) apag.parseFrom(voe.a, blob, aozs.a());
        } catch (Throwable unused) {
            return voe.a;
        }
    }

    public final vox ah() {
        return vox.b(getInt(cI(104, sbi.a)));
    }

    public final vox ai() {
        return vox.b(getInt(cI(105, sbi.a)));
    }

    public final wks aj() {
        byte[] blob = getBlob(cI(145, sbi.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wks) apag.parseFrom(wks.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wks.a;
        }
    }

    public final xxw ak() {
        xxw[] values = xxw.values();
        int i = getInt(cI(31, sbi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional al() {
        return uxi.g(getLong(cI(144, sbi.a)));
    }

    public final String am() {
        return getString(cI(176, sbi.a));
    }

    public final String an() {
        return getString(cI(72, sbi.a));
    }

    public final String ao() {
        return getString(cI(63, sbi.a));
    }

    public final String ap() {
        return getString(cI(26, sbi.a));
    }

    public final String aq() {
        return getString(cI(137, sbi.a));
    }

    public final String ar() {
        return aabr.bb(getString(cI(90, sbi.a)));
    }

    public final String as() {
        return aabr.bb(getString(cI(160, sbi.a)));
    }

    public final String at() {
        return getString(cI(175, sbi.a));
    }

    public final String au() {
        return yta.a(getString(cI(92, sbi.a)));
    }

    public final String av() {
        return yta.a(getString(cI(162, sbi.a)));
    }

    public final String aw() {
        return yta.a(getString(cI(91, sbi.a)));
    }

    public final String ax() {
        return yta.a(getString(cI(161, sbi.a)));
    }

    public final String ay() {
        return getString(cI(157, sbi.a));
    }

    public final String az() {
        return getString(cI(106, sbi.a));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new saz();
    }

    public final long[] bA() {
        return agnc.y(dl(getString(87)), dl(getString(cI(87, sbi.a))));
    }

    public final long[] bB() {
        return agnc.y(null, dl(getString(cI(169, sbi.a))));
    }

    public final long[] bC() {
        return agnc.y(null, dl(getString(cI(112, sbi.a))));
    }

    public final long[] bD() {
        return agnc.y(null, dl(getString(cI(110, sbi.a))));
    }

    public final long[] bE() {
        return agnc.y(null, dl(getString(cI(109, sbi.a))));
    }

    public final long[] bF() {
        return agnc.y(dl(getString(87)), dl(getString(cI(47, sbi.a))));
    }

    public final Uri[] bG() {
        String string = getString(cI(58, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dm[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) agnc.z(dl, uriArr, new Uri[0]);
    }

    public final Uri[] bH() {
        String string = getString(cI(41, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dm[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) agnc.z(dl, uriArr, new Uri[0]);
    }

    public final Uri[] bI() {
        String string = getString(cI(56, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dm[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) agnc.z(dl, uriArr, new Uri[0]);
    }

    public final Uri[] bJ() {
        String string = getString(cI(42, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dm[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) agnc.z(dl, uriArr, new Uri[0]);
    }

    public final Uri[] bK() {
        String string = getString(cI(39, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dm[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) agnc.z(dl, uriArr, new Uri[0]);
    }

    public final Uri[] bL() {
        String[] dm = dm(getString(cI(165, sbi.a)));
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

    public final nht[] bM() {
        String string = getString(cI(150, sbi.a));
        long[] dl = dl(getString(153));
        int[] dk = dk(string);
        nht[] nhtVarArr = new nht[dk.length];
        for (int i = 0; i < dk.length; i++) {
            nht b = nht.b(dk[i]);
            if (b != null) {
                nhtVarArr[i] = b;
            } else {
                throw new IllegalStateException();
            }
        }
        return (nht[]) agnc.z(dl, nhtVarArr, new nht[0]);
    }

    public final tqd[] bN() {
        String string = getString(cI(49, sbi.a));
        long[] dl = dl(getString(87));
        int[] dk = dk(string);
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
        return (tqd[]) agnc.z(dl, tqdVarArr, new tqd[0]);
    }

    public final tqj[] bO() {
        String string = getString(cI(81, sbi.a));
        long[] dl = dl(getString(87));
        int[] dk = dk(string);
        tqj[] values = tqj.values();
        int length = values.length;
        tqj[] tqjVarArr = new tqj[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqjVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqj[]) agnc.z(dl, tqjVarArr, new tqj[0]);
    }

    public final Optional[] bP() {
        long[] dl = dl(getString(cI(111, sbi.a)));
        int length = dl.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = uxi.g(dl[i]);
        }
        return (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
    }

    public final String[] bQ() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(62, sbi.a))), new String[0]);
    }

    public final String[] bR() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(61, sbi.a))), new String[0]);
    }

    public final String[] bS() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(71, sbi.a))), new String[0]);
    }

    public final String[] bT() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(40, sbi.a))), new String[0]);
    }

    public final String[] bU() {
        return (String[]) agnc.z(null, dm(getString(cI(166, sbi.a))), new String[0]);
    }

    public final String[] bV() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(68, sbi.a))), new String[0]);
    }

    public final String[] bW() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(69, sbi.a))), new String[0]);
    }

    public final String[] bX() {
        return (String[]) agnc.z(null, dm(getString(cI(167, sbi.a))), new String[0]);
    }

    public final String[] bY() {
        return (String[]) agnc.z(dl(getString(87)), dm(getString(cI(36, sbi.a))), new String[0]);
    }

    public final String[] bZ() {
        return (String[]) agnc.z(null, dm(getString(cI(163, sbi.a))), new String[0]);
    }

    public final boolean ba() {
        if (getInt(cI(78, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bb() {
        if (getInt(cI(99, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bc() {
        if (getInt(cI(141, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bd() {
        if (getInt(cI(22, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean be() {
        if (getInt(cI(101, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bf() {
        if (getInt(cI(135, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bg() {
        if (getInt(cI(174, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bh() {
        if (getInt(cI(134, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bi() {
        if (getInt(cI(8, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bj() {
        if (getInt(cI(143, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean bk() {
        if (getInt(cI(9, sbi.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] bl() {
        return getBlob(cI(65, sbi.a));
    }

    public final byte[] bm() {
        return getBlob(cI(64, sbi.a));
    }

    public final int[] bn() {
        return agnc.w(dl(getString(87)), dk(getString(cI(60, sbi.a))));
    }

    public final int[] bo() {
        return agnc.w(null, dk(getString(cI(122, sbi.a))));
    }

    public final int[] bp() {
        return agnc.w(null, dk(getString(cI(123, sbi.a))));
    }

    public final int[] bq() {
        return agnc.w(null, dk(getString(cI(124, sbi.a))));
    }

    public final int[] br() {
        return agnc.w(dl(getString(87)), dk(getString(cI(44, sbi.a))));
    }

    public final int[] bs() {
        return agnc.w(dl(getString(87)), dk(getString(cI(59, sbi.a))));
    }

    public final long[] bt() {
        return agnc.y(dl(getString(87)), dl(getString(cI(67, sbi.a))));
    }

    public final long[] bu() {
        return agnc.y(dl(getString(87)), dl(getString(cI(74, sbi.a))));
    }

    public final long[] bv() {
        return agnc.y(dl(getString(87)), dl(getString(cI(70, sbi.a))));
    }

    public final long[] bw() {
        return agnc.y(null, dl(getString(cI(168, sbi.a))));
    }

    public final long[] bx() {
        return agnc.y(null, dl(getString(cI(108, sbi.a))));
    }

    public final long[] by() {
        return agnc.y(null, dl(getString(cI(114, sbi.a))));
    }

    public final long[] bz() {
        return agnc.y(null, dl(getString(cI(125, sbi.a))));
    }

    public final double c() {
        return getDouble(cI(55, sbi.a));
    }

    public final String[] ca() {
        return (String[]) agnc.z(dl(getString(153)), dm(getString(cI(152, sbi.a))), new String[0]);
    }

    public final String[] cb() {
        String[] dm = dm(getString(cI(121, sbi.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = aabr.bb(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] cc() {
        return (String[]) agnc.z(dl(getString(153)), dm(getString(cI(149, sbi.a))), new String[0]);
    }

    public final String[] cd() {
        String string = getString(cI(38, sbi.a));
        long[] dl = dl(getString(87));
        String[] dm = dm(string);
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(dl, dm, new String[0]);
    }

    public final String[] ce() {
        String[] dm = dm(getString(cI(164, sbi.a)));
        for (int i = 0; i < dm.length; i++) {
            dm[i] = yta.a(dm[i]);
        }
        return (String[]) agnc.z(null, dm, new String[0]);
    }

    public final String[] cf() {
        return (String[]) agnc.z(dl(getString(153)), dm(getString(cI(151, sbi.a))), new String[0]);
    }

    public final String[] cg() {
        return (String[]) agnc.z(null, dm(getString(cI(117, sbi.a))), new String[0]);
    }

    public final String[] ch() {
        return (String[]) agnc.z(null, dm(getString(cI(119, sbi.a))), new String[0]);
    }

    public final String[] ci() {
        return (String[]) agnc.z(null, dm(getString(cI(120, sbi.a))), new String[0]);
    }

    public final boolean[] cj() {
        return agnc.A(dl(getString(87)), dn(getString(cI(66, sbi.a))));
    }

    public final boolean[] ck() {
        return agnc.A(dl(getString(87)), dn(getString(cI(73, sbi.a))));
    }

    public final boolean[] cl() {
        return agnc.A(dl(getString(87)), dn(getString(cI(77, sbi.a))));
    }

    public final byte[][] cm() {
        return agnc.B(dl(getString(87)), dv(getString(cI(76, sbi.a))));
    }

    public final byte[][] cn() {
        return agnc.B(dl(getString(87)), dv(getString(cI(75, sbi.a))));
    }

    public final double e() {
        return getDouble(cI(54, sbi.a));
    }

    public final int f() {
        return getInt(cI(96, sbi.a));
    }

    public final int g() {
        return getInt(cI(97, sbi.a));
    }

    public final int h() {
        return getInt(cI(140, sbi.a));
    }

    public final int i() {
        return getInt(cI(98, sbi.a));
    }

    public final int j() {
        return getInt(cI(7, sbi.a));
    }

    public final int k() {
        return getInt(cI(100, sbi.a));
    }

    public final int l() {
        return getInt(cI(5, sbi.a));
    }

    public final int m() {
        return getInt(cI(17, sbi.a));
    }

    public final int n() {
        return getInt(cI(20, sbi.a));
    }

    public final int o() {
        return getInt(cI(30, sbi.a));
    }

    public final int p() {
        return getInt(cI(24, sbi.a));
    }

    public final int q() {
        return getInt(cI(11, sbi.a));
    }

    public final int r() {
        return getInt(cI(6, sbi.a));
    }

    public final int s() {
        return getInt(cI(158, sbi.a));
    }

    public final long t() {
        return getLong(cI(94, sbi.a));
    }

    public final long u() {
        return getLong(cI(103, sbi.a));
    }

    public final long v() {
        return getLong(cI(128, sbi.a));
    }

    public final long w() {
        return getLong(cI(171, sbi.a));
    }

    public final long x() {
        return getLong(cI(79, sbi.a));
    }

    public final long y() {
        return getLong(cI(53, sbi.a));
    }

    public final long z() {
        return getLong(cI(14, sbi.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
