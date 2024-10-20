package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjy {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;

    public atjy(int i, boolean z, Object obj, int i2) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = i2;
        if (atjz.e(i, i2)) {
        } else {
            throw new IllegalArgumentException("invalid prefix length");
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof atjy)) {
            atjy atjyVar = (atjy) obj;
            if (this.a == atjyVar.a && this.b == atjyVar.b && this.c == atjyVar.c && this.d.equals(atjyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c + (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.b) {
            stringBuffer.append("!");
        }
        stringBuffer.append(this.a);
        stringBuffer.append(":");
        int i = this.a;
        if (i != 1 && i != 2) {
            stringBuffer.append(atpj.c((byte[]) this.d));
        } else {
            stringBuffer.append(((InetAddress) this.d).getHostAddress());
        }
        stringBuffer.append("/");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
