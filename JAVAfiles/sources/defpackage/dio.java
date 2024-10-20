package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dio {
    public final din a;
    public final dim b;

    public dio(din dinVar, dim dimVar) {
        this.a = dinVar;
        this.b = dimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dio)) {
            return false;
        }
        dio dioVar = (dio) obj;
        if (d.F(this.b, dioVar.b) && d.F(this.a, dioVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        din dinVar = this.a;
        int i2 = 0;
        if (dinVar != null) {
            i = dinVar.hashCode();
        } else {
            i = 0;
        }
        dim dimVar = this.b;
        if (dimVar != null) {
            i2 = dimVar.hashCode();
        }
        return (i * 31) + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public dio() {
        this(null, new dim((byte[]) null));
    }
}
