package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpw extends atqh {
    private final Method a;
    private final int b;

    public atpw(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.atqh
    public final /* bridge */ /* synthetic */ void a(atql atqlVar, Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        atqlVar.b(str, value.toString());
                    } else {
                        throw atqx.d(this.a, this.b, a.bW(str, "Header map contained null value for key '", "'."), new Object[0]);
                    }
                } else {
                    throw atqx.d(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw atqx.d(this.a, this.b, "Header map was null.", new Object[0]);
    }
}
