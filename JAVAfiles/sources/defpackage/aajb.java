package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajb implements lqv, yet {
    private static final alog f = alog.u(amip.HAPPINESS_TRACKING_MODE_SURVEY, amip.SMART_REPLY_HAPPINESS_TRACKING_SURVEY, amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY, amip.ORGANIZE_HAPPINESS_TRACKING_SURVEY);
    public final armf a;
    public final armf b;
    public final xnv c;
    public final View d;
    public boolean e;
    private final apwt g;

    public aajb(armf armfVar, armf armfVar2, xnv xnvVar, apwt apwtVar, View view) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = xnvVar;
        this.d = view;
        this.g = apwtVar;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    @Override // defpackage.lqv
    public final akul b() {
        if (((Boolean) yfe.a.e()).booleanValue()) {
            aazm aazmVar = (aazm) this.g.b();
            return ((zas) aazmVar.c.b()).c().i(new xfv(aazmVar, f, 12), aazmVar.d);
        }
        return aktp.ag(false);
    }

    @Override // defpackage.lqv
    public final void d() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [yfb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [apwt, java.lang.Object] */
    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        String str;
        aazm aazmVar = (aazm) this.g.b();
        yfd yfdVar = (yfd) aazmVar.a.b();
        ?? r13 = aazmVar.e;
        znj znjVar = yfdVar.d;
        ahmc ahmcVar = null;
        CronetEngine cronetEngine = (CronetEngine) ((ghw) znjVar.a).q().orElse(null);
        if (((Boolean) ((utz) yfd.b.get()).e()).booleanValue() && cronetEngine == null) {
            if (r13 instanceof yfa) {
                str = ((yfa) r13).c();
            } else {
                str = "";
            }
            maq maqVar = (maq) znjVar.b.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            aozy createBuilder = amlb.a.createBuilder();
            aozy createBuilder2 = amkx.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            amkx amkxVar = (amkx) apagVar;
            str.getClass();
            amkxVar.b |= 1;
            amkxVar.c = str;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            amkx amkxVar2 = (amkx) createBuilder2.b;
            amkxVar2.d = 1;
            amkxVar2.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amlb amlbVar = (amlb) createBuilder.b;
            amkx amkxVar3 = (amkx) createBuilder2.s();
            amkxVar3.getClass();
            amlbVar.d = amkxVar3;
            amlbVar.b |= 2;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amlb amlbVar2 = (amlb) createBuilder.s();
            amlbVar2.getClass();
            amfrVar.aE = amlbVar2;
            amfrVar.e |= 262144;
            amfp amfpVar = amfp.BUGLE_HATS_NEXT_CLIENT_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            maqVar.j(amfqVar);
        }
        if (cronetEngine != null && (r13 instanceof yfa)) {
            agxw agxwVar = new agxw(cronetEngine);
            d.t(true, "SDK < 16 isn't supported");
            aiyx aiyxVar = aiyx.a;
            ahnz ahnzVar = new ahnz((int[]) null);
            if (aizp.b == null) {
                synchronized (aizp.a) {
                    if (aizp.b == null) {
                        aizp.b = context;
                    }
                }
            }
            aizp.c = ahnzVar;
            long j = aizr.a;
            aiyw.a.c = new ahmn(context, null);
            aizq.a().a = new aodz((char[]) null);
            aiyw.a.d = agxwVar;
            ahmcVar = new ahmc(null);
        }
        if (r13 != 0 && ahmcVar != null) {
            if (r13.d() == amip.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING) {
                yfdVar.a(context);
            }
            String c = ((yfa) r13).c();
            if (!TextUtils.isEmpty(c)) {
                if (!TextUtils.isEmpty(c)) {
                    akkw akkwVar = new akkw(context, c, new aoij(yfdVar, context, this), (String) yfe.b.e(), ((Boolean) yfe.q.e()).booleanValue());
                    String ag = albo.ag((String) akkwVar.e);
                    aiyx aiyxVar2 = aiyx.a;
                    aiyxVar2.i = ag;
                    if (TextUtils.isEmpty(aiyxVar2.i)) {
                        Log.d("SurveyController", "API key was not set or set empty by the client. API key is needed if survey is targeted for signed out users as well. For surveys targeted for only signin users, api key is not needed.");
                    }
                    aizi e = aiyxVar2.e(akkwVar, aiyxVar2.i);
                    aozy createBuilder3 = aqjf.a.createBuilder();
                    String str2 = aiyxVar2.i;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar2 = createBuilder3.b;
                    str2.getClass();
                    ((aqjf) apagVar2).b = str2;
                    if (!apagVar2.isMutable()) {
                        createBuilder3.u();
                    }
                    ((aqjf) createBuilder3.b).c = a.ak(4);
                    aqjf aqjfVar = (aqjf) createBuilder3.s();
                    aizi e2 = aiyxVar2.e(akkwVar, "AIzaSyBmGDOmYcGmylWMKTdQxmf5vXWAuybv7qA");
                    aoij aoijVar = new aoij(aiyxVar2, akkwVar, e);
                    if (aqjfVar == null) {
                        Log.e("NetworkCallerGrpc", "Survey startup config request was null");
                    } else {
                        long j2 = aizr.a;
                        aize.a().execute(new adub(e2, aqjfVar, aoijVar, 6, (char[]) null));
                    }
                } else {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
            } else {
                yfd.a.q(String.format("SiteId was blank or missing from BugleHatsSurvey: %s, not showing survey", r13));
            }
        }
        return this.e;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 14;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
