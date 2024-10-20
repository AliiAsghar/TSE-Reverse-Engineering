package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghh<K> implements Iterable<K> {
    final Set a = new LinkedHashSet();
    final Set b = new LinkedHashSet();

    public final int a() {
        return this.a.size() + this.b.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.clear();
    }

    public final boolean c(Object obj) {
        if (!this.a.contains(obj) && !this.b.contains(obj)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghh)) {
            return false;
        }
        ghh ghhVar = (ghh) obj;
        if (this.a.equals(ghhVar.a) && this.b.equals(ghhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.b;
        return set.hashCode() ^ this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<K> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        if (a() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb = new StringBuilder(a() * 28);
        sb.append("Selection{");
        sb.append("primary{size=" + this.a.size());
        Set set = this.a;
        Objects.toString(set);
        sb.append(", entries=".concat(set.toString()));
        sb.append("}, provisional{size=" + this.b.size());
        Set set2 = this.b;
        Objects.toString(set2);
        sb.append(", entries=".concat(set2.toString()));
        sb.append("}}");
        return sb.toString();
    }
}
