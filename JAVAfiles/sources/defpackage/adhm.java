package defpackage;

import android.os.Message;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class adhm extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhm(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    private final String j(adju adjuVar) {
        String str = adjuVar.A;
        if (str != null) {
            advr.d(this.b.m, "Using URI format: %s", str);
            return str;
        }
        advr.r(this.b.m, "URI format not set! Using default URI format: %s", "tel");
        return "tel";
    }

    @Override // defpackage.acyi, defpackage.acyh
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.F(new adhp(this, 1));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void c() {
        super.c();
        this.b.C = 0;
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        String str;
        int h;
        int i = message.what;
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                if (i != 3) {
                    if (i != 8) {
                        if (i != 17) {
                            if (i != 21) {
                                return super.e(message);
                            }
                            advr.r(this.b.m, "Network is lost.", new Object[0]);
                            this.b.O();
                            adhw adhwVar = this.b;
                            adhwVar.w(adhwVar.ac);
                            return true;
                        }
                        this.b.N(acok.SIM_REMOVED);
                        adhw adhwVar2 = this.b;
                        adhwVar2.w(adhwVar2.ac);
                        return true;
                    }
                    advr.d(this.b.m, "Cancel registration.", new Object[0]);
                    this.b.N(message.obj);
                    adhw adhwVar3 = this.b;
                    adhwVar3.w(adhwVar3.ac);
                    return true;
                }
                advr.h(this.b.m, "Registration timeout.", new Object[0]);
                adhw adhwVar4 = this.b;
                adhwVar4.w(adhwVar4.ag);
                return true;
            }
            if (message.obj instanceof aioo) {
                try {
                    aioo aiooVar = (aioo) message.obj;
                    advr.d(this.b.m, "Got response: %s", aiooVar);
                    aijw aijwVar = this.b.t;
                    if (!Objects.isNull(aijwVar)) {
                        String str2 = aijwVar.a;
                        if (aiooVar.y() == 200) {
                            advr.d(this.b.m, "Registered.", new Object[0]);
                            h(aiooVar);
                        } else {
                            if (aiooVar.y() == 401) {
                                advr.d(this.b.m, "Authentication requested.", new Object[0]);
                                this.b.s(1, aiooVar);
                            } else if (aiooVar.y() == 403) {
                                advr.d(this.b.m, "Forbidden. Reconfiguration Required.", new Object[0]);
                                this.b.I();
                                this.b.D(acok.RECONFIGURATION_REQUIRED);
                                adhw adhwVar5 = this.b;
                                adhwVar5.w(adhwVar5.ae);
                                this.b.E();
                                if (!((Boolean) adhw.e.a()).booleanValue()) {
                                    this.b.N.execute(new adha(this, 11));
                                }
                            } else if (aiooVar.y() == 404) {
                                advr.d(this.b.m, "User Not Found. Reconfiguration Required.", new Object[0]);
                                this.b.I();
                                this.b.D(acok.RECONFIGURATION_REQUIRED);
                                adhw adhwVar6 = this.b;
                                adhwVar6.w(adhwVar6.ae);
                                this.b.E();
                                if (!((Boolean) adhw.e.a()).booleanValue()) {
                                    this.b.N.execute(new adha(this, 12));
                                }
                            } else if (aiooVar.y() != 423) {
                                advr.d(this.b.m, "Received an registration error response %d %s.", Integer.valueOf(aiooVar.y()), aiooVar.A());
                                aimh d = aiooVar.z().d("Retry-After");
                                if (d == null) {
                                    h = 0;
                                } else {
                                    h = d.h(0);
                                    if (h > 0) {
                                        advr.d(this.b.m, "server requested retry in %ds", Integer.valueOf(h));
                                    }
                                }
                                adhw adhwVar7 = this.b;
                                adhwVar7.E.a = h;
                                adhwVar7.w(adhwVar7.ag);
                                this.b.D(acok.ERROR_RESPONSE);
                            } else {
                                int a = adwf.a(aiooVar);
                                if (a == -1) {
                                    advr.h(this.b.m, "Can't read the Min-Expires value", new Object[0]);
                                    this.b.I();
                                    this.b.D(acok.ERROR_RESPONSE);
                                    adhw adhwVar8 = this.b;
                                    adhwVar8.w(adhwVar8.ag);
                                } else {
                                    adhw adhwVar9 = this.b;
                                    adhwVar9.C = a;
                                    advr.l(adhwVar9.m, "Send new REGISTER", new Object[0]);
                                    this.b.q(1);
                                }
                            }
                            if (str2 != null) {
                                adhw adhwVar10 = this.b;
                                advr.d(adhwVar10.m, "Notify SipError. CallId=%s sipError=%d(%s)", str2, Integer.valueOf(aiooVar.y()), aiooVar.A());
                                adhwVar10.N.execute(new adha(adhwVar10, i2));
                            }
                        }
                    } else {
                        throw new aild("Null SipDialogPath.");
                    }
                } catch (aild unused) {
                    this.b.D(acok.ERROR_RESPONSE);
                    adhw adhwVar11 = this.b;
                    adhwVar11.w(adhwVar11.ag);
                }
            } else {
                advr.j((aild) message.obj, this.b.m, "Registration failed", new Object[0]);
                this.b.D(acok.ERROR_RESPONSE);
                adhw adhwVar12 = this.b;
                adhwVar12.w(adhwVar12.ag);
            }
        } else if (message.obj == null) {
            try {
                this.b.M();
            } catch (adfj | aild e) {
                advr.j(e, this.b.m, "Registration failure.", new Object[0]);
                adhw adhwVar13 = this.b;
                adhwVar13.w(adhwVar13.ag);
            }
            if (!Objects.isNull(this.b.t)) {
                adhw adhwVar14 = this.b;
                String ag = albo.ag(adhwVar14.t.a);
                advr.d(adhwVar14.m, "Notify Registering. CallId=%s", ag);
                adhwVar14.N.execute(new acaj(adhwVar14, ag, 18, (byte[]) null));
            }
        } else {
            aioo aiooVar2 = (aioo) message.obj;
            if (((Boolean) acqb.a.a()).booleanValue()) {
                aikb aikbVar = this.b.r.a;
                if (Objects.isNull(aikbVar)) {
                    advr.g("Null SipStack. Can't register.", new Object[0]);
                    adhw adhwVar15 = this.b;
                    adhwVar15.w(adhwVar15.ag);
                } else {
                    List p = aiooVar2.p();
                    if (!p.isEmpty()) {
                        ainb ainbVar = (ainb) alzz.aO(p);
                        if (ainbVar.l("rport") && (str = (String) ainbVar.e.b("rport")) != null && !str.isEmpty()) {
                            try {
                                advr.p(this.b.m, "Updating local port to %s", str);
                                aikbVar.h().l(Integer.parseInt(str));
                            } catch (NumberFormatException unused2) {
                                advr.r(this.b.m, "Invalid RPORT value - %s ignoring, continuing with normal registration flow", str);
                            }
                        }
                    }
                }
            }
            try {
                this.b.aj.d(aiooVar2);
                advr.d(this.b.m, "Send second REGISTER", new Object[0]);
                try {
                    this.b.M();
                } catch (adfj | aild e2) {
                    advr.j(e2, this.b.m, "Registration failure.", new Object[0]);
                    this.b.N(acok.UNKNOWN);
                    adhw adhwVar16 = this.b;
                    adhwVar16.w(adhwVar16.ag);
                }
            } catch (adfj e3) {
                advr.j(e3, this.b.m, "Failed to write SecurityHeader.", new Object[0]);
                adhw adhwVar17 = this.b;
                adhwVar17.w(adhwVar17.ag);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r0 = r8.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r3 = java.lang.Integer.parseInt(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.aiom r12) {
        /*
            r11 = this;
            adhw r0 = r11.b
            aikc r0 = r0.r
            aikb r0 = r0.a
            boolean r1 = r0.u()
            r2 = 600000(0x927c0, float:8.40779E-40)
            if (r1 == 0) goto L10
            return r2
        L10:
            java.lang.String r0 = r0.k()
            ainh r12 = r12.a
            advp r1 = defpackage.adwf.a
            aily r1 = r12.c()
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L80
            r6 = r4
        L22:
            int r7 = r1.b()
            r8 = 0
            if (r6 >= r7) goto L73
            aimh r7 = r1.e(r6)
            ailx r7 = (defpackage.ailx) r7
            aikn r9 = r7.a
            aiks r9 = r9.b
            boolean r10 = r9 instanceof defpackage.aikp
            if (r10 == 0) goto L6b
            aikp r9 = (defpackage.aikp) r9
            aikw r9 = r9.a()
            if (r9 != 0) goto L41
            r9 = r8
            goto L43
        L41:
            aikv r9 = r9.a
        L43:
            if (r9 != 0) goto L46
            goto L73
        L46:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.aikv.a(r8)
            if (r8 == 0) goto L5e
            java.lang.String r8 = r9.a
            int r9 = r8.length()
            int r9 = r9 + r3
            java.lang.String r8 = r8.substring(r5, r9)
            boolean r8 = defpackage.d.B(r8, r0)
            goto L64
        L5e:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.d.B(r8, r0)
        L64:
            if (r8 == 0) goto L68
            r8 = r7
            goto L73
        L68:
            int r6 = r6 + 1
            goto L22
        L6b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "address is not a SipURI"
            r12.<init>(r0)
            throw r12
        L73:
            if (r8 == 0) goto L80
            java.lang.String r0 = r8.e()
            if (r0 == 0) goto L80
            int r3 = java.lang.Integer.parseInt(r0)
            goto L8e
        L80:
            java.lang.String r0 = "Expires"
            aimh r12 = r12.d(r0)
            aime r12 = (defpackage.aime) r12
            if (r12 == 0) goto L8e
            int r3 = r12.b()
        L8e:
            if (r3 >= 0) goto La2
            adhw r12 = r11.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            advp r12 = r12.m
            java.lang.String r0 = "No expires value found in response to REGISTER! Using a default period of %d seconds!"
            defpackage.advr.h(r12, r0, r1)
            return r2
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhm.g(aiom):int");
    }

    protected void h(aioo aiooVar) {
        String str;
        Optional optional;
        String valueOf;
        aikb aikbVar = this.b.r.a;
        if (!Objects.isNull(aikbVar)) {
            this.b.D = g(aiooVar);
            i(aikbVar, aiooVar);
            aikbVar.c = null;
            aily c = aiooVar.z().c();
            for (int i = 0; i < c.b(); i++) {
                ailx ailxVar = (ailx) c.e(i);
                String i2 = ailxVar.i("+sip.instance");
                if (i2 != null && i2.contains(this.b.A)) {
                    aikbVar.c = ailxVar.i("pub-gruu");
                }
            }
            String j = j(this.b.G);
            aimi e = aiooVar.a.e("P-Associated-Uri");
            adhw adhwVar = this.b;
            if (e.b() == 0) {
                adhw adhwVar2 = this.b;
                advr.d(adhwVar2.m, "Generating associated URI from config", new Object[0]);
                adju adjuVar = adhwVar2.G;
                String j2 = j(adjuVar);
                str = adjuVar.l;
                if (!str.startsWith(j2)) {
                    String k = adwf.k(str, this.b.J);
                    if (Objects.isNull(k)) {
                        advr.q("expected non null user name from address", new Object[0]);
                        str = "";
                    } else if ("sip".equals(j2)) {
                        str = "sip:" + k + "@" + adjuVar.n;
                    } else {
                        if (!aczf.w()) {
                            valueOf = String.valueOf(this.b.J.q(k));
                        } else {
                            valueOf = String.valueOf(k);
                        }
                        str = "tel:".concat(valueOf);
                    }
                }
            } else {
                advr.d(this.b.m, "Extracting associated URIs from headers", new Object[0]);
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < e.b(); i3++) {
                    Iterator it = anna.e(',').a(e.e(i3).a()).iterator();
                    while (it.hasNext()) {
                        String trim = ((String) it.next()).trim();
                        if (trim.startsWith("<")) {
                            trim = trim.substring(1, trim.length() - 1);
                        }
                        if (trim.startsWith(j)) {
                            arrayList.add(trim);
                        }
                    }
                }
                adju adjuVar2 = adhwVar.G;
                if (!arrayList.isEmpty()) {
                    String str2 = (String) arrayList.get(0);
                    this.b.x = arrayList;
                    str = str2;
                } else {
                    str = adjuVar2.l;
                }
            }
            if (!agkx.ae(str)) {
                adhw adhwVar3 = this.b;
                adhwVar3.w = str;
                advr.d(adhwVar3.m, "Set associated uri: %s using URI format: %s", advr.a(str), j);
            }
            ainb f = aiooVar.a.f();
            if (f == null) {
                optional = Optional.empty();
            } else {
                String i4 = f.i("keep");
                if (i4 == null) {
                    optional = Optional.empty();
                } else {
                    advr.d(this.b.m, "Server has requested a keep-alive period of: %ss", i4);
                    Optional empty = Optional.empty();
                    try {
                        optional = Optional.of(Integer.valueOf(Integer.parseInt(i4)));
                    } catch (NumberFormatException e2) {
                        advr.j(e2, this.b.m, "Unable to parse keep alive value. Using default client value.", new Object[0]);
                        optional = empty;
                    }
                }
            }
            if (optional.isPresent() && ((Integer) optional.get()).intValue() > 0) {
                adhw adhwVar4 = this.b;
                adey adeyVar = adhwVar4.u;
                adfn adfnVar = adhwVar4.z;
                if (((adeyVar != null && adeyVar.l == 1) || (adfnVar != null && adfnVar.a())) && adaa.n() > 0 && ((Integer) optional.get()).intValue() > adaa.n()) {
                    optional = Optional.of(Integer.valueOf((int) adaa.n()));
                }
                adhw adhwVar5 = this.b;
                int intValue = ((Integer) optional.get()).intValue();
                adif adifVar = adhwVar5.I;
                if (!adifVar.k()) {
                    advr.c("Enabling keep-alives", new Object[0]);
                    adey a = adifVar.a();
                    if (a == null) {
                        advr.r(adifVar.b, "Network interface is null", new Object[0]);
                    }
                    if (intValue <= 0 && a != null) {
                        intValue = 120;
                    }
                    adifVar.e = intValue;
                    adifVar.d(intValue);
                } else {
                    advr.d(adifVar.b, "Just processed a REGISTER. Next keep-alive ping can wait a bit longer", new Object[0]);
                    adifVar.h();
                }
            } else {
                adif adifVar2 = this.b.I;
                adifVar2.c();
                advr.l(adifVar2.b, "Disabled keep-alives", new Object[0]);
            }
            adhw adhwVar6 = this.b;
            adhwVar6.w(adhwVar6.X);
            return;
        }
        throw new aild("Null SipStack");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(aikb aikbVar, aioo aiooVar) {
        ArrayList arrayList = new ArrayList();
        List j = aiooVar.z().j("Service-Route");
        if (aikbVar != aike.f) {
            try {
                String l = aikbVar.l();
                int b = aikbVar.b();
                String str = aikbVar.g().d;
                advp advpVar = adwf.a;
                arrayList.add(new aimt(ahji.g(ahji.i(l, b, str))));
            } catch (ailb e) {
                advr.j(e, this.b.m, "Failed to create RouteHeader", new Object[0]);
                return;
            }
        }
        if (!j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                String str2 = ((aimf) ((aimh) it.next())).d;
                List<String> c = anna.e(',').c(albo.ag(str2));
                advr.d(this.b.m, "service route headers %s", str2);
                for (String str3 : c) {
                    try {
                        aimh X = ahmc.X("Route", str3);
                        advr.d(this.b.m, "service route headers are %s", str3);
                        arrayList.add((aimt) X);
                    } catch (ailb e2) {
                        advr.j(e2, this.b.m, "Invalid ServiceRoute header: %s", str3);
                    }
                }
            }
        }
        aikbVar.s(arrayList);
    }
}
