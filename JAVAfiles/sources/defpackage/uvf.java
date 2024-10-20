package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper");
    public static final uuf b = uuh.f(uuh.b, "background_service_duration_seconds", 65);
    public final mbl c;
    private final armf d;
    private final anen e;
    private final armf f;
    private final ocf g;
    private final aneo h;
    private final armf i;
    private final xym j;

    public uvf(armf armfVar, xym xymVar, armf armfVar2, mbl mblVar, anen anenVar, armf armfVar3, ocf ocfVar, aneo aneoVar) {
        this.d = armfVar;
        this.j = xymVar;
        this.i = armfVar2;
        this.c = mblVar;
        this.e = anenVar;
        this.f = armfVar3;
        this.g = ocfVar;
        this.h = aneoVar;
    }

    public static boolean c(int i, int i2) {
        if (i == 1 || i2 == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:4)(1:5))|7|(3:8|9|(4:27|28|13|14)(4:(2:21|22)|(2:15|16)|13|14))|33|34|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        r11.addSuppressed(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(boolean r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            if (r11 != 0) goto L9
            if (r12 != 0) goto L9
            if (r13 == 0) goto L8
            r13 = 1
            goto L9
        L8:
            return
        L9:
            alvi r0 = defpackage.uvf.a
            alvw r0 = r0.g()
            alvz r1 = defpackage.alwp.a
            java.lang.String r2 = "BugleNetwork"
            r0.X(r1, r2)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "attachToWakelockOrService"
            r3 = 164(0xa4, float:2.3E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper"
            java.lang.String r5 = "TickleHandlerHelper.java"
            alvw r0 = r0.h(r4, r1, r3, r5)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "Prewarm service starting"
            r0.q(r1)
            java.lang.String r0 = "TickleHandlerHelper::backgroundService"
            akrh r0 = defpackage.aktp.e(r0)
            aneo r1 = r10.h     // Catch: java.lang.Throwable -> Ld0
            eyg r3 = new eyg     // Catch: java.lang.Throwable -> Ld0
            r4 = 11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Ld0
            uuf r4 = defpackage.uvf.b     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> Ld0
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Ld0
            anem r1 = r1.schedule(r3, r4, r6)     // Catch: java.lang.Throwable -> Ld0
            akul r1 = defpackage.akul.g(r1)     // Catch: java.lang.Throwable -> Ld0
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r11 == 0) goto L7c
            armf r11 = r10.f     // Catch: java.lang.Throwable -> L61
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Throwable -> L61
            umz r11 = (defpackage.umz) r11     // Catch: java.lang.Throwable -> L61
            r11.b(r1)     // Catch: java.lang.Throwable -> L61
            goto Lcc
        L61:
            r11 = move-exception
            r9 = r11
            alvi r11 = defpackage.uvf.a     // Catch: java.lang.Throwable -> Ld0
            alvw r3 = r11.i()     // Catch: java.lang.Throwable -> Ld0
            alvz r11 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Ld0
            r3.X(r11, r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper"
            java.lang.String r6 = "attachToWakelockOrService"
            java.lang.String r8 = "TickleHandlerHelper.java"
            java.lang.String r4 = "Wakelock or service can't be attached."
            r7 = 178(0xb2, float:2.5E-43)
            defpackage.a.cj(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld0
            goto Lcc
        L7c:
            if (r12 == 0) goto La4
            armf r11 = r10.f     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Throwable -> L8a
            umz r11 = (defpackage.umz) r11     // Catch: java.lang.Throwable -> L8a
            r11.a(r1)     // Catch: java.lang.Throwable -> L8a
            goto La4
        L8a:
            r11 = move-exception
            r9 = r11
            alvi r11 = defpackage.uvf.a     // Catch: java.lang.Throwable -> Ld0
            alvw r3 = r11.i()     // Catch: java.lang.Throwable -> Ld0
            alvz r11 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Ld0
            r3.X(r11, r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper"
            java.lang.String r6 = "attachToWakelockOrService"
            java.lang.String r8 = "TickleHandlerHelper.java"
            java.lang.String r4 = "Unable to attachService."
            r7 = 186(0xba, float:2.6E-43)
            defpackage.a.cj(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld0
        La4:
            if (r13 == 0) goto Lcc
            armf r11 = r10.f     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Throwable -> Lb2
            umz r11 = (defpackage.umz) r11     // Catch: java.lang.Throwable -> Lb2
            r11.c(r1)     // Catch: java.lang.Throwable -> Lb2
            goto Lcc
        Lb2:
            r11 = move-exception
            r9 = r11
            alvi r11 = defpackage.uvf.a     // Catch: java.lang.Throwable -> Ld0
            alvw r3 = r11.i()     // Catch: java.lang.Throwable -> Ld0
            alvz r11 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Ld0
            r3.X(r11, r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper"
            java.lang.String r6 = "attachToWakelockOrService"
            java.lang.String r8 = "TickleHandlerHelper.java"
            java.lang.String r4 = "Unable to attachWakelock."
            r7 = 193(0xc1, float:2.7E-43)
            defpackage.a.cj(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld0
        Lcc:
            r0.close()
            return
        Ld0:
            r11 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Ld5
            goto Ld9
        Ld5:
            r12 = move-exception
            r11.addSuppressed(r12)
        Ld9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvf.d(boolean, boolean, boolean):void");
    }

    public final akul a(algk algkVar, aqfn aqfnVar, String str, String str2) {
        return ((akul) algkVar.apply(aqfnVar)).e(Throwable.class, new tul(this, str, str2, 8), this.e);
    }

    public final void b(String str, aqfn aqfnVar, algk algkVar, algk algkVar2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Notification notification;
        boolean z6 = this.j.a;
        alvw g = a.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "handleNonDittoTickle", 100, "TickleHandlerHelper.java")).K("Handling non-Ditto firebase tickle. Type: [%s], ID: [%s], isHighPriority: [%b], isForeground: [%b]", str2, str, Boolean.valueOf(z), Boolean.valueOf(z6));
        if (z6) {
            a(algkVar, aqfnVar, "Failed to bind in response to tickle", "Bugle.Fcm.Phone.Bind.Failure.Count");
            if (((ansy) ((nlg) this.g).a.b()).e("bugle.enable_service_wakelock_after_message_received")) {
                d(z3, z4, z5);
                return;
            }
            return;
        }
        akul a2 = a(algkVar2, aqfnVar, "Failed to pull messages in response to tickle", "Bugle.Fcm.Phone.Pull.Failure.Count");
        if (z2) {
            a2.i(new ukk(this, algkVar, aqfnVar, 4, (short[]) null), andi.a);
            d(z3, z4, z5);
        }
        if (z) {
            notification = ((via) this.i.b()).a();
        } else {
            notification = null;
        }
        if (notification != null) {
            umz umzVar = (umz) this.f.b();
            ((akat) this.d.b()).g(a2);
            umzVar.e(a2, notification, 12);
            return;
        }
        ((akat) this.d.b()).g(a2);
    }
}
