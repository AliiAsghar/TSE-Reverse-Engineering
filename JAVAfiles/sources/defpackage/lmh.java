package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmh implements ljw, ljv {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler");
    private final Context b;
    private final llc c;
    private final aant d;

    public lmh(Context context, aant aantVar, llc llcVar) {
        this.b = context;
        this.d = aantVar;
        this.c = llcVar;
    }

    @Override // defpackage.ljv
    public final /* bridge */ /* synthetic */ Object a(lkg lkgVar, arpe arpeVar) {
        return d(arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ljw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.lme r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmh.b(lme, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.lmg
            if (r0 == 0) goto L13
            r0 = r8
            lmg r0 = (defpackage.lmg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lmg r0 = new lmg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.aqil.P(r8)
            llc r8 = r7.c
            sl r2 = new sl
            r2.<init>()
            r0.c = r3
            java.lang.String r3 = "com.google.android.apps.messaging.navigation.targets.DirectSendViewer"
            java.lang.Object r8 = r8.a(r3, r2, r0)
            if (r8 == r1) goto L82
        L43:
            ru r8 = (defpackage.ru) r8
            alvi r0 = defpackage.lmh.a
            alvw r1 = r0.e()
            r2 = 155(0x9b, float:2.17E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler"
            java.lang.String r4 = "resumeNavigation"
            java.lang.String r5 = "DirectSendViewer.kt"
            alvw r1 = r1.h(r3, r4, r2, r5)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r2 = "MediaViewer activity result: %s"
            r1.t(r2, r8)
            int r1 = r8.a
            r2 = -1
            r6 = 0
            if (r1 != r2) goto L6e
            android.content.Intent r8 = r8.b
            if (r8 == 0) goto L6d
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r8 = defpackage.lgb.g(r8)
            return r8
        L6d:
            return r6
        L6e:
            alvw r0 = r0.i()
            r1 = 160(0xa0, float:2.24E-43)
            alvw r0 = r0.h(r3, r4, r1, r5)
            alvg r0 = (defpackage.alvg) r0
            int r8 = r8.a
            java.lang.String r1 = "Skipping MediaViewer activity result because of resultCode %s"
            r0.r(r1, r8)
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmh.d(arpe):java.lang.Object");
    }
}
