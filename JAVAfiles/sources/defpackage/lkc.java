package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkc {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl");
    public final enh b;
    public final lkd c;
    private final arwe d;
    private final Map e;
    private final Map f;
    private boolean g;

    public lkc(lkd lkdVar, arwe arweVar, enh enhVar, Map map, Map map2) {
        lkdVar.getClass();
        arweVar.getClass();
        enhVar.getClass();
        this.c = lkdVar;
        this.d = arweVar;
        this.b = enhVar;
        this.e = map;
        this.f = map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.lke r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ljz
            if (r0 == 0) goto L13
            r0 = r10
            ljz r0 = (defpackage.ljz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ljz r0 = new ljz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            java.lang.String r4 = "handleUpdatedState"
            java.lang.String r5 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl"
            java.lang.String r6 = "NavigationRouterControllerImpl.kt"
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r10)
            goto L9f
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.aqil.P(r10)
            java.util.Map r10 = r8.f
            java.lang.Class r2 = r9.getClass()
            java.lang.Object r10 = r10.get(r2)
            lks r10 = (defpackage.lks) r10
            if (r10 != 0) goto L5e
            alvi r10 = defpackage.lkc.a
            alvw r10 = r10.e()
            r0 = 62
            alvw r10 = r10.h(r5, r4, r0, r6)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r0 = "No navigation operation for state %s"
            r10.t(r0, r9)
            goto Lb2
        L5e:
            alvi r2 = defpackage.lkc.a
            alvw r2 = r2.g()
            r7 = 64
            alvw r2 = r2.h(r5, r4, r7, r6)
            alvg r2 = (defpackage.alvg) r2
            java.lang.String r7 = "Invoking operation %s for state %s"
            r2.D(r7, r10, r9)
            r0.a = r9
            r0.b = r10
            r0.e = r3
            lkh r2 = r9.b()
            java.util.Map r3 = r8.e
            java.lang.Class r7 = r2.getClass()
            java.lang.Object r3 = r3.get(r7)
            ljx r3 = (defpackage.ljx) r3
            if (r3 == 0) goto Lb6
            int r2 = r9.a()
            lkh r7 = r9.b()
            java.lang.Object r0 = r10.a(r2, r7, r3, r0)
            arpl r2 = defpackage.arpl.a
            if (r0 == r2) goto L9b
            arnb r0 = defpackage.arnb.a
        L9b:
            if (r0 == r1) goto Lb5
            r0 = r9
            r9 = r10
        L9f:
            alvi r10 = defpackage.lkc.a
            alvw r10 = r10.e()
            r1 = 66
            alvw r10 = r10.h(r5, r4, r1, r6)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r1 = "Finished invoking operation %s for state %s"
            r10.D(r1, r9, r0)
        Lb2:
            arnb r9 = defpackage.arnb.a
            return r9
        Lb5:
            return r1
        Lb6:
            java.lang.Class r9 = r2.getClass()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            int r0 = defpackage.arsc.a
            arrh r0 = new arrh
            r0.<init>(r9)
            java.lang.String r9 = r0.c()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "A navigation handler has not been provided for "
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkc.a(lke, arpe):java.lang.Object");
    }

    public final void b() {
        ((alvg) a.d().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "initialize", 32, "NavigationRouterControllerImpl.kt")).q("Initializing navigation controller.");
        if (this.g) {
            return;
        }
        qjh.l(this.d, null, new lfn(this, (arpe) null, 3), 3);
        this.g = true;
    }

    public final void c(lkh lkhVar, boolean z) {
        String str;
        alvg alvgVar = (alvg) a.d().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "setCanNavigateToTarget", 55, "NavigationRouterControllerImpl.kt");
        if (true != z) {
            str = "Disabling";
        } else {
            str = "Enabling";
        }
        alvgVar.D("%s navigation to target: %s.", str, lkhVar);
        lkd lkdVar = this.c;
        if (z) {
            lkdVar.a.remove(lkhVar);
        } else {
            lkdVar.a.add(lkhVar);
        }
        if (d.F(lkhVar, llg.a)) {
            lkdVar.b.f(Boolean.valueOf(z));
        }
    }
}
