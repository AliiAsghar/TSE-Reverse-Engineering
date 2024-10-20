package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpu extends atqh {
    private final Method a;
    private final int b;
    private final atox c;
    private final boolean d;

    public atpu(Method method, int i, atox atoxVar, boolean z) {
        this.a = method;
        this.b = i;
        this.c = atoxVar;
        this.d = z;
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
                        String obj2 = value.toString();
                        if (obj2 != null) {
                            atqlVar.a(str, obj2, this.d);
                        } else {
                            throw atqx.d(this.a, this.b, "Field map value '" + value.toString() + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw atqx.d(this.a, this.b, a.bW(str, "Field map contained null value for key '", "'."), new Object[0]);
                    }
                } else {
                    throw atqx.d(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw atqx.d(this.a, this.b, "Field map was null.", new Object[0]);
    }
}
