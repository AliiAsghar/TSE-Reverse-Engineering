package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wws implements wwn {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl");
    public final armf a;
    private final Context c;
    private final arwe d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final okr j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final wpp q;

    public wws(Context context, arwe arweVar, armf armfVar, wpp wppVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, okr okrVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        wppVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        okrVar.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        this.c = context;
        this.d = arweVar;
        this.e = armfVar;
        this.q = wppVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar5;
        this.a = armfVar6;
        this.i = armfVar7;
        this.j = okrVar;
        this.k = armfVar9;
        this.l = armfVar10;
        this.m = armfVar11;
        this.n = armfVar12;
        this.o = armfVar13;
        this.p = armfVar14;
        ascy.a(yyb.db(wxb.a.createBuilder()).h());
    }

    static /* synthetic */ void B(wws wwsVar, int i, boolean z) {
        aozy createBuilder = amvy.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvy amvyVar = (amvy) apagVar;
        amvyVar.b |= 1;
        amvyVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amvy amvyVar2 = (amvy) createBuilder.b;
        amvyVar2.b |= 2;
        amvyVar2.d = z;
        boolean f = ((adtg) wwsVar.h.b()).f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amvy amvyVar3 = (amvy) apagVar2;
        amvyVar3.b |= 8;
        amvyVar3.f = f;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amvy amvyVar4 = (amvy) createBuilder.b;
        amvyVar4.e = a.an(4);
        amvyVar4.b = 4 | amvyVar4.b;
        apag s = createBuilder.s();
        s.getClass();
        qjh.l(wwsVar.d, null, new wwh(wwsVar, (amvy) s, (arpe) null, 3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wwo
            if (r0 == 0) goto L13
            r0 = r5
            wwo r0 = (defpackage.wwo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwo r0 = new wwo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            armf r5 = r4.f
            java.lang.Object r5 = r5.b()
            wvu r5 = (defpackage.wvu) r5
            r0.c = r3
            java.util.Set r5 = r5.e()
            if (r5 == r1) goto L72
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.aqjn.J(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r5.next()
            wxb r1 = (defpackage.wxb) r1
            adiw r2 = new adiw
            java.lang.String r1 = r1.c
            r1.getClass()
            r2.<init>(r1)
            r0.add(r2)
            goto L53
        L6d:
            java.util.Set r5 = defpackage.aqjn.aE(r0)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wws.A(arpe):java.lang.Object");
    }

    @Override // defpackage.wwn
    public final wwz a() {
        return ((wvu) this.f.b()).a();
    }

    @Override // defpackage.wwn
    public final akul b() {
        return qjh.b(new ncd((Object) this, 3, (short[]) null), this.d);
    }

    @Override // defpackage.wwn
    public final akul c() {
        return qjh.b(new ncd((Object) this, 4, (int[]) null), this.d);
    }

    @Override // defpackage.wwn
    public final akul d() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new vck(this, (arpe) null, 19));
        return c;
    }

    @Override // defpackage.wwn
    public final akul e(wwm wwmVar) {
        akul c;
        wwmVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new wwh(this, wwmVar, (arpe) null, 2));
        return c;
    }

    @Override // defpackage.wwn
    public final Optional f() {
        Object obj;
        wxa wxaVar = (wxa) ((AtomicReference) this.q.c).get();
        if (wxaVar != null) {
            wwz wwzVar = wxaVar.d;
            if (wwzVar == null) {
                wwzVar = wwz.a;
            }
            String str = wwzVar.c;
            str.getClass();
            apax apaxVar = wxaVar.c;
            apaxVar.getClass();
            Iterator<E> it = apaxVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (d.F(((wxb) obj).c, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return Optional.ofNullable(obj);
        }
        throw new wvl();
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) {
        List opportunisticSubscriptions;
        Set aE;
        ParcelUuid groupUuid;
        String str;
        adiv c = this.q.c(i);
        if (c != null) {
            ((alvg) b.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 332, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in simStateCache. subId %s: provisioning id: %s", new adix(i), advq.SIM_ID.c(adom.n(c).a));
            return Optional.ofNullable(c);
        }
        znj znjVar = (znj) this.g.b();
        if (Build.VERSION.SDK_INT < 29) {
            aE = arnx.a;
        } else {
            String q = ((yjy) znjVar.b).h(i).q();
            if (q != null) {
                try {
                    opportunisticSubscriptions = ((SubscriptionManager) adwq.b((Context) znjVar.a).a).getOpportunisticSubscriptions();
                    opportunisticSubscriptions.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : opportunisticSubscriptions) {
                        groupUuid = ((SubscriptionInfo) obj).getGroupUuid();
                        if (groupUuid != null) {
                            str = groupUuid.toString();
                        } else {
                            str = null;
                        }
                        if (d.F(str, q)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new adix(((SubscriptionInfo) it.next()).getSubscriptionId()));
                    }
                    aE = aqjn.aE(arrayList2);
                } catch (SecurityException e) {
                    throw new adwk("READ_PHONE_STATE permission is missing.", e);
                }
            } else {
                aE = arnx.a;
            }
        }
        Iterator it2 = aE.iterator();
        while (it2.hasNext()) {
            adiv c2 = this.q.c(((adix) it2.next()).a);
            if (c2 != null) {
                ((alvg) b.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 360, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in opportunisticSubs. subId %s: provisioning id: %s", new adix(i), advq.SIM_ID.c(adom.n(c2).a));
                return Optional.of(c2);
            }
        }
        alvi alviVar = b;
        ((alvg) alviVar.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 368, "SimSubscriptionInfoRetrieverImpl.kt")).t("No match for subId %s", new adix(i));
        if (z) {
            ((alvg) alviVar.i().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 372, "SimSubscriptionInfoRetrieverImpl.kt")).t("No SimSubscriptionInfo found in cache for subId %s. Looking up cached availability based on the ICCID from SubscriptionMetadataUtils.", new adix(i));
            String y = ((yjy) this.e.b()).h(i).y();
            if (y != null && y.length() != 0) {
                return Optional.of(new adiw(y));
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.wwn
    public final Optional h(wwm wwmVar) {
        wwmVar.getClass();
        Optional ofNullable = Optional.ofNullable(((wvu) this.f.b()).b(wwmVar));
        if (wwmVar == wwm.a) {
        }
        return ofNullable;
    }

    @Override // defpackage.wwn
    public final Optional j(adiv adivVar) {
        adivVar.getClass();
        return Optional.ofNullable(((wvu) this.f.b()).c(adivVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:11:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.wwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wwp
            if (r0 == 0) goto L13
            r0 = r8
            wwp r0 = (defpackage.wwp) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            wwp r0 = new wwp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            wws r6 = r0.g
            defpackage.aqil.P(r8)
            goto L7f
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            wws r2 = r0.g
            defpackage.aqil.P(r8)
            goto L4e
        L40:
            defpackage.aqil.P(r8)
            r0.g = r7
            r0.f = r4
            java.util.Set r8 = r7.n()
            if (r8 == r1) goto La7
            r2 = r7
        L4e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.aqjn.J(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
            r6 = r2
            r2 = r4
            r4 = r8
        L62:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r4.next()
            adiv r8 = (defpackage.adiv) r8
            r0.g = r6
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r8 = r6.x(r8)
            if (r8 == r1) goto L86
            r5 = r2
        L7f:
            wxb r8 = (defpackage.wxb) r8
            r2.add(r8)
            r2 = r5
            goto L62
        L86:
            return r1
        L87:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r2.iterator()
        L90:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()
            wxb r1 = (defpackage.wxb) r1
            if (r1 == 0) goto L90
            r8.add(r1)
            goto L90
        La2:
            java.util.Set r8 = defpackage.aqjn.aE(r8)
            return r8
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wws.k(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.wwm r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wwq
            if (r0 == 0) goto L13
            r0 = r6
            wwq r0 = (defpackage.wwq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwq r0 = new wwq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wwm r5 = r0.e
            wws r0 = r0.d
            defpackage.aqil.P(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            armf r6 = r4.f
            java.lang.Object r6 = r6.b()
            wvu r6 = (defpackage.wvu) r6
            r0.d = r4
            r0.e = r5
            r0.c = r3
            wxb r6 = r6.b(r5)
            if (r6 == r1) goto L5a
            r0 = r4
        L4b:
            wxb r6 = (defpackage.wxb) r6
            wwm r1 = defpackage.wwm.a
            if (r5 != r1) goto L59
            armf r5 = r0.i
            java.lang.Object r5 = r5.b()
            olh r5 = (defpackage.olh) r5
        L59:
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wws.l(wwm, arpe):java.lang.Object");
    }

    @Override // defpackage.wwn
    public final Set m() {
        Set e = ((wvu) this.f.b()).e();
        ArrayList arrayList = new ArrayList(aqjn.J(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            String str = ((wxb) it.next()).c;
            str.getClass();
            arrayList.add(new adiw(str));
        }
        return aqjn.aE(arrayList);
    }

    @Override // defpackage.wwn
    public final Set n() {
        if (!this.j.a()) {
            wxb b2 = ((wvu) this.f.b()).b(wwm.a);
            if (b2 != null) {
                String str = b2.c;
                str.getClass();
                return aqjn.e(new adiw(str));
            }
            return arnx.a;
        }
        return m();
    }

    @Override // defpackage.wwn
    public final Set o() {
        Set n = n();
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            wxb wxbVar = (wxb) arsd.k(j((adiv) it.next()));
            if (wxbVar != null) {
                arrayList.add(wxbVar);
            }
        }
        return aqjn.aE(arrayList);
    }

    @Override // defpackage.wwn
    public final Set p() {
        return ((wvu) this.f.b()).e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.wwn
    public final Set q(adiv adivVar) {
        adivVar.getClass();
        return aqjn.aE(alzz.bc(this.q.a).s().p().b(adivVar));
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ boolean r(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            String q = ((yjy) this.e.b()).h(i).q();
            if (q != null || (q = ((yjy) this.e.b()).h(i2).q()) != null) {
                List d = adwq.b(this.c).d(ParcelUuid.fromString(q));
                d.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
                }
                if (arrayList.contains(Integer.valueOf(i)) && arrayList.contains(Integer.valueOf(i2))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ boolean s(int i) {
        TelephonyManager createForSubscriptionId;
        boolean z = false;
        if (((off) this.m.b()).a()) {
            Optional map = i(i).map(new wki(wwr.a, 11));
            map.getClass();
            String str = (String) arsd.k(map);
            if (str != null) {
                z = m().contains(new adiw(str));
            }
            if (((acxa) this.l.b()).a()) {
                B(this, i, z);
                return z;
            }
        } else if (((ofg) this.o.b()).a()) {
            if (((yjf) this.p.b()).h()) {
                if (adwq.b(this.c).a(i) != null) {
                    z = true;
                }
                if (((acxa) this.l.b()).a()) {
                    B(this, i, z);
                    return z;
                }
            }
        } else if (((ofh) this.n.b()).a()) {
            if (((yjf) this.p.b()).h()) {
                Object systemService = this.c.getSystemService("phone");
                systemService.getClass();
                createForSubscriptionId = ((TelephonyManager) systemService).createForSubscriptionId(i);
                createForSubscriptionId.getClass();
                if (createForSubscriptionId.hasIccCard() && createForSubscriptionId.getSimState() == 5) {
                    z = true;
                }
            }
            if (((acxa) this.l.b()).a()) {
                B(this, i, z);
                return z;
            }
        } else {
            ykb h = ((yjy) this.e.b()).h(i);
            if (h.e() == 5 && h.C()) {
                z = true;
            }
            if (((acxa) this.l.b()).a()) {
                B(this, i, z);
            }
        }
        return z;
    }

    @Override // defpackage.wwn
    public final boolean t() {
        return ((AtomicBoolean) this.q.b).get();
    }

    @Override // defpackage.wwn
    public final Object u() {
        return n();
    }

    @Override // defpackage.wwn
    public final Object v() {
        return ((wvu) this.f.b()).e();
    }

    @Override // defpackage.wwn
    public final Object w(adiv adivVar) {
        String o = ((wvu) this.f.b()).b.o("sim_loggable_guid_".concat(adom.n(adivVar).a));
        if (true == o.isEmpty()) {
            o = null;
        }
        if (o == null) {
            ((alvg) wvu.a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getLoggableGuidSync", 114, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No loggable guid found for sim id");
            return null;
        }
        return o;
    }

    @Override // defpackage.wwn
    public final Object x(adiv adivVar) {
        return ((wvu) this.f.b()).c(adivVar);
    }

    @Override // defpackage.wwn
    public final Object y(int i) {
        return ((wvu) this.f.b()).d(i);
    }

    @Override // defpackage.wwn
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Optional i(int i) {
        return Optional.ofNullable(((wvu) this.f.b()).d(i));
    }
}
