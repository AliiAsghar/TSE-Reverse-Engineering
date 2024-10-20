package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qch {
    static final qch a;
    static final qch b;
    static final qch c;
    public final boolean d;
    public final boolean e;

    static {
        aomk aomkVar = new aomk();
        aomkVar.h(true);
        aomkVar.i(false);
        a = aomkVar.g();
        aomk aomkVar2 = new aomk();
        aomkVar2.h(true);
        aomkVar2.i(true);
        b = aomkVar2.g();
        aomk aomkVar3 = new aomk();
        aomkVar3.h(false);
        aomkVar3.i(false);
        c = aomkVar3.g();
    }

    public qch() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qch a(qch qchVar) {
        boolean z;
        aomk aomkVar = new aomk();
        boolean z2 = true;
        if (this.d && qchVar.d) {
            z = true;
        } else {
            z = false;
        }
        aomkVar.h(z);
        if (!this.e && !qchVar.e) {
            z2 = false;
        }
        aomkVar.i(z2);
        return aomkVar.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qch) {
            qch qchVar = (qch) obj;
            if (this.d == qchVar.d && this.e == qchVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.e) {
            i2 = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return "UpdateResult{isSuccessful=" + this.d + ", shouldRefreshConversation=" + this.e + "}";
    }

    public qch(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
