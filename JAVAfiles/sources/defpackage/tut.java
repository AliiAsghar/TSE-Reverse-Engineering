package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class tut {
    public final boolean a;
    public final Optional b;

    public tut() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tut) {
            tut tutVar = (tut) obj;
            if (this.a == tutVar.a && this.b.equals(tutVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FailToDecryptResult{successful=" + this.a + ", newIdentityKey=" + this.b.toString() + "}";
    }

    public tut(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }
}
