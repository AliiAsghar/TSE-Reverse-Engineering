package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuo {
    public final boolean a;
    public final Optional b;

    public tuo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tuo) {
            tuo tuoVar = (tuo) obj;
            if (this.a == tuoVar.a && this.b.equals(tuoVar.b)) {
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

    public tuo(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }
}
