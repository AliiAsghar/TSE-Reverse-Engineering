package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sei extends agmp implements agmq {
    @Deprecated
    public sei(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sej sejVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sem.a, agoxVar, akkwVar, sejVar);
    }

    public final int A() {
        return getInt(cI(149, sem.a));
    }

    public final int B() {
        return getInt(cI(10, sem.a));
    }

    public final int C() {
        return getInt(cI(70, sem.a));
    }

    public final int D() {
        return getInt(cI(90, sem.a));
    }

    public final int E() {
        return getInt(cI(93, sem.a));
    }

    public final long F() {
        return getLong(cI(39, sem.a));
    }

    public final long G() {
        return getLong(cI(167, sem.a));
    }

    public final long H() {
        return getLong(cI(83, sem.a));
    }

    public final long I() {
        return getLong(cI(162, sem.a));
    }

    public final long J() {
        return getLong(cI(101, sem.a));
    }

    public final long K() {
        return getLong(cI(156, sem.a));
    }

    public final long L() {
        return getLong(cI(161, sem.a));
    }

    public final long M() {
        return getLong(cI(130, sem.a));
    }

    public final long N() {
        return getLong(cI(20, sem.a));
    }

    public final long O() {
        return getLong(cI(133, sem.a));
    }

    public final long P() {
        return getLong(cI(132, sem.a));
    }

    public final long Q() {
        return getLong(cI(21, sem.a));
    }

    public final long R() {
        return getLong(cI(34, sem.a));
    }

    public final long S() {
        return getLong(cI(150, sem.a));
    }

    public final long T() {
        return getLong(cI(168, sem.a));
    }

    public final long U() {
        return getLong(cI(8, sem.a));
    }

    public final long V() {
        return getLong(cI(77, sem.a));
    }

    public final long W() {
        return getLong(cI(46, sem.a));
    }

    public final long X() {
        return getLong(cI(26, sem.a));
    }

    public final long Y() {
        return getLong(cI(42, sem.a));
    }

    public final long Z() {
        return getLong(cI(6, sem.a));
    }

    public final rve aA() {
        return rve.a(getString(cI(28, sem.a)));
    }

    public final rxg aB() {
        return vcp.l(getString(cI(107, sem.a)));
    }

    public final tqc aC() {
        return tqc.a(getInt(cI(128, sem.a)));
    }

    public final tqf aD() {
        tqf[] values = tqf.values();
        int i = getInt(cI(56, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqh aE() {
        tqh[] values = tqh.values();
        int i = getInt(cI(115, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqp aF() {
        tqp[] values = tqp.values();
        int i = getInt(cI(60, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqp aG() {
        tqp[] values = tqp.values();
        int i = getInt(cI(61, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqr aH() {
        tqr[] values = tqr.values();
        int i = getInt(cI(98, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqr aI() {
        tqr[] values = tqr.values();
        int i = getInt(cI(30, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqu aJ() {
        tqu[] values = tqu.values();
        int i = getInt(cI(62, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final utj aK() {
        return utj.a(getString(cI(185, sem.a)));
    }

    public final utk aL() {
        utk[] values = utk.values();
        int i = getInt(cI(184, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final utk aM() {
        utk[] values = utk.values();
        int i = getInt(cI(65, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final vov aN() {
        return vov.b(getInt(cI(110, sem.a)));
    }

    public final vox aO() {
        return vox.b(getInt(cI(108, sem.a)));
    }

    public final vox aP() {
        return vox.b(getInt(cI(109, sem.a)));
    }

    public final vst aQ() {
        byte[] blob = getBlob(cI(181, sem.a));
        if (blob == null) {
            return null;
        }
        try {
            return (vst) apag.parseFrom(vst.a, blob, aozs.a());
        } catch (Throwable unused) {
            return vst.a;
        }
    }

    public final vtm aR() {
        return new vtm(getLong(cI(170, sem.a)));
    }

    public final vvh aS() {
        vvh[] values = vvh.values();
        int i = getInt(cI(182, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xhv aT() {
        return xhv.b(getLong(cI(113, sem.a)));
    }

    public final xxw aU() {
        xxw[] values = xxw.values();
        int i = getInt(cI(175, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xxw aV() {
        xxw[] values = xxw.values();
        int i = getInt(cI(55, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final xxw aW() {
        xxw[] values = xxw.values();
        int i = getInt(cI(105, sem.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final apwq aX() {
        byte[] blob = getBlob(cI(47, sem.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwq.a;
        }
    }

    public final Instant aY() {
        return uzz.l(getLong(cI(7, sem.a)));
    }

    public final Optional aZ() {
        return rvg.a(getString(cI(53, sem.a)));
    }

    public final long aa() {
        return getLong(cI(16, sem.a));
    }

    public final long ab() {
        return getLong(cI(129, sem.a));
    }

    public final long ac() {
        return getLong(cI(41, sem.a));
    }

    public final Uri ad() {
        String string = getString(cI(82, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ae() {
        String string = getString(cI(125, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri af() {
        String string = getString(cI(52, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ag() {
        String string = getString(cI(120, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ah() {
        String string = getString(cI(81, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ai() {
        String string = getString(cI(14, sem.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final mta aj() {
        return mta.b(getInt(cI(106, sem.a)));
    }

    public final ndp ak() {
        byte[] blob = getBlob(cI(111, sem.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ndp) apag.parseFrom(ndp.a, blob, aozs.a());
        } catch (Throwable unused) {
            return ndp.a;
        }
    }

    public final qpd al() {
        return qpd.b(getInt(cI(174, sem.a)));
    }

    public final qss am() {
        return qta.d(getString(cI(140, sem.a)));
    }

    public final qwe an() {
        return riw.m(getString(cI(139, sem.a)));
    }

    public final qwe ao() {
        return riw.m(getString(cI(25, sem.a)));
    }

    public final qwe ap() {
        return riw.m(getString(cI(68, sem.a)));
    }

    public final qwe aq() {
        return riw.m(getString(cI(69, sem.a)));
    }

    public final ConversationIdType ar() {
        return new ConversationIdType(getLong(cI(1, sem.a)));
    }

    public final ConversationIdType as() {
        return new ConversationIdType(getLong(cI(172, sem.a)));
    }

    public final ConversationIdType at() {
        return new ConversationIdType(getLong(cI(173, sem.a)));
    }

    public final ConversationIdType au() {
        return new ConversationIdType(getLong(cI(112, sem.a)));
    }

    public final ruz av() {
        return new ruz(getString(cI(64, sem.a)));
    }

    public final MessageIdType aw() {
        return new MessageIdType(getLong(cI(0, sem.a)));
    }

    public final MessageIdType ax() {
        return new MessageIdType(getLong(cI(117, sem.a)));
    }

    public final MessageIdType ay() {
        return new MessageIdType(getLong(cI(50, sem.a)));
    }

    public final rve az() {
        return rve.a(getString(cI(43, sem.a)));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new seh();
    }

    public final String bA() {
        return getString(cI(84, sem.a));
    }

    public final String bB() {
        return getString(cI(19, sem.a));
    }

    public final String bC() {
        return getString(cI(22, sem.a));
    }

    public final String bD() {
        return yta.a(getString(cI(17, sem.a)));
    }

    public final String bE() {
        return getString(cI(18, sem.a));
    }

    public final String bF() {
        return getString(cI(4, sem.a));
    }

    public final String bG() {
        return getString(cI(114, sem.a));
    }

    public final String bH() {
        return aabr.bb(getString(cI(72, sem.a)));
    }

    public final String bI() {
        return yta.a(getString(cI(158, sem.a)));
    }

    public final String bJ() {
        return getString(cI(148, sem.a));
    }

    public final String bK() {
        return getString(cI(135, sem.a));
    }

    public final String bL() {
        return getString(cI(143, sem.a));
    }

    public final String bM() {
        return getString(cI(137, sem.a));
    }

    public final String bN() {
        return yta.a(getString(cI(157, sem.a)));
    }

    public final String bO() {
        return getString(cI(147, sem.a));
    }

    public final String bP() {
        return getString(cI(134, sem.a));
    }

    public final String bQ() {
        return getString(cI(136, sem.a));
    }

    public final String bR() {
        return getString(cI(121, sem.a));
    }

    public final String bS() {
        return getString(cI(99, sem.a));
    }

    public final String bT() {
        return yyb.j(getString(cI(165, sem.a)));
    }

    public final String bU() {
        return getString(cI(164, sem.a));
    }

    public final String bV() {
        return getString(cI(176, sem.a));
    }

    public final String bW() {
        return getString(cI(33, sem.a));
    }

    public final String bX() {
        return getString(cI(5, sem.a));
    }

    public final String bY() {
        return getString(cI(78, sem.a));
    }

    public final String bZ() {
        return getString(cI(24, sem.a));
    }

    public final Optional ba() {
        return rvg.a(getString(cI(66, sem.a)));
    }

    public final Optional bb() {
        return uxi.g(getLong(cI(178, sem.a)));
    }

    public final Optional bc() {
        return uxi.g(getLong(cI(177, sem.a)));
    }

    public final String bd() {
        return getString(cI(94, sem.a));
    }

    public final String be() {
        return getString(cI(27, sem.a));
    }

    public final String bf() {
        return getString(cI(186, sem.a));
    }

    public final String bg() {
        return getString(cI(48, sem.a));
    }

    public final String bh() {
        return getString(cI(163, sem.a));
    }

    public final String bi() {
        return getString(cI(38, sem.a));
    }

    public final String bj() {
        return getString(cI(97, sem.a));
    }

    public final String bk() {
        return yta.a(getString(cI(75, sem.a)));
    }

    public final String bl() {
        return getString(cI(91, sem.a));
    }

    public final String bm() {
        return getString(cI(37, sem.a));
    }

    public final String bn() {
        return yta.a(getString(cI(76, sem.a)));
    }

    public final String bo() {
        return getString(cI(138, sem.a));
    }

    public final String bp() {
        return getString(cI(44, sem.a));
    }

    public final String bq() {
        return aabr.bb(getString(cI(74, sem.a)));
    }

    public final String br() {
        return getString(cI(126, sem.a));
    }

    public final String bs() {
        return yta.a(getString(cI(123, sem.a)));
    }

    public final String bt() {
        return yta.a(getString(cI(124, sem.a)));
    }

    public final String bu() {
        return getString(cI(104, sem.a));
    }

    public final String bv() {
        return yta.a(getString(cI(80, sem.a)));
    }

    public final String bw() {
        return yta.a(getString(cI(79, sem.a)));
    }

    public final String bx() {
        return getString(cI(49, sem.a));
    }

    public final String by() {
        return getString(cI(131, sem.a));
    }

    public final String bz() {
        return getString(cI(67, sem.a));
    }

    public final int c() {
        return getInt(cI(57, sem.a));
    }

    public final boolean cA() {
        if (getInt(cI(12, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cB() {
        if (getInt(cI(169, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cC() {
        if (getInt(cI(13, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cD() {
        if (getInt(cI(122, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cE() {
        if (getInt(cI(159, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] cF() {
        return getBlob(cI(45, sem.a));
    }

    public final byte[] cG() {
        return getBlob(cI(100, sem.a));
    }

    public final byte[] cH() {
        return getBlob(cI(166, sem.a));
    }

    public final String ca() {
        return aabr.bb(getString(cI(73, sem.a)));
    }

    public final String cb() {
        return getString(cI(2, sem.a));
    }

    public final String cc() {
        return getString(cI(3, sem.a));
    }

    public final String cd() {
        return getString(cI(36, sem.a));
    }

    public final String ce() {
        return getString(cI(146, sem.a));
    }

    public final String cf() {
        return yta.a(getString(cI(118, sem.a)));
    }

    public final String cg() {
        return yta.a(getString(cI(119, sem.a)));
    }

    public final String ch() {
        return getString(cI(89, sem.a));
    }

    public final String ci() {
        return getString(cI(116, sem.a));
    }

    public final String cj() {
        return getString(cI(40, sem.a));
    }

    public final atok ck() {
        byte[] blob = getBlob(cI(59, sem.a));
        if (blob == null) {
            return null;
        }
        try {
            return (atok) apag.parseFrom(atok.a, blob, aozs.a());
        } catch (Throwable unused) {
            return atok.a;
        }
    }

    public final boolean cl() {
        if (getInt(cI(171, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cm() {
        if (getInt(cI(51, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cn() {
        if (getInt(cI(88, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean co() {
        if (getInt(cI(58, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cp() {
        if (getInt(cI(179, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cq() {
        if (getInt(cI(155, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cr() {
        if (getInt(cI(145, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cs() {
        if (getInt(cI(102, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean ct() {
        if (getInt(cI(154, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cu() {
        if (getInt(cI(32, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cv() {
        if (getInt(cI(95, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cw() {
        if (getInt(cI(103, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cx() {
        if (getInt(cI(180, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cy() {
        if (getInt(cI(142, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean cz() {
        if (getInt(cI(144, sem.a)) == 1) {
            return true;
        }
        return false;
    }

    public final int e() {
        return getInt(cI(85, sem.a));
    }

    public final int f() {
        return getInt(cI(86, sem.a));
    }

    public final int g() {
        return getInt(cI(152, sem.a));
    }

    public final int h() {
        return getInt(cI(127, sem.a));
    }

    public final int i() {
        return getInt(cI(87, sem.a));
    }

    public final int j() {
        return getInt(cI(96, sem.a));
    }

    public final int k() {
        return getInt(cI(151, sem.a));
    }

    public final int l() {
        return getInt(cI(11, sem.a));
    }

    public final int m() {
        return getInt(cI(183, sem.a));
    }

    public final int n() {
        return getInt(cI(160, sem.a));
    }

    public final int o() {
        return getInt(cI(63, sem.a));
    }

    public final int p() {
        return getInt(cI(141, sem.a));
    }

    public final int q() {
        return getInt(cI(92, sem.a));
    }

    public final int r() {
        return getInt(cI(9, sem.a));
    }

    public final int s() {
        return getInt(cI(23, sem.a));
    }

    public final int t() {
        return getInt(cI(29, sem.a));
    }

    public final int u() {
        return getInt(cI(31, sem.a));
    }

    public final int v() {
        return getInt(cI(54, sem.a));
    }

    public final int w() {
        return getInt(cI(153, sem.a));
    }

    public final int x() {
        return getInt(cI(71, sem.a));
    }

    public final int y() {
        return getInt(cI(35, sem.a));
    }

    public final int z() {
        return getInt(cI(15, sem.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
