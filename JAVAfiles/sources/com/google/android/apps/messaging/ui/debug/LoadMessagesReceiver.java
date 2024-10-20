package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.aamo;
import defpackage.aams;
import defpackage.aana;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.apwt;
import defpackage.armf;
import defpackage.arpj;
import defpackage.arqr;
import defpackage.arqw;
import defpackage.arro;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.d;
import defpackage.jwz;
import defpackage.qjh;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoadMessagesReceiver extends aamo {
    public static final arqr a = aams.b;
    public static final arqr b = aams.a;
    public static final arqw c = jwz.o;
    public static final alvi d = alvi.m("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver");
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public apwt j;
    public apwt k;
    public armf l;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.e;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("LoadMessagesReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        akul c2;
        context.getClass();
        intent.getClass();
        if (!d.F(intent.getAction(), "com.google.android.apps.messaging.load_messages")) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("load_data_from_file", true);
        Object a2 = c.a(intent, context, "messages.csv");
        int intValue = ((Number) a.a(intent)).intValue();
        int intValue2 = ((Number) b.a(intent)).intValue();
        boolean booleanExtra2 = intent.getBooleanExtra("sync_bugle_db_after_load", true);
        alvw g = d.g();
        g.X(alwp.a, "BugleTests");
        File file = (File) a2;
        ((alvg) g.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver", "processBroadcast", 102, "LoadMessagesReceiver.kt")).L("Loading messages from csv file. loadDataFromFile=%s, filename=%s, numMessages=%s, offset=%s, syncBugleDbAfterLoad=%s", Boolean.valueOf(booleanExtra), file.getAbsolutePath(), Integer.valueOf(intValue), Integer.valueOf(intValue2), Boolean.valueOf(booleanExtra2));
        armf armfVar = this.g;
        if (armfVar == null) {
            arro.b("backgroundScope");
            armfVar = null;
        }
        Object b2 = armfVar.b();
        b2.getClass();
        c2 = qjh.c((arwe) b2, arpj.a, arwf.a, new aana(booleanExtra, this, file, intValue, intValue2, booleanExtra2, context, null));
        q("LoadMessages", c2);
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    public final apwt f() {
        apwt apwtVar = this.j;
        if (apwtVar != null) {
            return apwtVar;
        }
        arro.b("mmsSmsThreadIdResolver");
        return null;
    }

    public final apwt g() {
        apwt apwtVar = this.k;
        if (apwtVar != null) {
            return apwtVar;
        }
        arro.b("syncManager");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (defpackage.armd.p(r4, r2) != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.io.File r15, int r16, int r17, boolean r18, defpackage.arpe r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof defpackage.aamu
            if (r2 == 0) goto L16
            r2 = r1
            aamu r2 = (defpackage.aamu) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.d = r3
            goto L1b
        L16:
            aamu r2 = new aamu
            r2.<init>(r14, r1)
        L1b:
            java.lang.Object r1 = r2.b
            arpl r3 = defpackage.arpl.a
            int r4 = r2.d
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L41
            if (r4 == r6) goto L37
            if (r4 != r7) goto L2f
            defpackage.aqil.P(r1)
            goto Lce
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            boolean r4 = r2.a
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r6 = r2.e
            defpackage.aqil.P(r1)
            r12 = r4
            r9 = r6
            goto L7b
        L41:
            defpackage.aqil.P(r1)
            apwt r1 = r14.g()
            java.lang.Object r1 = r1.b()
            wzp r1 = (defpackage.wzp) r1
            r1.q(r5)
            armf r1 = r14.k()
            java.lang.Object r1 = r1.b()
            r1.getClass()
            arpi r1 = (defpackage.arpi) r1
            aamx r4 = new aamx
            r12 = 0
            r13 = 0
            r8 = r4
            r9 = r15
            r10 = r17
            r11 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            r2.e = r0
            r8 = r18
            r2.a = r8
            r2.d = r6
            java.lang.Object r1 = defpackage.arro.q(r1, r4, r2)
            if (r1 == r3) goto Ld1
            r9 = r0
            r12 = r8
        L7b:
            java.util.List r1 = (java.util.List) r1
            armf r4 = r9.l()
            java.lang.Object r4 = r4.b()
            xnv r4 = (defpackage.xnv) r4
            long r10 = r4.a()
            aghw r4 = new aghw
            r6 = 7
            r4.<init>(r1, r6)
            gbz r1 = new gbz
            r6 = 0
            r8 = 10
            r1.<init>(r4, r6, r9, r8)
            asaa r4 = new asaa
            r4.<init>(r1)
            qjt r1 = new qjt
            r1.<init>(r4, r6, r5)
            asaa r4 = new asaa
            r4.<init>(r1)
            asai r1 = defpackage.armd.u(r4, r7)
            aamv r4 = new aamv
            r4.<init>(r9, r6)
            akee r5 = new akee
            r5.<init>(r1, r4, r8)
            aamw r1 = new aamw
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r12, r13)
            akee r4 = new akee
            r8 = 3
            r4.<init>(r5, r1, r8)
            r2.e = r6
            r2.d = r7
            java.lang.Object r1 = defpackage.armd.p(r4, r2)
            if (r1 != r3) goto Lce
            goto Ld1
        Lce:
            arnb r1 = defpackage.arnb.a
            return r1
        Ld1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.h(java.io.File, int, int, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(int r49, android.content.Context r50, boolean r51, defpackage.arpe r52) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.i(int, android.content.Context, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r17, java.lang.String r18, defpackage.arpe r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof defpackage.aamz
            if (r3 == 0) goto L19
            r3 = r2
            aamz r3 = (defpackage.aamz) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            aamz r3 = new aamz
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            arpl r4 = defpackage.arpl.a
            int r5 = r3.c
            r6 = 1
            if (r5 == 0) goto L3d
            if (r5 != r6) goto L35
            java.lang.String r1 = r3.f
            java.lang.String r4 = r3.e
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r3 = r3.d
            defpackage.aqil.P(r2)
            r6 = r1
            r5 = r4
            goto L68
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.aqil.P(r2)
            armf r2 = r16.k()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            arpi r2 = (defpackage.arpi) r2
            aafa r5 = new aafa
            r7 = 0
            r8 = 6
            r5.<init>(r0, r1, r7, r8)
            r3.d = r0
            r3.e = r1
            r7 = r18
            r3.f = r7
            r3.c = r6
            java.lang.Object r2 = defpackage.arro.q(r2, r5, r3)
            if (r2 != r4) goto L65
            return r4
        L65:
            r3 = r0
            r5 = r1
            r6 = r7
        L68:
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            armf r1 = r3.l()
            java.lang.Object r1 = r1.b()
            xnv r1 = (defpackage.xnv) r1
            j$.time.Instant r1 = r1.f()
            long r7 = r1.toEpochMilli()
            r14 = 1
            r15 = 1
            r11 = -1
            r13 = 0
            android.content.ContentValues r1 = defpackage.aamb.a(r5, r6, r7, r9, r11, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.j(java.lang.String, java.lang.String, arpe):java.lang.Object");
    }

    public final armf k() {
        armf armfVar = this.h;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("backgroundContext");
        return null;
    }

    public final armf l() {
        armf armfVar = this.f;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("clock");
        return null;
    }
}
