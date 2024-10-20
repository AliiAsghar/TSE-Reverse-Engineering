package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm {
    public final dli a;
    public final dlx b;
    public final int c;
    public final int d;
    public final Object e = null;

    public dmm(dli dliVar, dlx dlxVar, int i, int i2) {
        this.a = dliVar;
        this.b = dlxVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmm)) {
            return false;
        }
        dmm dmmVar = (dmm) obj;
        if (!d.F(this.a, dmmVar.a) || !d.F(this.b, dmmVar.b) || !a.bA(this.c, dmmVar.c) || !a.bA(this.d, dmmVar.d)) {
            return false;
        }
        Object obj2 = dmmVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        dli dliVar = this.a;
        if (dliVar == null) {
            hashCode = 0;
        } else {
            hashCode = dliVar.hashCode();
        }
        return ((((((hashCode * 31) + this.b.h) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) dls.a(this.c)) + ", fontSynthesis=" + ((Object) dlt.a(this.d)) + ", resourceLoaderCacheKey=null)";
    }
}
