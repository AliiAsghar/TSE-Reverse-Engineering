package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class btg<T> implements bsw<T> {
    private final Map a;

    public btg(Map map) {
        this.a = map;
    }

    @Override // defpackage.bsw
    public final float a() {
        Float valueOf;
        Collection values = this.a.values();
        values.getClass();
        Iterator<T> it = values.iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // defpackage.bsw
    public final float b() {
        Float valueOf;
        Collection values = this.a.values();
        values.getClass();
        Iterator<T> it = values.iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // defpackage.bsw
    public final float c(Object obj) {
        Float f = (Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // defpackage.bsw
    public final int d() {
        return this.a.size();
    }

    @Override // defpackage.bsw
    public final Object e(float f) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    int compare = Float.compare(abs, abs2);
                    if (compare > 0) {
                        abs = abs2;
                    }
                    if (compare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btg)) {
            return false;
        }
        return d.F(this.a, ((btg) obj).a);
    }

    @Override // defpackage.bsw
    public final Object f(float f, boolean z) {
        T next;
        float f2;
        float f3;
        Iterator<T> it = this.a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z) {
                    f2 = floatValue - f;
                } else {
                    f2 = f - floatValue;
                }
                if (f2 < brg.a) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z) {
                        f3 = floatValue2 - f;
                    } else {
                        f3 = f - floatValue2;
                    }
                    if (f3 < brg.a) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    int compare = Float.compare(f2, f3);
                    if (compare > 0) {
                        f2 = f3;
                    }
                    if (compare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @Override // defpackage.bsw
    public final boolean g(Object obj) {
        return this.a.containsKey(obj);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
