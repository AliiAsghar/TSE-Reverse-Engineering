package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygh {
    public final int a;
    private final Optional b;

    public ygh() {
        throw null;
    }

    public static ygh a(int i) {
        return new ygh(i, Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygh) {
            ygh yghVar = (ygh) obj;
            if (this.a == yghVar.a && this.b.equals(yghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                str = "INTERRUPTED";
            } else {
                str = "FAILED";
            }
        } else {
            str = "SUCCEEDED";
        }
        return "AudioPlaybackResult{status=" + str + ", error=" + this.b.toString() + "}";
    }

    public ygh(int i, Optional optional) {
        this.a = i;
        this.b = optional;
    }
}
