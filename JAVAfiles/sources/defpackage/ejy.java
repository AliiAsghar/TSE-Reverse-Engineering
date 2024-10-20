package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejy {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public volatile int b = 0;
    public final euu c;

    public ejy(euu euuVar, int i) {
        this.c = euuVar;
        this.a = i;
    }

    public final int a(int i) {
        gku e = e();
        int a = e.a(16);
        if (a != 0) {
            return ((ByteBuffer) e.b).getInt(e.b(a) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        gku e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.c(a);
        }
        return 0;
    }

    public final int c() {
        gku e = e();
        int a = e.a(4);
        if (a != 0) {
            return ((ByteBuffer) e.b).getInt(a + e.a);
        }
        return 0;
    }

    public final short d() {
        gku e = e();
        int a = e.a(14);
        if (a != 0) {
            return ((ByteBuffer) e.b).getShort(a + e.a);
        }
        return (short) 0;
    }

    public final gku e() {
        ThreadLocal threadLocal = d;
        gku gkuVar = (gku) threadLocal.get();
        if (gkuVar == null) {
            gkuVar = new gku();
            threadLocal.set(gkuVar);
        }
        euu euuVar = this.c;
        int i = this.a;
        gku gkuVar2 = (gku) euuVar.c;
        int a = gkuVar2.a(6);
        if (a != 0) {
            int b = gkuVar2.b(a) + (i * 4);
            gkuVar.d(b + ((ByteBuffer) gkuVar2.b).getInt(b), (ByteBuffer) gkuVar2.b);
        }
        return gkuVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
