package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zui extends arpw implements arqw {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ zum e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zui(zum zumVar, arpe arpeVar) {
        super(3, arpeVar);
        this.e = zumVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zui zuiVar = new zui(this.e, (arpe) obj3);
        zuiVar.c = (alog) obj;
        zuiVar.d = (miu) obj2;
        return zuiVar.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            boolean r0 = r9.a
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.aqil.P(r10)
            goto L60
        L16:
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.aqil.P(r10)
            goto L49
        L1e:
            defpackage.aqil.P(r10)
            goto L38
        L22:
            defpackage.aqil.P(r10)
            java.lang.Object r10 = r9.c
            alog r10 = (defpackage.alog) r10
            java.lang.Object r1 = r9.d
            zum r4 = r9.e
            r5 = 0
            r9.c = r5
            r9.b = r3
            java.lang.Object r10 = r4.b(r10, r1, r9)
            if (r10 == r0) goto Lb4
        L38:
            zum r1 = r9.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r10 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r10
            r9.c = r10
            r9.b = r2
            java.lang.Object r1 = r1.d(r9)
            if (r1 == r0) goto Lb4
            r8 = r1
            r1 = r10
            r10 = r8
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            zum r2 = r9.e
            r9.c = r1
            r9.a = r10
            r4 = 3
            r9.b = r4
            java.lang.Object r2 = r2.c(r9)
            if (r2 == r0) goto Lb4
            r0 = r10
            r10 = r2
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r10.booleanValue()
            alvi r4 = defpackage.zum.a
            alvw r4 = r4.g()
            alvz r5 = defpackage.alwp.a
            java.lang.String r6 = "BugleBanners"
            r4.X(r5, r6)
            alvg r4 = (defpackage.alvg) r4
            r5 = r0 ^ 1
            alvz r6 = defpackage.zuc.h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.X(r6, r5)
            alvz r5 = defpackage.zuc.i
            r4.X(r5, r10)
            java.lang.String r10 = "invokeSuspend"
            r5 = 74
            java.lang.String r6 = "com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2DataServiceImpl$getAddContactBanner2LoadedDataFlow$1$1"
            java.lang.String r7 = "AddContactBanner2DataServiceImpl.kt"
            alvw r10 = r4.h(r6, r10, r5, r7)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r4 = "Add contact banner is dismissed and first incoming"
            r10.q(r4)
            r10 = 0
            if (r1 == 0) goto La1
            if (r0 == 0) goto La1
            if (r2 == 0) goto La1
            r0 = r3
            goto La2
        La1:
            r0 = r10
        La2:
            zun r2 = new zun
            if (r0 == 0) goto Laf
            zum r4 = r9.e
            boolean r4 = r4.e(r1)
            if (r4 == 0) goto Laf
            goto Lb0
        Laf:
            r3 = r10
        Lb0:
            r2.<init>(r1, r0, r3)
            return r2
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zui.b(java.lang.Object):java.lang.Object");
    }
}
