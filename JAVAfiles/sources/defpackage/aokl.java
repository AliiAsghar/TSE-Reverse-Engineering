package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokl implements aokg {
    static final long a = TimeUnit.MINUTES.toMillis(5);
    static final long b = TimeUnit.HOURS.toMillis(1);
    private static final algs e = new algs(" ");
    private final aegu f;
    private final asmb h;
    private final anen g = new andj();
    public final Map c = new HashMap();
    public final Map d = new HashMap();

    public aokl(asmb asmbVar, aegu aeguVar) {
        this.h = asmbVar;
        this.f = aeguVar;
    }

    private static final String f(Set set) {
        return "oauth2:".concat(e.d(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.aokg
    public final aoki a(aokd aokdVar, Set set) {
        ListenableFuture listenableFuture;
        ?? r1;
        aokk aokkVar = new aokk(new Account(aokdVar.b, "com.google"), f(set));
        synchronized (this.d) {
            listenableFuture = (ListenableFuture) this.d.get(aokkVar);
            r1 = 0;
            if (listenableFuture == null) {
                anel anelVar = new anel(new akoo(this, aokkVar, 4));
                anelVar.c(new aofk(this, aokkVar, 6, null), this.g);
                this.d.put(aokkVar, anelVar);
                listenableFuture = anelVar;
                r1 = listenableFuture;
            }
        }
        if (r1 != 0) {
            r1.run();
        }
        try {
            return (aoki) listenableFuture.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof aokh) {
                throw ((aokh) cause);
            }
            throw new aokh("Failed to refresh token", cause);
        }
    }

    @Override // defpackage.aokg
    public final aoki b(aokd aokdVar, Set set) {
        aoki c;
        try {
            aokk aokkVar = new aokk(new Account(aokdVar.b, "com.google"), f(set));
            synchronized (this.c) {
                c = c(aokkVar);
            }
            return c;
        } catch (aokh e2) {
            throw e2;
        } catch (Throwable th) {
            throw new aokh("Failed to get auth token", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aoki c(defpackage.aokk r8) {
        /*
            r7 = this;
            java.util.Map r0 = r7.c
            java.lang.Object r0 = r0.get(r8)
            aoki r0 = (defpackage.aoki) r0
            if (r0 == 0) goto L44
            java.lang.Long r1 = r0.c
            if (r1 == 0) goto L2a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r1.longValue()
            long r1 = r2.toMillis(r3)
            aegu r3 = r7.f
            j$.time.Instant r3 = r3.f()
            long r3 = r3.toEpochMilli()
            long r1 = r1 - r3
            long r3 = defpackage.aokl.a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L40
            goto L41
        L2a:
            aegu r1 = r7.f
            j$.time.Instant r1 = r1.f()
            long r1 = r1.toEpochMilli()
            long r3 = r0.b
            long r1 = r1 - r3
            long r3 = defpackage.aokl.b
            long r5 = defpackage.aokl.a
            long r3 = r3 - r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L41
        L40:
            return r0
        L41:
            r7.e(r0)
        L44:
            aoki r8 = r7.d(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aokl.c(aokk):aoki");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, aegu] */
    public final aoki d(aokk aokkVar) {
        Account account = aokkVar.a;
        String str = aokkVar.b;
        asmb asmbVar = this.h;
        try {
            TokenData a2 = abkw.a((Context) asmbVar.a, account, str, null);
            aoki aokiVar = new aoki(a2.b, asmbVar.b.f().toEpochMilli(), a2.c);
            this.c.put(aokkVar, aokiVar);
            return aokiVar;
        } catch (abks e2) {
            throw new aokh(e2);
        }
    }

    public final void e(aoki aokiVar) {
        try {
            Object obj = this.h.a;
            abhg.g("Calling this from your main thread can lead to deadlock");
            abkw.h((Context) obj);
            Bundle bundle = new Bundle();
            abkw.d((Context) obj, bundle);
            ahtp.f((Context) obj);
            boolean b2 = aqmg.b();
            String str = aokiVar.a;
            if (b2 && abkw.f((Context) obj)) {
                abld abldVar = new abld((Context) obj);
                ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
                clearTokenRequest.b = str;
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.d = new Feature[]{abkr.c};
                ajxpVar.c = new abot(clearTokenRequest, 1);
                ajxpVar.b = 1513;
                try {
                    abkw.b(abldVar.i(ajxpVar.b()), "clear token");
                    return;
                } catch (abra e2) {
                    abkw.c(e2, "clear token");
                }
            }
            abkw.g((Context) obj, abkw.c, new abku(str, bundle));
        } catch (abks e3) {
            throw new aokh(e3);
        }
    }
}
