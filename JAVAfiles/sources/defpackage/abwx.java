package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IClientApiService;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abwx implements acim {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ abwx(abxa abxaVar, abwt abwtVar, acit acitVar, int i) {
        this.d = i;
        this.a = abxaVar;
        this.b = abwtVar;
        this.c = acitVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.acim
    public final void e(Object obj) {
        Object s;
        acir acirVar;
        int i = this.d;
        int i2 = 7;
        if (i != 0) {
            int i3 = 5;
            if (i != 1) {
                boolean z = agls.a;
                Object obj2 = this.b;
                boolean w = ((acgl) obj2).w(12451000);
                Object obj3 = this.a;
                if (!w) {
                    acirVar = acgl.a();
                } else {
                    ajxp ajxpVar = new ajxp(null);
                    ajxpVar.c = new acdk((String) obj3, i3);
                    acirVar = ((abrc) obj2).g(ajxpVar.b());
                }
                acirVar.o(this.c, new ktn(obj3, 13));
                return;
            }
            abwv abwvVar = (abwv) obj;
            Intent flags = new Intent("com.google.android.apps.tachyon.intent.INSTALL").setPackage("com.google.android.apps.tachyon").setFlags(32);
            if (!abwo.a.get()) {
                ((Context) this.b).sendBroadcast(flags);
                abwo.a.compareAndSet(false, true);
            }
            int a = abwvVar.a();
            int i4 = 3;
            if (a != 1) {
                if (a != 2) {
                    if (a == 3) {
                        i2 = 5;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
            ((acak) this.a).j(i2);
            GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
            if (!abwvVar.b()) {
                i4 = abwvVar.a();
            }
            Object obj4 = this.c;
            getApiAvailabilityResponse.a = i4;
            ((acit) obj4).b(getApiAvailabilityResponse);
            return;
        }
        Object obj5 = this.b;
        Object obj6 = this.c;
        final IClientApiService iClientApiService = (IClientApiService) obj;
        try {
            anhh anhhVar = (anhh) apag.parseFrom(anhh.b, iClientApiService.getSupportedApiFeatures(), aozs.a());
            final boolean b = abxa.b(anhhVar, anhg.DUO_KIT_REQUESTS);
            final boolean b2 = abxa.b(anhhVar, anhg.MEET_API_REQUESTS);
            if (abxa.b(anhhVar, anhg.SERVICE_API_GET_REGISTERED_ID_TYPE)) {
                acit acitVar = new acit();
                try {
                    iClientApiService.getRegisteredIdType(new abwy(acitVar));
                } catch (RemoteException e) {
                    if (!acitVar.c(e)) {
                        Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e);
                    }
                }
                s = acitVar.a;
            } else {
                AccountManager accountManager = AccountManager.get(((abxa) this.a).a);
                akrh e2 = aktp.e("AccountManager.getAccounts");
                try {
                    Account[] accounts = accountManager.getAccounts();
                    e2.close();
                    int length = accounts.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            Account account = accounts[i5];
                            if ("Duo".equals(account.name) && "com.google.android.apps.tachyon".equals(account.type)) {
                                s = actx.s(true);
                                break;
                            }
                            i5++;
                        } else {
                            s = actx.s(false);
                            break;
                        }
                    }
                } finally {
                }
            }
            acir c = ((acir) s).c(new acig() { // from class: abww
                @Override // defpackage.acig
                public final Object a(acir acirVar2) {
                    boolean z2;
                    IClientApiService iClientApiService2 = iClientApiService;
                    if (!acirVar2.l()) {
                        Exception g = acirVar2.g();
                        g.getClass();
                        return actx.r(g);
                    }
                    if (acirVar2.l() && ((Boolean) acirVar2.h()).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && b2) {
                        acit acitVar2 = new acit();
                        try {
                            iClientApiService2.getMeetApiAvailabilityInfo(new abwz(acitVar2));
                        } catch (RemoteException e3) {
                            Log.e("DuoStateFetcher", "Error getting Meet registered.", e3);
                            acitVar2.b(new abwv(true, true, false));
                        }
                        return acitVar2.a;
                    }
                    return actx.s(new abwv(b, z2, false));
                }
            });
            c.s(new kos(obj6, i2));
            c.r(new vdn(obj5, obj6, 4, null));
        } catch (RemoteException | apba | NullPointerException e3) {
            Log.e("DuoStateFetcher", "Error getting features.", e3);
            ((abwt) obj5).initCause(e3);
            ((acit) obj6).a((Exception) obj5);
        }
    }

    public /* synthetic */ abwx(acgl acglVar, String str, Executor executor, int i) {
        this.d = i;
        this.b = acglVar;
        this.a = str;
        this.c = executor;
    }

    public /* synthetic */ abwx(acit acitVar, Context context, acak acakVar, int i) {
        this.d = i;
        this.c = acitVar;
        this.b = context;
        this.a = acakVar;
    }
}
