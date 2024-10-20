package defpackage;

import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airn implements airm {
    public final Proxy b;
    public final int c;
    public final ArrayMap d;
    private final anen f;
    private static final String e = "Sticker/1.0 ".concat(String.valueOf(System.getProperty("http.agent")));
    public static final int a = (int) TimeUnit.SECONDS.toMillis(1);

    public airn(Proxy proxy, int i, Map map, anen anenVar) {
        this.b = proxy;
        this.c = i;
        ArrayMap arrayMap = new ArrayMap();
        this.d = arrayMap;
        arrayMap.putAll(map);
        if (!map.containsKey("User-Agent")) {
            arrayMap.put("User-Agent", e);
        }
        this.f = anenVar;
    }

    @Override // defpackage.airm
    public final ListenableFuture a(String str) {
        return albo.bM(new ahes(this, str, 8), this.f);
    }
}
