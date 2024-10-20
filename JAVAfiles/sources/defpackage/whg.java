package defpackage;

import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class whg implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ whg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                xze xzeVar = whj.a;
                return (String) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).r), obj2, "Default");
            case 1:
                Object obj3 = this.a;
                xze xzeVar2 = whj.a;
                return (Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).j), obj3, 0);
            case 2:
                whc whcVar = (whc) obj;
                xze xzeVar3 = whj.a;
                aozy builder = whcVar.toBuilder();
                whm whmVar = whcVar.f;
                if (whmVar == null) {
                    whmVar = whm.a;
                }
                aozy builder2 = whmVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj4 = this.a;
                whm whmVar2 = (whm) builder2.b;
                obj4.getClass();
                whmVar2.g = (apct) obj4;
                whmVar2.b |= 2;
                whm whmVar3 = (whm) builder2.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                whc whcVar2 = (whc) builder.b;
                whmVar3.getClass();
                whcVar2.f = whmVar3;
                whcVar2.b |= 1;
                return (whc) builder.s();
            case 3:
                xze xzeVar4 = whj.a;
                aozy builder3 = ((whc) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj5 = this.a;
                whc whcVar3 = (whc) builder3.b;
                obj5.getClass();
                whcVar3.e = (String) obj5;
                return (whc) builder3.s();
            case 4:
                Object obj6 = this.a;
                xze xzeVar5 = whj.a;
                return uhy.b((whl) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).n), obj6, whl.a));
            case 5:
                Object obj7 = this.a;
                xze xzeVar6 = whj.a;
                return whj.n(wgr.a.createBuilder((wgr) obj), (wfy) obj7);
            case 6:
                alvi alviVar = why.a;
                return this.a.a(obj);
            case 7:
                alvi alviVar2 = why.a;
                return this.a.a(obj);
            case 8:
                alvi alviVar3 = wiv.a;
                return this.a.a(obj);
            case 9:
                alvi alviVar4 = wiv.a;
                return this.a.a(obj);
            case 10:
                int intValue = ((Integer) this.a).intValue();
                long millis = TimeUnit.SECONDS.toMillis(((Integer) wjo.b.e()).intValue());
                long millis2 = TimeUnit.SECONDS.toMillis(((Integer) wjo.a.e()).intValue());
                if (Long.numberOfLeadingZeros(millis) - Long.numberOfLeadingZeros(millis2) > intValue) {
                    millis2 = millis << intValue;
                }
                return Duration.ofMillis(millis2);
            case 11:
                adlw adlwVar = ((RcsProvisioningListenableWorker) this.a).h;
                if (adlwVar != null) {
                    adlwVar.T();
                }
                return true;
            case 12:
                advp advpVar = wjy.a;
                advr.k("Cancel All Provisioning work operation result is: %s, trigger is %s", (gtc) obj, ((amww) this.a).name());
                return null;
            case 13:
                ((wkk) this.a).v(aphg.TRIGGER_APP_START, amww.APP_STARTUP);
                return null;
            case 14:
                ((wkk) this.a).v(aphg.TRIGGER_PHENOTYPE_FLAG_UPDATE, amww.CSLIB_PHENOTYPE_UPDATE);
                return null;
            case 15:
                xyo c = wkr.a.c();
                c.H("[SR]: Successfully called UnregisterGoogleRcsRPC.");
                c.j((String) this.a);
                c.q();
                return upm.b();
            case 16:
                Throwable th = (Throwable) obj;
                boolean d = vch.d(th);
                xyo e = wkr.a.e();
                e.H("[SR]: UnregisterGoogleRcs RPC failed.");
                e.j((String) this.a);
                e.r(th);
                if (d) {
                    return upm.e();
                }
                return upm.d();
            case 17:
                xyo c2 = wne.a.c();
                c2.H("Ending foreground service on async work complete for broadcast of");
                wne wneVar = (wne) this.a;
                c2.H(wneVar.b);
                c2.q();
                wneVar.c();
                wneVar.g.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 2);
                return true;
            case 18:
                RuntimeException runtimeException = (RuntimeException) obj;
                ((wne) this.a).e(runtimeException);
                throw runtimeException;
            case 19:
                RuntimeException runtimeException2 = (RuntimeException) obj;
                wne wneVar2 = (wne) this.a;
                wneVar2.e(runtimeException2);
                wneVar2.g.a();
                throw runtimeException2;
            default:
                qzv qzvVar = (qzv) obj;
                qzvVar.getClass();
                qzw qzwVar = ((woe) this.a).d;
                ((ahmv) qzwVar.l.b()).j(qzvVar.a, null);
                if (lbp.a()) {
                }
                return null;
        }
    }
}
