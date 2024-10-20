package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rry implements rtn, rwy {
    private boolean A;
    private boolean B;
    private boolean C;
    private voe D;
    private String E;
    private final ujx F;
    private final armf G;
    private final xvc H;
    private final uli I;
    private uqg J;
    private final iew K;
    public saz a;
    public MessagesTable.BindData b;
    public ParticipantsTable.BindData c;
    public tox d;
    public List e;
    public List f;
    public List g;
    public long h;
    public final ParticipantColor i;
    public final apwt j;
    public Optional k;
    public List l;
    public int m;
    public boolean n;
    public boolean o;
    public wks p;
    public boolean q;
    public RepliedToDataAdapter r;
    public final armf s;
    public final apwt t;
    public Long u;
    private final rtb v;
    private final rvx w;
    private final trz x;
    private final msk y;
    private final armf z;

    public rry(xvc xvcVar, rtb rtbVar, rvx rvxVar, trz trzVar, iew iewVar, msk mskVar, apwt apwtVar, armf armfVar, uli uliVar, ujx ujxVar, armf armfVar2, apwt apwtVar2, armf armfVar3) {
        int i = alog.d;
        this.l = alsx.a;
        this.m = 0;
        this.u = null;
        this.H = xvcVar;
        this.v = rtbVar;
        this.w = rvxVar;
        this.x = trzVar;
        this.K = iewVar;
        this.y = mskVar;
        this.j = apwtVar;
        this.z = armfVar;
        this.I = uliVar;
        this.J = uliVar.a(rvc.a, rve.a);
        this.F = ujxVar;
        this.s = armfVar2;
        this.t = apwtVar2;
        this.G = armfVar3;
        this.i = new ParticipantColor();
        this.k = Optional.empty();
        this.a = sbi.a().a();
        this.b = MessagesTable.b().a();
        this.c = ParticipantsTable.c().a();
    }

    public static boolean aG(int i) {
        if (i == 3) {
            return true;
        }
        return false;
    }

    public static boolean ba(sbd sbdVar) {
        if (d.y(sbdVar.r())) {
            return true;
        }
        return false;
    }

    private final MessagePartCoreData bd(ameb amebVar) {
        return w(amebVar, 0);
    }

    private final String be(Context context) {
        StringBuilder sb = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        for (MessagePartCoreData messagePartCoreData : this.e) {
            if (messagePartCoreData.aT()) {
                if (!z) {
                    str2 = messagePartCoreData.V();
                    z = true;
                } else {
                    if (sb == null) {
                        sb = new StringBuilder();
                        if (!TextUtils.isEmpty(str2)) {
                            sb.append(str2);
                        }
                        if (ap()) {
                            str = context.getResources().getString(R.string.notification_dash_separator);
                        } else {
                            str = " ";
                        }
                    }
                    String V = messagePartCoreData.V();
                    if (!TextUtils.isEmpty(V)) {
                        if (!TextUtils.isEmpty(str) && sb.length() > 0) {
                            sb.append(str);
                        }
                        sb.append(V);
                    }
                }
            }
        }
        if (sb == null) {
            return str2;
        }
        return sb.toString();
    }

    private final List bf(saz sazVar) {
        if (((Boolean) ((utz) ibx.a.get()).e()).booleanValue()) {
            List<MessagePartCoreData> bg = bg(sazVar.aK);
            alor alorVar = (alor) DesugarArrays.stream(sazVar.ce).collect(alls.a(new rrv(1), Function$CC.identity()));
            for (MessagePartCoreData messagePartCoreData : bg) {
                if (alorVar.containsKey(messagePartCoreData.Z())) {
                    messagePartCoreData.aI((VmtTable.BindData) alorVar.get(messagePartCoreData.Z()));
                }
            }
            return bg;
        }
        return bg(sazVar.aK);
    }

    private final List bg(PartsTable.BindData[] bindDataArr) {
        ArrayList arrayList = new ArrayList();
        for (PartsTable.BindData bindData : bindDataArr) {
            arrayList.add(this.v.g(bindData));
        }
        return arrayList;
    }

    private final void bh(saz sazVar) {
        rry rryVar;
        boolean z;
        String str;
        ParticipantColor participantColor;
        rry rryVar2 = this;
        bi();
        rryVar2.a = sazVar;
        rryVar2.b = sazVar.cD;
        Z();
        rryVar2.c = sazVar.bd;
        rryVar2.d = sazVar.bO;
        if (!sazVar.cA.f().b()) {
            lti.a(sazVar.cA);
        }
        rryVar2.e = bf(sazVar);
        rryVar2.f = new ArrayList();
        sdy sdyVar = sazVar.bl;
        String str2 = "index %d not in range 0 ... %d";
        int i = 2;
        if (sdyVar.f() != null) {
            for (int i2 = 0; i2 < sdyVar.f().length; i2++) {
                List list = rryVar2.f;
                long[] jArr = sdyVar.c;
                if (i2 < jArr.length) {
                    String valueOf = String.valueOf(jArr[i2]);
                    long[] jArr2 = sdyVar.d;
                    if (i2 < jArr2.length) {
                        long j = jArr2[i2];
                        long[] jArr3 = sdyVar.e;
                        if (i2 < jArr3.length) {
                            long j2 = jArr3[i2];
                            Optional[] optionalArr = sdyVar.f;
                            if (i2 < optionalArr.length) {
                                list.add(new rrx(valueOf, j, j2, optionalArr[i2]));
                            } else {
                                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(sdyVar.f.length)));
                            }
                        } else {
                            throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(sdyVar.e.length)));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(sdyVar.d.length)));
                    }
                } else {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(sdyVar.c.length)));
                }
            }
        }
        rryVar2.g = new ArrayList();
        toa toaVar = sazVar.bz;
        if (toaVar.f() != null) {
            int length = toaVar.f().length;
            int i3 = 0;
            while (i3 < length) {
                List list2 = rryVar2.g;
                long[] jArr4 = toaVar.b;
                if (i3 < jArr4.length) {
                    long j3 = jArr4[i3];
                    String[] strArr = toaVar.e;
                    if (i3 < strArr.length) {
                        String str3 = strArr[i3];
                        if (rryVar2.c.n() == 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        xvc xvcVar = rryVar2.H;
                        String[] strArr2 = toaVar.f;
                        if (i3 < strArr2.length) {
                            Uri d = rtw.d(strArr2[i3]);
                            String[] strArr3 = toaVar.g;
                            if (i3 < strArr3.length) {
                                String g = rtw.g(strArr3[i3]);
                                msk mskVar = rryVar2.y;
                                int i4 = length;
                                String[] strArr4 = toaVar.i;
                                if (i3 < strArr4.length) {
                                    msh n = mskVar.n(strArr4[i3]);
                                    toaVar.ao(9, "color_palette_index");
                                    int i5 = toaVar.j[i3];
                                    toaVar.ao(10, "color_type");
                                    int i6 = toaVar.k[i3];
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            participantColor = new ParticipantColor(0, i5, 0);
                                            str = str2;
                                        } else {
                                            toaVar.ao(11, "extended_color");
                                            str = str2;
                                            participantColor = new ParticipantColor(2, -1, toaVar.l[i3]);
                                        }
                                    } else {
                                        str = str2;
                                        participantColor = new ParticipantColor(1, i5, 0);
                                    }
                                    Uri w = xvcVar.w(d, g, n, participantColor);
                                    long[] jArr5 = toaVar.c;
                                    if (i3 < jArr5.length) {
                                        list2.add(new rtw(j3, str3, z, w, jArr5[i3]));
                                        i3++;
                                        rryVar2 = this;
                                        length = i4;
                                        str2 = str;
                                        i = 2;
                                    } else {
                                        throw new IndexOutOfBoundsException(String.format(str, Integer.valueOf(i3), Integer.valueOf(toaVar.c.length)));
                                    }
                                } else {
                                    throw new IndexOutOfBoundsException(String.format(str2, Integer.valueOf(i3), Integer.valueOf(toaVar.i.length)));
                                }
                            } else {
                                throw new IndexOutOfBoundsException(String.format(str2, Integer.valueOf(i3), Integer.valueOf(toaVar.g.length)));
                            }
                        } else {
                            Integer valueOf2 = Integer.valueOf(i3);
                            Integer valueOf3 = Integer.valueOf(toaVar.f.length);
                            Object[] objArr = new Object[i];
                            objArr[0] = valueOf2;
                            objArr[1] = valueOf3;
                            throw new IndexOutOfBoundsException(String.format(str2, objArr));
                        }
                    } else {
                        Integer valueOf4 = Integer.valueOf(i3);
                        Integer valueOf5 = Integer.valueOf(toaVar.e.length);
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = valueOf4;
                        objArr2[1] = valueOf5;
                        throw new IndexOutOfBoundsException(String.format(str2, objArr2));
                    }
                } else {
                    Integer valueOf6 = Integer.valueOf(i3);
                    Integer valueOf7 = Integer.valueOf(toaVar.b.length);
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = valueOf6;
                    objArr3[1] = valueOf7;
                    throw new IndexOutOfBoundsException(String.format(str2, objArr3));
                }
            }
        }
        ssi ssiVar = sazVar.bK;
        if (ssiVar.q() != null && ssiVar.h() > 0) {
            rryVar = this;
            rryVar.k = Optional.of(sazVar.bK);
        } else {
            rryVar = this;
        }
        sazVar.ao(145, "reactions_data");
        rryVar.p = sazVar.bV;
        sazVar.ao(147, "message_id");
        rryVar.q = !sazVar.bX.b();
        if (((Boolean) vof.a.e()).booleanValue()) {
            sazVar.ao(148, "sharing_state");
            rryVar.D = sazVar.bY;
        }
        if (!((Boolean) rryVar.G.b()).booleanValue() && !((Boolean) ((utz) yig.al.get()).e()).booleanValue()) {
            return;
        }
        sazVar.ao(176, "caption");
        rryVar.E = sazVar.cC;
    }

    private final void bi() {
        this.h = 0L;
        this.A = false;
        this.B = false;
        this.n = false;
        this.o = false;
        this.k = Optional.empty();
        this.p = null;
        this.r = null;
        int i = alog.d;
        this.l = alsx.a;
        this.b = MessagesTable.b().a();
        this.c = ParticipantsTable.c().a();
    }

    private final boolean bj(rry rryVar, boolean z) {
        if (!TextUtils.equals(this.b.P(), rryVar.b.P()) || au() != rryVar.au() || aR() || d.z(rryVar.f()) || Math.abs(i() - rryVar.i()) > 60000 || !TextUtils.equals(lga.Y(s()), lga.Y(rryVar.s())) || ap() || rryVar.ap() || z() != rryVar.z()) {
            return false;
        }
        if ((z && uvl.o(rryVar)) || rryVar.r != null) {
            return false;
        }
        return true;
    }

    private final List bk(sbd sbdVar) {
        return bf((saz) sbdVar.cK());
    }

    private final void bl(sbd sbdVar, boolean z) {
        boolean z2;
        bh((saz) sbdVar.cK());
        int i = 0;
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
            saz sazVar = this.a;
            String[] strArr = szu.a;
            if (sazVar.as("p2p_suggestions")) {
                this.l = (List) DesugarArrays.stream((szn[]) this.a.au("p2p_suggestions", new szn[0])).map(new rrv(i)).collect(Collectors.toCollection(new roi(5)));
            }
        }
        if (!z) {
            if (sbdVar.isFirst()) {
                this.A = false;
                this.n = true;
            } else if (sbdVar.moveToPrevious()) {
                this.A = bm(sbdVar, true);
                this.C = bn(sbdVar);
                if (Math.abs(i() - sbdVar.G()) >= 3600000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.n = z2;
                sbdVar.moveToNext();
            } else {
                this.A = false;
                this.n = false;
            }
            if (!sbdVar.isLast() && sbdVar.moveToNext()) {
                this.B = bm(sbdVar, false);
                sbdVar.moveToPrevious();
            } else {
                this.B = false;
            }
        }
        int i2 = say.a;
        if (!lbp.a()) {
            SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
        } else {
            d.t(sbdVar.dc("label_subquery_expression"), "ConversationMessagesQueries#getLabel: Conversation Labels enabled, but query did not include label expression");
            try {
                SuperSortLabel.a(Integer.parseInt(sbdVar.cX("label_subquery_expression")));
            } catch (NumberFormatException unused) {
                SuperSortLabel superSortLabel2 = SuperSortLabel.UNKNOWN;
            }
        }
        if (lbp.a() && lbp.b()) {
            d.t(sbdVar.dc("intent_subquery_expression"), "ConversationMessagesQueries#getIntent: Conversation Labels enabled, but query did not include intent expression");
            sbdVar.cX("intent_subquery_expression");
        }
        this.q = !sbdVar.S().b();
    }

    private final boolean bm(sbd sbdVar, boolean z) {
        boolean z2;
        if (!TextUtils.equals(this.b.P(), sbdVar.aU())) {
            return false;
        }
        int r = sbdVar.r();
        if (r < 100) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (au() != z2 || aR() || d.z(r) || Math.abs(i() - sbdVar.C()) > 60000) {
            return false;
        }
        if (TextUtils.equals(lga.Y(s()), sbdVar.aS()) && !ap()) {
            int l = sbdVar.l();
            if (!ba(sbdVar) || !aG(l) || !MessagePartData.bA(bk(sbdVar))) {
                int l2 = sbdVar.l();
                if ((ba(sbdVar) && aG(l2) && MessagePartData.bB(bk(sbdVar))) || z() != sbdVar.af()) {
                    return false;
                }
                if ((z && bn(sbdVar)) || !sbdVar.R().b()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean bn(sbd sbdVar) {
        wks aj = sbdVar.aj();
        if ((aj != null && !aj.b.isEmpty()) || sbdVar.S().a > 0) {
            return true;
        }
        return false;
    }

    public final voe A() {
        if (!((Boolean) vof.a.e()).booleanValue()) {
            return null;
        }
        return this.D;
    }

    public final Optional B() {
        return Optional.ofNullable(this.b.S()).map(new rqr(20));
    }

    public final String C() {
        if (!((Boolean) this.G.b()).booleanValue() && !((Boolean) ((utz) yig.al.get()).e()).booleanValue()) {
            return null;
        }
        return this.E;
    }

    public final String D() {
        return this.b.M();
    }

    public final String E() {
        return this.b.N();
    }

    public final String F() {
        return this.b.P();
    }

    public final String G(Context context) {
        if (this.g != null) {
            return rtw.e(context.getResources(), this.g, this.b.O());
        }
        return "";
    }

    public final String H() {
        saz sazVar = this.a;
        sazVar.ao(142, "rcs_group_id");
        return sazVar.bS;
    }

    public final String I() {
        return this.c.N();
    }

    @Deprecated
    public final String J() {
        return this.c.J();
    }

    public final String K(boolean z) {
        String M = M();
        if (z && !TextUtils.isEmpty(M)) {
            return M;
        }
        String L = L();
        if (!TextUtils.isEmpty(L)) {
            return L;
        }
        if (!z && !TextUtils.isEmpty(M)) {
            return M;
        }
        if (((Boolean) this.s.b()).booleanValue()) {
            String g = this.a.g();
            if (!TextUtils.isEmpty(g)) {
                return String.valueOf(aZ()) + " " + vom.b(g);
            }
        }
        return J();
    }

    public final String L() {
        return this.c.K();
    }

    public final String M() {
        return this.c.L();
    }

    @Override // defpackage.rtn
    public final String N() {
        return this.c.O();
    }

    public final String O() {
        return this.b.Q();
    }

    public final String P() {
        Uri y = this.b.y();
        if (y == null) {
            return null;
        }
        return y.toString();
    }

    @Override // defpackage.rtn
    public final String Q(Context context) {
        String str;
        if (this.g != null && aR()) {
            if (ujx.f(f())) {
                str = be(context);
            } else {
                str = null;
            }
            return this.F.d(this.g, f(), false, this.b.O(), this.b.P(), K(false), str, context);
        }
        String be = be(context);
        if (this.x.n() && MessageData.bY(f())) {
            return context.getResources().getString(this.K.j());
        }
        return be;
    }

    public final String R() {
        return this.d.m();
    }

    public final String S() {
        return this.b.R();
    }

    public final List T() {
        return U(null);
    }

    public final List U(Predicate predicate) {
        boolean test;
        List<MessagePartCoreData> list = this.e;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MessagePartCoreData messagePartCoreData : list) {
                if (messagePartCoreData.aV()) {
                    if (predicate != null) {
                        test = predicate.test(messagePartCoreData);
                        if (test) {
                        }
                    }
                    arrayList.add(messagePartCoreData);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final List V() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (rrx rrxVar : this.f) {
            if (rrxVar.d.isPresent()) {
                arrayList.add(rrxVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.rwy
    public final List W() {
        return this.e;
    }

    public final List X() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (rrx rrxVar : this.f) {
            if (rrxVar.c != 0) {
                arrayList.add(rrxVar);
            }
        }
        return arrayList;
    }

    public final List Y() {
        MessagePartCoreData bd = bd(ameb.RICH_CARD);
        if (bd == null) {
            bd = bd(ameb.RICH_CARD_CAROUSEL);
        }
        if (bd != null && RbmSpecificMessage.CONTENT_TYPE.equals(bd.U())) {
            RichCardContainer parse = new RichCardParser(bd.ad()).parse();
            if (parse == null) {
                return Collections.emptyList();
            }
            return parse.getGeneralPurposeCards();
        }
        return Collections.emptyList();
    }

    public final void Z() {
        this.J = this.I.a(this.b.A(), this.b.D());
    }

    public final int a(rry rryVar) {
        int compare = Long.compare(i(), rryVar.i());
        if (compare == 0) {
            return Long.compare(u().a, rryVar.u().a);
        }
        return compare;
    }

    public final boolean aA(rry rryVar) {
        if (a(rryVar) < 0) {
            return true;
        }
        return false;
    }

    public final boolean aB() {
        int f = f();
        int l = this.b.l();
        int c = c();
        if ((f == 8 || f == 19) && l == 0 && rvx.a(c)) {
            return true;
        }
        return false;
    }

    public final boolean aC() {
        int f;
        if (this.b == null || (f = f()) <= 0 || f > 22) {
            return false;
        }
        return true;
    }

    public final boolean aD() {
        if (f() == 18) {
            return true;
        }
        return false;
    }

    public final boolean aE() {
        if (an()) {
            return true;
        }
        for (MessagePartCoreData messagePartCoreData : this.e) {
            if (messagePartCoreData.aV() && (messagePartCoreData.x() != null || messagePartCoreData.t() != null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean aF() {
        return aG(this.b.k());
    }

    public final boolean aH() {
        if (d.y(f()) && aG(this.b.k())) {
            return MessagePartData.bA(this.e);
        }
        return false;
    }

    public final boolean aI() {
        if (d.y(f()) && aG(this.b.k())) {
            return MessagePartData.bB(this.e);
        }
        return false;
    }

    public final boolean aJ() {
        if (f() == 16) {
            return true;
        }
        return false;
    }

    public final boolean aK() {
        if (((Boolean) new mst(14).get()).booleanValue()) {
            return r().A();
        }
        if (au() && aF() && agkx.ad(N())) {
            return true;
        }
        return false;
    }

    public final boolean aL() {
        return this.c.T();
    }

    public final boolean aM() {
        return rvx.p(f());
    }

    public final boolean aN() {
        return rvx.v(f());
    }

    public final boolean aO() {
        List list = this.e;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.e.get(0)).bk();
    }

    public final boolean aP() {
        List list = this.e;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.e.get(0)).bz();
    }

    public final boolean aQ() {
        return rvx.z(this.b.k());
    }

    public final boolean aR() {
        return d.z(this.b.q());
    }

    public final boolean aS() {
        return ujy.a(this.b.q());
    }

    public final boolean aT() {
        boolean z;
        if (((Boolean) vye.a.e()).booleanValue() && rvx.r(f())) {
            z = true;
        } else {
            z = false;
        }
        boolean u = rvx.u(f());
        if (!aF()) {
            return false;
        }
        if (MessageData.cF(f()) || rvx.p(f()) || rvx.q(f()) || z) {
            return true;
        }
        if (!u) {
            return false;
        }
        return true;
    }

    public final boolean aU() {
        if (this.b.p() == 130) {
            return true;
        }
        return false;
    }

    public final boolean aV() {
        int f = f();
        if ((f == 8 || f == 19) && this.b.l() == 10004 && aF()) {
            return true;
        }
        return false;
    }

    public final boolean aW() {
        if (!((Boolean) ytk.c.e()).booleanValue() && !this.o) {
            return true;
        }
        return false;
    }

    public final boolean aX(rry rryVar) {
        boolean z;
        boolean z2 = this.B;
        if (rryVar != null) {
            z = bj(rryVar, false);
            this.B = z;
        } else {
            this.B = false;
            z = false;
        }
        if (z2 == z) {
            return false;
        }
        return true;
    }

    public final boolean aY(rry rryVar) {
        boolean z;
        boolean z2 = this.A;
        boolean z3 = this.C;
        boolean z4 = this.n;
        if (rryVar == null) {
            this.C = false;
            this.A = false;
            this.n = true;
        } else {
            this.C = uvl.o(rryVar);
            this.A = bj(rryVar, true);
            if (Math.abs(i() - rryVar.i()) >= 3600000) {
                z = true;
            } else {
                z = false;
            }
            this.n = z;
        }
        if (((Boolean) this.z.b()).booleanValue()) {
            if (z2 == this.A && z3 == this.C && z4 == this.n) {
                return false;
            }
            return true;
        }
        if (z2 == this.A && z4 == this.n) {
            return false;
        }
        return true;
    }

    public final msf aZ() {
        return this.y.o(this.c).F();
    }

    public final boolean aa() {
        if (!ay() && !uvl.o(this) && this.r == null) {
            return this.B;
        }
        return false;
    }

    public final boolean ab() {
        if (!ay() && this.r == null) {
            return this.A;
        }
        return false;
    }

    public final boolean ac() {
        if (aj()) {
            return false;
        }
        if (!rvx.v(f()) && !rvx.h(f())) {
            return false;
        }
        return true;
    }

    public final boolean ad(Context context) {
        if (!aj() && this.w.b(context, f())) {
            return true;
        }
        return false;
    }

    public final boolean ae() {
        if (this.a.f() == 0 && !this.a.i()) {
            rvx rvxVar = this.w;
            int k = this.b.k();
            int f = f();
            long v = this.b.v();
            boolean j = this.a.j();
            if (rvx.y(k) && rvx.q(f) && v <= rvxVar.d.f().toEpochMilli() - ((Long) ncu.b.e()).longValue() && j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean af() {
        if (this.a.f() == 0 && !this.a.i()) {
            rvx rvxVar = this.w;
            int k = this.b.k();
            int f = f();
            long v = this.b.v();
            if (rvx.y(k) && rvx.p(f) && v <= rvxVar.d.f().toEpochMilli() - ((Long) ncu.a.e()).longValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean ag() {
        voe A = A();
        if ((!((Boolean) vof.a.e()).booleanValue() || A == null || A.b != 104) && !aj()) {
            rvx rvxVar = this.w;
            int f = f();
            int c = c();
            if ((d() != 10003 || c != 1) && ((f == 8 || f == 19 || f == 12 || (rvx.x(f) && rvxVar.c.q())) && rvx.a(c))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ah(Context context) {
        int c = c();
        if (c != 0) {
            if (c != 2) {
                if (c == 3) {
                    saz sazVar = this.a;
                    sazVar.ao(146, "transfer_id");
                    if (sazVar.bW != null) {
                        if (!MessageData.cx(f()) && g() > 0) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else if (h() != -1) {
            if (!MessageData.cx(f()) && g() > 0) {
                return false;
            }
        } else {
            return false;
        }
        return this.w.c(context, f());
    }

    public final boolean ai() {
        if (aF() && b() == 0 && !as()) {
            return true;
        }
        return false;
    }

    public final boolean aj() {
        return Collection.EL.stream(this.e).anyMatch(new qxi(11));
    }

    public final boolean ak() {
        return MessageData.ca(this.e);
    }

    public final boolean al() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean am() {
        if (!aw()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                if (((MessagePartCoreData) it.next()).aT()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean an() {
        return rvx.h(f());
    }

    public final boolean ao() {
        return rvx.i(f());
    }

    public final boolean ap() {
        if (!aH() && !aI()) {
            return false;
        }
        return true;
    }

    public final boolean aq() {
        if (this.b.m() == 2) {
            return true;
        }
        return false;
    }

    public final boolean ar() {
        return MessageData.bY(f());
    }

    public final boolean as() {
        return this.a.i();
    }

    public final boolean at() {
        return this.b.T();
    }

    @Override // defpackage.rtn
    public final boolean au() {
        if (this.b == null) {
            return false;
        }
        return d.y(f());
    }

    public final boolean av() {
        return d.A(this.b.k());
    }

    public final boolean aw() {
        if (this.b.k() == 2) {
            return true;
        }
        return false;
    }

    public final boolean ax(rry rryVar) {
        if (a(rryVar) > 0) {
            return true;
        }
        return false;
    }

    public final boolean ay() {
        int f = f();
        alwo alwoVar = MessageData.a;
        if (f == 14) {
            return true;
        }
        return false;
    }

    public final boolean az() {
        if (au() && !an()) {
            return true;
        }
        return false;
    }

    public final int b() {
        return this.a.f();
    }

    public final String bb(znj znjVar) {
        return znjVar.y(i()).toString();
    }

    public final String bc(znj znjVar) {
        return znjVar.B(i(), false, false, true).toString();
    }

    @Override // defpackage.rtn
    public final int c() {
        return this.b.k();
    }

    public final int d() {
        return this.b.l();
    }

    public final int e() {
        return this.b.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rry)) {
            return false;
        }
        rry rryVar = (rry) obj;
        if (this.a.equals(rrw.a) && rryVar.a.equals(rrw.a)) {
            return this.b.equals(rryVar.b);
        }
        return this.a.equals(rryVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [alhr, java.lang.Object] */
    public final int f() {
        Integer num;
        uqg uqgVar = this.J;
        int q = this.b.q();
        if (((rvf) uqgVar.d).k()) {
            num = (Integer) uqgVar.c.get();
        } else if (!((MessageIdType) uqgVar.a).b()) {
            num = (Integer) uqgVar.b.get();
        } else {
            num = null;
        }
        if (num == null || ((num.intValue() != 1 && num.intValue() != 2) || (num.intValue() <= q && q != 4 && q != 5 && q != 6 && q != 7))) {
            return q;
        }
        return num.intValue();
    }

    public final long g() {
        return this.b.r();
    }

    public final long h() {
        return this.b.s();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final long i() {
        return this.b.t();
    }

    public final long j() {
        return this.c.s();
    }

    public final long k() {
        return this.b.v();
    }

    public final long l() {
        return this.b.w();
    }

    public final long m() {
        List list = this.e;
        long j = 0;
        if (list == null) {
            return 0L;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j += ((MessagePartCoreData) it.next()).p();
        }
        return j;
    }

    @Override // defpackage.rtn
    public final long n() {
        return this.b.x();
    }

    public final Uri o() {
        ParticipantsTable.BindData bindData;
        if (((Boolean) this.s.b()).booleanValue() && (bindData = this.c) != null) {
            bindData.C();
        }
        return this.H.s(q(), M(), r(), this.i, aK(), aL(), this.c.R());
    }

    public final Uri p() {
        long j = j();
        String I = I();
        if (j > -1 && !TextUtils.isEmpty(I)) {
            return ContactsContract.Contacts.getLookupUri(j, I);
        }
        return null;
    }

    public final Uri q() {
        return this.c.v();
    }

    public final msh r() {
        return this.y.q(this.c);
    }

    public final SelfIdentityId s() {
        return lga.W(this.b.O());
    }

    @Override // defpackage.rtn
    public final ConversationIdType t() {
        return this.b.z();
    }

    public final String toString() {
        return MessageData.aB(this.b.A(), this.b.k(), this.e);
    }

    public final MessageIdType u() {
        return this.b.A();
    }

    public final rve v() {
        return this.b.D();
    }

    public final MessagePartCoreData w(ameb amebVar, int i) {
        List<MessagePartCoreData> list = this.e;
        if (list != null && i >= 0) {
            for (MessagePartCoreData messagePartCoreData : list) {
                if (messagePartCoreData.M() == amebVar && messagePartCoreData.a() == i) {
                    return messagePartCoreData;
                }
            }
        }
        return null;
    }

    public final MessagePartCoreData x(int i) {
        return w(ameb.RICH_CARD_MEDIA, i);
    }

    public final tqr y() {
        return this.c.A();
    }

    public final tqr z() {
        return this.b.H();
    }

    public rry(xvc xvcVar, rtb rtbVar, rvx rvxVar, trz trzVar, iew iewVar, msk mskVar, apwt apwtVar, armf armfVar, uli uliVar, ujx ujxVar, armf armfVar2, apwt apwtVar2, armf armfVar3, MessageCoreData messageCoreData) {
        this(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, apwtVar, armfVar, uliVar, ujxVar, armfVar2, apwtVar2, armfVar3);
        bi();
        this.b = messageCoreData.I();
        this.e = ((MessageData) messageCoreData).i;
        this.J = uliVar.a(messageCoreData.B(), this.b.D());
    }

    public rry(xvc xvcVar, rtb rtbVar, rvx rvxVar, trz trzVar, iew iewVar, msk mskVar, apwt apwtVar, armf armfVar, uli uliVar, ujx ujxVar, armf armfVar2, apwt apwtVar2, armf armfVar3, saz sazVar) {
        this(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, apwtVar, armfVar, uliVar, ujxVar, armfVar2, apwtVar2, armfVar3);
        bh(sazVar);
    }

    public rry(xvc xvcVar, rtb rtbVar, rvx rvxVar, trz trzVar, iew iewVar, msk mskVar, apwt apwtVar, armf armfVar, uli uliVar, ujx ujxVar, armf armfVar2, apwt apwtVar2, armf armfVar3, sbd sbdVar) {
        this(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, apwtVar, armfVar, uliVar, ujxVar, armfVar2, apwtVar2, armfVar3);
        bl(sbdVar, false);
    }

    public rry(xvc xvcVar, rtb rtbVar, rvx rvxVar, trz trzVar, iew iewVar, msk mskVar, apwt apwtVar, armf armfVar, uli uliVar, ujx ujxVar, armf armfVar2, apwt apwtVar2, armf armfVar3, sbd sbdVar, byte[] bArr) {
        this(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, apwtVar, armfVar, uliVar, ujxVar, armfVar2, apwtVar2, armfVar3);
        bl(sbdVar, true);
    }
}
