package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnh extends vkh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/notification2o/unapprovedincomingmessage/UnapprovedIncomingMessageNotificationBlueprint");
    public final miw b;
    private final Context c;
    private final arwe d;
    private final nfx e;
    private final xnv f;
    private final armf g;
    private final qoq h;
    private final Optional i;

    public vnh(Context context, arwe arweVar, miw miwVar, nfx nfxVar, xnv xnvVar, armf armfVar, qoq qoqVar, Optional optional) {
        context.getClass();
        arweVar.getClass();
        miwVar.getClass();
        nfxVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        qoqVar.getClass();
        optional.getClass();
        this.c = context;
        this.d = arweVar;
        this.b = miwVar;
        this.e = nfxVar;
        this.f = xnvVar;
        this.g = armfVar;
        this.h = qoqVar;
        this.i = optional;
    }

    @Override // defpackage.vkh
    public final /* bridge */ /* synthetic */ akul a(List list, Object obj) {
        akul c;
        vnd vndVar = (vnd) obj;
        vndVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new uwn(this, vndVar, (arpe) null, 11));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.Conversation r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnh.b(com.google.android.apps.messaging.shared.api.messaging.Conversation, arpe):java.lang.Object");
    }

    @Override // defpackage.vkh
    public final vlf c() {
        return new vna(2);
    }

    @Override // defpackage.vkh
    public final vlm d() {
        return vlm.NT_INCOMING_UNAPPROVED_MESSAGE;
    }

    @Override // defpackage.vkh
    public final akul e() {
        akul ag = aktp.ag(true);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vkh
    public final String g() {
        return "msg";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnh.h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.miu r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vng
            if (r0 == 0) goto L13
            r0 = r8
            vng r0 = (defpackage.vng) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vng r0 = new vng
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            vnh r0 = r0.e
            defpackage.aqil.P(r8)
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.aqil.P(r8)
            nfw r8 = r7.f()
            if (r8 != 0) goto L63
            nfx r8 = r6.e
            ncq r8 = r8.a()
            akul r8 = r8.b()
            r8.getClass()
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.arro.F(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r0 = r6
        L57:
            r8.getClass()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = defpackage.aqjn.X(r8)
            nfw r8 = (defpackage.nfw) r8
            goto L64
        L63:
            r0 = r6
        L64:
            android.content.Context r1 = r0.c
            r2 = 2132019177(0x7f1407e9, float:1.9676682E38)
            java.lang.String r1 = r1.getString(r2)
            r8.getClass()
            android.net.Uri r8 = r8.c()
            vlq r8 = defpackage.vlq.a(r1, r8)
            vle[] r1 = new defpackage.vle[r3]
            java.lang.String r2 = r7.h()
            android.net.Uri r3 = r7.a()
            vlq r2 = defpackage.vlq.a(r2, r3)
            android.content.Context r3 = r0.c
            r4 = 2132022039(0x7f141317, float:1.9682486E38)
            java.lang.String r3 = r3.getString(r4)
            xnv r4 = r0.f
            j$.time.Instant r4 = r4.f()
            long r4 = r4.toEpochMilli()
            vld r2 = defpackage.vle.a(r2, r3, r4)
            vle r2 = r2.a()
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = defpackage.aqjn.D(r1)
            java.lang.String r2 = r7.h()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vlg r8 = defpackage.vli.b(r8, r1, r2, r3)
            java.lang.String r7 = r7.h()
            r8.d(r7)
            android.content.Context r7 = r0.c
            r1 = 2131231850(0x7f08046a, float:1.8079793E38)
            androidx.core.graphics.drawable.IconCompat r7 = androidx.core.graphics.drawable.IconCompat.g(r7, r1)
            r8.a = r7
            android.content.Context r7 = r0.c
            r0 = 2131102297(0x7f060a59, float:1.7817028E38)
            int r7 = r7.getColor(r0)
            r8.c(r7)
            vli r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnh.i(miu, arpe):java.lang.Object");
    }
}
