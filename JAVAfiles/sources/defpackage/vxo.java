package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxo {
    public final Optional a;
    public final Optional b;

    public vxo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxo) {
            vxo vxoVar = (vxo) obj;
            if (this.a.equals(vxoVar.a) && this.b.equals(vxoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "RcsGroupTelephonyDataParseResult{rcsGroupTelephonyData=" + String.valueOf(this.a) + ", parseError=" + String.valueOf(optional) + "}";
    }

    public vxo(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
