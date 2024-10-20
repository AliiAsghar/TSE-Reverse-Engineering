package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsc {
    public final qeq a;
    public final Optional b;

    public xsc(qeq qeqVar, Optional optional) {
        this.a = qeqVar;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsc)) {
            return false;
        }
        xsc xscVar = (xsc) obj;
        if (d.F(this.a, xscVar.a) && d.F(this.b, xscVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FileUploadResult(fileUploadResponse=" + this.a + ", thumbnailError=" + this.b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xsc(qeq qeqVar) {
        this(qeqVar, Optional.empty());
        qeqVar.getClass();
    }
}
