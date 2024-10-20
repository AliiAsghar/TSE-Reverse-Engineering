package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mup implements mjp {
    private final boolean b;
    private final alog c;

    public mup() {
        throw null;
    }

    @Override // defpackage.mjp
    public final alog a() {
        return this.c;
    }

    @Override // defpackage.mjp
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mup) {
            mup mupVar = (mup) obj;
            if (this.b == mupVar.b && alzz.at(this.c, mupVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "DefaultReadReport{isReadByAll=" + this.b + ", readByList=" + this.c.toString() + "}";
    }

    public mup(boolean z, alog alogVar) {
        this.b = z;
        if (alogVar == null) {
            throw new NullPointerException("Null readByList");
        }
        this.c = alogVar;
    }
}
