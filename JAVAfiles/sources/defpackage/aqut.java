package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqut {
    public static final Logger a = Logger.getLogger(aqut.class.getName());
    public static final aqum b = new ankj(2);
    public static final aquk c = new arca(1);
    static final amcn d = amcn.e.g();
    public Object[] e;
    public int f;

    public aqut() {
    }

    public static byte[] m(InputStream inputStream) {
        try {
            return amcp.b(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int o() {
        Object[] objArr = this.e;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void p(int i) {
        Object[] objArr = new Object[i];
        if (!k()) {
            System.arraycopy(this.e, 0, objArr, 0, a());
        }
        this.e = objArr;
    }

    private final void q(int i, Object obj) {
        if (this.e instanceof byte[][]) {
            p(o());
        }
        this.e[i + i + 1] = obj;
    }

    public final int a() {
        int i = this.f;
        return i + i;
    }

    public final Object b(aquo aquoVar) {
        int i = this.f;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(aquoVar.b, l(i)));
        return d(i, aquoVar);
    }

    public final Object c(int i) {
        return this.e[i + i + 1];
    }

    public final Object d(int i, aquo aquoVar) {
        aqun a2;
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return aquoVar.a((byte[]) c2);
        }
        aquq aquqVar = (aquq) c2;
        if (aquoVar.c() && (a2 = aquq.a(aquoVar)) != null) {
            return a2.b(aquqVar.b());
        }
        return aquoVar.a(aquqVar.c());
    }

    public final void e(aquo aquoVar) {
        if (!k()) {
            int i = 0;
            for (int i2 = 0; i2 < this.f; i2++) {
                if (!Arrays.equals(aquoVar.b, l(i2))) {
                    g(i, l(i2));
                    q(i, c(i2));
                    i++;
                }
            }
            Arrays.fill(this.e, i + i, a(), (Object) null);
            this.f = i;
        }
    }

    public final void f(aqut aqutVar) {
        if (aqutVar.k()) {
            return;
        }
        int o = o() - a();
        if (k() || o < aqutVar.a()) {
            p(a() + aqutVar.a());
        }
        System.arraycopy(aqutVar.e, 0, this.e, a(), aqutVar.a());
        this.f += aqutVar.f;
    }

    public final void g(int i, byte[] bArr) {
        this.e[i + i] = bArr;
    }

    public final void h(aquo aquoVar, Object obj) {
        aquoVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == o()) {
            int a2 = a();
            p(Math.max(a2 + a2, 8));
        }
        g(this.f, aquoVar.b);
        if (aquoVar.c()) {
            int i = this.f;
            aqun a3 = aquq.a(aquoVar);
            a3.getClass();
            q(i, new aquq(a3, obj));
        } else {
            i(this.f, aquoVar.b(obj));
        }
        this.f++;
    }

    public final void i(int i, byte[] bArr) {
        this.e[i + i + 1] = bArr;
    }

    public final boolean j(aquo aquoVar) {
        for (int i = 0; i < this.f; i++) {
            if (Arrays.equals(aquoVar.b, l(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    public final byte[] l(int i) {
        return (byte[]) this.e[i + i];
    }

    public final byte[] n(int i) {
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return (byte[]) c2;
        }
        return ((aquq) c2).c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(l(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(d.j(n(i)));
            } else {
                sb.append(new String(n(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public aqut(int i, Object[] objArr) {
        this.f = i;
        this.e = objArr;
    }

    public aqut(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
