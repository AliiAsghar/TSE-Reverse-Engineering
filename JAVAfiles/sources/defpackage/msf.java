package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msf {
    public final String a;

    public msf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof msf)) {
            return false;
        }
        return Objects.equals(this.a, ((msf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return albo.ag(this.a);
    }
}
