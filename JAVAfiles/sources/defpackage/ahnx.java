package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahnx implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ ahnx(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return alog.n((List) obj);
            case 1:
                asis asisVar = (asis) obj;
                aozy createBuilder = asjx.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asjx asjxVar = (asjx) createBuilder.b;
                asisVar.getClass();
                asjxVar.c = asisVar;
                asjxVar.b |= 1;
                aozy createBuilder2 = asjw.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjw asjwVar = (asjw) createBuilder2.b;
                asjwVar.b |= 2;
                asjwVar.e = true;
                asjw asjwVar2 = (asjw) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asjx asjxVar2 = (asjx) createBuilder.b;
                asjwVar2.getClass();
                asjxVar2.d = asjwVar2;
                asjxVar2.b |= 2;
                return (asjx) createBuilder.s();
            case 2:
                ((alvg) ((alvg) ((alvg) ahkh.a.i()).g((RuntimeException) obj)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 422, "MemoryMetricServiceImpl.java")).q("Metric extension provider failed.");
                return null;
            case 3:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 4:
                return false;
            case 5:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 6:
                return aocq.a((String) obj);
            case 7:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 8:
                ahty ahtyVar = (ahty) obj;
                if (ahtyVar.a == 29514) {
                    aozy createBuilder3 = ahum.a.createBuilder();
                    aozy createBuilder4 = ahuj.b.createBuilder();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    ahuj ahujVar = (ahuj) createBuilder4.b;
                    ahujVar.c |= 8;
                    ahujVar.g = currentTimeMillis;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ahum ahumVar = (ahum) createBuilder3.b;
                    ahuj ahujVar2 = (ahuj) createBuilder4.s();
                    ahujVar2.getClass();
                    ahumVar.c = ahujVar2;
                    ahumVar.b |= 1;
                    return (ahum) createBuilder3.s();
                }
                throw ahtyVar;
            case 9:
                return Long.valueOf(((aicv) obj).b);
            case 10:
                ((alvg) ((alvg) aiea.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "recordSaveSuccess", 348, "MobaltPeriodicJobImpl.java")).r("Mobalt: successfully generated observations for %s reports", ((List) obj).size());
                return null;
            case 11:
                ((alvg) ((alvg) aieo.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "recordSuccess", 175, "LogWriter.java")).r("Mobalt: logged event to %s reports", ((List) obj).size());
                return null;
            case 12:
                return ((InetSocketAddress) obj).toString();
            case 13:
                List list = (List) obj;
                int i = aiig.a;
                return list;
            case 14:
                List list2 = (List) obj;
                int i2 = aiig.a;
                return list2;
            case 15:
                List list3 = (List) obj;
                int i3 = aiig.a;
                return list3;
            case 16:
                return new ArrayList(((LinkedHashMap) obj).values());
            case 17:
                Log.w("ExpressiveStickerClient", "Fetch failed.", (Throwable) obj);
                return null;
            case 18:
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    try {
                        return (aouu) ((aozy) aouu.a.createBuilder().g(bArr)).s();
                    } catch (apba e) {
                        throw new IllegalArgumentException("Response has protocol buffer issue.", e);
                    }
                }
                throw new IllegalArgumentException("Response content data cannot be empty.");
            case 19:
                aouu aouuVar = (aouu) obj;
                LinkedHashMap ak = alzz.ak(aouuVar.b.size());
                Iterator<E> it = aouuVar.b.iterator();
                while (it.hasNext()) {
                    aova aovaVar = ((aovb) it.next()).b;
                    if (aovaVar == null) {
                        aovaVar = aova.a;
                    }
                    int aT = a.aT(aovaVar.c);
                    if (aT == 0 || aT != 4) {
                        ak.put(aovaVar.b, aovaVar);
                    }
                }
                return ak;
            default:
                return null;
        }
    }
}
