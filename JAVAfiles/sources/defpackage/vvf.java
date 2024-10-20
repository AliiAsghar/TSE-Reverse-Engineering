package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvf extends arpw implements arqr {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ vvg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvf(vvg vvgVar, arpe arpeVar) {
        super(1, arpeVar);
        this.e = vvgVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new vvf(this.e, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008a -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r10.d
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBatchWorker$upgradeEligibleMmsGroups$2"
            java.lang.String r4 = "MmsGroupUpgradeBatchWorker.kt"
            java.lang.String r5 = "BugleGroupManagement"
            r6 = 1
            if (r1 == 0) goto L20
            if (r1 == r6) goto L1c
            int r1 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            defpackage.aqil.P(r11)
            goto L8d
        L1c:
            defpackage.aqil.P(r11)
            goto L36
        L20:
            defpackage.aqil.P(r11)
            vvg r11 = r10.e
            miw r11 = r11.c
            akul r11 = r11.j()
            r11.getClass()
            r10.d = r6
            java.lang.Object r11 = defpackage.arro.F(r11, r10)
            if (r11 == r0) goto Lc3
        L36:
            alog r11 = (defpackage.alog) r11
            alvi r1 = defpackage.vvg.a
            alvw r1 = r1.g()
            alvz r6 = defpackage.alwp.a
            r1.X(r6, r5)
            r6 = 28
            alvw r1 = r1.h(r3, r2, r6, r4)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r6 = "Upgradable candidate groups: %s"
            r1.t(r6, r11)
            r11.getClass()
            vvg r1 = r10.e
            boolean r6 = r11.isEmpty()
            r7 = 0
            if (r6 == 0) goto L5d
            goto La1
        L5d:
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r9 = r7
            r7 = r1
            r1 = r9
        L65:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto La0
            java.lang.Object r11 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r11
            r8 = r7
            vvg r8 = (defpackage.vvg) r8
            miw r8 = r8.c
            akul r11 = r8.v(r11)
            r11.getClass()
            r10.a = r7
            r10.b = r6
            r10.c = r1
            r8 = 2
            r10.d = r8
            java.lang.Object r11 = defpackage.arro.F(r11, r10)
            if (r11 != r0) goto L8d
            return r0
        L8d:
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L65
            int r1 = r1 + 1
            if (r1 >= 0) goto L65
            defpackage.aqjn.F()
            goto L65
        La0:
            r7 = r1
        La1:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r7)
            int r0 = r11.intValue()
            alvi r1 = defpackage.vvg.a
            alvw r1 = r1.g()
            alvz r6 = defpackage.alwp.a
            r1.X(r6, r5)
            r5 = 33
            alvw r1 = r1.h(r3, r2, r5, r4)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r2 = "%d groups attempted to upgrade."
            r1.r(r2, r0)
            return r11
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.b(java.lang.Object):java.lang.Object");
    }
}
