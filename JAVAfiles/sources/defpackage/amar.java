package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amar {
    public final Map a;
    public volatile transient Map.Entry b;

    public amar(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        obj.getClass();
        Object b = b(obj);
        if (b == null) {
            return this.a.get(obj);
        }
        return b;
    }

    public final Object b(Object obj) {
        Map.Entry entry = this.b;
        if (entry != null && entry.getKey() == obj) {
            return entry.getValue();
        }
        return null;
    }
}
