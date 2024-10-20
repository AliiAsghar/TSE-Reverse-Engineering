package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bym<K, V> {
    public final ve a;

    public final boolean equals(Object obj) {
        if ((obj instanceof bym) && d.F(this.a, ((bym) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.a + ')';
    }
}
