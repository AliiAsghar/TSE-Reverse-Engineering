package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imj {
    public final Optional a;
    public final int b;

    public imj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imj) {
            imj imjVar = (imj) obj;
            if (this.a.equals(imjVar.a) && this.b == imjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.aS(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "CombinedDraft{draft=" + this.a.toString() + ", source=" + hwr.n(this.b) + "}";
    }

    public imj(Optional optional, int i) {
        this.a = optional;
        this.b = i;
    }
}
