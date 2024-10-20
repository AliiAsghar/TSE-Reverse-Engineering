package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xja {
    public final armf A;
    public final alhr B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final xii F;
    public final armf G;
    private final agnq J;
    private final armf K;
    private final armf L;
    private final armf M;
    private final wyp N;
    private final armf O;
    private final tqx P;
    private final armf Q;
    private final armf R;
    private final armf S;
    private final armf T;
    private final alhr U;
    private final armf V;
    private final armf W;
    private final armf X;
    private final armf Y;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final Set i;
    public final Set k;
    public final armf l;
    public final armf m;
    public final wnq n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final wzs u;
    public final xae v;
    public final uhj w;
    public final armf x;
    public final armf y;
    public final armf z;
    public static final xze a = xze.g("Bugle", "SyncMessageBatch");
    private static final alwo H = alwo.o("Bugle");
    public static final uuf b = uuh.q(132812332);
    static final alhr c = uuh.w("log_duplicate_rcs_message_id_event_in_sync_message_batch");
    public final HashSet d = new HashSet();
    private final vl I = new vl();
    public final HashSet j = new HashSet();

    public xja(wnq wnqVar, wyp wypVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, wzs wzsVar, xae xaeVar, uhj uhjVar, armf armfVar7, tqx tqxVar, agnq agnqVar, armf armfVar8, yjf yjfVar, yjy yjyVar, armf armfVar9, armf armfVar10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Set set, Set set2, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, xii xiiVar, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28) {
        this.n = wnqVar;
        this.N = wypVar;
        this.o = armfVar;
        this.p = armfVar2;
        this.r = armfVar4;
        this.q = armfVar3;
        this.s = armfVar5;
        this.t = armfVar6;
        this.u = wzsVar;
        this.v = xaeVar;
        this.w = uhjVar;
        this.O = armfVar7;
        this.P = tqxVar;
        this.J = agnqVar;
        this.K = armfVar8;
        this.Q = armfVar9;
        this.x = armfVar10;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = arrayList4;
        this.i = set;
        this.k = set2;
        this.L = armfVar11;
        this.l = armfVar12;
        this.M = armfVar14;
        this.R = armfVar15;
        if (((ogn) armfVar19.b()).a()) {
            this.y = xiiVar.a;
        } else {
            this.y = armfVar13;
        }
        this.S = armfVar16;
        this.z = armfVar17;
        this.m = armfVar18;
        this.A = armfVar19;
        this.D = armfVar20;
        this.V = armfVar21;
        this.F = xiiVar;
        this.E = armfVar23;
        this.C = armfVar22;
        this.T = armfVar24;
        this.W = armfVar25;
        this.X = armfVar26;
        this.Y = armfVar27;
        this.G = armfVar28;
        this.U = albo.D(new ubu(yjfVar, yjyVar, 19));
        this.B = albo.D(new vvk(yjyVar, 9));
    }

    public static boolean g(Map map, wye wyeVar) {
        return Boolean.TRUE.equals(map.get(wyeVar.a));
    }

    public static xjn h(xjn xjnVar) {
        if (xjnVar == null) {
            return new xjn(tqc.ARCHIVED, false, false, "", 0, -1L);
        }
        return new xjn(tqc.ARCHIVED, xjnVar.b, xjnVar.c, xjnVar.d, xjnVar.e, xjnVar.f);
    }

    private final SelfIdentityId i(final int i) {
        if (((ogn) this.A.b()).a()) {
            xii xiiVar = this.F;
            armf armfVar = new armf() { // from class: xiy
                @Override // defpackage.armf, defpackage.arme
                public final Object b() {
                    return ((rxq) xja.this.o.b()).g(rxn.d(i));
                }
            };
            return lga.V((String) xii.d(xiiVar, xiiVar.c, Integer.valueOf(i), armfVar, "selfDestinationCache", null, null, 48));
        }
        return lga.V(((rxq) this.o.b()).g(rxn.d(i)));
    }

    private final ConversationIdType j(wye wyeVar) {
        return k(wyeVar, false);
    }

    private final ConversationIdType k(wye wyeVar, boolean z) {
        long j = wyeVar.i;
        int i = wyeVar.q;
        xjn c2 = c(j);
        String str = wyeVar.a;
        albo.C(str);
        return this.v.d(j, i, c2, str, tqc.b(false), z);
    }

    private final String l(int i, msh mshVar) {
        tap k;
        String m = mshVar.m();
        m.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) this.I.get(m);
        if (bindData == null) {
            if (((Boolean) new mss(18).get()).booleanValue()) {
                k = rxn.h(i, mshVar);
            } else {
                k = rxn.k(i, m);
            }
            ((rxq) this.o.b()).i(k, true);
            vl vlVar = this.I;
            bindData = k.a();
            vlVar.put(m, bindData);
        }
        return bindData.M();
    }

    private final String m(final int i, final String str) {
        armf armfVar = new armf() { // from class: xiw
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                tap k = rxn.k(i, str);
                ((rxq) xja.this.o.b()).i(k, true);
                return k.a().M();
            }
        };
        str.getClass();
        String str2 = i + "::" + str;
        xii xiiVar = this.F;
        return (String) xii.d(xiiVar, xiiVar.d, str2, armfVar, "participantCache", new wyk(xiiVar, 8), null, 32);
    }

    private final void n(int i) {
        ((mbl) this.X.b()).e("Bugle.Telephony.ForwardSync.SyncMessageBatch.ThirdPartyOrLegacyMessageCount", i);
    }

    private static boolean o(vre vreVar) {
        if (vreVar.e.isPresent() && (((vqb) vreVar.e.get()).b & 1) != 0) {
            return true;
        }
        return false;
    }

    public final msh a(xhv xhvVar) {
        List I = this.u.I(albo.ag(this.u.G(xhvVar)));
        if (I.size() != 1) {
            xyo e = a.e();
            e.H("Thread ID had an SMS message but had 0 or multiple recipients");
            e.z("threadId", xhvVar);
            e.x("recipients.size()", I.size());
            e.q();
        }
        return (msh) Collection.EL.stream(I).findFirst().orElseGet(new wxx(this, 3));
    }

    public final ConversationIdType b(wyh wyhVar) {
        msh a2;
        msh mshVar = wyhVar.c;
        if (mshVar != null && !mshVar.D()) {
            a2 = wyhVar.c;
        } else {
            xhv xhvVar = new xhv(wyhVar.i);
            if (((ogn) this.A.b()).a()) {
                xii xiiVar = this.F;
                a2 = (msh) xii.d(xiiVar, xiiVar.e, xhvVar, new vhf(this, xhvVar, 5, null), "firstRecipientForThreadCache", null, new wyk(xiiVar, 4), 16);
            } else {
                a2 = a(xhvVar);
            }
        }
        ((Boolean) new mst(15).get()).booleanValue();
        a2.o(false);
        return ((qpj) this.L.b()).a(a2, new rfj(this, wyhVar, a2, 3)).x();
    }

    public final xjn c(long j) {
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            Object obj = ((xjo) this.R.b()).a;
            if (obj != null) {
                return (xjn) ((uj) obj).d(j);
            }
            return null;
        }
        return ((wzp) this.K.b()).b(j);
    }

    public final void d(wyh wyhVar, boolean z) {
        ConversationIdType d;
        String l;
        String str;
        msh mshVar = wyhVar.c;
        if (mshVar == null || mshVar.w()) {
            a.q("SMS has no address; using unknown sender");
            wyhVar.c = ((msk) this.y.b()).f();
            ((mbl) this.x.b()).c("Bugle.Telephony.ForwardSync.EmptySmsAddress");
        }
        if (((Boolean) qpf.a.e()).booleanValue()) {
            if (((ogn) this.A.b()).a() && (str = wyhVar.d) != null) {
                xii xiiVar = this.F;
                vhf vhfVar = new vhf(this, wyhVar, 4, null);
                alog r = alog.r(str);
                r.getClass();
                String alnuVar = r.toString();
                alnuVar.getClass();
                arsb arsbVar = new arsb();
                d = (ConversationIdType) xii.d(xiiVar, xiiVar.b, alnuVar, new xiz(arsbVar, r, xiiVar, vhfVar, 1), "conversationIdCache-unsorted", new wyk(xiiVar, 7), null, 32);
                String str2 = (String) arsbVar.a;
                if (str2 != null) {
                }
            } else {
                d = b(wyhVar);
            }
        } else {
            xae xaeVar = this.v;
            long j = wyhVar.i;
            d = xaeVar.d(j, wyhVar.m, c(j), wyhVar.b, tqc.b(false), false);
        }
        if (!d.b()) {
            int i = wyhVar.m;
            SelfIdentityId i2 = i(i);
            if (z) {
                l = ((SelfIdentityIdImpl) i2).a;
            } else if (((ogn) this.A.b()).a() && !ytd.h(wyhVar.d)) {
                l = m(i, wyhVar.d);
            } else {
                l = l(i, wyhVar.c);
            }
            MessageCoreData l2 = this.P.l(wyhVar.b, l, i2, d, xca.b(z, wyhVar.h, wyhVar.j), wyhVar.l, wyhVar.k, wyhVar.g, wyhVar.f, wyhVar.e);
            try {
                ((rvw) this.Q.b()).d(l2, true, Optional.ofNullable((String) this.U.get()));
            } catch (SQLiteConstraintException unused) {
            }
            xyo d2 = a.d();
            d2.H("Inserted new SMS message.");
            d2.c(l2.B());
            d2.z("smsMessageUri", l2.t());
            d2.y("receivedTimeStamp", l2.n());
            d2.q();
            this.d.add(d);
            return;
        }
        xyo b2 = a.b();
        b2.H("Failed to create conversation for SMS thread");
        b2.G(wyhVar.i);
        b2.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0610  */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.wye r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xja.e(wye, boolean):void");
    }

    public final void f() {
        HashMap hashMap;
        boolean z;
        akrh e = aktp.e("SyncMessageBatch#updateLocalDatabase");
        try {
            ahqq d = ((ahqr) this.V.b()).d();
            ahqp ahqpVar = ahqp.ERROR;
            try {
                xze xzeVar = a;
                xyo c2 = xzeVar.c();
                c2.H("synchronizing.");
                c2.N("threadsToMerge", this.k);
                c2.N("smsToAdd", this.e);
                c2.N("mmsToAdd", this.f);
                c2.N("messagesToDelete", this.h);
                c2.q();
                if (xzeVar.s(2)) {
                    ArrayList arrayList = this.h;
                    int i = 0;
                    for (int size = arrayList.size(); i < size; size = size) {
                        wyc wycVar = (wyc) arrayList.get(i);
                        xyo d2 = a.d();
                        d2.H("Deleted message.");
                        d2.z("localId", wycVar.d);
                        d2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wycVar.b);
                        d2.y("timestamp", wycVar.c);
                        d2.q();
                        i++;
                    }
                }
                final HashMap hashMap2 = new HashMap();
                ArrayList arrayList2 = this.f;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    wye wyeVar = (wye) arrayList2.get(i2);
                    String str = wyeVar.a;
                    if (str != null) {
                        if (TextUtils.isEmpty(wyeVar.o)) {
                            hashMap = hashMap2;
                            if (this.v.a(wxr.a, wyeVar.i, str).h != null) {
                                z = true;
                                hashMap2 = hashMap;
                                hashMap2.put(str, Boolean.valueOf(z));
                            }
                        } else {
                            hashMap = hashMap2;
                        }
                        z = false;
                        hashMap2 = hashMap;
                        hashMap2.put(str, Boolean.valueOf(z));
                    }
                }
                this.J.e("SyncMessageBatch#updateLocalDatabase", new Runnable() { // from class: xiv
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map;
                        boolean z2;
                        akrh e2;
                        akrh e3;
                        String str2;
                        vqd vqdVar;
                        String str3;
                        vqd vqdVar2;
                        xja xjaVar = xja.this;
                        for (xio xioVar : xjaVar.k) {
                            long j = xioVar.a;
                            xaz xazVar = xioVar.b;
                            ConversationIdType l = ((rtz) xjaVar.p.b()).l(j);
                            tqc r = ((rtz) xjaVar.p.b()).r(l);
                            if (r == null) {
                                r = tqc.UNARCHIVED;
                            }
                            tqc tqcVar = r;
                            ConversationIdType conversationIdType = ruy.a;
                            try {
                                conversationIdType = ((ibi) xjaVar.s.b()).i(wym.a, xazVar, tqcVar, -1).a;
                            } catch (xba e4) {
                                xja.a.n("Mismatched threads", e4);
                            }
                            xjaVar.u.Y(j, xazVar.a);
                            if (!l.b()) {
                                xyo e5 = xja.a.e();
                                e5.H("Moving messages from");
                                e5.b(l);
                                e5.H("to");
                                e5.b(conversationIdType);
                                e5.q();
                                ((lru) xjaVar.r.b()).l(l, conversationIdType, tqcVar);
                            }
                            xjaVar.d.add(conversationIdType);
                        }
                        ArrayList arrayList3 = xjaVar.e;
                        int size3 = arrayList3.size();
                        int i3 = 0;
                        while (true) {
                            boolean z3 = true;
                            if (i3 >= size3) {
                                break;
                            }
                            wyh wyhVar = (wyh) arrayList3.get(i3);
                            if (wyhVar.e == null) {
                                xyo e6 = xja.a.e();
                                e6.H("SMS message has no body; add empty one.");
                                e6.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wyhVar.b);
                                e6.q();
                                wyhVar.e = "";
                            }
                            if (wyhVar.h == 1) {
                                z3 = false;
                            }
                            if (wyhVar.b != null && !z3) {
                                wnq wnqVar = xjaVar.n;
                                String str4 = wyhVar.e;
                                if (!TextUtils.isEmpty(str4)) {
                                    alog alogVar = wnqVar.b;
                                    int size4 = alogVar.size();
                                    int i4 = 0;
                                    while (i4 < size4) {
                                        boolean f = ((wnp) alogVar.get(i4)).f(str4);
                                        i4++;
                                        if (f) {
                                            xjaVar.u.a(Uri.parse(wyhVar.b), "Bugle.Telephony.Delete.Message.Latency");
                                            String str5 = wyhVar.b;
                                            int a2 = xjaVar.u.a(Uri.parse(str5), "Bugle.Telephony.Delete.Message.Latency");
                                            xyo c3 = xja.a.c();
                                            c3.H("Ignored SMS message deleted.");
                                            c3.x("count", a2);
                                            c3.z("messageUri", str5);
                                            c3.q();
                                            break;
                                        }
                                    }
                                }
                                xjaVar.d(wyhVar, false);
                            } else {
                                xjaVar.d(wyhVar, z3);
                            }
                            i3++;
                        }
                        for (xin xinVar : xjaVar.i) {
                            wyc wycVar2 = xinVar.a;
                            String d3 = xinVar.b.d();
                            if (!albo.ah(d3)) {
                                sya syaVar = new sya();
                                syaVar.aj("associateMessages");
                                syaVar.K(Uri.parse(d3));
                                syc sycVar = new syc();
                                sycVar.i(wycVar2.d);
                                syaVar.O(sycVar);
                                syaVar.a().e();
                            }
                        }
                        ArrayList arrayList4 = xjaVar.g;
                        int size5 = arrayList4.size();
                        int i5 = 0;
                        while (true) {
                            map = hashMap2;
                            if (i5 >= size5) {
                                break;
                            }
                            wye wyeVar2 = (wye) arrayList4.get(i5);
                            xjaVar.e(wyeVar2, xja.g(map, wyeVar2));
                            i5++;
                        }
                        ArrayList arrayList5 = xjaVar.f;
                        int size6 = arrayList5.size();
                        for (int i6 = 0; i6 < size6; i6++) {
                            wye wyeVar3 = (wye) arrayList5.get(i6);
                            xjaVar.e(wyeVar3, xja.g(map, wyeVar3));
                        }
                        ArrayList arrayList6 = xjaVar.h;
                        int size7 = arrayList6.size();
                        for (int i7 = 0; i7 < size7; i7++) {
                            wyc wycVar3 = (wyc) arrayList6.get(i7);
                            xjaVar.w.j(wycVar3.e, wycVar3.d, new String[0]);
                            xjaVar.d.add(wycVar3.e);
                        }
                        ArrayList arrayList7 = xjaVar.h;
                        int size8 = arrayList7.size();
                        final MessageIdType[] messageIdTypeArr = new MessageIdType[size8];
                        for (int i8 = 0; i8 < size8; i8++) {
                            messageIdTypeArr[i8] = ((wyc) arrayList7.get(i8)).d;
                        }
                        final int i9 = 0;
                        while (i9 < size8) {
                            final int min = Math.min(size8, i9 + 128);
                            sxu sxuVar = new sxu();
                            sxuVar.f("batchDeleteMessages");
                            sxuVar.b(new Function() { // from class: xix
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo416andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    syc sycVar2 = (syc) obj;
                                    sycVar2.U(new agmf("messages._id", 3, syc.X((Iterable) DesugarArrays.stream((MessageIdType[]) Arrays.copyOfRange(messageIdTypeArr, i9, min)).map(new sho(13)).collect(Collectors.toCollection(new swm(19)))), true));
                                    return sycVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            sxuVar.d();
                            i9 = min + 1;
                        }
                        if (xja.a.s(2)) {
                            ArrayList arrayList8 = xjaVar.h;
                            int size9 = arrayList8.size();
                            for (int i10 = 0; i10 < size9; i10++) {
                                wyc wycVar4 = (wyc) arrayList8.get(i10);
                                xyo d4 = xja.a.d();
                                d4.H("Deleted message.");
                                d4.z("localId", wycVar4.d);
                                d4.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, wycVar4.b);
                                d4.y("timestamp", wycVar4.c);
                                d4.q();
                            }
                        }
                        Iterator it = xjaVar.d.iterator();
                        while (it.hasNext()) {
                            ConversationIdType conversationIdType2 = (ConversationIdType) it.next();
                            if (!((uzo) xjaVar.t.b()).f(conversationIdType2)) {
                                tqc b2 = tqc.b(false);
                                tqc tqcVar2 = null;
                                if (((Boolean) qpf.a.e()).booleanValue() && !xjaVar.j.contains(conversationIdType2)) {
                                    z2 = false;
                                } else {
                                    if (((Boolean) qpf.a.e()).booleanValue()) {
                                        xhv a3 = ((qos) xjaVar.m.b()).a(conversationIdType2);
                                        if (((ogn) xjaVar.A.b()).a()) {
                                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                            xii xiiVar = xjaVar.F;
                                            rfj rfjVar = new rfj(xjaVar, (Object) atomicBoolean, (Object) a3, 5);
                                            a3.getClass();
                                            tqc tqcVar3 = (tqc) xii.d(xiiVar, xiiVar.f, a3, rfjVar, "threadArchiveStatusCache", null, null, 48);
                                            if (!atomicBoolean.get()) {
                                                b2 = null;
                                            } else {
                                                b2 = tqcVar3;
                                            }
                                        } else {
                                            b2 = tqc.b(xjaVar.u.T(a3));
                                        }
                                    } else {
                                        b2 = tqc.b(xjaVar.v.c(conversationIdType2));
                                    }
                                    z2 = true;
                                }
                                ruq ruqVar = (ruq) xjaVar.q.b();
                                if (true == z2) {
                                    tqcVar2 = b2;
                                }
                                ruqVar.j(conversationIdType2, tqcVar2);
                                if (((pqe) xjaVar.C.b()).a() && !((osr) xjaVar.G.b()).a()) {
                                }
                                if (((Boolean) ((utz) vrf.a.get()).e()).booleanValue()) {
                                    e2 = aktp.e("SyncMessageBatch#updateConversationMmsOrRcs");
                                    try {
                                        aiut.b();
                                        smr q = ((rtz) xjaVar.p.b()).q(conversationIdType2);
                                        if (q != null) {
                                            if (q.h() == 2) {
                                                MessageCoreData k = ((rwd) xjaVar.z.b()).k(conversationIdType2);
                                                e3 = aktp.e("SyncMessageBatch#updateConversationRcsConferenceUri");
                                                try {
                                                    aiut.b();
                                                    ConversationIdType x = q.x();
                                                    if (!TextUtils.isEmpty(q.U())) {
                                                        xja.a.l(String.format("Skipping updating RCS conference URI for conversation %s. Conference URI is already present: %s", x, q.U()));
                                                    } else if (k == null) {
                                                        xja.a.l(String.format("Skipping updating RCS conference URI for conversation %s. No messages in the conversation", x));
                                                    } else {
                                                        String aq = k.aq();
                                                        if (TextUtils.isEmpty(aq)) {
                                                            xyo a4 = xja.a.a();
                                                            a4.H("Skipping updating RCS conference URI, last message has empty transaction ID");
                                                            a4.b(x);
                                                            a4.q();
                                                        } else {
                                                            vre a5 = vrf.a(aq);
                                                            if (a5 == null) {
                                                                xyo a6 = xja.a.a();
                                                                a6.H("Skipping updating RCS conference URI, parsed transaction ID is null");
                                                                a6.b(x);
                                                                a6.q();
                                                            } else {
                                                                if (a5.c.isPresent() && ((vqe) a5.c.get()).c == 2) {
                                                                    Object obj = a5.c.get();
                                                                    if (((vqe) obj).c == 2) {
                                                                        vqdVar = (vqd) ((vqe) obj).d;
                                                                    } else {
                                                                        vqdVar = vqd.a;
                                                                    }
                                                                    str2 = vqdVar.f;
                                                                } else if (a5.b.isPresent()) {
                                                                    str2 = ((vrb) a5.b.get()).a;
                                                                } else {
                                                                    xyo a7 = xja.a.a();
                                                                    a7.H("Skipping updating RCS conference URI, not present in parsed transaction ID");
                                                                    a7.b(x);
                                                                    a7.q();
                                                                }
                                                                sng sngVar = new sng();
                                                                sngVar.aj("updateConversationRcsConferenceUri2");
                                                                sngVar.I(str2);
                                                                sngVar.e(x);
                                                            }
                                                        }
                                                    }
                                                    e3.close();
                                                } finally {
                                                }
                                            } else if (q.h() == 1) {
                                                MessageCoreData m = ((rwd) xjaVar.z.b()).m(conversationIdType2);
                                                e3 = aktp.e("SyncMessageBatch#updateConversationMmsGroupName");
                                                try {
                                                    aiut.b();
                                                    ConversationIdType x2 = q.x();
                                                    if (m == null) {
                                                        xja.a.l(String.format("Skipping updating MMS group name for conversation %s. No messages in the conversation", x2));
                                                    } else {
                                                        String aq2 = m.aq();
                                                        if (TextUtils.isEmpty(aq2)) {
                                                            xyo a8 = xja.a.a();
                                                            a8.H("Skipping updating MMS group name, last message has empty transaction ID");
                                                            a8.b(x2);
                                                            a8.q();
                                                        } else {
                                                            vre a9 = vrf.a(aq2);
                                                            if (a9 == null) {
                                                                xyo d5 = xja.a.d();
                                                                d5.H("Skipping updating MMS group name, parsed transaction ID is null");
                                                                d5.b(x2);
                                                                d5.q();
                                                            } else if (a9.e.isPresent() && !((vqb) a9.e.get()).d.isEmpty() && q.B() == tqh.NAME_IS_AUTOMATIC) {
                                                                ((rtz) xjaVar.p.b()).T(x2, ((vqb) a9.e.get()).d, 1, false);
                                                                ((mbl) xjaVar.x.b()).e("Bugle.Telephony.ForwardSync.MmsGroupNameRestore", m.d());
                                                            } else {
                                                                xyo a10 = xja.a.a();
                                                                a10.H("Skipping updating MMS group name, not present in parsed transaction ID");
                                                                a10.b(x2);
                                                                a10.q();
                                                            }
                                                        }
                                                    }
                                                    e3.close();
                                                } finally {
                                                }
                                            }
                                        } else {
                                            xja.a.m(String.format("Skip updating conversation %s. Conversation is null", conversationIdType2));
                                        }
                                        e2.close();
                                    } finally {
                                    }
                                } else {
                                    e2 = aktp.e("SyncMessageBatch#updateConversationRcsConferenceUri");
                                    try {
                                        aiut.b();
                                        smr q2 = ((rtz) xjaVar.p.b()).q(conversationIdType2);
                                        if (q2 == null) {
                                            xja.a.m(String.format("Skipping updating RCS conference URI for conversation %s. Conversation is null", conversationIdType2));
                                        } else if (q2.h() != 2) {
                                            xja.a.l(String.format("Skipping updating RCS conference URI for conversation %s. Conversation is not RCS group", conversationIdType2));
                                        } else if (!TextUtils.isEmpty(q2.U())) {
                                            xja.a.l(String.format("Skipping updating RCS conference URI for conversation %s. Conference URI is already present: %s", conversationIdType2, q2.U()));
                                        } else {
                                            MessageCoreData k2 = ((rwd) xjaVar.z.b()).k(conversationIdType2);
                                            if (k2 == null) {
                                                xja.a.l(String.format("Skipping updating RCS conference URI for conversation %s. No messages in the conversation", conversationIdType2));
                                            } else {
                                                String aq3 = k2.aq();
                                                if (TextUtils.isEmpty(aq3)) {
                                                    xyo a11 = xja.a.a();
                                                    a11.H("Skipping updating RCS conference URI, last message has empty transaction ID");
                                                    a11.b(conversationIdType2);
                                                    a11.q();
                                                } else {
                                                    vre a12 = vrf.a(aq3);
                                                    if (a12 == null) {
                                                        xyo a13 = xja.a.a();
                                                        a13.H("Skipping updating RCS conference URI, parsed transaction ID is null");
                                                        a13.b(conversationIdType2);
                                                        a13.q();
                                                    } else {
                                                        if (a12.c.isPresent() && ((vqe) a12.c.get()).c == 2) {
                                                            Object obj2 = a12.c.get();
                                                            if (((vqe) obj2).c == 2) {
                                                                vqdVar2 = (vqd) ((vqe) obj2).d;
                                                            } else {
                                                                vqdVar2 = vqd.a;
                                                            }
                                                            str3 = vqdVar2.f;
                                                        } else if (a12.b.isPresent()) {
                                                            str3 = ((vrb) a12.b.get()).a;
                                                        } else {
                                                            xyo a14 = xja.a.a();
                                                            a14.H("Skipping updating RCS conference URI, not present in parsed transaction ID");
                                                            a14.b(conversationIdType2);
                                                            a14.q();
                                                        }
                                                        sng sngVar2 = new sng();
                                                        sngVar2.aj("updateConversationRcsConferenceUri1");
                                                        sngVar2.I(str3);
                                                        sngVar2.e(conversationIdType2);
                                                    }
                                                }
                                            }
                                        }
                                        e2.close();
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                });
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.w.i((ConversationIdType) it.next());
                }
                this.w.c();
                ahqp ahqpVar2 = ahqp.SUCCESS;
                if (this.e.size() + this.f.size() + this.g.size() + this.h.size() + this.i.size() >= ((Integer) xim.g.e()).intValue()) {
                    ((ahqr) this.V.b()).f(d, new ahka("ForwardSync::SyncOneBatch::Full"), null, ahqpVar2);
                } else {
                    ((ahqr) this.V.b()).f(d, new ahka("ForwardSync::SyncOneBatch::Partial"), null, ahqpVar2);
                }
                e.close();
            } catch (Throwable th) {
                if (this.e.size() + this.f.size() + this.g.size() + this.h.size() + this.i.size() >= ((Integer) xim.g.e()).intValue()) {
                    ((ahqr) this.V.b()).f(d, new ahka("ForwardSync::SyncOneBatch::Full"), null, ahqpVar);
                } else {
                    ((ahqr) this.V.b()).f(d, new ahka("ForwardSync::SyncOneBatch::Partial"), null, ahqpVar);
                }
                throw th;
            }
        } finally {
        }
    }
}
