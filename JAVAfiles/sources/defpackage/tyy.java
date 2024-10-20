package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyy {
    public final String a;
    public final alor b;
    public final int c;
    public final int d;

    public tyy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyy) {
            tyy tyyVar = (tyy) obj;
            if (this.d == tyyVar.d && this.a.equals(tyyVar.a) && this.b.equals(tyyVar.b) && this.c == tyyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.aS(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                str = "STATUS_RUNTIME_EXCEPTION";
            } else {
                str = "EMPTY_PHONE_NUMBER";
            }
        } else {
            str = "SUCCESS";
        }
        String str2 = this.a;
        alor alorVar = this.b;
        int i2 = this.c;
        return "TachyonRegistrationRpcResult{kind=" + str + ", requestId=" + str2 + ", remoteRegistrationMap=" + alorVar.toString() + ", rpcErrorCode=" + i2 + "}";
    }

    public tyy(int i, String str, alor alorVar, int i2) {
        this.d = i;
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.a = str;
        this.b = alorVar;
        this.c = i2;
    }
}
