package defpackage;

import android.net.LinkProperties;
import android.net.Network;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zko implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zko(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Collection, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        List list;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        LinkProperties linkProperties = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                if (!zkv.m(((vrn) ((xyt) ((zkv) this.a).u.b()).a()).e(adom.n((adiv) obj).a))) {
                    return true;
                }
                return false;
            case 1:
                if (!((String) obj).equals(this.a)) {
                    return true;
                }
                return false;
            case 2:
                return Collection.EL.stream(this.a).anyMatch(new zko((MessagePartCoreData) obj, 3));
            case 3:
                return zol.f(this.a, (MessagePartCoreData) obj);
            case 4:
                return ((ydc) this.a).g((String) obj);
            case 5:
                Network network = (Network) obj;
                Object obj2 = this.a;
                try {
                    linkProperties = ((adwg) obj2).e().a(network);
                } catch (adwk e) {
                    advr.i(e, "Can't get link properties, missing permissions.", new Object[0]);
                }
                if (linkProperties == null) {
                    int i = alog.d;
                    list = alsx.a;
                } else {
                    list = (List) Collection.EL.stream(linkProperties.getLinkAddresses()).map(new addg(8)).collect(Collectors.toList());
                }
                return list.contains(((adwg) obj2).c);
            case 6:
                String str = (String) obj;
                Object obj3 = this.a;
                try {
                    aiks n = new ailc(str, (int[]) null).n();
                    if (!n.l()) {
                        return false;
                    }
                    return ((String) obj3).equals(((aikp) n).b());
                } catch (ailb e2) {
                    advr.j(e2, adgu.a, "Exception while trying to parse Uri: %s", str);
                    return false;
                }
            case 7:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 8:
                booleanValue2 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue2;
            case 9:
                return ((adiv) obj).equals(new adiw(((adtn) ((adms) this.a).c.b()).l()));
            case 10:
                return ((String) this.a).equals(((adpe) obj).d.a);
            case 11:
                int i2 = adov.b;
                return ((String) this.a).equals(((adpe) obj).d.a);
            case 12:
                int i3 = adov.b;
                return ((String) this.a).equals(((adoz) obj).l.a);
            case 13:
                int i4 = adov.b;
                return ((String) this.a).equals(((ador) obj).c.a);
            case 14:
                Object obj4 = this.a;
                adqt adqtVar = adqt.UNKNOWN;
                return ((adqt) obj).l.equals(albo.ap((String) obj4));
            case 15:
                int i5 = adui.e;
                return adwf.A((String) obj, ((aiom) this.a).m());
            case 16:
                return adwf.A((String) obj, (String) adui.c((aion) this.a).orElse(""));
            case 17:
                int i6 = adui.e;
                return adwf.A((String) obj, ((aiom) this.a).m());
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                int i7 = ((aehn) entry.getValue()).b & 2;
                Object obj5 = this.a;
                if (i7 != 0) {
                    aotw aotwVar = ((aehn) entry.getValue()).d;
                    if (aotwVar == null) {
                        aotwVar = aotw.a;
                    }
                    aozn aoznVar = aotwVar.f;
                    if (aoznVar == null) {
                        aoznVar = aozn.a;
                    }
                    Duration k = aotl.k(aoznVar);
                    apct apctVar = ((aehn) entry.getValue()).e;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    Duration between = Duration.between(aotl.l(apctVar), Instant.now());
                    aehv aehvVar = (aehv) obj5;
                    Duration ofSeconds = Duration.ofSeconds(aqnl.a.get().a(aehvVar.b));
                    if (k.minus(between).compareTo(ofSeconds) > 0) {
                        z = false;
                    }
                    ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 167, "SyncHelper.java")).L("[%s] configValidity: %s, durationSinceLastUpdate: %s, batchSyncConfigExpireInterval: %s, shouldSync: %s", aehvVar.h, k, between, ofSeconds, Boolean.valueOf(z));
                } else {
                    ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 146, "SyncHelper.java")).t("[%s] configData has no configuration, enforce a sync.", ((aehv) obj5).h);
                }
                return z;
            case 19:
                booleanValue3 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue3;
            default:
                booleanValue4 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue4;
        }
    }
}
