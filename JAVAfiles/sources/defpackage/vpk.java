package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vpk {
    private static final alvi i = alvi.m("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider");
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final arpi e;
    public final arpi f;
    public final arwe g;
    public final arwe h;
    private final armf j;
    private final armf k;
    private final oky l;
    private final armf m;
    private final arpi n;

    public vpk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, oky okyVar, armf armfVar5, armf armfVar6, armf armfVar7, arpi arpiVar, arpi arpiVar2, arpi arpiVar3, arwe arweVar, arwe arweVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        arpiVar3.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.a = armfVar;
        this.j = armfVar2;
        this.b = armfVar3;
        this.k = armfVar4;
        this.l = okyVar;
        this.c = armfVar5;
        this.m = armfVar6;
        this.d = armfVar7;
        this.e = arpiVar;
        this.f = arpiVar2;
        this.n = arpiVar3;
        this.g = arweVar;
        this.h = arweVar2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [arwe, java.lang.Object] */
    private final adit i(int i2) {
        adit a = ((adji) this.a.b()).a(i2);
        if (a == null && ((ansy) ((nro) this.l).a.b()).e("bugle.enable_rcs_local_identity_provider_logging")) {
            yyt yytVar = (yyt) this.k.b();
            qjh.l(yytVar.b, null, new uxn(yytVar, i2, (arpe) null, 2), 3);
            return null;
        }
        return a;
    }

    private final adit j(qei qeiVar) {
        adae adaeVar = (adae) this.m.b();
        String str = qeiVar.d;
        str.getClass();
        return adaeVar.d(str);
    }

    private final Object k(qei qeiVar, adix adixVar, int i2) {
        if (adixVar == null) {
            if (i2 == 1) {
                alvw i3 = i.i();
                i3.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) i3;
                alvgVar.Z(alwk.MEDIUM);
                alvgVar.X(ydl.D, qeiVar.d);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "toSubscriptionIdInternal-FVOka_M", 361, "RcsLocalIdentityProvider.kt")).q("Chat endpoint id does not exist in identity mapping.");
            }
            return aqil.O(new vpn());
        }
        if (adixVar.a >= 0) {
            return adixVar;
        }
        alvw i4 = i.i();
        i4.X(alwp.a, "Bugle");
        alvg alvgVar2 = (alvg) i4;
        alvgVar2.Z(alwk.MEDIUM);
        alvgVar2.X(ydl.D, qeiVar.d);
        alvgVar2.X(ydl.t, Integer.valueOf(adixVar.a));
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "toSubscriptionIdInternal-FVOka_M", 374, "RcsLocalIdentityProvider.kt")).q("The sub id of the provided self chat endpoint is not valid.");
        return aqil.O(new vpm());
    }

    public final qei a(int i2) {
        alvi alviVar = i;
        alvw d = alviVar.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvz alvzVar = ydl.t;
        Integer valueOf = Integer.valueOf(i2);
        alvgVar.X(alvzVar, valueOf);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 98, "RcsLocalIdentityProvider.kt")).q("Attempt to get self identity.");
        adom.m(i2);
        if (((pce) this.d.b()).a()) {
            adit i3 = i(i2);
            if (i3 != null) {
                qei c = ((psq) this.c.b()).c(i3.a);
                c.getClass();
                alvw d2 = alviVar.d();
                d2.X(alwp.a, "Bugle");
                alvg alvgVar2 = (alvg) d2;
                alvgVar2.X(ydl.t, valueOf);
                alvgVar2.X(ydl.D, c.d);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 108, "RcsLocalIdentityProvider.kt")).q("Retrieved phone number for given sub id.");
                return c;
            }
            return null;
        }
        adit i4 = i(i2);
        if (i4 != null) {
            alvw d3 = alviVar.d();
            d3.X(alwp.a, "Bugle");
            alvg alvgVar3 = (alvg) d3;
            alvgVar3.X(ydl.t, valueOf);
            alvgVar3.X(ydl.D, i4.a);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 118, "RcsLocalIdentityProvider.kt")).q("Retrieved phone number for given sub id.");
            return ((psq) this.c.b()).c(i4.a);
        }
        return null;
    }

    public final qei b(int i2) {
        qei a = a(i2);
        if (a != null) {
            return a;
        }
        throw new vpd(i2);
    }

    public final akul c(ConversationIdType conversationIdType) {
        akul c;
        akul c2;
        conversationIdType.getClass();
        if (((pce) this.d.b()).a()) {
            c2 = qjh.c(this.h, arpj.a, arwf.a, new vpi(this, conversationIdType, (arpe) null, 1, (byte[]) null));
            return c2;
        }
        c = qjh.c(this.g, arpj.a, arwf.a, new vpi(this, conversationIdType, (arpe) null, 0));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vph
            if (r0 == 0) goto L13
            r0 = r6
            vph r0 = (defpackage.vph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vph r0 = new vph
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r6)
            armq r6 = (defpackage.armq) r6
            java.lang.Object r5 = r6.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            r0.c = r3
            java.lang.Object r5 = r4.e(r5, r3, r0)
            if (r5 == r1) goto L44
        L3e:
            boolean r6 = r5 instanceof defpackage.armp
            if (r6 == 0) goto L43
            r5 = 0
        L43:
            return r5
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpk.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, int r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.vpe
            if (r0 == 0) goto L13
            r0 = r10
            vpe r0 = (defpackage.vpe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vpe r0 = new vpe
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            defpackage.aqil.P(r10)
            armq r10 = (defpackage.armq) r10
            java.lang.Object r8 = r10.a
            goto Lb4
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            int r9 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r0.e
            vpk r2 = r0.d
            defpackage.aqil.P(r10)
            goto L5c
        L42:
            defpackage.aqil.P(r10)
            arpi r10 = r7.n
            uog r2 = new uog
            r6 = 5
            r2.<init>(r7, r8, r5, r6)
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r4
            java.lang.Object r10 = defpackage.arro.q(r10, r2, r0)
            if (r10 == r1) goto Lb5
            r2 = r7
        L5c:
            smr r10 = (defpackage.smr) r10
            if (r10 == 0) goto L65
            java.lang.String r10 = r10.K()
            goto L66
        L65:
            r10 = r5
        L66:
            if (r10 != 0) goto La0
            if (r9 != r4) goto L96
            alvi r9 = defpackage.vpk.i
            alvw r9 = r9.i()
            alvz r10 = defpackage.alwp.a
            java.lang.String r0 = "Bugle"
            r9.X(r10, r0)
            alvg r9 = (defpackage.alvg) r9
            alwk r10 = defpackage.alwk.MEDIUM
            r9.Z(r10)
            alvz r10 = defpackage.ydl.p
            r9.X(r10, r8)
            java.lang.String r8 = "getLocalIdentityFromConversationId-0E7RQCE"
            r10 = 288(0x120, float:4.04E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "RcsLocalIdentityProvider.kt"
            alvw r8 = r9.h(r0, r8, r10, r1)
            alvg r8 = (defpackage.alvg) r8
            java.lang.String r9 = "Active self identity is not set in the conversation."
            r8.q(r9)
        L96:
            vpl r8 = new vpl
            r8.<init>()
            java.lang.Object r8 = defpackage.aqil.O(r8)
            return r8
        La0:
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r8 = defpackage.lga.V(r10)
            r0.d = r5
            r0.e = r5
            r10 = 0
            r0.f = r10
            r0.c = r3
            java.lang.Object r8 = r2.g(r8, r9, r0)
            if (r8 != r1) goto Lb4
            return r1
        Lb4:
            return r8
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpk.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.nfw r7, int r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.vpf
            if (r0 == 0) goto L13
            r0 = r9
            vpf r0 = (defpackage.vpf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vpf r0 = new vpf
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qei r7 = r0.d
            defpackage.aqil.P(r9)
            armq r9 = (defpackage.armq) r9
            java.lang.Object r8 = r9.a
            goto L9e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r9)
            j$.util.Optional r9 = r7.i()
            vnk r2 = defpackage.vnk.c
            viu r4 = new viu
            r5 = 7
            r4.<init>(r2, r5)
            j$.util.Optional r9 = r9.flatMap(r4)
            r9.getClass()
            java.lang.Object r9 = defpackage.arsd.k(r9)
            qei r9 = (defpackage.qei) r9
            if (r9 != 0) goto L93
            if (r8 != r3) goto L89
            alvi r8 = defpackage.vpk.i
            alvw r8 = r8.i()
            alvz r9 = defpackage.alwp.a
            java.lang.String r0 = "Bugle"
            r8.X(r9, r0)
            alvg r8 = (defpackage.alvg) r8
            alwk r9 = defpackage.alwk.MEDIUM
            r8.Z(r9)
            alvz r9 = defpackage.ydl.m
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r7 = r7.f()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl r7 = (com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl) r7
            java.lang.String r7 = r7.a
            r8.X(r9, r7)
            java.lang.String r7 = "getLocalIdentityFromSelfIdentity-0E7RQCE"
            r9 = 325(0x145, float:4.55E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "RcsLocalIdentityProvider.kt"
            alvw r7 = r8.h(r0, r7, r9, r1)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r8 = "Self identity does not contain any chat endpoint."
            r7.q(r8)
        L89:
            vpo r7 = new vpo
            r7.<init>()
            java.lang.Object r7 = defpackage.aqil.O(r7)
            return r7
        L93:
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r6.h(r9, r8, r0)
            if (r8 == r1) goto Laa
            r7 = r9
        L9e:
            boolean r9 = defpackage.armq.d(r8)
            if (r9 == 0) goto La9
            adix r8 = (defpackage.adix) r8
            int r8 = r8.a
            return r7
        La9:
            return r8
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpk.f(nfw, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9, int r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpk.g(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.qei r8, int r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.vpj
            if (r0 == 0) goto L13
            r0 = r10
            vpj r0 = (defpackage.vpj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vpj r0 = new vpj
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r9 = r0.f
            qei r8 = r0.e
            vpk r0 = r0.d
            defpackage.aqil.P(r10)
            goto L5e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.aqil.P(r10)
            armf r10 = r7.a
            java.lang.Object r10 = r10.b()
            adji r10 = (defpackage.adji) r10
            adit r2 = r7.j(r8)
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r3
            arpi r3 = r10.d
            zez r4 = new zez
            r5 = 0
            r6 = 19
            r4.<init>(r10, r2, r5, r6)
            java.lang.Object r10 = defpackage.arro.q(r3, r4, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r0 = r7
        L5e:
            adix r10 = (defpackage.adix) r10
            java.lang.Object r8 = r0.k(r8, r10, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpk.h(qei, int, arpe):java.lang.Object");
    }
}
