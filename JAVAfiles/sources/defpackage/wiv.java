package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.LocalDate;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wiv implements wih {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl");
    public static final akfc b = new akgc("RCS_ENABLED_DATA_SOURCE_KEY");
    public static final akfc c = new akgc("RCS_SETTINGS_DATA_SOURCE_KEY");
    private final armf A;
    private final armf B;
    private final ahiy C;
    private final yyt D;
    private final wfh E;
    public final armf d;
    public final arwe e;
    public final arpi f;
    public final anen g;
    public final wul h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    private final Context s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;

    public wiv(Context context, armf armfVar, arwe arweVar, arpi arpiVar, anen anenVar, wul wulVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ahiy ahiyVar, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, wfh wfhVar, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21) {
        context.getClass();
        armfVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        anenVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        ahiyVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        armfVar15.getClass();
        wfhVar.getClass();
        armfVar16.getClass();
        armfVar17.getClass();
        armfVar18.getClass();
        armfVar19.getClass();
        armfVar20.getClass();
        armfVar21.getClass();
        this.s = context;
        this.d = armfVar;
        this.e = arweVar;
        this.f = arpiVar;
        this.g = anenVar;
        this.h = wulVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.k = armfVar5;
        this.C = ahiyVar;
        this.l = armfVar6;
        this.t = armfVar7;
        this.m = armfVar8;
        this.n = armfVar9;
        this.u = armfVar10;
        this.o = armfVar11;
        this.v = armfVar12;
        this.p = armfVar13;
        this.w = armfVar14;
        this.x = armfVar15;
        this.E = wfhVar;
        this.y = armfVar16;
        this.q = armfVar17;
        this.z = armfVar18;
        this.r = armfVar19;
        this.A = armfVar20;
        this.B = armfVar21;
        this.D = wfhVar.Y(new qds(3));
    }

    private final wja E(adiv adivVar) {
        wja wjaVar;
        if (((okw) this.p.b()).a()) {
            int C = ((wpp) this.v.b()).C(adivVar) - 1;
            if (C != 0) {
                if (C != 1) {
                    wjaVar = wja.PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED;
                } else {
                    wjaVar = wja.PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED;
                }
            } else {
                wjaVar = wja.PER_SIM_TOGGLE_STATE_ENABLED;
            }
            ((alvg) a.d().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "getDefaultSimLevelToggleStateForProvisioningRule", 407, "RcsSettingsDataServiceImpl.kt")).D("Default sim level toggle state for rcsProvisioningId: %s is %s", advq.SIM_ID.c(adom.n(adivVar).a), wjaVar);
            if (wjaVar == wja.PER_SIM_TOGGLE_STATE_ENABLED) {
                l(adivVar, wjaVar);
            }
            return wjaVar;
        }
        wwz a2 = ((wwn) this.i.b()).a();
        boolean F = d.F(a2.c, adom.n(adivVar).a);
        boolean F2 = d.F(a2.d, adom.n(adivVar).a);
        if (!F && !F2) {
            return wja.PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED;
        }
        l(adivVar, wja.PER_SIM_TOGGLE_STATE_ENABLED);
        return wja.PER_SIM_TOGGLE_STATE_ENABLED;
    }

    private final wjc F() {
        return (wjc) this.h.l();
    }

    private final Map G() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new apaw(F().c, wjc.f));
        unmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new adiw((String) key), entry.getValue());
        }
        return linkedHashMap;
    }

    public final String A(adiv adivVar) {
        String str = adom.n(adivVar).a;
        LocalDate b2 = ((xnv) this.l.b()).g().b();
        Objects.toString(b2);
        return str.concat(String.valueOf(b2));
    }

    public final void B(wiz wizVar) {
        wiz wizVar2;
        if (wizVar != wiz.TOGGLE_STATE_UNSPECIFIED) {
            return;
        }
        if (((ykw) this.d.b()).q(this.s.getString(R.string.enable_rcs_pref_key), true)) {
            wizVar2 = wiz.TOGGLE_STATE_ENABLED;
        } else {
            wizVar2 = wiz.TOGGLE_STATE_USER_DISABLED;
        }
        m(wizVar2);
        ((alvg) a.d().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "backfillGlobalToggleFromBuglePrefs", 174, "RcsSettingsDataServiceImpl.kt")).t("backfillGlobalToggleFromBuglePrefs: setting global toggle to %s", wizVar2);
    }

    public final void C(wiz wizVar) {
        if (wizVar == wiz.TOGGLE_STATE_ENABLED) {
            ((ykw) this.d.b()).h(this.s.getString(R.string.enable_rcs_pref_key), true);
        } else {
            if (wizVar != wiz.TOGGLE_STATE_USER_DISABLED && wizVar != wiz.TOGGLE_STATE_AUTOMATICALLY_DISABLED) {
                return;
            }
            ((ykw) this.d.b()).h(this.s.getString(R.string.enable_rcs_pref_key), false);
        }
    }

    public final boolean D(Map map, adiv adivVar) {
        if (!o()) {
            return false;
        }
        if (!((okr) this.j.b()).a() && !((okw) this.p.b()).a()) {
            return true;
        }
        Object obj = map.get(adivVar);
        if (obj == null) {
            obj = E(adivVar);
        }
        if (obj != wja.PER_SIM_TOGGLE_STATE_ENABLED) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wih
    public final wiz a() {
        if (((pmg) this.q.b()).a()) {
            wiz b2 = wiz.b(F().e);
            if (b2 == null) {
                b2 = wiz.TOGGLE_STATE_UNSPECIFIED;
            }
            b2.getClass();
            B(b2);
        }
        wiz b3 = wiz.b(F().e);
        if (b3 == null) {
            b3 = wiz.TOGGLE_STATE_UNSPECIFIED;
        }
        b3.getClass();
        return b3;
    }

    @Override // defpackage.wih
    public final wja b(adiv adivVar) {
        Object obj = G().get(adivVar);
        if (obj == null) {
            obj = E(adivVar);
        }
        return (wja) obj;
    }

    @Override // defpackage.wih
    public final akgr c() {
        return new wiq(this, 1);
    }

    @Override // defpackage.wih
    public final akgr d() {
        return new wiq(this, 0);
    }

    @Override // defpackage.wih
    public final akgr e(enh enhVar) {
        enhVar.getClass();
        enhVar.c(new wit(this, new wii(this, 0), new vro(this, 2)));
        return new wiq(this, 0);
    }

    @Override // defpackage.wih
    public final akul f(adiv adivVar) {
        akul c2;
        c2 = qjh.c(this.e, arpj.a, arwf.a, new vpi(this, adivVar, (arpe) null, 12, (char[]) null));
        return c2;
    }

    @Override // defpackage.wih
    public final akul g(adiv adivVar, wja wjaVar) {
        akul c2;
        wjaVar.getClass();
        c2 = qjh.c(this.e, arpj.a, arwf.a, new wiu(this, adivVar, wjaVar, (arpe) null, 2, (byte[]) null));
        return c2;
    }

    @Override // defpackage.wih
    public final akul h(wiz wizVar) {
        akul c2;
        wizVar.getClass();
        c2 = qjh.c(this.e, arpj.a, arwf.a, new whw(this, wizVar, (arpe) null, 4));
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.win
            if (r0 == 0) goto L13
            r0 = r7
            win r0 = (defpackage.win) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            win r0 = new win
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            arpi r7 = r6.f
            wio r2 = new wio
            r4 = 0
            r5 = 0
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.i(arpe):java.lang.Object");
    }

    @Override // defpackage.wih
    public final void j() {
        if (!((okr) this.j.b()).a()) {
            return;
        }
        qjh.l(this.e, null, new vck(this, (arpe) null, 4), 3);
    }

    @Override // defpackage.wih
    public final void k() {
        this.C.q(aktp.ag(null), c);
        if (!((osu) this.x.b()).a()) {
        } else {
            this.D.y(new vtc(14), "RcsSettingsDataService::notifyDataChanged");
        }
    }

    @Override // defpackage.wih
    public final void l(adiv adivVar, wja wjaVar) {
        adivVar.getClass();
        wjaVar.getClass();
        this.h.m(new whg(new kjs(adivVar, wjaVar, 20, null), 8));
    }

    @Override // defpackage.wih
    public final void m(wiz wizVar) {
        wizVar.getClass();
        this.h.m(new whg(new uxc(wizVar, 7), 9));
        C(wizVar);
        k();
    }

    @Override // defpackage.wih
    public final boolean n(adiv adivVar) {
        return D(G(), adivVar);
    }

    @Override // defpackage.wih
    public final boolean o() {
        return a().equals(wiz.TOGGLE_STATE_ENABLED);
    }

    @Override // defpackage.wih
    public final boolean p(adiv adivVar) {
        if (!((okw) this.p.b()).a() || b(adivVar) != wja.PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0089 -> B:18:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wij
            if (r0 == 0) goto L13
            r0 = r9
            wij r0 = (defpackage.wij) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wij r0 = new wij
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.aqil.P(r9)
            goto Lc2
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.a
            wiv r6 = r0.e
            defpackage.aqil.P(r9)
            goto L8b
        L3e:
            wiv r2 = r0.e
            defpackage.aqil.P(r9)
            goto L5a
        L44:
            defpackage.aqil.P(r9)
            armf r9 = r8.i
            java.lang.Object r9 = r9.b()
            wwn r9 = (defpackage.wwn) r9
            r0.e = r8
            r0.d = r5
            java.lang.Object r9 = r9.u()
            if (r9 == r1) goto Lc5
            r2 = r8
        L5a:
            java.util.Set r9 = (java.util.Set) r9
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto Lc2
            boolean r6 = r9 instanceof java.util.Collection
            if (r6 == 0) goto L6d
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L6d
            goto L97
        L6d:
            java.util.Iterator r9 = r9.iterator()
            r6 = r2
            r2 = r9
        L73:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L94
            java.lang.Object r9 = r2.next()
            adiv r9 = (defpackage.adiv) r9
            r0.e = r6
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = r6.v(r9, r0)
            if (r9 == r1) goto L96
        L8b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L73
            r5 = 0
        L94:
            r2 = r6
            goto L97
        L96:
            return r1
        L97:
            if (r5 == 0) goto Lc2
            alvi r9 = defpackage.wiv.a
            alvw r9 = r9.g()
            java.lang.String r4 = "automaticallyDisableGlobalToggle"
            r5 = 481(0x1e1, float:6.74E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r7 = "RcsSettingsDataServiceImpl.kt"
            alvw r9 = r9.h(r6, r4, r5, r7)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r4 = "All sim level toggles disabled, automatically disabling global toggle"
            r9.q(r4)
            wiz r9 = defpackage.wiz.TOGGLE_STATE_AUTOMATICALLY_DISABLED
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r2.z(r9, r0)
            if (r9 != r1) goto Lc2
            return r1
        Lc2:
            arnb r9 = defpackage.arnb.a
            return r9
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.q(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.arpe r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.wik
            if (r0 == 0) goto L13
            r0 = r12
            wik r0 = (defpackage.wik) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wik r0 = new wik
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.a
            wiv r5 = r0.e
            defpackage.aqil.P(r12)
            goto L59
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            wiv r2 = r0.e
            defpackage.aqil.P(r12)
            r5 = r2
            goto L53
        L3d:
            defpackage.aqil.P(r12)
            armf r12 = r11.i
            java.lang.Object r12 = r12.b()
            wwn r12 = (defpackage.wwn) r12
            r0.e = r11
            r0.d = r4
            java.lang.Object r12 = r12.u()
            if (r12 == r1) goto Lc6
            r5 = r11
        L53:
            java.util.Set r12 = (java.util.Set) r12
            java.util.Iterator r2 = r12.iterator()
        L59:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lc3
            java.lang.Object r12 = r2.next()
            adiv r12 = (defpackage.adiv) r12
            armf r6 = r5.v
            java.lang.Object r6 = r6.b()
            wpp r6 = (defpackage.wpp) r6
            int r6 = r6.C(r12)
            adiw r7 = defpackage.adom.n(r12)
            java.lang.String r7 = r7.a
            armf r8 = r5.i
            java.lang.Object r8 = r8.b()
            wwn r8 = (defpackage.wwn) r8
            wwz r8 = r8.a()
            java.lang.String r8 = r8.c
            boolean r7 = defpackage.d.F(r7, r8)
            if (r6 == r4) goto L8f
            if (r6 != r3) goto L59
            if (r7 == 0) goto L59
        L8f:
            alvi r6 = defpackage.wiv.a
            alvw r6 = r6.g()
            java.lang.String r7 = "enableProvisioningRuleEligibleSims"
            r8 = 289(0x121, float:4.05E-43)
            java.lang.String r9 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r10 = "RcsSettingsDataServiceImpl.kt"
            alvw r6 = r6.h(r9, r7, r8, r10)
            alvg r6 = (defpackage.alvg) r6
            advq r7 = defpackage.advq.SIM_ID
            adiw r8 = defpackage.adom.n(r12)
            java.lang.String r8 = r8.a
            java.lang.String r7 = r7.c(r8)
            java.lang.String r8 = "Enabling RCS for provisioning rule eligible SIM: %s"
            r6.t(r8, r7)
            wja r6 = defpackage.wja.PER_SIM_TOGGLE_STATE_ENABLED
            r0.e = r5
            r0.a = r2
            r0.d = r3
            java.lang.Object r12 = r5.y(r12, r6, r0)
            if (r12 != r1) goto L59
            return r1
        Lc3:
            arnb r12 = defpackage.arnb.a
            return r12
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.r(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.adiv r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wil
            if (r0 == 0) goto L13
            r0 = r8
            wil r0 = (defpackage.wil) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wil r0 = new wil
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            arpi r8 = r6.f
            vpi r2 = new vpi
            r4 = 0
            r5 = 10
            r2.<init>(r6, r7, r4, r5)
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.s(adiv, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.adiv r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wim
            if (r0 == 0) goto L13
            r0 = r12
            wim r0 = (defpackage.wim) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wim r0 = new wim
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r12)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.aqil.P(r12)
            arpi r12 = r10.f
            vpi r2 = new vpi
            r8 = 11
            r9 = 0
            r7 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r12 = defpackage.arro.q(r12, r2, r0)
            if (r12 != r1) goto L49
            return r1
        L49:
            r12.getClass()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.t(adiv, arpe):java.lang.Object");
    }

    public final Object u(arpe arpeVar) {
        return this.h.c(arpeVar);
    }

    public final Object v(adiv adivVar, arpe arpeVar) {
        return arro.q(this.f, new whw(this, adivVar, (arpe) null, 3), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wip
            if (r0 == 0) goto L13
            r0 = r5
            wip r0 = (defpackage.wip) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wip r0 = new wip
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            r0.c = r3
            java.lang.Object r5 = r4.u(r0)
            if (r5 == r1) goto L84
        L3a:
            wjc r5 = (defpackage.wjc) r5
            apaw r0 = new apaw
            apbo r5 = r5.c
            apas r1 = defpackage.wjc.f
            r0.<init>(r5, r1)
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r0)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.size()
            int r1 = defpackage.aqjn.i(r1)
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            adiw r2 = new adiw
            java.lang.Object r3 = r1.getKey()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L61
        L83:
            return r0
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.w(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x054e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ca  */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x04cf -> B:13:0x04fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.util.Set r49, defpackage.arpe r50) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.x(java.util.Set, arpe):java.lang.Object");
    }

    public final Object y(adiv adivVar, wja wjaVar, arpe arpeVar) {
        Object q = arro.q(this.f, new wiu(this, adivVar, wjaVar, (arpe) null, 0), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final Object z(wiz wizVar, arpe arpeVar) {
        Object q = arro.q(this.f, new vpi(this, wizVar, (arpe) null, 13), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }
}
