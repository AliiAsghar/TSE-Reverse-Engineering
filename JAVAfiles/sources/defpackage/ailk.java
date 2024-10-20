package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailk implements ailm {
    public static final advp a = new advp("BasicDiscoveryStrategyImpl");
    private static final alog c;
    public final ailo b;
    private final aiid d;

    static {
        int i = alog.d;
        c = alsx.a;
    }

    public ailk(aiid aiidVar, ailo ailoVar) {
        this.d = aiidVar;
        this.b = ailoVar;
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str) && str.endsWith(".")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    private static List c(ListenableFuture listenableFuture, String str) {
        try {
            return (List) listenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            advr.j(e, a, "error processing %s records", str);
            return c;
        }
    }

    @Override // defpackage.ailm
    public final List b(String str) {
        ArrayList arrayList = new ArrayList();
        for (atmb atmbVar : c(this.d.b(str), "NAPTR")) {
            for (atng atngVar : c(this.d.c(atmbVar.c.toString()), "SRV")) {
                String a2 = a(atngVar.d.toString());
                if (anbj.b(a2) && (anbj.a(a2) instanceof Inet4Address)) {
                    arrayList.add(new aill(atmbVar, atngVar, a2, a2, this.b));
                } else {
                    arrayList.addAll((Collection) Collection.EL.stream(c(this.d.a(a2), "A_or_AAAA")).filter(new agol(this, 7)).map(new uoc(this, atmbVar, atngVar, 6, null)).collect(Collectors.toList()));
                }
            }
        }
        try {
            Collections.sort(arrayList);
        } catch (IllegalArgumentException e) {
            advr.j(new ailj(e), a, "error sorting records: %s", arrayList);
        }
        advr.d(a, "Resolved %d NAPTR records, to %d SRV records, to %d IP addresses, DNS discovery results: %s", Long.valueOf(Collection.EL.stream(arrayList).map(new aiec(15)).distinct().count()), Long.valueOf(Collection.EL.stream(arrayList).map(new aiec(16)).distinct().count()), Long.valueOf(arrayList.size()), Collection.EL.stream(arrayList).map(new aiec(17)).collect(Collectors.joining(";")));
        return alog.n(arrayList);
    }
}
