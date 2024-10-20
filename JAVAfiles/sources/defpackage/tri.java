package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tri implements trh {
    public static final /* synthetic */ int a = 0;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl");
    private final armf c;
    private final armf d;
    private final trj e;
    private final armf f;
    private final anen g;
    private maq h;
    private abnr i;
    private final Context j;
    private final AtomicReference k = new AtomicReference();
    private final AtomicReference l = new AtomicReference();
    private int m = -1;
    private int n = -1;
    private apmc o;
    private final armf p;
    private final armf q;
    private final armf r;

    static {
        alpt.s(aplw.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT, aplw.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION, aplw.SHOW_VERIFICATION_PROMPT_NOTIFICATION);
    }

    public tri(Context context, armf armfVar, armf armfVar2, trj trjVar, armf armfVar3, armf armfVar4, armf armfVar5, anen anenVar, armf armfVar6) {
        this.j = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = trjVar;
        this.f = armfVar3;
        this.p = armfVar4;
        this.q = armfVar5;
        this.g = anenVar;
        this.r = armfVar6;
    }

    private static void j() {
        alvw d = b.d();
        d.X(alwp.a, "DittoClearcutLogger");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logClearcutDisabled", 155, "DittoClearcutLoggerImpl.java")).q("Clearcut loggings are disabled.");
    }

    private final boolean k() {
        if (!((Boolean) uwg.a.e()).booleanValue() && !((ozu) this.r.b()).a()) {
            return false;
        }
        return true;
    }

    private final void l(String str, String str2, int i, int i2, int i3, String str3, int i4, int i5) {
        m("", str, str2, i, i2, i3, str3, i4, i5);
    }

    private final void m(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, int i5) {
        aply aplyVar;
        if (!this.e.a()) {
            j();
            return;
        }
        int i6 = i2 - 1;
        int i7 = 2;
        aozy o = o(2);
        int i8 = 5;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 != 6) {
                        i8 = 9;
                    } else {
                        i8 = 8;
                    }
                } else {
                    i8 = 7;
                }
            } else {
                i8 = 6;
            }
        }
        aozy createBuilder = aplz.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aplz) createBuilder.b).c = a.ak(3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aplz) createBuilder.b).d = a.av(i8);
        if (i != -1) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplz) createBuilder.b).b = i;
        }
        if (i3 != -1) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplz) createBuilder.b).g = i3;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aplz aplzVar = (aplz) createBuilder.b;
            str2.getClass();
            aplzVar.e = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            xze xzeVar = xca.a;
            if (msx.g(str3)) {
                alvw i9 = b.i();
                i9.X(alwp.a, "DittoClearcutLogger");
                ((alvg) ((alvg) i9).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "canLogSessionId", 1198, "DittoClearcutLoggerImpl.java")).q("Preventing unexpected logging of sessionId containing email address");
            } else {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aplz aplzVar2 = (aplz) createBuilder.b;
                str3.getClass();
                aplzVar2.f = str3;
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aplz aplzVar3 = (aplz) createBuilder.b;
            str4.getClass();
            aplzVar3.h = str4;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aplz aplzVar4 = (aplz) createBuilder.b;
            str.getClass();
            aplzVar4.n = str;
        }
        if (i4 != -1) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplz) createBuilder.b).i = i4;
        }
        if (i5 != -1) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplz) createBuilder.b).j = i5;
        }
        try {
            Context context = this.j;
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.google.android.ims.binding.SystemBindingService"));
            if (componentEnabledSetting == 1) {
                aplyVar = aply.ENABLED;
            } else if (componentEnabledSetting == 2) {
                aplyVar = aply.DISABLED;
            } else {
                throw new IllegalStateException(a.bV(componentEnabledSetting, "Unexpected component state: "));
            }
        } catch (IllegalStateException unused) {
            aplyVar = aply.UNKNOWN_STATE;
        }
        alvw e = b.e();
        e.X(alwp.a, "DittoClearcutLogger");
        ((alvg) ((alvg) e).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoGrpcMessage", 500, "DittoClearcutLoggerImpl.java")).t("System binding state: %s", aplyVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aplz) createBuilder.b).m = aplyVar.a();
        if (((ode) this.p.b()).a()) {
            boolean z = !((wfh) this.q.b()).S();
            if (!o.b.isMutable()) {
                o.u();
            }
            apmd apmdVar = (apmd) o.b;
            apmd apmdVar2 = apmd.a;
            apmdVar.b |= 2;
            apmdVar.h = z;
        }
        n(createBuilder, null);
        if (!o.b.isMutable()) {
            o.u();
        }
        apmd apmdVar3 = (apmd) o.b;
        aplz aplzVar5 = (aplz) createBuilder.s();
        apmd apmdVar4 = apmd.a;
        aplzVar5.getClass();
        apmdVar3.d = aplzVar5;
        apmdVar3.c = 3;
        if (k() && str3 != null && str3.length() != 0) {
            if (!str3.startsWith("+")) {
                i7 = 3;
            }
        } else {
            i7 = 1;
        }
        i(o, i7);
    }

    private final void n(aozy aozyVar, aozy aozyVar2) {
        AtomicReference atomicReference = this.k;
        Instant now = Instant.now();
        if (atomicReference.get() == null || Duration.between((Temporal) this.k.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
            this.m = vht.g(this.j);
            this.n = vht.h(this.j);
            this.k.set(now);
        }
        int i = this.m;
        if (i != -1) {
            if (aozyVar != null) {
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aplz aplzVar = (aplz) aozyVar.b;
                aplz aplzVar2 = aplz.a;
                aplzVar.k = i;
            }
            if (aozyVar2 != null) {
                int i2 = this.m;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                aplu apluVar = (aplu) aozyVar2.b;
                aplu apluVar2 = aplu.a;
                apluVar.f = i2;
            }
        }
        int i3 = this.n;
        if (i3 != -1) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (aozyVar != null) {
                        if (!aozyVar.b.isMutable()) {
                            aozyVar.u();
                        }
                        aplz aplzVar3 = (aplz) aozyVar.b;
                        aplz aplzVar4 = aplz.a;
                        aplzVar3.l = a.an(4);
                    }
                    if (aozyVar2 != null) {
                        if (!aozyVar2.b.isMutable()) {
                            aozyVar2.u();
                        }
                        aplu apluVar3 = (aplu) aozyVar2.b;
                        aplu apluVar4 = aplu.a;
                        apluVar3.g = a.an(4);
                        return;
                    }
                    return;
                }
                if (aozyVar != null) {
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    aplz aplzVar5 = (aplz) aozyVar.b;
                    aplz aplzVar6 = aplz.a;
                    aplzVar5.l = a.an(3);
                }
                if (aozyVar2 != null) {
                    if (!aozyVar2.b.isMutable()) {
                        aozyVar2.u();
                    }
                    aplu apluVar5 = (aplu) aozyVar2.b;
                    aplu apluVar6 = aplu.a;
                    apluVar5.g = a.an(3);
                    return;
                }
                return;
            }
            if (aozyVar != null) {
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aplz aplzVar7 = (aplz) aozyVar.b;
                aplz aplzVar8 = aplz.a;
                aplzVar7.l = a.an(2);
            }
            if (aozyVar2 != null) {
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                aplu apluVar7 = (aplu) aozyVar2.b;
                aplu apluVar8 = aplu.a;
                apluVar7.g = a.an(2);
            }
        }
    }

    private static aozy o(int i) {
        aozy createBuilder = apmd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((apmd) apagVar).e = i - 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apmd) createBuilder.b).f = a.aq(8);
        return createBuilder;
    }

    @Override // defpackage.trh
    public final void a() {
        aiut.b();
        trj trjVar = this.e;
        boolean i = ((yep) trjVar.g.b()).i("bugle_enable_analytics", true);
        if (i) {
            trjVar.b = (maq) trjVar.a.b();
            trjVar.c = new abnm(trjVar.f, "COMMS_MESSAGES_WEB").a();
            trjVar.d = abnr.l(trjVar.f, "COMMS_MESSAGES_WEB").a();
        }
        trjVar.e.set(i);
        if (this.e.a()) {
            trj trjVar2 = this.e;
            this.h = trjVar2.b;
            this.i = trjVar2.c;
        }
    }

    @Override // defpackage.trh
    public final void b(boolean z, int i) {
        if (!this.e.a()) {
            j();
            return;
        }
        armf armfVar = this.p;
        aozy o = o(12);
        if (((ode) armfVar.b()).a()) {
            boolean z2 = !((wfh) this.q.b()).S();
            if (!o.b.isMutable()) {
                o.u();
            }
            apmd apmdVar = (apmd) o.b;
            apmd apmdVar2 = apmd.a;
            apmdVar.b |= 2;
            apmdVar.h = z2;
        }
        amee t = ((lfl) this.d.b()).t(-1);
        int V = a.V(i);
        if (V == 0) {
            V = 4;
        }
        aozy createBuilder = aplt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aplt apltVar = (aplt) apagVar;
        t.getClass();
        apltVar.e = t;
        apltVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((aplt) apagVar2).c = z;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((aplt) createBuilder.b).d = a.as(V);
        aplt apltVar2 = (aplt) createBuilder.s();
        if (!o.b.isMutable()) {
            o.u();
        }
        apmd apmdVar3 = (apmd) o.b;
        apmd apmdVar4 = apmd.a;
        apltVar2.getClass();
        apmdVar3.d = apltVar2;
        apmdVar3.c = 16;
        i(o, 4);
    }

    @Override // defpackage.trh
    public final void c(String str, int i, int i2) {
        l("", "", -1, 7, -1, str, i, i2);
    }

    @Override // defpackage.trh
    public final void d(String str, String str2, int i, int i2, String str3) {
        l(str, str2, i, 4, i2, str3, -1, -1);
    }

    @Override // defpackage.trh
    public final void e(String str, String str2, int i, String str3, int i2) {
        m("", str, str2, i, 8, i2, str3, -1, -1);
    }

    @Override // defpackage.trh
    public final void f(String str, String str2, String str3, int i, String str4, int i2) {
        m(str, str2, str3, i, 8, i2, str4, -1, -1);
    }

    @Override // defpackage.trh
    public final void g(String str, String str2, int i, String str3, int i2) {
        l(str, str2, i, 6, i2, str3, -1, -1);
    }

    @Override // defpackage.trh
    public final void h(amjv amjvVar, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        if (!this.e.a()) {
            j();
            return;
        }
        Optional ofNullable = Optional.ofNullable(((ykw) this.c.b()).f("tachyon_registration_id", ""));
        aozy u = ((lfl) this.d.b()).u(-1);
        if (!u.b.isMutable()) {
            u.u();
        }
        amee ameeVar = (amee) u.b;
        apap apapVar = amee.a;
        ameeVar.c &= -5;
        ameeVar.f = false;
        amee ameeVar2 = (amee) u.s();
        int i6 = 3;
        int i7 = i2;
        if (i7 != 2) {
            i7 = 3;
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            aozy o = o(8);
            if (((ode) this.p.b()).a()) {
                boolean z3 = !((wfh) this.q.b()).S();
                if (!o.b.isMutable()) {
                    o.u();
                }
                apmd apmdVar = (apmd) o.b;
                apmd apmdVar2 = apmd.a;
                apmdVar.b |= 2;
                apmdVar.h = z3;
            }
            int ordinal = amjvVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                i3 = 6;
                            } else {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(amjvVar))));
                            }
                        } else {
                            i3 = 5;
                        }
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 3;
                }
            } else {
                i3 = 2;
            }
            aozy createBuilder = aplu.a.createBuilder();
            String str = (String) ofNullable.orElse("");
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            str.getClass();
            ((aplu) apagVar).c = str;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aplu) createBuilder.b).d = a.am(i3);
            if (z) {
                i4 = 4;
            } else {
                i4 = 3;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplu) createBuilder.b).e = a.an(i4);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplu) createBuilder.b).j = a.am(3);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aplu apluVar = (aplu) createBuilder.b;
            ameeVar2.getClass();
            apluVar.i = ameeVar2;
            apluVar.b |= 1;
            n(null, createBuilder);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aplu) createBuilder.b).h = a.as(i);
            aplu apluVar2 = (aplu) createBuilder.s();
            if (!o.b.isMutable()) {
                o.u();
            }
            apmd apmdVar3 = (apmd) o.b;
            apmd apmdVar4 = apmd.a;
            apluVar2.getClass();
            apmdVar3.d = apluVar2;
            apmdVar3.c = 9;
            if (k() && i7 == 2) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            i(o, i5);
        }
        if (!z2) {
            int i8 = i7 - 1;
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.DITTO_BINDING_STATUS;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            aozy createBuilder2 = amjx.a.createBuilder();
            String str2 = (String) ofNullable.orElse("");
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            amjx amjxVar = (amjx) apagVar2;
            str2.getClass();
            amjxVar.b |= 1;
            amjxVar.c = str2;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar3 = createBuilder2.b;
            amjx amjxVar2 = (amjx) apagVar3;
            amjxVar2.d = amjvVar.f;
            amjxVar2.b |= 2;
            if (true != z) {
                i6 = 2;
            }
            if (!apagVar3.isMutable()) {
                createBuilder2.u();
            }
            amjx amjxVar3 = (amjx) createBuilder2.b;
            amjxVar3.e = i6 - 1;
            amjxVar3.b |= 4;
            AtomicReference atomicReference = this.k;
            Instant now = Instant.now();
            if (atomicReference.get() == null || Duration.between((Temporal) this.k.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
                this.m = vht.g(this.j);
                this.n = vht.h(this.j);
                this.k.set(now);
            }
            int i9 = this.m;
            if (i9 != -1) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amjx amjxVar4 = (amjx) createBuilder2.b;
                amjxVar4.b |= 8;
                amjxVar4.f = i9;
            }
            int i10 = this.n;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amjx amjxVar5 = (amjx) createBuilder2.b;
                        amjxVar5.g = 2;
                        amjxVar5.b |= 16;
                    } else {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amjx amjxVar6 = (amjx) createBuilder2.b;
                        amjxVar6.g = 1;
                        amjxVar6.b |= 16;
                    }
                } else {
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amjx amjxVar7 = (amjx) createBuilder2.b;
                    amjxVar7.g = 0;
                    amjxVar7.b |= 16;
                }
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amjx amjxVar8 = (amjx) createBuilder2.b;
            amjxVar8.h = a.as(i);
            amjxVar8.b |= 32;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar4 = createBuilder2.b;
            amjx amjxVar9 = (amjx) apagVar4;
            ameeVar2.getClass();
            amjxVar9.i = ameeVar2;
            amjxVar9.b |= 64;
            if (!apagVar4.isMutable()) {
                createBuilder2.u();
            }
            amjx amjxVar10 = (amjx) createBuilder2.b;
            amjxVar10.j = i8;
            amjxVar10.b |= 128;
            amjx amjxVar11 = (amjx) createBuilder2.s();
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amjxVar11.getClass();
            amfrVar2.aa = amjxVar11;
            amfrVar2.c |= Integer.MIN_VALUE;
            this.h.j(amfqVar);
        }
        alvw e = b.e();
        e.X(alwp.a, "DittoClearcutLogger");
        ((alvg) ((alvg) e).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoBindingStatusEvent", 731, "DittoClearcutLoggerImpl.java")).t("Binding status: %s", amjvVar);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [arwe, java.lang.Object] */
    final void i(aozy aozyVar, int i) {
        apmc apmcVar;
        abnr abnrVar;
        akul c;
        if (k()) {
            if (!this.e.a()) {
                return;
            }
        } else if (this.i == null) {
            return;
        }
        AtomicReference atomicReference = this.l;
        Instant now = Instant.now();
        if (atomicReference.get() == null || Duration.between((Temporal) this.l.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
            Intent registerReceiver = this.j.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                apmcVar = apmc.a;
            } else {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                int intExtra3 = registerReceiver.getIntExtra("status", -1);
                if (intExtra2 == 0) {
                    aozy createBuilder = apmc.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apmc) createBuilder.b).c = intExtra3;
                    apmcVar = (apmc) createBuilder.s();
                } else {
                    float f = intExtra2;
                    aozy createBuilder2 = apmc.a.createBuilder();
                    float f2 = intExtra / f;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    ((apmc) apagVar).b = (int) (f2 * 100.0f);
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    ((apmc) createBuilder2.b).c = intExtra3;
                    apmcVar = (apmc) createBuilder2.s();
                }
            }
            this.o = apmcVar;
            this.l.set(now);
        }
        apmc apmcVar2 = this.o;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apmd apmdVar = (apmd) aozyVar.b;
        apmd apmdVar2 = apmd.a;
        apmcVar2.getClass();
        apmdVar.g = apmcVar2;
        apmdVar.b |= 1;
        aozy createBuilder3 = apmj.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apmj apmjVar = (apmj) createBuilder3.b;
        apmd apmdVar3 = (apmd) aozyVar.s();
        apmdVar3.getClass();
        apmjVar.c = apmdVar3;
        apmjVar.b |= 1;
        apmj apmjVar2 = (apmj) createBuilder3.s();
        if (k()) {
            trj trjVar = this.e;
            if (i != 2 && i != 4) {
                abnrVar = trjVar.d;
            } else {
                abnrVar = trjVar.c;
            }
        } else {
            abnrVar = this.i;
        }
        if (abnrVar == null) {
            return;
        }
        lru lruVar = (lru) this.f.b();
        c = qjh.c(lruVar.c, arpj.a, arwf.a, new lgp(lruVar, (arpe) null, 12, (byte[]) null));
        qiu.h(c.h(new raw(abnrVar, apmjVar2, 8), this.g));
    }
}
