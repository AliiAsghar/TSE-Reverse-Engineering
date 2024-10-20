package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anug {
    private final Class a;
    private final aocj b;

    public anug(Class cls, aocj aocjVar) {
        this.a = cls;
        this.b = aocjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anug)) {
            return false;
        }
        anug anugVar = (anug) obj;
        if (!anugVar.a.equals(this.a) || !anugVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        aocj aocjVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(aocjVar);
    }
}
