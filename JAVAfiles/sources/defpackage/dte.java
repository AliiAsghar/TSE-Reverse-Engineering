package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dte {
    public final boolean a;
    public final boolean b;
    public final dto c;
    public final boolean d;
    public final boolean e;

    public dte(dto dtoVar) {
        this.a = true;
        this.b = true;
        this.c = dtoVar;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dte)) {
            return false;
        }
        dte dteVar = (dte) obj;
        boolean z = dteVar.a;
        boolean z2 = dteVar.b;
        if (this.c != dteVar.c) {
            return false;
        }
        boolean z3 = dteVar.d;
        boolean z4 = dteVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((a.v(true) * 31) + a.v(true)) * 31) + this.c.hashCode()) * 31) + a.v(true)) * 31) + a.v(true);
    }

    public dte() {
        this(dto.a);
    }

    public /* synthetic */ dte(byte[] bArr) {
        this(dto.a);
    }
}
