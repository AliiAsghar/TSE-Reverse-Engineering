package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public mlt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.n = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.i = armfVar3;
        armfVar4.getClass();
        this.h = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.l = armfVar6;
        armfVar7.getClass();
        this.e = armfVar7;
        armfVar8.getClass();
        this.m = armfVar8;
        armfVar9.getClass();
        this.b = armfVar9;
        armfVar10.getClass();
        this.f = armfVar10;
        armfVar11.getClass();
        this.d = armfVar11;
        armfVar12.getClass();
        this.k = armfVar12;
        armfVar13.getClass();
        this.j = armfVar13;
        armfVar14.getClass();
        this.g = armfVar14;
    }

    public static final aerb g(mix mixVar) {
        int ordinal = mixVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                    return aerb.di;
                }
                return aerb.de;
            }
            return aerb.dk;
        }
        return aerb.dj;
    }

    public static final aerb i(miz mizVar) {
        mje c = mizVar.c();
        c.getClass();
        mix a = ((mjm) c).a();
        a.getClass();
        return g(a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ock, java.lang.Object] */
    public static /* synthetic */ void j(mlt mltVar, List list, miz mizVar, boolean z) {
        int i = 2;
        String str = null;
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && (z || (((Boolean) ((utz) yig.Z.get()).e()).booleanValue() && mizVar.o()))) {
            aerb aerbVar = aerb.cZ;
            nbv q = mizVar.q();
            if (q != null) {
                str = k(q);
            }
            list.add(new aeuq(aerbVar, str, i));
            return;
        }
        if (mizVar.n()) {
            aerb aerbVar2 = aerb.bD;
            nbv q2 = mizVar.q();
            if (q2 != null) {
                str = k(q2);
            }
            list.add(new aeuq(aerbVar2, str, i));
            return;
        }
        if (mltVar.c.a() && !mizVar.n()) {
            aerb aerbVar3 = aerb.bE;
            nbv q3 = mizVar.q();
            if (q3 != null) {
                str = k(q3);
            }
            list.add(new aeuq(aerbVar3, str, i));
        }
    }

    private static final String k(nbv nbvVar) {
        if (nbvVar.h == 2) {
            return "error";
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    public final mls a(BugleConversationId bugleConversationId) {
        wfh wfhVar = (wfh) this.a.b();
        wfhVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.c.b();
        anenVar2.getClass();
        iew iewVar = (iew) this.d.b();
        iewVar.getClass();
        nfx nfxVar = (nfx) this.e.b();
        nfxVar.getClass();
        lfl lflVar = (lfl) this.f.b();
        lflVar.getClass();
        msk mskVar = (msk) this.g.b();
        mskVar.getClass();
        nfx nfxVar2 = (nfx) this.h.b();
        nfxVar2.getClass();
        return new mls(wfhVar, anenVar, anenVar2, iewVar, nfxVar, lflVar, mskVar, nfxVar2, this.i, this.j, this.k, this.l, bugleConversationId, this.m, this.n);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    public final kxx b(uye uyeVar, int i) {
        xnv xnvVar = (xnv) this.h.b();
        xnvVar.getClass();
        mgv mgvVar = (mgv) this.j.b();
        mgvVar.getClass();
        laj lajVar = (laj) this.b.b();
        lajVar.getClass();
        aksr aksrVar = (aksr) this.f.b();
        aksrVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.n.b();
        anenVar2.getClass();
        lbt lbtVar = (lbt) this.g.b();
        lbtVar.getClass();
        uyeVar.getClass();
        return new kxx(xnvVar, mgvVar, lajVar, aksrVar, anenVar, anenVar2, lbtVar, this.e, this.c, this.l, this.k, this.a, this.i, this.m, uyeVar, i);
    }

    public final String c(String str) {
        if (qta.r()) {
            return wfh.x(str);
        }
        return ((wfh) this.g).z(str);
    }

    public final void d(List list, miz mizVar, boolean z) {
        String str;
        nbv q = mizVar.q();
        if (q != null && (str = q.a) != null) {
            if (lga.bP(mizVar)) {
                list.add(new aeuq(aerb.aM, k(q), 2));
            } else if (z) {
                list.add(new aeup(null));
            }
            if (lga.bN(mizVar)) {
                String string = ((Context) this.n).getResources().getString(R.string.message_metatext_premium_sms_options);
                string.getClass();
                list.add(new aeuy(string, null, false, k(q), null, false, 110));
            } else {
                list.add(new aeuy(str, null, false, k(q), null, false, 110));
            }
            if (lga.bM(mizVar)) {
                String string2 = ((Context) this.n).getResources().getString(R.string.message_metatext_resend);
                string2.getClass();
                list.add(new aeuy(string2, new jkq(this, mizVar, 12), false, k(q), null, false, 108));
                return;
            }
            if (!e() && lga.bO(mizVar) && !(mizVar.e() instanceof mxf)) {
                String string3 = ((Context) this.n).getResources().getString(R.string.message_metatext_check_options);
                string3.getClass();
                list.add(new aeuy(string3, new jkq(this, mizVar, 13), false, k(q), null, false, 108));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    public final boolean e() {
        return this.e.c() instanceof EmergencySosConversationId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (((defpackage.mjm) r1).a() == defpackage.mix.ERROR) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [ock, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aeva f(defpackage.kam r15, boolean r16, boolean r17, boolean r18, boolean r19, java.util.List r20) {
        /*
            r14 = this;
            r7 = r14
            java.lang.Object r0 = r7.c
            boolean r0 = r0.a()
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L10
            if (r19 == 0) goto L10
            r10 = r15
            r11 = r9
            goto L12
        L10:
            r10 = r15
            r11 = r8
        L12:
            miz r12 = r10.a
            kah r13 = new kah
            r0 = r13
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r17
            r5 = r16
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 2
            if (r11 == 0) goto L29
        L27:
            r1 = r9
            goto L5b
        L29:
            boolean r1 = r12 instanceof defpackage.mty
            if (r1 != 0) goto L45
            boolean r1 = defpackage.lga.bV(r12)
            if (r1 == 0) goto L45
            mje r1 = r12.c()
            r1.getClass()
            mjm r1 = (defpackage.mjm) r1
            mix r1 = r1.a()
            mix r2 = defpackage.mix.ERROR
            if (r1 != r2) goto L45
            goto L27
        L45:
            boolean r1 = defpackage.lga.bY(r12)
            if (r1 != 0) goto L27
            boolean r1 = defpackage.lga.bO(r12)
            if (r1 == 0) goto L52
            goto L27
        L52:
            boolean r1 = r15.b()
            if (r1 == 0) goto L5a
            r1 = r0
            goto L5b
        L5a:
            r1 = 3
        L5b:
            aeuo r2 = new aeuo
            aeuz r3 = new aeuz
            r3.<init>(r9, r8, r0)
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.<init>(r13, r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlt.f(kam, boolean, boolean, boolean, boolean, java.util.List):aeva");
    }

    public final void h(List list, miz mizVar, boolean z) {
        nfw nfwVar;
        int ba;
        if (z) {
            mje c = mizVar.c();
            if (c instanceof mjl) {
                nfwVar = ((mjl) c).c();
            } else if (c instanceof muk) {
                nfwVar = ((muk) c).b;
            } else {
                return;
            }
            String k = nfwVar.k();
            int a = nfwVar.a();
            if (a == 0) {
                ba = ((Context) this.n).getColor(R.color.sim_icon_text_color);
            } else {
                ba = adom.ba((Context) this.n, a);
            }
            list.add(new aeup(null));
            list.add(new aeuy(k, null, false, null, Integer.valueOf(ba), false, 94));
        }
    }

    public mlt(ajwt ajwtVar, znj znjVar, Context context, wfh wfhVar, kcy kcyVar, lkd lkdVar, @oqd armf armfVar, armf armfVar2, armf armfVar3, Optional optional, ock ockVar, Optional optional2, Optional optional3, kao kaoVar, Conversation conversation, obk obkVar, oro oroVar) {
        ajwtVar.getClass();
        znjVar.getClass();
        context.getClass();
        wfhVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        ockVar.getClass();
        kaoVar.getClass();
        conversation.getClass();
        obkVar.getClass();
        this.b = znjVar;
        this.n = context;
        this.g = wfhVar;
        this.i = kcyVar;
        this.h = lkdVar;
        this.f = armfVar;
        this.k = armfVar2;
        this.j = armfVar3;
        this.m = optional;
        this.c = ockVar;
        this.l = optional2;
        this.d = optional3;
        this.e = conversation;
        this.a = oroVar;
    }

    public mlt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, byte[] bArr) {
        armfVar.getClass();
        this.h = armfVar;
        armfVar2.getClass();
        this.j = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
        armfVar6.getClass();
        this.n = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.e = armfVar8;
        armfVar9.getClass();
        this.c = armfVar9;
        armfVar10.getClass();
        this.l = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.a = armfVar12;
        armfVar13.getClass();
        this.i = armfVar13;
        armfVar14.getClass();
        this.m = armfVar14;
    }

    public mlt(Context context, arwe arweVar, armf armfVar, armf armfVar2, lgd lgdVar, miw miwVar, armf armfVar3, armf armfVar4, wfh wfhVar, armf armfVar5, armf armfVar6, ahqr ahqrVar, eog eogVar) {
        Long l;
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        lgdVar.getClass();
        miwVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        wfhVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        ahqrVar.getClass();
        eogVar.getClass();
        this.n = context;
        this.m = arweVar;
        this.l = armfVar;
        this.g = armfVar2;
        this.i = miwVar;
        this.c = armfVar3;
        this.b = armfVar4;
        this.h = wfhVar;
        this.a = armfVar5;
        this.d = armfVar6;
        this.e = ahqrVar;
        Bundle bundle = (Bundle) eogVar.a("conversation_list_bundle_key");
        if (bundle != null) {
            Object b = armfVar.b();
            b.getClass();
            l = Long.valueOf(bundle.getLong("conversation_list_limit_key", ((Number) b).longValue()));
        } else {
            l = (Long) armfVar.b();
        }
        ascd a = ascy.a(l);
        this.j = a;
        eogVar.d("conversation_list_bundle_key", new cp(this, 5));
        kdp kdpVar = new kdp(a, this, 9);
        int i = ascp.a;
        ascv T = arrn.T(kdpVar, arweVar, asco.a(0L, 3), new lhy(null));
        this.k = T;
        this.f = arrn.T(new jdn(lgdVar.c, T, new afxf(this, lgdVar, (arpe) null, 1), 17, null), arweVar, asco.a(0L, 3), new lib(false, 7));
    }

    public mlt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.m = armfVar13;
        armfVar14.getClass();
        this.n = armfVar14;
    }
}
