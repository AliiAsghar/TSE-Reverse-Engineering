package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apaw extends AbstractMap {
    public final apas a;
    private final Map b;

    public apaw(Map map, apas apasVar) {
        this.b = map;
        this.a = apasVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new apav(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object valueOf;
        valueOf = Integer.valueOf(((apak) obj2).a());
        Object put = this.b.put(obj, valueOf);
        if (put == null) {
            return null;
        }
        return this.a.a(put);
    }
}
