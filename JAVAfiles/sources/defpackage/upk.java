package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upk {
    public final String a;
    public final apbt b;
    public final uta c;
    private final xny d;

    public upk() {
        throw null;
    }

    public static upk a(String str, apbt apbtVar) {
        return b(str, apbtVar, new uta(null, null, null, null, null, null));
    }

    public static upk b(String str, apbt apbtVar, uta utaVar) {
        return new upk(str, apbtVar, utaVar, new xnx(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof upk) {
            upk upkVar = (upk) obj;
            if (this.a.equals(upkVar.a) && this.b.equals(upkVar.b) && this.c.equals(upkVar.c) && this.d.equals(upkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        xny xnyVar = this.d;
        uta utaVar = this.c;
        return "WorkQueueRequest{key=" + this.a + ", rawData=" + this.b.toString() + ", extras=" + String.valueOf(utaVar) + ", traceSpanSupplier=" + xnyVar.toString() + "}";
    }

    public upk(String str, apbt apbtVar, uta utaVar, xny xnyVar) {
        this.a = str;
        if (apbtVar == null) {
            throw new NullPointerException("Null rawData");
        }
        this.b = apbtVar;
        this.c = utaVar;
        this.d = xnyVar;
    }
}
