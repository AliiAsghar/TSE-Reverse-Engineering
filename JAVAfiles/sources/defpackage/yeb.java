package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yeb implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ yeb(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                atpc atpcVar = (atpc) obj;
                alvg alvgVar = (alvg) ((alvg) yee.b.i()).g(atpcVar);
                alvgVar.X(yee.c, Integer.valueOf(atpcVar.a));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 149, "TenorService.java")).q("HTTP Exception while registering share.");
                return null;
            case 1:
                xze xzeVar = yee.a;
                return null;
            case 2:
                ((alvg) ((alvg) ((alvg) yee.b.i()).g((UnknownHostException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 156, "TenorService.java")).q("No connectivity while registering share.");
                return null;
            case 3:
                ((alvg) ((alvg) ((alvg) yee.b.i()).g((SSLHandshakeException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 163, "TenorService.java")).q("SSLHandshake Exception while registering share.");
                return null;
            case 4:
                ((alvg) ((alvg) ((alvg) yee.b.i()).g((ConnectException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 171, "TenorService.java")).q("Connect Exception while registering share.");
                return null;
            case 5:
                ((alvg) ((alvg) ((alvg) yee.b.i()).g((SocketTimeoutException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 178, "TenorService.java")).q("Socket Timeout Exception while registering share.");
                return null;
            case 6:
                yeu yeuVar = ((yey) obj).c;
                if (yeuVar == null) {
                    yeuVar = yeu.a;
                }
                return Long.valueOf(yeuVar.c);
            case 7:
                yew yewVar = ((yey) obj).f;
                if (yewVar == null) {
                    yewVar = yew.a;
                }
                apct apctVar = yewVar.c;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return aotl.l(apctVar);
            case 8:
                yev yevVar = ((yey) obj).d;
                if (yevVar == null) {
                    yevVar = yev.a;
                }
                return Long.valueOf(yevVar.c);
            case 9:
                yev yevVar2 = ((yey) obj).d;
                if (yevVar2 == null) {
                    yevVar2 = yev.a;
                }
                return Long.valueOf(yevVar2.d);
            case 10:
                yex yexVar = ((yey) obj).e;
                if (yexVar == null) {
                    yexVar = yex.a;
                }
                return Long.valueOf(yexVar.c);
            case 11:
                if (((Integer) obj).intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return yyb.di((znj) obj);
            case 13:
                return Integer.valueOf(yyb.dh((znj) obj));
            case 14:
                aozy createBuilder = aldb.a.createBuilder();
                createBuilder.aC((alog) obj);
                return (aldb) createBuilder.s();
            case 15:
                return Boolean.valueOf(((yiy) obj).d);
            case 16:
                ((alvg) ((alvg) ((alvg) yks.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPlace", 93, "PlacesMessagingClient.java")).q("Failed to get place from fetch place request.");
                return Optional.empty();
            case 17:
                ((alvg) ((alvg) ((alvg) yks.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", 169, "PlacesMessagingClient.java")).q("Failed to get photo metadata from fetch place request.");
                return Optional.empty();
            case 18:
                ((alvg) ((alvg) ((alvg) yks.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", 159, "PlacesMessagingClient.java")).q("Failed to get bitmap from fetch photo request.");
                return Optional.empty();
            case 19:
                ((alwl) ((alwl) yqi.b.i()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "callHadesClassify", 264, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#callHadesClassify: failed to initialize");
                return new aect("NOT_AVAILABLE", aecg.e, 4);
            default:
                yuf yufVar = (yuf) obj;
                xze xzeVar2 = ytl.g;
                return Boolean.valueOf(Stream.CC.concat(Collection.EL.stream(DesugarCollections.unmodifiableMap(yufVar.c).values()), Collection.EL.stream(DesugarCollections.unmodifiableMap(yufVar.e).values())).anyMatch(new wjl(20)));
        }
    }
}
