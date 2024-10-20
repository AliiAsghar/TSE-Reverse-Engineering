package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxd {
    public final mwc a;
    public final mll b;

    public mxd(mwc mwcVar, mll mllVar) {
        mwcVar.getClass();
        mllVar.getClass();
        this.a = mwcVar;
        this.b = mllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxd)) {
            return false;
        }
        mxd mxdVar = (mxd) obj;
        if (d.F(this.a, mxdVar.a) && d.F(this.b, mxdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationDataCache(cachedConstraints=" + this.a + ", cachedConversationProperties=" + this.b + ")";
    }
}
