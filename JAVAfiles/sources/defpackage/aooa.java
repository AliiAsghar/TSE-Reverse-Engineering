package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aooa extends aood implements Iterable {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.aood
    public final String a() {
        int size = this.a.size();
        if (size == 1) {
            return ((aood) this.a.get(0)).a();
        }
        throw new IllegalStateException(a.bV(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aooa) && ((aooa) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<aood> iterator() {
        return this.a.iterator();
    }
}
