package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgz implements adfa {
    private static final acyz d = aczd.a(169805025);
    private static final acyz e = aczd.a(176892952);
    private static final acyz f = aczd.a(187751924);
    public final advp a;
    final adhy b;
    adhw c;

    @Deprecated
    private final adjv g;
    private final adjq h;

    @Deprecated
    private final armf i;
    private final anen j;
    private final adid l;
    private adib m;
    private int k = -1;
    private final adeu n = new adgy(this);

    public adgz(adjv adjvVar, adjq adjqVar, armf armfVar, adhy adhyVar, adid adidVar, anen anenVar, advp advpVar) {
        this.g = adjvVar;
        this.h = adjqVar;
        this.i = armfVar;
        this.b = adhyVar;
        this.l = adidVar;
        this.j = anenVar;
        this.a = advpVar;
    }

    @Override // defpackage.adfa
    public final adeu a() {
        return this.n;
    }

    @Override // defpackage.adfa
    public final synchronized adey b() {
        adhw adhwVar = this.c;
        if (Objects.isNull(adhwVar)) {
            return null;
        }
        return adhwVar.u;
    }

    @Override // defpackage.adfa
    public final Optional c() {
        Optional empty;
        adhw adhwVar = this.c;
        if (adhwVar == null) {
            return Optional.empty();
        }
        adfn adfnVar = adhwVar.z;
        if (adfnVar != null && adhwVar.l) {
            try {
                empty = Optional.of(adex.a(adhwVar.q.b().c.c, adfnVar.c, true));
            } catch (IllegalStateException unused) {
                advr.h(adhwVar.m, "RegistrationContext is not found.", new Object[0]);
                empty = Optional.empty();
            }
        } else {
            empty = Optional.empty();
        }
        if (empty.isEmpty()) {
            return Optional.ofNullable(b()).map(new addg(9));
        }
        return empty;
    }

    @Override // defpackage.adfa
    public final String d() {
        adju adjuVar;
        adhw adhwVar = this.c;
        if (!Objects.isNull(adhwVar)) {
            String str = adhwVar.w;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (aczf.K()) {
            adjuVar = this.h.a.c();
        } else {
            adjuVar = this.g.a;
        }
        return adjuVar.l;
    }

    @Override // defpackage.adfa
    public final synchronized void e() {
        adhw adhwVar = this.c;
        advr.l(this.a, "Destroying RegistrationEngine.", new Object[0]);
        if (!Objects.isNull(adhwVar)) {
            adhwVar.B(acok.SHUTDOWN);
            adhwVar.m();
            this.c = null;
        }
    }

    @Override // defpackage.adfa
    public final void f(PrintWriter printWriter) {
        String str;
        adhw adhwVar = this.c;
        printWriter.println("    - RegistrationEngine: ".concat(String.valueOf(String.valueOf(this.a))));
        if (!Objects.isNull(adhwVar)) {
            printWriter.println("     - RegistrationStateMachine ".concat(String.valueOf(String.valueOf(adhwVar.m))));
            adhd adhdVar = (adhd) adhwVar.d();
            if (adhdVar != null) {
                str = adhdVar.a();
            } else {
                str = "UnknownState";
            }
            printWriter.println("       state: ".concat(str));
            printWriter.println("       expirePeriod: " + adhwVar.D + "s");
            if (adhwVar.ag.equals(adhwVar.d())) {
                printWriter.println("       next retry in " + (adhwVar.F - agkx.W().longValue()) + "ms");
                printWriter.println("       retryDelayCalculator: ".concat(String.valueOf(String.valueOf(adhwVar.E))));
            }
            printWriter.println("       publicIdentity: ".concat(String.valueOf(advq.URI_SIP.c(adhwVar.w))));
            printWriter.println("       P-CSCF: ".concat(String.valueOf(adhwVar.G.p)));
            printWriter.println("       ConfigVersion: " + adhwVar.H);
            printWriter.println("       useNetworkCallback: " + adhwVar.l);
            adif adifVar = adhwVar.I;
            printWriter.println("    - Keep Alive Manager -");
            printWriter.println("      mKeepAlivePeriod: " + adifVar.d);
            printWriter.println("      mLastKeepAlive: " + adifVar.f);
            printWriter.println("      Keep alive scheduled: " + adifVar.a.e());
        }
    }

    @Override // defpackage.adfa
    public final void g(acok acokVar) {
        if (acokVar != acok.DISABLED && acokVar != acok.SHUTDOWN && acokVar != acok.CANCELED) {
            advr.l(this.a, "RegistrationEngineStateMachine restarts after deregistration. reason=%s", acokVar);
            int i = this.k;
            j(acokVar);
            i(i);
            return;
        }
        advr.r(this.a, "Unexpected reason for restarting. reason=%s", acokVar);
    }

    @Override // defpackage.adfa
    public final /* synthetic */ void h(acok acokVar, int i) {
        g(acokVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d2 A[Catch: all -> 0x040f, TryCatch #3 {, blocks: (B:4:0x0005, B:7:0x00c3, B:9:0x00cb, B:10:0x00d2, B:12:0x00d9, B:14:0x00ec, B:15:0x00f8, B:17:0x0109, B:18:0x0116, B:20:0x011d, B:21:0x0126, B:25:0x013d, B:26:0x0329, B:28:0x032f, B:33:0x033a, B:35:0x0342, B:38:0x035d, B:40:0x0391, B:49:0x03a3, B:41:0x03ad, B:43:0x03b5, B:45:0x03bb, B:46:0x03c3, B:50:0x036c, B:52:0x03cc, B:54:0x03d2, B:56:0x03e0, B:58:0x03e6, B:61:0x03f1, B:66:0x0149, B:68:0x0200, B:69:0x020d, B:70:0x0207, B:71:0x0137, B:72:0x0122, B:73:0x0112, B:74:0x001b, B:76:0x001f, B:77:0x0036, B:79:0x0044, B:81:0x004a, B:82:0x0053, B:84:0x0057, B:85:0x004f, B:86:0x006d, B:88:0x0073, B:89:0x0080, B:91:0x0088, B:92:0x0092, B:94:0x0098, B:95:0x00a5, B:97:0x00b1, B:100:0x00ba, B:103:0x009f, B:104:0x007c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x040d A[DONT_GENERATE] */
    @Override // defpackage.adfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void i(final int r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgz.i(int):void");
    }

    @Override // defpackage.adfa
    public final synchronized void j(acok acokVar) {
        advr.l(this.a, "Unregistering from IMS network. reason=%s", acokVar);
        adhw adhwVar = this.c;
        if (!Objects.isNull(adhwVar)) {
            adhwVar.B(acokVar);
        }
    }

    @Override // defpackage.adfa
    public final boolean k() {
        adhw adhwVar = this.c;
        if (Objects.isNull(adhwVar)) {
            return false;
        }
        if (!l()) {
            acyh d2 = adhwVar.d();
            if (d2 == null || d2.equals(adhwVar.S) || d2.equals(adhwVar.ae) || d2.equals(adhwVar.ah)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.adfa
    public final boolean l() {
        adhw adhwVar = this.c;
        if (Objects.isNull(adhwVar)) {
            return false;
        }
        return adhwVar.P();
    }

    @Override // defpackage.adfa
    public final boolean m() {
        adhw adhwVar = this.c;
        if (Objects.isNull(adhwVar)) {
            return false;
        }
        return adhwVar.Q();
    }

    @Override // defpackage.adfa
    public final boolean n() {
        adey adeyVar;
        adhw adhwVar = this.c;
        if (Objects.isNull(adhwVar) || (adeyVar = adhwVar.u) == null || adeyVar.l != 1) {
            return false;
        }
        return true;
    }
}
