package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yri {
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    private final armf m;
    private final armf n;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification");
    private static final utz l = uuh.e(uuh.b, "spam_max_reclassification_index", 100);
    public static final utz b = uuh.e(uuh.b, "spam_max_reclassification_latency_hours", 24);

    public yri(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.m = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
        this.j = armfVar9;
        this.k = armfVar10;
        this.n = armfVar11;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yrk r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.yrg
            if (r0 == 0) goto L13
            r0 = r14
            yrg r0 = (defpackage.yrg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yrg r0 = new yrg
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            akrh r13 = r0.d
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L2b
            goto Lae
        L2b:
            r14 = move-exception
            goto Lb9
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            defpackage.aqil.P(r14)
            java.lang.String r14 = "SpamReclassification.reclassifySpam"
            akrh r14 = defpackage.aktp.e(r14)
            java.lang.String r2 = r13.d     // Catch: java.lang.Throwable -> Lb5
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r7 = defpackage.rvc.b(r2)     // Catch: java.lang.Throwable -> Lb5
            ypi r2 = defpackage.ypi.a     // Catch: java.lang.Throwable -> Lb5
            int r2 = r13.c     // Catch: java.lang.Throwable -> Lb5
            ypi r8 = defpackage.yyb.H(r2)     // Catch: java.lang.Throwable -> Lb5
            int r9 = r13.e     // Catch: java.lang.Throwable -> Lb5
            utz r13 = defpackage.yri.l     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r2 = r13.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> Lb5
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Lb5
            if (r9 < r2) goto L90
            alvi r0 = defpackage.yri.a     // Catch: java.lang.Throwable -> Lb5
            alvw r0 = r0.i()     // Catch: java.lang.Throwable -> Lb5
            alvg r0 = (defpackage.alvg) r0     // Catch: java.lang.Throwable -> Lb5
            alvz r1 = defpackage.ydl.b     // Catch: java.lang.Throwable -> Lb5
            r0.X(r1, r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification"
            java.lang.String r2 = "reclassifySpam$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_util_spam_reclassification_spam_reclassification_AUTO_DEPS_ORIGINAL"
            java.lang.String r4 = "SpamReclassification.kt"
            r5 = 111(0x6f, float:1.56E-43)
            alvw r0 = r0.h(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> Lb5
            alvg r0 = (defpackage.alvg) r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "reclassification skipped: current index %d exceeds maximum %d"
            java.lang.Object r13 = r13.e()     // Catch: java.lang.Throwable -> Lb5
            r13.getClass()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> Lb5
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> Lb5
            r0.u(r1, r9, r13)     // Catch: java.lang.Throwable -> Lb5
            arnb r13 = defpackage.arnb.a     // Catch: java.lang.Throwable -> Lb5
            defpackage.armd.i(r14, r3)
            return r13
        L90:
            armf r13 = r12.n     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r13 = r13.b()     // Catch: java.lang.Throwable -> Lb5
            r13.getClass()     // Catch: java.lang.Throwable -> Lb5
            arpi r13 = (defpackage.arpi) r13     // Catch: java.lang.Throwable -> Lb5
            yrh r2 = new yrh     // Catch: java.lang.Throwable -> Lb5
            r10 = 0
            r5 = r2
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb5
            r0.d = r14     // Catch: java.lang.Throwable -> Lb5
            r0.c = r4     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r13 = defpackage.arro.q(r13, r2, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r13 == r1) goto Lb4
            r13 = r14
        Lae:
            defpackage.armd.i(r13, r3)
            arnb r13 = defpackage.arnb.a
            return r13
        Lb4:
            return r1
        Lb5:
            r13 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        Lb9:
            throw r14     // Catch: java.lang.Throwable -> Lba
        Lba:
            r0 = move-exception
            defpackage.armd.i(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yri.a(yrk, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    public final void b(ypi ypiVar, MessageIdType messageIdType, ype ypeVar, int i) {
        if (ypeVar.d == null) {
            return;
        }
        wfh wfhVar = (wfh) this.m.b();
        aozy createBuilder = yrk.a.createBuilder();
        createBuilder.getClass();
        int i2 = ypiVar.l;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yrk yrkVar = (yrk) createBuilder.b;
        yrkVar.b |= 1;
        yrkVar.c = i2;
        String a2 = messageIdType.a();
        a2.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        yrk yrkVar2 = (yrk) apagVar;
        yrkVar2.b |= 2;
        yrkVar2.d = a2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        yrk yrkVar3 = (yrk) createBuilder.b;
        yrkVar3.b |= 4;
        yrkVar3.e = i;
        Integer num = ypeVar.d;
        num.getClass();
        int intValue = num.intValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yrk yrkVar4 = (yrk) createBuilder.b;
        yrkVar4.b |= 8;
        yrkVar4.f = intValue;
        apag s = createBuilder.s();
        s.getClass();
        ypeVar.d.getClass();
        ((uof) wfhVar.a.b()).b(upk.b("spam_reclassification_handler", (yrk) s, new uta(null, null, Duration.ofSeconds(r10.intValue()), null, null, null)));
    }
}
