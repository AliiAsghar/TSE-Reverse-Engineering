package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxv {
    public final Object a;
    public final Object b;

    public jxv(anen anenVar, Object obj) {
        this.a = anenVar;
        this.b = obj;
    }

    public static final String a(MessageId messageId) {
        String a = messageId.a();
        a.getClass();
        return a;
    }

    public static final aevq n(aevp aevpVar, aevo aevoVar, aevn aevnVar) {
        aevq aevqVar = new aevq(aevpVar, aevoVar, aevnVar);
        if (aevpVar == null && aevoVar == null && aevnVar == null) {
            return null;
        }
        return aevqVar;
    }

    public static /* synthetic */ aevq p(aevp aevpVar, aevo aevoVar, int i) {
        if (1 == (i & 1)) {
            aevpVar = null;
        }
        if ((i & 2) != 0) {
            aevoVar = null;
        }
        return n(aevpVar, aevoVar, null);
    }

    private static final jgx q(afcv afcvVar, EditedMedia editedMedia) {
        if (editedMedia != null && !d.F(editedMedia.b.toString(), afcvVar.i())) {
            afsx H = afwv.H(editedMedia.a);
            if (H != null) {
                return new jgw(H, editedMedia.b, null, afcvVar.fh());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return new jgv(afcvVar);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kni, java.lang.Object] */
    private final knl r(int i) {
        xzd xzdVar = new xzd(this, 1);
        knl knlVar = (knl) knl.a.get();
        if (knlVar == null) {
            knl knlVar2 = new knl(this.a);
            knl.a.set(knlVar2);
            knlVar = knlVar2;
        } else {
            knlVar.q();
        }
        knlVar.s(i, "Diagnostics", xzdVar);
        return knlVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arwe, java.lang.Object] */
    public final ascg b(Uri uri) {
        uri.getClass();
        asai a = ((uet) this.b).a(uri);
        int i = ascp.a;
        return arrn.S(a, this.a, asco.a(0L, 3), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final jhc c(arqr arqrVar) {
        ?? r0;
        Object c;
        do {
            r0 = this.b;
            c = r0.c();
        } while (!r0.g(c, arqrVar.a(c)));
        return (jhc) c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final jhc d(arqr arqrVar) {
        ?? r0;
        Object c;
        Object a;
        do {
            r0 = this.b;
            c = r0.c();
            a = arqrVar.a(c);
        } while (!r0.g(c, a));
        return (jhc) a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void e(arqr arqrVar) {
        ?? r0;
        Object c;
        do {
            r0 = this.b;
            c = r0.c();
        } while (!r0.g(c, arqrVar.a(c)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.afcv r11, java.lang.String r12, boolean r13, boolean r14, defpackage.arpe r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.jlo
            if (r0 == 0) goto L13
            r0 = r15
            jlo r0 = (defpackage.jlo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jlo r0 = new jlo
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.a
            jxv r12 = r0.e
            defpackage.aqil.P(r15)
            goto L68
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.aqil.P(r15)
            lme r15 = new lme
            java.lang.String r2 = r11.i()
            android.net.Uri r5 = android.net.Uri.parse(r2)
            r5.getClass()
            afsx r2 = r11.d()
            java.lang.String r6 = r2.a()
            if (r3 == r13) goto L50
            r13 = 2
            r7 = r13
            goto L51
        L50:
            r7 = r3
        L51:
            r4 = r15
            r8 = r12
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r12 = r10.b
            r0.e = r10
            r0.a = r11
            r0.c = r3
            lkd r12 = (defpackage.lkd) r12
            java.lang.Object r15 = r12.a(r15, r0)
            if (r15 == r1) goto Lca
            r12 = r10
        L68:
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult) r15
            if (r15 != 0) goto L8e
            java.lang.Object r11 = r12.a
            aluw r11 = (defpackage.aluw) r11
            alvw r11 = r11.g()
            java.lang.String r12 = "openDirectSendViewer"
            r13 = 52
            java.lang.String r14 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer"
            java.lang.String r15 = "DirectSendViewer.kt"
            alvw r11 = r11.h(r14, r12, r13, r15)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r12 = "Null Direct Send Viewer result."
            r11.q(r12)
            jll r11 = new jll
            r12 = 0
            r11.<init>(r12)
            return r11
        L8e:
            boolean r12 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send
            if (r12 == 0) goto La2
            jlm r12 = new jlm
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Send r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r13 = r15.a
            jgx r11 = q(r11, r13)
            java.lang.String r13 = r15.b
            r12.<init>(r11, r13)
            return r12
        La2:
            boolean r12 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add
            if (r12 == 0) goto Lb6
            jlk r12 = new jlk
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Add r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r13 = r15.a
            jgx r11 = q(r11, r13)
            java.lang.String r13 = r15.b
            r12.<init>(r11, r13)
            return r12
        Lb6:
            boolean r11 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard
            if (r11 == 0) goto Lc4
            jll r11 = new jll
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Discard r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard) r15
            java.lang.String r12 = r15.a
            r11.<init>(r12)
            return r11
        Lc4:
            armm r11 = new armm
            r11.<init>()
            throw r11
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxv.f(afcv, java.lang.String, boolean, boolean, arpe):java.lang.Object");
    }

    public final knl g() {
        return r(6);
    }

    public final knl h() {
        return r(2);
    }

    public final void i(String str) {
        knl g = g();
        g.H(str);
        g.q();
    }

    public final void j(String str) {
        knl h = h();
        h.H(str);
        h.q();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, ascc] */
    public final Object k(kjl kjlVar, arpe arpeVar) {
        Object fv = this.b.fv(new kjl(kjlVar.a, kjlVar.b, kjlVar.c, kjlVar.d, kjlVar.e, new kfq(this, kjlVar, 6), new kfq(this, kjlVar, 7)), arpeVar);
        if (fv == arpl.a) {
            return fv;
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascc] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ascc] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ascc] */
    public final void l(kjl kjlVar) {
        String str;
        kjl kjlVar2 = (kjl) aqjn.Z(this.b.d());
        if (kjlVar2 != null) {
            str = kjlVar2.a;
        } else {
            str = null;
        }
        if (d.F(kjlVar.a, str)) {
            this.b.e();
            this.b.h(null);
        }
    }

    public final void m(int i, Long l) {
        ahlp bC = aktp.bC(amty.a.createBuilder());
        aozy createBuilder = amua.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amua amuaVar = (amua) apagVar;
        amuaVar.c = i - 1;
        amuaVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amua amuaVar2 = (amua) createBuilder.b;
        amuaVar2.d = 3;
        amuaVar2.b |= 2;
        if (l != null) {
            long longValue = l.longValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amua amuaVar3 = (amua) createBuilder.b;
            amuaVar3.b |= 4;
            amuaVar3.e = longValue;
        }
        apag s = createBuilder.s();
        s.getClass();
        amua amuaVar4 = (amua) s;
        aozy aozyVar = (aozy) bC.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        Object obj = this.b;
        amty amtyVar = (amty) aozyVar.b;
        amtyVar.e = amuaVar4;
        amtyVar.c |= 8;
        ((mgu) obj).g(189043, bC.n());
    }

    public final qkg o(kam kamVar, boolean z) {
        aevp aevpVar;
        asai jxjVar;
        asai asaiVar;
        if (kamVar.c != null && Math.abs(kamVar.a.h().toEpochMilli() - kamVar.c.h().toEpochMilli()) < 3600000) {
            aevpVar = null;
        } else {
            aevpVar = new aevp((String) ((znj) this.b).y(kamVar.a.h().toEpochMilli()));
        }
        if (z) {
            kamVar.a.b();
            aevo aevoVar = aevo.a;
            if (!((Boolean) jcj.d.e()).booleanValue()) {
                asaiVar = asah.a;
            } else {
                jyy jyyVar = (jyy) arsd.k((Optional) this.a);
                if (jyyVar == null) {
                    asaiVar = asah.a;
                } else {
                    jxjVar = new jxj(jyyVar.a(), 11);
                    return new qki(new jdn(jxjVar, aevpVar, aevoVar, 8, null), p(aevpVar, aevoVar, 4), 1);
                }
            }
            jxjVar = asaiVar;
            return new qki(new jdn(jxjVar, aevpVar, aevoVar, 8, null), p(aevpVar, aevoVar, 4), 1);
        }
        return new qjp(new kdz(aevpVar, 1));
    }

    public jxv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public jxv(yep yepVar, armf armfVar) {
        this.b = armfVar;
        this.a = yepVar;
    }

    public jxv(lkd lkdVar) {
        lkdVar.getClass();
        this.b = lkdVar;
        this.a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer");
    }

    public jxv(char[] cArr) {
        ascd a = ascy.a(new jhc(null, null, null, false, null, null, null, false, 0, false, 1023));
        this.b = a;
        this.a = a;
    }

    public jxv(arwe arweVar, jwp jwpVar) {
        arweVar.getClass();
        this.b = arweVar;
        jdn jdnVar = new jdn(jwpVar.a(), new qjp(jlc.r), new jdy((arpe) null, 4, (int[]) null), 17, null);
        int i = ascp.a;
        this.a = arrn.T(jdnVar, arweVar, asco.a, null);
    }

    public jxv() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public jxv(byte[] bArr) {
        ascd a = ascy.a(false);
        this.b = a;
        this.a = a;
    }

    public jxv(arwe arweVar, uet uetVar) {
        arweVar.getClass();
        this.a = arweVar;
        this.b = uetVar;
    }

    public jxv(znj znjVar, Optional optional) {
        znjVar.getClass();
        this.b = znjVar;
        this.a = optional;
    }

    public jxv(mbl mblVar, arwe arweVar) {
        mblVar.getClass();
        arweVar.getClass();
        this.b = mblVar;
        this.a = arweVar;
    }

    public jxv(znj znjVar, mgu mguVar) {
        mguVar.getClass();
        this.a = znjVar;
        this.b = mguVar;
    }

    public jxv(short[] sArr) {
        ascc d = asck.d(1, 50, 2);
        this.b = d;
        this.a = d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public jxv(List list, nei neiVar) {
        this.b = list;
        khb khbVar = (khb) neiVar.e.b();
        khbVar.getClass();
        arwe arweVar = (arwe) neiVar.c.b();
        arweVar.getClass();
        ?? r3 = neiVar.f;
        ?? r4 = neiVar.d;
        ghw ghwVar = (ghw) neiVar.b.b();
        ghwVar.getClass();
        this.a = new jcy(khbVar, arweVar, r3, r4, ghwVar, neiVar.a, list).f;
    }
}
