package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguj implements agvc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider");
    public final Executor b;
    public final agur c;
    public final aiwu d;

    public aguj(Context context) {
        aneo aneoVar = agtj.a().e;
        this.b = aneoVar;
        atsg atsgVar = agzq.a;
        if (atsgVar == null) {
            synchronized (agzq.class) {
                atsgVar = agzq.a;
                if (atsgVar == null) {
                    aiwx aiwxVar = aiwx.a;
                    HashMap hashMap = new HashMap();
                    agcp agcpVar = agzq.b;
                    if (agcpVar == null) {
                        synchronized (agzq.class) {
                            agcp agcpVar2 = agzq.b;
                            if (agcpVar2 == null) {
                                aivk a2 = aivk.a();
                                aohs aohsVar = new aohs(context.getApplicationContext(), (byte[]) null);
                                ahmc.af(true, "LockScope will not be used in the custom backend. Only call builderWithOverrideForTest if you want to override the backend for testing, or call builder together with setLockScope to set a new lock scope.", new Object[0]);
                                aohsVar.a = a2;
                                agcp agcpVar3 = new agcp(alog.s(new aiuy(aohsVar), new aivb(a2)));
                                agzq.b = agcpVar3;
                                agcpVar2 = agcpVar3;
                            }
                            agcpVar = agcpVar2;
                        }
                    }
                    ahmc.ae(aiwr.a, hashMap);
                    atsg atsgVar2 = new atsg(aneoVar, agcpVar, aiwxVar, hashMap);
                    agzq.a = atsgVar2;
                    atsgVar = atsgVar2;
                }
            }
        }
        aiwl a3 = aiwm.a();
        aiuz aiuzVar = new aiuz(context);
        aiuzVar.c("protodatastore");
        aiuzVar.d("global_variant_prefs.pb");
        a3.e(aiuzVar.a());
        a3.d(aguw.a);
        this.d = atsgVar.n(a3.a());
        this.c = new agur(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(alog alogVar) {
        int Y;
        int aH = alzz.aH(alogVar, new evp(9));
        if (aH < 0) {
            return 0;
        }
        agvd agvdVar = (agvd) alogVar.get(aH);
        if (agvdVar.b == 2 && (Y = a.Y(((Integer) agvdVar.c).intValue())) != 0) {
            return Y;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(alog alogVar) {
        int ag;
        int aH = alzz.aH(alogVar, new evp(8));
        if (aH < 0) {
            return 0;
        }
        agvd agvdVar = (agvd) alogVar.get(aH);
        if (agvdVar.b != 1 || (ag = a.ag(((Integer) agvdVar.c).intValue())) == 0) {
            return 1;
        }
        return ag;
    }

    public final void a(aguw aguwVar) {
        albo.bR(anee.o(this.d.b(new agui(aguwVar, 1), this.b)), new vbr(this, aguwVar, 10), this.b);
    }
}
