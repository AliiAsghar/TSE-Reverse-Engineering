package defpackage;

import android.database.DatabaseUtils;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adhe implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adhe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v9, types: [adns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.Object, java.util.function.Supplier] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Object obj2;
        int i = 0;
        switch (this.b) {
            case 0:
                return adcx.m((adhf) this.a, (IOException) obj);
            case 1:
                aior aiorVar = (aior) obj;
                adhf adhfVar = (adhf) this.a;
                advr.l(adhfVar.b.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", aiorVar);
                adhfVar.b.s(13, aiorVar);
                return Optional.of(aiorVar);
            case 2:
                aior aiorVar2 = (aior) obj;
                adhf adhfVar2 = (adhf) this.a;
                advr.l(adhfVar2.b.m, "discoverSipServer: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", aiorVar2);
                adhfVar2.b.s(13, aiorVar2);
                return Optional.of(aiorVar2);
            case 3:
                return adcx.m((adhf) this.a, (IOException) obj);
            case 4:
                adka adkaVar = (adka) this.a;
                adkaVar.h.k();
                adkaVar.g.b();
                ((vyv) adkaVar.e.b()).e(2);
                return null;
            case 5:
                adka adkaVar2 = (adka) this.a;
                adkaVar2.h.k();
                adkaVar2.g.b();
                ((vyv) adkaVar2.e.b()).e(2);
                return null;
            case 6:
                ((adka) this.a).h.k();
                return null;
            case 7:
                ((adky) this.a).a.V(adjj.MSG_GET_CONSENT_API_SUCCESS, (adkb) obj);
                return null;
            case 8:
                adky adkyVar = (adky) this.a;
                Exception exc = (Exception) obj;
                adkyVar.a.D.f(exc, "googleToSConsentApi.getConsent failed", new Object[0]);
                adkyVar.a.V(adjj.MSG_GET_CONSENT_API_ERROR, exc);
                return null;
            case 9:
                return ((adms) this.a).A();
            case 10:
                return ((adnt) this.a).c((apkc) obj);
            case 11:
                alor alorVar = adnt.a;
                return adnt.b((apkc) obj, (apjv) ((aozy) this.a).s());
            case 12:
                alor alorVar2 = adnt.a;
                return adnt.b((apkc) obj, (apjv) ((aozy) this.a).s());
            case 13:
                apkc apkcVar = (apkc) obj;
                alor alorVar3 = adnt.a;
                apjr apjrVar = apkcVar.f;
                if (apjrVar == null) {
                    apjrVar = apjr.a;
                }
                ?? r1 = this.a;
                aozy builder = apjrVar.toBuilder();
                r1.a(builder);
                aozy builder2 = apkcVar.toBuilder();
                apjr apjrVar2 = (apjr) builder.s();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apkc apkcVar2 = (apkc) builder2.b;
                apjrVar2.getClass();
                apkcVar2.f = apjrVar2;
                apkcVar2.b |= 8;
                return (apkc) builder2.s();
            case 14:
                return this.a.a(obj);
            case 15:
                aozy builder3 = ((aegj) obj).toBuilder();
                while (true) {
                    Object obj3 = this.a;
                    if (i < ((aegj) builder3.b).b.size()) {
                        if (((aegh) ((aegj) builder3.b).b.get(i)).d.equals(((aegh) obj3).d)) {
                            if (!builder3.b.isMutable()) {
                                builder3.u();
                            }
                            aegj aegjVar = (aegj) builder3.b;
                            obj3.getClass();
                            aegjVar.a();
                            aegjVar.b.set(i, obj3);
                            return (aegj) builder3.s();
                        }
                        i++;
                    } else {
                        if (!builder3.b.isMutable()) {
                            builder3.u();
                        }
                        aegj aegjVar2 = (aegj) builder3.b;
                        obj3.getClass();
                        aegjVar2.a();
                        aegjVar2.b.add(obj3);
                        return (aegj) builder3.s();
                    }
                }
            case 16:
                ((alvg) ((alvg) ((alvg) aehk.a.i()).g((aqwb) obj)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 259, "RpcManager.java")).t("[%s] sync failed due to RPC error", this.a);
                return new aehe(5);
            case 17:
                return this.a.a(obj);
            case 18:
                String str = (String) obj;
                if (str == null) {
                    return "NULL";
                }
                if (!((agmf) this.a).a) {
                    return DatabaseUtils.sqlEscapeString(str);
                }
                return str;
            case 19:
                ThreadLocal threadLocal = agoz.a;
                return ((agpw) obj).a((agpo) this.a);
            default:
                ThreadLocal threadLocal2 = agoz.a;
                obj2 = this.a.get();
                return obj2;
        }
    }
}
