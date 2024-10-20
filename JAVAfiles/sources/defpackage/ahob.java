package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahob extends ahnz implements ahmw {
    private final ahmu b;
    private final Context c;
    private final Executor d;
    private final ahnw e;
    private final armf f;
    private final apwt g;
    private final armf h;
    private final armf i;
    private final armf j;

    public ahob(ahmv ahmvVar, Context context, Executor executor, ahnw ahnwVar, armf<SharedPreferences> armfVar, apwt<ahnv> apwtVar, ahkr ahkrVar, armf<Boolean> armfVar2, armf<ashc> armfVar3, armf<Boolean> armfVar4) {
        this.b = ahmvVar.a(executor, apwtVar, null);
        this.c = context;
        this.d = executor;
        this.e = ahnwVar;
        this.f = armfVar;
        this.g = apwtVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
    }

    public static /* synthetic */ ListenableFuture i(ahob ahobVar) {
        String processName;
        if (!((ahnv) ahobVar.g.b()).b()) {
            return aneh.a;
        }
        Context context = ahobVar.c;
        apwt apwtVar = ahobVar.g;
        String packageName = context.getPackageName();
        String str = ((ahnv) apwtVar.b()).a;
        String valueOf = String.valueOf(packageName);
        String valueOf2 = String.valueOf(str);
        processName = Application.getProcessName();
        if (!processName.equals(valueOf.concat(valueOf2))) {
            return aneh.a;
        }
        if (!((Boolean) ahobVar.h.b()).booleanValue()) {
            return aneh.a;
        }
        return ancj.g(ahobVar.e.a(0, 0, ((SharedPreferences) ahobVar.f.b()).getString("lastExitProcessName", null), ((SharedPreferences) ahobVar.f.b()).getLong("lastExitTimestamp", -1L)), new ahce(ahobVar, 3), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ListenableFuture U(alog alogVar) {
        if (alogVar.isEmpty()) {
            return aneh.a;
        }
        ashc ashcVar = (ashc) this.i.b();
        aozy createBuilder = ashb.a.createBuilder();
        int size = alogVar.size();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ashb ashbVar = (ashb) apagVar;
        ashbVar.b |= 2;
        ashbVar.e = size;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ashb ashbVar2 = (ashb) createBuilder.b;
        ashcVar.getClass();
        ashbVar2.d = ashcVar;
        ashbVar2.b |= 1;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < ashcVar.b.size(); i++) {
            int as = arsd.as(ashcVar.b.d(i));
            if (as == 0) {
                as = 1;
            }
            hashSet.add(Integer.valueOf(as - 1));
        }
        int size2 = alogVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            asha ashaVar = (asha) alogVar.get(i2);
            int as2 = arsd.as(ashaVar.d);
            if (as2 == 0) {
                as2 = 1;
            }
            if (hashSet.contains(Integer.valueOf(as2 - 1))) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashb ashbVar3 = (ashb) createBuilder.b;
                ashaVar.getClass();
                apax apaxVar = ashbVar3.c;
                if (!apaxVar.c()) {
                    ashbVar3.c = apag.mutableCopy(apaxVar);
                }
                ashbVar3.c.add(ashaVar);
            }
        }
        ashb ashbVar4 = (ashb) createBuilder.s();
        ahmu ahmuVar = this.b;
        ahmq a = ahmr.a();
        aozy createBuilder2 = asjt.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        asjt asjtVar = (asjt) createBuilder2.b;
        ashbVar4.getClass();
        asjtVar.q = ashbVar4;
        asjtVar.b |= 65536;
        a.e((asjt) createBuilder2.s());
        return ancj.f(ahmuVar.b(a.a()), new abdo(this, alogVar, 13), this.d);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0027 */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ java.lang.Void V(defpackage.alog r6, java.lang.Void r7) {
        /*
            r5 = this;
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            asha r6 = (defpackage.asha) r6
        L7:
            java.lang.String r0 = r6.c
            long r1 = r6.g
            armf r3 = r5.f
            java.lang.Object r3 = r3.b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "lastExitProcessName"
            android.content.SharedPreferences$Editor r0 = r3.putString(r4, r0)
            java.lang.String r3 = "lastExitTimestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L49
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L7
            alvi r6 = defpackage.ahkh.a
            alvw r6 = r6.i()
            alvg r6 = (defpackage.alvg) r6
            java.lang.String r7 = "updateLastRecordedAppExit"
            r0 = 213(0xd5, float:2.98E-43)
            java.lang.String r1 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
            java.lang.String r2 = "ApplicationExitMetricServiceImpl.java"
            alvw r6 = r6.h(r1, r7, r0, r2)
            alvg r6 = (defpackage.alvg) r6
            java.lang.String r7 = "Failed to persist most recent App Exit"
            r6.q(r7)
        L49:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahob.V(alog, java.lang.Void):java.lang.Void");
    }

    public /* synthetic */ void W() {
        ((Boolean) this.j.b()).booleanValue();
    }

    public /* synthetic */ void X() {
        albo.bN(new aarj(this, 9), this.d);
    }

    public void Y() {
        albo.bN(new aarj(this, 8), this.d);
    }

    @Override // defpackage.ahmw
    public void as() {
        Y();
        albo.bL(new ahoa(this, 1), this.d);
    }

    public /* synthetic */ ListenableFuture j() {
        return agqa.b(this.c, new ahoa(this, 0));
    }
}
