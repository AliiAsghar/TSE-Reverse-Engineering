package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpz extends atqh {
    private final Method a;
    private final int b;
    private final atox c;
    private final String d;

    public atpz(Method method, int i, atox atoxVar, String str) {
        this.a = method;
        this.b = i;
        this.c = atoxVar;
        this.d = str;
    }

    @Override // defpackage.atqh
    public final /* synthetic */ void a(atql atqlVar, Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        atqlVar.c(aotl.au(assi.c, a.bW(str, "form-data; name=\"", "\""), assi.b, this.d), (asmk) this.c.a(value));
                    } else {
                        throw atqx.d(this.a, this.b, a.bW(str, "Part map contained null value for key '", "'."), new Object[0]);
                    }
                } else {
                    throw atqx.d(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw atqx.d(this.a, this.b, "Part map was null.", new Object[0]);
    }
}
