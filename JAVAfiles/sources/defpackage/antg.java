package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antg extends anme {
    public final anub e;

    public antg(anub anubVar) {
        super((byte[]) null);
        this.e = anubVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof antg)) {
            return false;
        }
        anub anubVar = ((antg) obj).e;
        anxp b = anxp.b(this.e.b.d);
        if (b == null) {
            b = anxp.UNRECOGNIZED;
        }
        anxp b2 = anxp.b(anubVar.b.d);
        if (b2 == null) {
            b2 = anxp.UNRECOGNIZED;
        }
        if (b.equals(b2)) {
            if (this.e.b.b.equals(anubVar.b.b)) {
                if (this.e.b.c.equals(anubVar.b.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        anub anubVar = this.e;
        return Objects.hash(anubVar.b, anubVar.a);
    }

    @Override // defpackage.anme
    public final boolean j() {
        anxp b = anxp.b(this.e.b.d);
        if (b == null) {
            b = anxp.UNRECOGNIZED;
        }
        if (b != anxp.RAW) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        anxg anxgVar = this.e.b;
        String str2 = anxgVar.b;
        anxp b = anxp.b(anxgVar.d);
        if (b == null) {
            b = anxp.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }
}
