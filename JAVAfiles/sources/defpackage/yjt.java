package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjt {
    public final int a;

    public yjt(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof yjt) {
            if (this.a != ((yjt) obj).a || !Objects.equals(null, null)) {
                return false;
            }
            return true;
        }
        if (!(obj instanceof Integer) || this.a != ((Integer) obj).intValue()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
