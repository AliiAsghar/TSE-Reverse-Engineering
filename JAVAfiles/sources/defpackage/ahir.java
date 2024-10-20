package defpackage;

import android.util.Log;
import android.util.Pair;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahir implements dts {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ahir(ahiy ahiyVar, ahiq ahiqVar, File file, String str, agrk agrkVar, int i) {
        this.f = i;
        this.b = ahiyVar;
        this.c = ahiqVar;
        this.d = file;
        this.a = str;
        this.e = agrkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        if (this.f != 0) {
            ptf ptfVar = new ptf(dtqVar, 10);
            Object obj = this.c;
            qax qaxVar = (qax) obj;
            ConcurrentMap concurrentMap = qaxVar.b;
            Object obj2 = this.d;
            concurrentMap.put(obj2, ptfVar);
            dtqVar.a(new nan(obj, obj2, 8), qaxVar.e);
            aozy createBuilder = qgv.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            Object obj3 = this.b;
            apag apagVar = createBuilder.b;
            qgv qgvVar = (qgv) apagVar;
            obj2.getClass();
            qgvVar.b |= 1;
            String str = (String) obj2;
            qgvVar.c = str;
            qfb qfbVar = (qfb) obj3;
            String str2 = qfbVar.c;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            Object obj4 = this.e;
            qgv qgvVar2 = (qgv) createBuilder.b;
            str2.getClass();
            qgvVar2.b |= 2;
            qgvVar2.d = str2;
            Optional optional = (Optional) obj4;
            optional.isPresent();
            d.s(true);
            aozy createBuilder2 = qgw.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            qgw qgwVar = (qgw) apagVar2;
            obj3.getClass();
            qgwVar.c = qfbVar;
            qgwVar.b |= 1;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            String str3 = this.a;
            qgw qgwVar2 = (qgw) createBuilder2.b;
            str3.getClass();
            qgwVar2.b = 2 | qgwVar2.b;
            qgwVar2.d = str3;
            aozb byteString = ((qgv) createBuilder.s()).toByteString();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgw qgwVar3 = (qgw) createBuilder2.b;
            qgwVar3.b |= 4;
            qgwVar3.e = byteString;
            Object obj5 = optional.get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgw qgwVar4 = (qgw) createBuilder2.b;
            qgwVar4.f = (qei) obj5;
            qgwVar4.b |= 8;
            try {
                ((qax) obj).c.g((qgw) createBuilder2.s()).h(new mmq(obj, obj2, 11), qaxVar.e).k(qiu.b(), andi.a);
            } catch (IllegalArgumentException e) {
                xyo e2 = qax.a.e();
                e2.H("Fail to start update group operation");
                e2.z("operationId", obj2);
                e2.r(e);
                aozy createBuilder3 = qeg.a.createBuilder();
                qef qefVar = qef.FAILED_PERMANENTLY;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qeg qegVar = (qeg) createBuilder3.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                qeg qegVar2 = (qeg) createBuilder3.s();
                qaxVar.a(str, qegVar2);
                qaxVar.d.f(str, qegVar2);
            }
            return "sendGroupNameChange#".concat(String.valueOf(obj2));
        }
        adwv adwvVar = new adwv(dtqVar);
        Object obj6 = this.d;
        String str4 = this.a;
        Object obj7 = this.e;
        Object obj8 = this.b;
        Object obj9 = ((ahiy) obj8).b;
        ahiq ahiqVar = (ahiq) this.c;
        ahjo ahjoVar = new ahjo((ahjv) obj9, ahiqVar.b, (File) obj6, str4, adwvVar, (agrk) obj7);
        ahjoVar.i = null;
        if (ahio.b == ahiqVar.c) {
            ahjoVar.g(ahjn.WIFI_OR_CELLULAR);
        } else {
            ahjoVar.g(ahjn.WIFI_ONLY);
        }
        alog alogVar = ahiqVar.d;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            Pair pair = (Pair) alogVar.get(i);
            ahjoVar.e.q((String) pair.first, (String) pair.second);
        }
        dtqVar.a(new adub(obj8, obj6, str4, 3), andi.a);
        boolean j = ahjoVar.d.j(ahjoVar);
        Object[] objArr = {"OffroadFileDownloader", ahiqVar.b, Boolean.valueOf(j)};
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", ahiu.a("%s: Data download scheduled for file: %s enqueued: %s", objArr));
        }
        if (!j) {
            atkm atkmVar = new atkm();
            atkmVar.a = 332;
            atkmVar.c = "Duplicate request for: ".concat(String.valueOf(ahiqVar.b));
            dtqVar.d(atkmVar.e());
        }
        return "Data download scheduled for file ".concat(String.valueOf(ahiqVar.b));
    }

    public /* synthetic */ ahir(qax qaxVar, String str, qfb qfbVar, Optional optional, String str2, int i) {
        this.f = i;
        this.c = qaxVar;
        this.d = str;
        this.b = qfbVar;
        this.e = optional;
        this.a = str2;
    }
}
