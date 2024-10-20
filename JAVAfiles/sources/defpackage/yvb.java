package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.duokit.DuoId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvb {
    public final arpi b;
    public final armf c;
    public final ota d;
    public final znj e;
    public final afxz f;
    private final Context h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final arpi n;
    private final armf o;
    private final otc p;
    private final mgu q;
    private final wfh r;
    private static final yjt g = new yjt(52);
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/video/BugleVideoCalling2");

    public yvb(Context context, armf armfVar, znj znjVar, armf armfVar2, afxz afxzVar, armf armfVar3, armf armfVar4, armf armfVar5, mgu mguVar, arpi arpiVar, arpi arpiVar2, armf armfVar6, wfh wfhVar, armf armfVar7, otc otcVar, ota otaVar) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        afxzVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        mguVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.h = context;
        this.i = armfVar;
        this.e = znjVar;
        this.j = armfVar2;
        this.f = afxzVar;
        this.k = armfVar3;
        this.l = armfVar4;
        this.m = armfVar5;
        this.q = mguVar;
        this.b = arpiVar;
        this.n = arpiVar2;
        this.c = armfVar6;
        this.r = wfhVar;
        this.o = armfVar7;
        this.p = otcVar;
        this.d = otaVar;
    }

    public static final DuoId f(ResolvedRecipient resolvedRecipient) {
        DuoId duoId = new DuoId();
        duoId.b = resolvedRecipient.f().n();
        return duoId;
    }

    private final void g(int i, ConversationId conversationId, boolean z) {
        int i2;
        ((mbl) this.l.b()).e("Bugle.UI.VideoCallButton.Clicked", i);
        aozy createBuilder = amiw.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiw.a((amiw) createBuilder.b);
        if (z) {
            if (((Boolean) yvr.f.e()).booleanValue()) {
                i2 = 3;
            } else if (((Boolean) yvr.e.e()).booleanValue()) {
                i2 = 2;
            } else if (((Boolean) yvr.d.e()).booleanValue()) {
                i2 = 4;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 5;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiw amiwVar = (amiw) createBuilder.b;
        amiwVar.i = i2 - 1;
        amiwVar.b |= 128;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_VIDEO_CALL_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        int g2 = yzc.g(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiw amiwVar2 = (amiw) createBuilder.b;
        amiwVar2.c = g2 - 1;
        amiwVar2.b |= 1;
        amiw amiwVar3 = (amiw) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amiwVar3.getClass();
        amfrVar2.W = amiwVar3;
        amfrVar2.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        aozy createBuilder2 = amfh.a.createBuilder();
        long b = ((lzz) this.o.b()).b(conversationId.b());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amfh amfhVar = (amfh) createBuilder2.b;
        amfhVar.b |= 65536;
        amfhVar.r = b;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar3 = (amfr) amfqVar.b;
        amfh amfhVar2 = (amfh) createBuilder2.s();
        amfhVar2.getClass();
        amfrVar3.l = amfhVar2;
        amfrVar3.b |= 8;
        ((maq) this.m.b()).j(amfqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.alog r9, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.yuy
            if (r0 == 0) goto L13
            r0 = r11
            yuy r0 = (defpackage.yuy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yuy r0 = new yuy
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mdg r9 = r0.e
            yvb r10 = r0.d
            defpackage.aqil.P(r11)
            goto L74
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r11)
            armf r11 = r8.k
            java.lang.Object r11 = r11.b()
            ksi r11 = (defpackage.ksi) r11
            r11.a()
            mgu r11 = r8.q
            r2 = 176581(0x2b1c5, float:2.47443E-40)
            mdg r11 = defpackage.lgb.H(r11, r2)
            java.lang.Object r2 = defpackage.aqjn.X(r9)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            nfo r2 = r2.B()
            int r2 = r2.c
            r8.g(r2, r10, r4)
            arpi r10 = r8.n
            yqs r2 = new yqs
            r5 = 0
            r6 = 8
            r2.<init>(r8, r9, r5, r6)
            r0.d = r8
            r0.e = r11
            r0.c = r3
            java.lang.Object r9 = defpackage.arro.q(r10, r2, r0)
            if (r9 == r1) goto L93
            r10 = r8
            r7 = r11
            r11 = r9
            r9 = r7
        L74:
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L83
            r9.b()
            goto L92
        L83:
            r0 = 3
            defpackage.lgb.F(r9, r4, r0)
            android.content.Context r9 = r10.h
            java.lang.String r10 = "Error making video call."
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r4)
            r9.show()
        L92:
            return r11
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvb.a(alog, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, arpe):java.lang.Object");
    }

    public final Object b(arpe arpeVar) {
        return arro.q(this.b, new xjs(this, (arpe) null, 17), arpeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yuz
            if (r0 == 0) goto L13
            r0 = r6
            yuz r0 = (defpackage.yuz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yuz r0 = new yuz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            yvb r0 = r0.e
            defpackage.aqil.P(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 == r1) goto Ldc
            r0 = r4
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 10
            if (r6 == 0) goto L81
            wfh r6 = r0.r
            r2 = 6
            r6.w(r2)
            armf r6 = r0.j
            java.lang.Object r6 = r6.b()
            yvf r6 = (defpackage.yvf) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.aqjn.J(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L68:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            msh r1 = r1.f()
            r0.add(r1)
            goto L68
        L7c:
            akul r5 = r6.d(r0)
            goto Ldb
        L81:
            int r6 = r5.size()
            if (r6 != r3) goto La6
            wfh r6 = r0.r
            r6.v()
            armf r6 = r0.j
            java.lang.Object r6 = r6.b()
            yvf r6 = (defpackage.yvf) r6
            java.lang.Object r5 = defpackage.aqjn.ag(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            msh r5 = r5.f()
            akul r5 = r6.a(r5)
            r5.getClass()
            goto Ldb
        La6:
            wfh r6 = r0.r
            r6.v()
            armf r6 = r0.j
            java.lang.Object r6 = r6.b()
            yvf r6 = (defpackage.yvf) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.aqjn.J(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lc0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            msh r1 = r1.f()
            r0.add(r1)
            goto Lc0
        Ld4:
            akul r5 = r6.b(r0)
            r5.getClass()
        Ldb:
            return r5
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvb.c(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.alog r8, defpackage.alog r9, defpackage.miu r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvb.d(alog, alog, miu, arpe):java.lang.Object");
    }

    public final void e(ResolvedRecipient resolvedRecipient, ConversationId conversationId) {
        mdg h;
        Intent a2;
        h = this.q.h(176581, null);
        Uri fromParts = Uri.fromParts("tel", resolvedRecipient.f().o(true), null);
        if (((ansy) ((nwa) this.p).a.b()).e("bugle.vilte_calling_use_implicit_intent")) {
            a2 = lqn.g("android.intent.action.CALL").a();
        } else {
            lqn f = lqn.f(this.h, yvb.class, "android.intent.action.VIEW");
            f.b("android.intent.action.CALL");
            a2 = f.a();
        }
        a2.getClass();
        a2.setData(fromParts);
        a2.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        a2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        g(resolvedRecipient.B().c, conversationId, true);
        try {
            h.b();
            akto.n(this.h, a2);
        } catch (ActivityNotFoundException unused) {
            lgb.F(h, 0, 3);
            Toast.makeText(this.h, "Error making LTE video call.", 0).show();
        }
    }
}
