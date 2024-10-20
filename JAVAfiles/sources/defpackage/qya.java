package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qya {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public qya(Context context, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    public static /* synthetic */ alor e() {
        alok alokVar = new alok();
        alokVar.h("my_identities.provisioning_id", 59990);
        alokVar.h("my_identities.is_verified", 60320);
        alokVar.h("my_identities.address_type", 59980);
        alokVar.h("my_identities.display_name", 60120);
        return alokVar.b();
    }

    @armg
    public static final void h(List list) {
        akrh e = aktp.e("ContactsSyncDataService#deleteContacts");
        try {
            Object e2 = qlb.l.e();
            e2.getClass();
            if (((Boolean) e2).booleanValue()) {
                Object e3 = qlb.m.e();
                e3.getClass();
                List<List> aj = aqjn.aj(list, ((Number) e3).intValue());
                ArrayList arrayList = new ArrayList(aqjn.J(aj, 10));
                for (List list2 : aj) {
                    sji sjiVar = new sji();
                    sjiVar.f("deleteContactsBlockingDeprecated");
                    sjiVar.b(new qcr(list2, 5));
                    arrayList.add(Integer.valueOf(sjiVar.d()));
                }
            } else {
                sji sjiVar2 = new sji();
                sjiVar2.f("deleteContactsBlockingDeprecated");
                sjiVar2.b(new qcr(list, 6));
                sjiVar2.d();
            }
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    public final Uri a(ParticipantsTable.BindData bindData) {
        ?? r0 = this.d;
        Uri v = bindData.v();
        String L = bindData.L();
        msh q = ((msk) r0.b()).q(bindData);
        ?? r02 = this.c;
        boolean k = vcp.k(bindData);
        boolean T = bindData.T();
        boolean R = bindData.R();
        ParticipantColor g = lru.g(bindData);
        if (((Boolean) r02.b()).booleanValue()) {
            bindData.C();
        }
        return ((xvc) this.b.b()).s(v, L, q, g, k, T, R);
    }

    public final Uri b(List list) {
        xyl.k(!list.isEmpty());
        if (list.size() == 1) {
            return a((ParticipantsTable.BindData) list.get(0));
        }
        int min = Math.min(list.size(), 4);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(a((ParticipantsTable.BindData) list.get(i)));
        }
        return xvc.f((Context) this.a, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Deque] */
    public final void c(qxu qxuVar) {
        boolean z;
        if (!((Boolean) this.a.get()).booleanValue()) {
            if (qxuVar == null) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            return;
        }
        qxuVar.getClass();
        synchronized (this.b) {
            albo.T(this.c.remove(qxuVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final qva d(armf armfVar) {
        qvp qvpVar = (qvp) this.b.b();
        qvpVar.getClass();
        oep oepVar = (oep) this.c.b();
        oepVar.getClass();
        arwe arweVar = (arwe) this.d.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) this.a.b();
        arweVar2.getClass();
        return new qva(qvpVar, armfVar, oepVar, arweVar, arweVar2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    public final List f(List list) {
        list.getClass();
        ArrayList<qlr> arrayList = new ArrayList();
        for (Object obj : list) {
            qlr qlrVar = (qlr) obj;
            if (qno.i(qlrVar)) {
                if (((oxi) this.d.b()).a()) {
                    String str = qlrVar.k;
                    if (str == null) {
                        str = qlrVar.j;
                    }
                    if (!d.ao(str)) {
                    }
                }
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        for (qlr qlrVar2 : arrayList) {
            ?? r2 = this.a;
            String str2 = qlrVar2.k;
            if (str2 == null) {
                str2 = qlrVar2.j;
                str2.getClass();
            }
            msh n = r2.n(str2);
            String obj2 = n.F().toString();
            String k = n.k();
            String[] strArr = sjm.a;
            int i = shg.a;
            sje sjeVar = new sje();
            sjeVar.f(qlrVar2.a);
            sjeVar.d(qlrVar2.b);
            sjeVar.g(obj2);
            sjeVar.m(k);
            sjeVar.l(qlrVar2.c);
            sjeVar.h(qlrVar2.d);
            sjeVar.j(qlrVar2.h);
            sjeVar.i(qlrVar2.i);
            sjeVar.p(qlrVar2.o);
            sjeVar.r(qlrVar2.p);
            sjeVar.c(qlrVar2.r);
            sjeVar.b(qlrVar2.s);
            sjeVar.k(qlrVar2.t);
            sjeVar.q(qlrVar2.e);
            sjeVar.o(qlrVar2.f);
            sjeVar.n(qlrVar2.g);
            sjeVar.e(qlrVar2.m);
            sjeVar.s(qlrVar2.n);
            arrayList2.add(sjeVar.a());
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [agnq, java.lang.Object] */
    public final void g(List list) {
        akrh e = aktp.e("ContactsSyncDataService#upsertContactsBlocking");
        try {
            this.b.e("ContactsSyncDataService#upsertContactsBlocking", new nau(list, 11));
            armd.i(e, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul i(Object obj) {
        synchronized (this.d) {
            if (((HashMap) this.c).containsKey(obj)) {
                return (akul) ((HashMap) this.c).get(obj);
            }
            akul f = akuk.c(new izd(this, obj, 5), this.b).f();
            ((HashMap) this.c).put(obj, f);
            return f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qbw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul j(Object obj, qbs qbsVar) {
        String a = this.b.a(obj);
        alob alobVar = new alob();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            alobVar.h(aktp.ai(new hbd((qby) it.next(), obj, qbsVar, 17), this.d));
        }
        return aktp.ad(alobVar.g()).h(new puy(a, 6), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [apwt, java.lang.Object] */
    public final rsa k(alog alogVar) {
        ?? b = this.d.b();
        b.getClass();
        ?? b2 = this.c.b();
        b2.getClass();
        ?? b3 = this.b.b();
        b3.getClass();
        this.a.b().getClass();
        alogVar.getClass();
        alog alogVar2 = alsx.a;
        return new rsa(b, b2, b3, alogVar, alogVar2, alogVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [apwt, java.lang.Object] */
    public final rsa l(alog alogVar, alog alogVar2, alog alogVar3) {
        ?? b = this.d.b();
        b.getClass();
        ?? b2 = this.c.b();
        b2.getClass();
        ?? b3 = this.b.b();
        b3.getClass();
        this.a.b().getClass();
        alogVar.getClass();
        alogVar2.getClass();
        alogVar3.getClass();
        return new rsa(b, b2, b3, alogVar, alogVar2, alogVar3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    public final void m(Uri uri, MessageIdType messageIdType, ConversationIdType conversationIdType, int i, int i2, boolean z, boolean z2) {
        if (z) {
            if (i != 105) {
                if (i == 103) {
                    i = 103;
                }
            }
            uri.getClass();
            ((wzs) this.b.b()).L((Context) this.c, uri);
        }
        sya syaVar = new sya();
        syaVar.aj("MessageStatusUpdater#updateMessageStatus");
        syaVar.L(i);
        syaVar.u(i2);
        int i3 = 0;
        if (z2) {
            syaVar.o(false);
            syaVar.y(false);
        }
        ((rwd) this.a.b()).O(conversationIdType, messageIdType, syaVar);
        if (uri != null) {
            ((Optional) this.d).ifPresent(new rbc(i3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    public final pym n() {
        Context context = (Context) this.a.b();
        context.getClass();
        ?? b = this.c.b();
        b.getClass();
        ydk ydkVar = (ydk) this.d.b();
        ydkVar.getClass();
        pzw pzwVar = (pzw) this.b.b();
        pzwVar.getClass();
        return new pym(context, b, ydkVar, pzwVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r11 != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.msh r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qya.o(msh, arpe):java.lang.Object");
    }

    public final void p(rve rveVar, rve rveVar2) {
        amgl amglVar = (amgl) amgu.a.createBuilder();
        String f = rveVar.f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= Integer.MIN_VALUE;
        amguVar.H = f;
        amxo n = ((hgj) this.b).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.aa = n.h;
        amguVar2.c |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = 5;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = 12;
        amguVar4.b |= 2;
        String f2 = rveVar2.f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        amguVar5.ag = f2;
        s((amgu) amglVar.s());
    }

    public final void q(qfo qfoVar, amxb amxbVar) {
        amgl amglVar = (amgl) amgu.a.createBuilder();
        String str = qfoVar.g;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        str.getClass();
        amguVar.b |= Integer.MIN_VALUE;
        amguVar.H = str;
        amgu amguVar2 = qfoVar.l;
        if (amguVar2 == null) {
            amguVar2 = amgu.a;
        }
        amxo b = amxo.b(amguVar2.aa);
        if (b == null) {
            b = amxo.UNKNOWN_RCS_TYPE;
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.aa = b.h;
        amguVar3.c |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.g = 8;
        amguVar4.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.h = 15;
        amguVar5.b |= 2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amxbVar.getClass();
        amguVar6.O = amxbVar;
        amguVar6.c |= 1024;
        s((amgu) amglVar.s());
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [armf, java.lang.Object] */
    public final void r(rve rveVar, qei qeiVar) {
        amgl amglVar = (amgl) amgu.a.createBuilder();
        String f = rveVar.f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= Integer.MIN_VALUE;
        amguVar.H = f;
        amxo n = ((hgj) this.b).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.aa = n.h;
        amguVar2.c |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = 3;
        int i = 1;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = 15;
        amguVar4.b |= 2;
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        amwy amwyVar = amwy.CHAT_API_FAILED_TRANSIENTLY;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.f = amwyVar.f;
        amxcVar.b |= 16;
        amwx amwxVar = amwx.CHAT_API_NO_RCS_SUBSCRIPTION;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amxc amxcVar2 = (amxc) createBuilder2.b;
        amxcVar2.e = amwxVar.x;
        int i2 = 8;
        amxcVar2.b |= 8;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxb amxbVar = (amxb) createBuilder.b;
        amxc amxcVar3 = (amxc) createBuilder2.s();
        amxcVar3.getClass();
        amxbVar.c = amxcVar3;
        amxbVar.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amxb amxbVar2 = (amxb) createBuilder.s();
        amxbVar2.getClass();
        amguVar5.O = amxbVar2;
        amguVar5.c |= 1024;
        aozy createBuilder3 = amjk.a.createBuilder();
        aozy createBuilder4 = ammc.a.createBuilder();
        Stream map = Collection.EL.stream(((adji) this.c).i()).map(new prj(i2));
        String str = qeiVar.d;
        str.getClass();
        boolean anyMatch = map.anyMatch(new ncc(str, 4));
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ammc ammcVar = (ammc) createBuilder4.b;
        ammcVar.b |= 1;
        ammcVar.c = anyMatch;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amjk amjkVar = (amjk) createBuilder3.b;
        ammc ammcVar2 = (ammc) createBuilder4.s();
        ammcVar2.getClass();
        amjkVar.l = ammcVar2;
        amjkVar.b |= 1024;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amjk amjkVar2 = (amjk) createBuilder3.s();
        amjkVar2.getClass();
        amguVar6.P = amjkVar2;
        amguVar6.c |= 2048;
        aozy createBuilder5 = amkn.a.createBuilder();
        if (true == ((yjr) this.a.b()).A(qeiVar.d)) {
            i = 2;
        }
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        amkn amknVar = (amkn) createBuilder5.b;
        amknVar.d = i - 1;
        amknVar.b |= 2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amkn amknVar2 = (amkn) createBuilder5.s();
        amknVar2.getClass();
        amguVar7.a();
        amguVar7.X.add(amknVar2);
        s((amgu) amglVar.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void s(amgu amguVar) {
        maq maqVar = (maq) this.d.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amguVar.getClass();
        amfrVar2.k = amguVar;
        amfrVar2.b |= 4;
        maqVar.j(amfqVar);
    }

    public qya(Context context, armf armfVar, armf armfVar2, Optional optional) {
        this.c = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.d = optional;
    }

    public qya(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        this.d = armfVar;
        this.c = armfVar2;
        this.b = armfVar3;
        this.a = armfVar4;
    }

    public qya(armf armfVar, hgj hgjVar, adji adjiVar, armf armfVar2) {
        this.d = armfVar;
        this.b = hgjVar;
        this.c = adjiVar;
        this.a = armfVar2;
    }

    public qya(qbw qbwVar, Set set, anen anenVar, anen anenVar2) {
        this.b = qbwVar;
        this.a = set;
        this.c = anenVar;
        this.d = anenVar2;
    }

    public qya(anen anenVar, Function function) {
        this.d = new Object();
        this.c = new HashMap();
        this.b = anenVar;
        this.a = function;
    }

    public qya(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_pins_backup._id";
        a.c = new wsy();
        rku rkuVar = new rku(a.a());
        this.a = rkuVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new qxs(19);
        a2.a = "conversation_pins_backup.conversation_id";
        a2.c = new wsy();
        rku rkuVar2 = new rku(a2.a());
        this.c = rkuVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "conversation_pins_backup.pin_status";
        a3.c = new wsy();
        rku rkuVar3 = new rku(a3.a());
        this.d = rkuVar3;
        this.b = new rku[]{rkuVar, rkuVar2, rkuVar3};
    }

    public qya(int[] iArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "rcs_remote_capabilities_cache.msisdn";
        a.c = new wsy();
        ptq ptqVar = new ptq(a.a());
        this.c = ptqVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.a = "rcs_remote_capabilities_cache.last_refresh_timestamp";
        a2.c = new wsy();
        ptq ptqVar2 = new ptq(a2.a());
        this.b = ptqVar2;
        agmi a3 = agmk.a();
        a3.d = 5;
        a3.i(true);
        a3.a = "rcs_remote_capabilities_cache.rcs_capabilities";
        a3.c = new wsy();
        ptq ptqVar3 = new ptq(a3.a());
        this.d = ptqVar3;
        this.a = new ptq[]{ptqVar, ptqVar2, ptqVar3};
    }

    public qya(arpi arpiVar, agnq agnqVar, msk mskVar, armf armfVar) {
        arpiVar.getClass();
        agnqVar.getClass();
        mskVar.getClass();
        armfVar.getClass();
        this.c = arpiVar;
        this.b = agnqVar;
        this.a = mskVar;
        this.d = armfVar;
    }

    public qya(char[] cArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "destinations.token";
        a.c = new wsy();
        qsu qsuVar = new qsu(a.a());
        this.d = qsuVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.c(true);
        a2.a = "destinations.address";
        a2.e(true);
        a2.c = new wsy();
        qsu qsuVar2 = new qsu(a2.a());
        this.a = qsuVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.a = "destinations.address_type";
        a3.c = new wsy();
        qsu qsuVar3 = new qsu(a3.a());
        this.b = qsuVar3;
        this.c = new qsu[]{qsuVar, qsuVar2, qsuVar3};
    }

    public qya(short[] sArr) {
        agmi a = agmk.a();
        a.d = 1;
        a.a = "backup_metadata.created_timestamp";
        a.c = new wsy();
        roa roaVar = new roa(a.a());
        this.c = roaVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "backup_metadata.schema_version";
        a2.c = new wsy();
        roa roaVar2 = new roa(a2.a());
        this.d = roaVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "backup_metadata.backup_id";
        a3.c = new wsy();
        roa roaVar3 = new roa(a3.a());
        this.b = roaVar3;
        this.a = new roa[]{roaVar, roaVar2, roaVar3};
    }

    public qya(yxx yxxVar, rdc rdcVar, ConversationIdType conversationIdType) {
        yxxVar.getClass();
        this.c = yxxVar;
        this.a = rdcVar;
        this.b = conversationIdType;
        this.d = alwo.o("BugleTachygram");
    }

    public qya(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public qya(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.a = "active_sims.sim_serial_number";
        a.c = new wsy();
        quj qujVar = new quj(a.a());
        this.b = qujVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.d(true);
        a2.a = "active_sims.active_sub_id";
        a2.c = new wsy();
        quj qujVar2 = new quj(a2.a());
        this.a = qujVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "active_sims.sim_slot_index";
        a3.c = new wsy();
        quj qujVar3 = new quj(a3.a());
        this.c = qujVar3;
        this.d = new quj[]{qujVar, qujVar2, qujVar3};
    }

    public qya(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }

    public qya(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public qya() {
        this.c = new ArrayDeque();
        this.b = new Object();
        this.d = new ReentrantLock(true);
        this.a = albo.D(new msu(18));
    }
}
