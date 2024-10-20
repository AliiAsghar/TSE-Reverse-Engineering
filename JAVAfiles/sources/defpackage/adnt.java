package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnt {
    public final Context c;
    public final armf d;
    public final armf e;
    public String f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public aiwu h;
    private final anen k;
    private final armf l;
    private final armf m;
    private final acoe n;
    private final atsg o;
    private static final ListenableFuture i = aneh.a;
    private static final ListenableFuture j = albo.bI(apjp.NOT_SET);
    public static final alor a = alzz.ae(new EnumMap(alor.n(yay.UNKNOWN, apjq.SMS_CONNECTION_AVAILABILITY_UNKNOWN, yay.AVAILABLE, apjq.SMS_CONNECTION_AVAILABLE, yay.UNAVAILABLE, apjq.SMS_CONNECTION_UNAVAILABLE)));
    public static final alwo b = alwo.o(advo.a);

    public adnt(Context context, atsg atsgVar, acoe acoeVar, armf armfVar, anen anenVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.c = context;
        this.o = atsgVar;
        this.n = acoeVar;
        this.d = armfVar;
        this.k = anenVar;
        this.l = armfVar2;
        this.m = armfVar3;
        this.e = armfVar4;
    }

    public static apkc b(apkc apkcVar, apjv apjvVar) {
        int a2 = aczv.a();
        if (a2 != 0) {
            apjy apjyVar = apkcVar.e;
            if (apjyVar == null) {
                apjyVar = apjy.a;
            }
            aozy builder = apjyVar.toBuilder();
            if (a2 > 0) {
                apjy apjyVar2 = apkcVar.e;
                if (apjyVar2 == null) {
                    apjyVar2 = apjy.a;
                }
                if (apjyVar2.d.size() >= a2) {
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apjy apjyVar3 = (apjy) builder.b;
                    apjyVar3.a();
                    apjyVar3.d.remove(0);
                    Integer valueOf = Integer.valueOf(aczv.a());
                    apjy apjyVar4 = apkcVar.e;
                    if (apjyVar4 == null) {
                        apjyVar4 = apjy.a;
                    }
                    advr.q("ProvisioningEvent exceeds max number %d, current size %d", valueOf, Integer.valueOf(apjyVar4.d.size()));
                }
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apjy apjyVar5 = (apjy) builder.b;
            apjvVar.getClass();
            apjyVar5.a();
            apjyVar5.d.add(apjvVar);
            aozy builder2 = apkcVar.toBuilder();
            apjy apjyVar6 = (apjy) builder.s();
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            apkc apkcVar2 = (apkc) builder2.b;
            apjyVar6.getClass();
            apkcVar2.e = apjyVar6;
            apkcVar2.b |= 4;
            return (apkc) builder2.s();
        }
        return apkcVar;
    }

    public static boolean h() {
        if (!aczv.E()) {
            return true;
        }
        if (!aczv.H() && !aczv.B()) {
            return true;
        }
        return false;
    }

    private final boolean t(String str) {
        if (((acxv) this.l.b()).a()) {
            return ((aday) this.m.b()).x(str);
        }
        Context context = this.c;
        adnu.a();
        return adnu.i(context, str);
    }

    public final ListenableFuture a() {
        aiwu aiwuVar = this.h;
        if (aiwuVar != null) {
            return aiwuVar.a();
        }
        return albo.bH(new NullPointerException());
    }

    public final apkc c(apkc apkcVar) {
        if ((apkcVar.b & 4) != 0) {
            apjy apjyVar = apkcVar.e;
            if (apjyVar == null) {
                apjyVar = apjy.a;
            }
            apjx b2 = apjx.b(apjyVar.c);
            if (b2 == null) {
                b2 = apjx.UNKNOWN_PROVISIONING_STAGE;
            }
            advr.c("finishProvisioningStageInternal, append %s", b2);
            if (aczv.I()) {
                acoe acoeVar = this.n;
                Context context = this.c;
                aozy createBuilder = apjt.a.createBuilder();
                apjy apjyVar2 = apkcVar.e;
                if (apjyVar2 == null) {
                    apjyVar2 = apjy.a;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjt apjtVar = (apjt) createBuilder.b;
                apjyVar2.getClass();
                apjtVar.c = apjyVar2;
                apjtVar.b |= 1;
                apjr apjrVar = apkcVar.f;
                if (apjrVar == null) {
                    apjrVar = apjr.a;
                }
                aozy builder = apjrVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                apjr apjrVar2 = (apjr) apagVar;
                apjrVar2.b &= -65537;
                apjrVar2.t = 0L;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                apjr apjrVar3 = (apjr) builder.b;
                apjrVar3.b &= -32769;
                apjrVar3.s = 0L;
                apjr apjrVar4 = (apjr) builder.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjt apjtVar2 = (apjt) createBuilder.b;
                apjrVar4.getClass();
                apjtVar2.d = apjrVar4;
                apjtVar2.b |= 2;
                acoeVar.g(context, (apjt) createBuilder.s());
            }
            aozy builder2 = apkcVar.toBuilder();
            Integer num = (Integer) aczv.s().a.J.a();
            int intValue = num.intValue();
            if (intValue != 0) {
                apjn apjnVar = ((apkc) builder2.b).d;
                if (apjnVar == null) {
                    apjnVar = apjn.a;
                }
                aozy builder3 = apjnVar.toBuilder();
                if (intValue > 0) {
                    apjn apjnVar2 = ((apkc) builder2.b).d;
                    if (apjnVar2 == null) {
                        apjnVar2 = apjn.a;
                    }
                    if (apjnVar2.c.size() >= intValue) {
                        if (!builder3.b.isMutable()) {
                            builder3.u();
                        }
                        apjn apjnVar3 = (apjn) builder3.b;
                        apjnVar3.a();
                        apjnVar3.c.remove(0);
                        apjn apjnVar4 = ((apkc) builder2.b).d;
                        if (apjnVar4 == null) {
                            apjnVar4 = apjn.a;
                        }
                        advr.q("ProvisioningStage exceeds max number %d, current stage count %d ", num, Integer.valueOf(apjnVar4.c.size()));
                    }
                }
                builder3.be(apjyVar);
                apjn apjnVar5 = (apjn) builder3.s();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apkc apkcVar2 = (apkc) builder2.b;
                apjnVar5.getClass();
                apkcVar2.d = apjnVar5;
                apkcVar2.b |= 2;
            }
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            apkc apkcVar3 = (apkc) builder2.b;
            apkcVar3.e = null;
            apkcVar3.b &= -5;
            return (apkc) builder2.s();
        }
        return apkcVar;
    }

    public final apkc d(apkc apkcVar, String str, Optional optional) {
        apjp apjpVar;
        boolean t = t((String) optional.orElse(this.f));
        aozy createBuilder = apjr.a.createBuilder();
        if (t) {
            apjpVar = apjp.TRUE;
        } else {
            apjpVar = apjp.FALSE;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjr apjrVar = (apjr) apagVar;
        apjrVar.c = apjpVar.d;
        apjrVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apjr apjrVar2 = (apjr) createBuilder.b;
        apjrVar2.h = 3;
        apjrVar2.b |= 32;
        String str2 = acny.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjr apjrVar3 = (apjr) createBuilder.b;
        str2.getClass();
        apjrVar3.b |= 2;
        apjrVar3.d = str2;
        if (((acxl) this.d.b()).a() && optional.isPresent()) {
            amva a2 = ((acnu) this.e.b()).a(new adiw((String) optional.get()));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjr apjrVar4 = (apjr) createBuilder.b;
            a2.getClass();
            apjrVar4.z = a2;
            apjrVar4.b |= 4194304;
        }
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjr apjrVar5 = (apjr) createBuilder.b;
            apjrVar5.b |= 1048576;
            apjrVar5.x = str;
        }
        aozy builder = apkcVar.toBuilder();
        apjr apjrVar6 = (apjr) createBuilder.s();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apkc apkcVar2 = (apkc) builder.b;
        apjrVar6.getClass();
        apkcVar2.f = apjrVar6;
        apkcVar2.b |= 8;
        return (apkc) builder.s();
    }

    public final String e(Optional optional) {
        return (String) optional.orElse(this.f);
    }

    public final void f(String str) {
        aiuz aiuzVar = new aiuz(this.c);
        aiuzVar.c("provisioningmetrics");
        aiuzVar.d(String.format("%s.pb", str));
        Uri a2 = aiuzVar.a();
        aiwl a3 = aiwm.a();
        a3.e(a2);
        a3.d(apkc.a);
        this.h = this.o.n(a3.a());
        advr.k("Created new RcsProvisioningProtoDataStorage for sim %s", advq.SIM_ID.c(str));
        this.f = str;
        if (((acxl) this.d.b()).a()) {
            this.g.put(str, this.h);
        }
    }

    public final boolean g(String str) {
        if (((acxv) this.l.b()).a()) {
            return ((aday) this.m.b()).w(str);
        }
        Context context = this.c;
        adnu.a();
        return adnu.h(context, str);
    }

    public final boolean i(String str) {
        if (aczv.E()) {
            if ((aczv.H() || aczv.I() || aczv.B()) && !g(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Context context, apkn apknVar, acnz acnzVar, String str, adiv adivVar) {
        aiwu aiwuVar;
        ListenableFuture f;
        boolean z;
        try {
            String str2 = adom.n(adivVar).a;
            if (((acxl) this.d.b()).a()) {
                aiwuVar = (aiwu) this.g.get(str2);
            } else {
                aiwuVar = this.h;
            }
            if (aiwuVar == null) {
                f = j;
            } else {
                f = ancj.f(anee.o(ancj.f(aiwuVar.a(), new abes(7), andi.a)), new abes(8), andi.a);
            }
            if (((apjp) f.get(1L, TimeUnit.SECONDS)) != apjp.FALSE) {
                z = true;
            } else {
                z = false;
            }
            aozy createBuilder = apjl.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apjl apjlVar = (apjl) apagVar;
            apjlVar.c = apknVar.H;
            apjlVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apjl apjlVar2 = (apjl) createBuilder.b;
            apjlVar2.b |= 1024;
            apjlVar2.n = z;
            acnzVar.z(context, acnzVar.p(createBuilder, adivVar), str);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            advr.q("Timeout when reading RcsProvisioningProtoDataStorage", new Object[0]);
        }
    }

    public final void k(apjx apjxVar, final String str, final Boolean bool, final String str2) {
        String str3;
        advr.c("enterProvisioningStage, provisioningSessionId=%s, provisioningStage=%s, simId=%s", str, apjxVar.name(), advq.SIM_ID.c(str2));
        if (((acxl) this.d.b()).a()) {
            str3 = str2;
        } else {
            str3 = this.f;
        }
        if (i(str3)) {
            return;
        }
        m(apjxVar, str2);
        o(2);
        r(new adns() { // from class: adnl
            /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
            @Override // defpackage.adns
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(defpackage.aozy r8) {
                /*
                    r7 = this;
                    adnt r0 = defpackage.adnt.this
                    android.content.Context r1 = r0.c
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                    android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
                    boolean r2 = j$.util.Objects.isNull(r1)
                    r3 = 1
                    if (r2 == 0) goto L19
                L17:
                    r1 = r3
                    goto L28
                L19:
                    int r2 = r1.getType()
                    if (r2 != r3) goto L21
                    r1 = 2
                    goto L28
                L21:
                    int r1 = r1.getType()
                    if (r1 != 0) goto L17
                    r1 = 3
                L28:
                    apag r2 = r8.b
                    boolean r2 = r2.isMutable()
                    if (r2 != 0) goto L33
                    r8.u()
                L33:
                    java.lang.String r2 = r2
                    apag r4 = r8.b
                    apjr r4 = (defpackage.apjr) r4
                    apjr r5 = defpackage.apjr.a
                    int r1 = r1 + (-1)
                    r4.e = r1
                    int r1 = r4.b
                    r1 = r1 | 4
                    r4.b = r1
                    apag r1 = r8.b
                    boolean r1 = r1.isMutable()
                    if (r1 != 0) goto L50
                    r8.u()
                L50:
                    java.lang.String r1 = defpackage.albo.ag(r2)
                    java.lang.Boolean r2 = r3
                    apag r4 = r8.b
                    apjr r4 = (defpackage.apjr) r4
                    int r5 = r4.b
                    r6 = 1048576(0x100000, float:1.469368E-39)
                    r5 = r5 | r6
                    r4.b = r5
                    r4.x = r1
                    boolean r1 = r2.booleanValue()
                    if (r1 == 0) goto L6c
                    apjp r1 = defpackage.apjp.TRUE
                    goto L6e
                L6c:
                    apjp r1 = defpackage.apjp.FALSE
                L6e:
                    apag r2 = r8.b
                    boolean r2 = r2.isMutable()
                    if (r2 != 0) goto L79
                    r8.u()
                L79:
                    apag r2 = r8.b
                    apjr r2 = (defpackage.apjr) r2
                    int r1 = r1.d
                    r2.c = r1
                    int r1 = r2.b
                    r1 = r1 | r3
                    r2.b = r1
                    armf r1 = r0.d
                    java.lang.Object r1 = r1.b()
                    acxl r1 = (defpackage.acxl) r1
                    boolean r1 = r1.a()
                    if (r1 == 0) goto Lc2
                    java.lang.String r1 = r4
                    armf r0 = r0.e
                    java.lang.Object r0 = r0.b()
                    acnu r0 = (defpackage.acnu) r0
                    adiw r2 = new adiw
                    r2.<init>(r1)
                    amva r0 = r0.a(r2)
                    apag r1 = r8.b
                    boolean r1 = r1.isMutable()
                    if (r1 != 0) goto Lb2
                    r8.u()
                Lb2:
                    apag r8 = r8.b
                    apjr r8 = (defpackage.apjr) r8
                    r0.getClass()
                    r8.z = r0
                    int r0 = r8.b
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 | r1
                    r8.b = r0
                Lc2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adnl.a(aozy):void");
            }
        }, str2);
    }

    public final void l(adjl adjlVar, Optional optional) {
        if (i(e(optional))) {
            return;
        }
        r(new adnn(adjlVar, 0), e(optional));
    }

    public final void m(apjx apjxVar, String str) {
        String str2;
        advr.c("startProvisioningStage, provisioningStageType=%s", apjxVar);
        if (((acxl) this.d.b()).a()) {
            str2 = str;
        } else {
            str2 = this.f;
        }
        if (i(str2)) {
            return;
        }
        s(new abdo(this, apjxVar, 6), Optional.of(str));
    }

    public final apkc n(apkc apkcVar, int i2, String str) {
        if ((apkcVar.b & 2) != 0) {
            apkc c = c(apkcVar);
            apjn apjnVar = c.d;
            if (apjnVar == null) {
                apjnVar = apjn.a;
            }
            aozy builder = apjnVar.toBuilder();
            apjr apjrVar = c.f;
            if (apjrVar == null) {
                apjrVar = apjr.a;
            }
            apjr apjrVar2 = (apjr) apjrVar.toBuilder().s();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apag apagVar = builder.b;
            apjn apjnVar2 = (apjn) apagVar;
            apjrVar2.getClass();
            apjnVar2.d = apjrVar2;
            apjnVar2.b |= 1;
            if (!apagVar.isMutable()) {
                builder.u();
            }
            apjn apjnVar3 = (apjn) builder.b;
            apjnVar3.g = i2 - 1;
            apjnVar3.b |= 8;
            apct b2 = apds.b(agkx.W().longValue());
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apjn apjnVar4 = (apjn) builder.b;
            b2.getClass();
            apjnVar4.f = b2;
            apjnVar4.b |= 4;
            apjn apjnVar5 = (apjn) builder.s();
            if (aczv.H()) {
                this.n.f(this.c, apjnVar5);
            }
            aozy builder2 = c.toBuilder();
            if (aczv.B()) {
                apjr apjrVar3 = c.f;
                if (apjrVar3 == null) {
                    apjrVar3 = apjr.a;
                }
                String e = e(Optional.of(str));
                if (aczv.N() && apjrVar3.t < 8 && !t(e)) {
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    apkc apkcVar2 = (apkc) builder2.b;
                    apjnVar5.getClass();
                    apkcVar2.c = apjnVar5;
                    apkcVar2.b |= 1;
                }
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apkc apkcVar3 = (apkc) builder2.b;
                apjnVar5.getClass();
                apkcVar3.d = apjnVar5;
                apkcVar3.b |= 2;
            } else {
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apag apagVar2 = builder2.b;
                apkc apkcVar4 = (apkc) apagVar2;
                apkcVar4.d = null;
                apkcVar4.b &= -3;
                if (!apagVar2.isMutable()) {
                    builder2.u();
                }
                apkc apkcVar5 = (apkc) builder2.b;
                apkcVar5.f = null;
                apkcVar5.b &= -9;
            }
            return (apkc) builder2.s();
        }
        return apkcVar;
    }

    public final void o(int i2) {
        q(i2, -1, Optional.empty());
    }

    public final void p(int i2, String str) {
        q(i2, -1, Optional.of(str));
    }

    public final void q(int i2, int i3, Optional optional) {
        if (i(this.f)) {
            return;
        }
        long longValue = agkx.W().longValue();
        aozy createBuilder = apjv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjv apjvVar = (apjv) apagVar;
        apjvVar.c = i2 - 1;
        apjvVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjv apjvVar2 = (apjv) apagVar2;
        apjvVar2.b |= 2;
        apjvVar2.d = longValue;
        if (i3 >= 0) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apjv apjvVar3 = (apjv) createBuilder.b;
            apjvVar3.b |= 4;
            apjvVar3.e = i3;
        }
        s(new adhe(createBuilder, 11), optional);
    }

    public final void r(adns adnsVar, String str) {
        s(new adhe(adnsVar, 13), Optional.of(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4.isPresent() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        f((java.lang.String) r4.get());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        throw new java.lang.IllegalStateException("updateStorage called before ProvisioningEngineMetricsStorage fully initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.h == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (((java.lang.Boolean) r0.orElse(java.lang.Boolean.valueOf(r1))).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.algk r3, j$.util.Optional r4) {
        /*
            r2 = this;
            armf r0 = r2.d
            java.lang.Object r0 = r0.b()
            acxl r0 = (defpackage.acxl) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L31
            admk r0 = new admk
            r1 = 11
            r0.<init>(r2, r1)
            j$.util.Optional r0 = r4.map(r0)
            aiwu r1 = r2.h
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            goto L35
        L31:
            aiwu r0 = r2.h
            if (r0 != 0) goto L4d
        L35:
            boolean r0 = r4.isPresent()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.get()
            java.lang.String r0 = (java.lang.String) r0
            r2.f(r0)
            goto L4d
        L45:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "updateStorage called before ProvisioningEngineMetricsStorage fully initialized"
            r3.<init>(r4)
            throw r3
        L4d:
            armf r0 = r2.d
            java.lang.Object r0 = r0.b()
            acxl r0 = (defpackage.acxl) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L6e
            boolean r0 = r4.isPresent()
            if (r0 == 0) goto L6e
            j$.util.concurrent.ConcurrentHashMap r0 = r2.g
            java.lang.Object r4 = r4.get()
            java.lang.Object r4 = r0.get(r4)
            aiwu r4 = (defpackage.aiwu) r4
            goto L70
        L6e:
            aiwu r4 = r2.h
        L70:
            if (r4 != 0) goto L73
            return
        L73:
            abdo r0 = new abdo
            r1 = 7
            r0.<init>(r2, r3, r1)
            anen r3 = r2.k
            com.google.common.util.concurrent.ListenableFuture r3 = r4.b(r0, r3)
            pum r4 = new pum
            r0 = 13
            r4.<init>(r0)
            andi r0 = defpackage.andi.a
            defpackage.albo.bR(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnt.s(algk, j$.util.Optional):void");
    }
}
