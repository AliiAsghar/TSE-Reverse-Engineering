package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwf implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a;
    public boolean d;
    public boolean f;
    public boolean h;
    public int b = 0;
    public long c = 0;
    public String e = "";
    public boolean g = false;
    public int i = 1;
    public final String j = "";
    private final String k = "";

    public final void a(int i) {
        this.a = true;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        ahwf ahwfVar;
        if ((obj instanceof ahwf) && (ahwfVar = (ahwf) obj) != null) {
            if (this != ahwfVar) {
                if (this.b == ahwfVar.b && this.c == ahwfVar.c && this.e.equals(ahwfVar.e) && this.g == ahwfVar.g && this.i == ahwfVar.i && this.j.equals(ahwfVar.j) && this.k.equals(ahwfVar.k)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.b + 2173) * 53) + Long.valueOf(this.c).hashCode()) * 53) + this.e.hashCode();
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = (((((hashCode * 53) + i) * 53) + this.i) * 53) + this.j.hashCode();
        a.aS(5);
        return (((((hashCode2 * 53) + 5) * 53) + this.k.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.c);
        if (this.f && this.g) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.h) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.i);
        }
        if (this.d) {
            sb.append(" Extension: ");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
