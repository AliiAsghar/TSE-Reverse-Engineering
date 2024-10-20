package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjt implements wzp {
    private static final xze e = xze.g("Bugle", "ForwardSyncManager");
    public final armf c;
    public final armf d;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final Context k;
    private final arwe l;
    private boolean m;

    public xjt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, Context context, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        context.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = context;
        this.l = arweVar;
        this.m = true;
    }

    public final List A() {
        ArrayList arrayList = new ArrayList();
        if (!this.m) {
            e.o("Forward Sync manually disabled");
        }
        if (!this.m) {
            arrayList.add(amvl.SYNC_DISABLED);
        }
        ArrayList arrayList2 = new ArrayList();
        if (((Optional) ((apxx) this.g).a).isPresent() && !((yjv) this.f.b()).e()) {
            arrayList2.add(amvl.NON_SMS_CAPABLE_WEAR_DEVICE);
        }
        if (!((yjv) this.f.b()).d()) {
            arrayList2.add(amvl.BUGLE_NOT_DEFAULT_SMS_APP);
        }
        if (!arrayList2.isEmpty()) {
            xyo d = e.d();
            d.H("Can't sync with Telephony");
            d.A("isWearable", ((Optional) ((apxx) this.g).a).isPresent());
            d.A("isSmsCapable", ((yjv) this.f.b()).e());
            d.A("isDefaultSmsApp", ((yjv) this.f.b()).d());
            d.q();
        }
        arrayList.addAll(aqjn.ax(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        if (((ppf) this.j.b()).a()) {
            if (!((yjf) this.h.b()).h()) {
                arrayList3.add(amvl.MISSING_PERMISSIONS);
            }
        } else if (!((yjf) this.h.b()).m()) {
            arrayList3.add(amvl.MISSING_PERMISSIONS);
        }
        if (!yhx.h(this.k)) {
            arrayList3.add(amvl.SMS_NOT_ALLOWED_FOR_USER);
        }
        if (!arrayList3.isEmpty()) {
            xyo e2 = e.e();
            e2.H("Missing required permissions for Forward Sync.");
            e2.A("hasSmsPermission", ((yjf) this.h.b()).m());
            e2.A("hasContactsPermission", ((yjf) this.h.b()).f());
            e2.A("hasPhoneStatePermission", ((yjf) this.h.b()).i());
            e2.A("smsAllowedForUser", yhx.h(this.k));
            e2.q();
        }
        arrayList.addAll(aqjn.ax(arrayList3));
        return arrayList;
    }

    @Override // defpackage.wzp
    @armg
    public final long a(long j) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    @armg
    public final xjn b(long j) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    @armg
    public final akul c(boolean z, long j, long j2, long j3, UUID uuid) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    @armg
    public final akul d() {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final akul e() {
        xjw xjwVar = (xjw) this.d.b();
        return xjwVar.g.h().h(new xgu(9), xjwVar.h);
    }

    @Override // defpackage.wzp
    public final akul f(amvm amvmVar) {
        amvmVar.getClass();
        return qjh.a(arrn.I(this.l, null, null, new xgk(this, amvmVar, (arpe) null, 6), 3));
    }

    @Override // defpackage.wzp
    @armg
    public final void g() {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    @armg
    public final void h() {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final void i(long j) {
        akrh e2 = aktp.e("ForwardSyncManager::onNewMessageInserted");
        try {
            xkt xktVar = (xkt) this.c.b();
            Instant ofEpochMilli = Instant.ofEpochMilli(j);
            ofEpochMilli.getClass();
            xktVar.b(ofEpochMilli);
            armd.i(e2, null);
        } finally {
        }
    }

    @Override // defpackage.wzp
    @armg
    public final void j(long j, amvm amvmVar) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final void k(amvm amvmVar) {
        amvmVar.getClass();
        qjh.l(this.l, null, new xgk(this, amvmVar, (arpe) null, 7, (byte[]) null), 3);
    }

    @Override // defpackage.wzp
    public final void l(amvm amvmVar) {
        amvmVar.getClass();
        qjh.l(this.l, null, new xgk(this, amvmVar, (arpe) null, 8, (char[]) null), 3);
    }

    @Override // defpackage.wzp
    public final void m(Uri uri, Instant instant) {
        uri.getClass();
        instant.getClass();
        qjh.l(this.l, null, new wiu(this, uri, instant, (arpe) null, 12), 3);
    }

    @Override // defpackage.wzp
    public final void n() {
        qjh.l(this.l, null, new xjs(this, (arpe) null, 0), 3);
    }

    @Override // defpackage.wzp
    @armg
    public final void o(uj ujVar) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    @armg
    public final void p(boolean z) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final void q(boolean z) {
        this.m = z;
    }

    @Override // defpackage.wzp
    @armg
    public final void r(long j) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final boolean s() {
        Instant instant;
        xjw xjwVar = (xjw) this.d.b();
        Instant instant2 = xjw.d;
        if (!((Boolean) xjw.a.e()).booleanValue()) {
            instant = Instant.ofEpochMilli(xjwVar.e.e("last_sync_time_millis", -1L));
        } else {
            try {
                if ((((xju) xjwVar.g.l()).b & 4) != 0) {
                    apct apctVar = ((xju) xjwVar.g.l()).e;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    instant = aotl.l(apctVar);
                }
            } catch (apba e2) {
                xjw.b.r("Unable to retrieve data.", e2);
            }
            instant = xjw.d;
        }
        boolean z = !instant2.equals(instant);
        Boolean.valueOf(z).getClass();
        return z;
    }

    @Override // defpackage.wzp
    @armg
    public final boolean t(long j) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.wzp
    public final boolean u() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((xju) ((xjw) this.d.b()).g.l()).c);
        } catch (apba e2) {
            xjw.b.r("Unable to retrieve data.", e2);
            bool = false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.wzp
    public final boolean v() {
        return ((xkt) this.c.b()).c();
    }

    @Override // defpackage.wzp
    @armg
    public final boolean w(long j) {
        throw new armn("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
    
        if (r2.a(r10, r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (y(r10, r9, true, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(defpackage.amvm r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.xjp
            if (r0 == 0) goto L13
            r0 = r10
            xjp r0 = (defpackage.xjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xjp r0 = new xjp
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L3a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            amvm r9 = r0.e
            xjt r2 = r0.d
            defpackage.aqil.P(r10)
            goto L73
        L3a:
            defpackage.aqil.P(r10)
            goto Lcd
        L3f:
            defpackage.aqil.P(r10)
            java.util.List r10 = r8.A()
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L56
            r0.c = r5
            java.lang.Object r9 = r8.y(r10, r9, r5, r0)
            if (r9 != r1) goto Lcd
            goto Lcc
        L56:
            armf r10 = r8.d
            java.lang.Object r10 = r10.b()
            xjw r10 = (defpackage.xjw) r10
            akul r10 = r10.a()
            r10.getClass()
            r0.d = r8
            r0.e = r9
            r0.c = r4
            java.lang.Object r10 = defpackage.arro.F(r10, r0)
            if (r10 != r1) goto L72
            goto Lcc
        L72:
            r2 = r8
        L73:
            j$.time.Instant r10 = (j$.time.Instant) r10
            xlb r4 = defpackage.xlb.a
            aozy r4 = r4.createBuilder()
            r4.getClass()
            java.util.UUID r6 = java.util.UUID.randomUUID()
            r6.getClass()
            aozb r6 = defpackage.yyb.bX(r6)
            defpackage.yyb.cp(r6, r4)
            xkv r6 = defpackage.xkv.a
            aozy r6 = r6.createBuilder()
            r6.getClass()
            if (r10 == 0) goto La9
            j$.time.Instant r7 = j$.time.Instant.EPOCH
            int r10 = r10.compareTo(r7)
            if (r10 >= 0) goto La0
            goto La2
        La0:
            r10 = 0
            r5 = r10
        La2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r10.getClass()
        La9:
            defpackage.yyb.cC(r5, r6)
            xkv r10 = defpackage.yyb.cB(r6)
            defpackage.yyb.cm(r10, r4)
            xlb r10 = defpackage.yyb.cl(r4)
            armf r2 = r2.c
            java.lang.Object r2 = r2.b()
            xkt r2 = (defpackage.xkt) r2
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r9 = r2.a(r10, r9, r0)
            if (r9 != r1) goto Lcd
        Lcc:
            return r1
        Lcd:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjt.x(amvm, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[LOOP:0: B:12:0x0090->B:14:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(java.util.List r6, defpackage.amvm r7, boolean r8, defpackage.arpe r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.xjq
            if (r0 == 0) goto L13
            r0 = r9
            xjq r0 = (defpackage.xjq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xjq r0 = new xjq
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            amvm r7 = r0.f
            java.lang.Object r6 = r0.a
            xjt r8 = r0.e
            defpackage.aqil.P(r9)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.aqil.P(r9)
            if (r8 == 0) goto L70
            armf r8 = r5.d
            java.lang.Object r8 = r8.b()
            xjw r8 = (defpackage.xjw) r8
            akul r8 = r8.a()
            r8.getClass()
            r0.e = r5
            r0.a = r6
            r0.f = r7
            r0.d = r4
            java.lang.Object r9 = defpackage.arro.F(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r5
        L5a:
            j$.time.Instant r0 = defpackage.xjw.c
            boolean r9 = defpackage.d.F(r9, r0)
            armf r8 = r8.i
            java.lang.Object r8 = r8.b()
            vyv r8 = (defpackage.vyv) r8
            alog r0 = defpackage.alzz.aZ(r6)
            r8.J(r7, r3, r9, r0)
            goto L7f
        L70:
            armf r8 = r5.i
            java.lang.Object r8 = r8.b()
            vyv r8 = (defpackage.vyv) r8
            alog r9 = defpackage.alzz.aZ(r6)
            r8.K(r7, r3, r9)
        L7f:
            xze r7 = defpackage.xjt.e
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.aqjn.J(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L90:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La4
            java.lang.Object r9 = r6.next()
            amvl r9 = (defpackage.amvl) r9
            java.lang.String r9 = r9.name()
            r8.add(r9)
            goto L90
        La4:
            r8.toString()
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = "Sync request failed: "
            java.lang.String r6 = r8.concat(r6)
            r7.o(r6)
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjt.y(java.util.List, amvm, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0128, code lost:
    
        if (r2.a(r10, r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (y(r10, r9, false, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.amvm r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjt.z(amvm, arpe):java.lang.Object");
    }
}
