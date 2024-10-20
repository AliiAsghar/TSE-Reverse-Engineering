package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elg {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public volatile int b = 0;
    public final euu c;

    public elg(euu euuVar, int i) {
        this.c = euuVar;
        this.a = i;
    }

    public final int a(int i) {
        fjl f = f();
        int x = f.x(16);
        if (x != 0) {
            return ((ByteBuffer) f.c).getInt(f.y(x) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        fjl f = f();
        int x = f.x(16);
        if (x != 0) {
            return f.z(x);
        }
        return 0;
    }

    public final int c() {
        return this.b & 3;
    }

    public final int d() {
        fjl f = f();
        int x = f.x(14);
        if (x != 0) {
            return ((ByteBuffer) f.c).getShort(x + f.b);
        }
        return 0;
    }

    public final int e() {
        fjl f = f();
        int x = f.x(4);
        if (x != 0) {
            return ((ByteBuffer) f.c).getInt(x + f.b);
        }
        return 0;
    }

    public final fjl f() {
        ThreadLocal threadLocal = d;
        fjl fjlVar = (fjl) threadLocal.get();
        if (fjlVar == null) {
            fjlVar = new fjl((char[]) null);
            threadLocal.set(fjlVar);
        }
        euu euuVar = this.c;
        int i = this.a;
        fjl fjlVar2 = (fjl) euuVar.d;
        int x = fjlVar2.x(6);
        if (x != 0) {
            int y = fjlVar2.y(x) + (i * 4);
            fjlVar.A(y + ((ByteBuffer) fjlVar2.c).getInt(y), (ByteBuffer) fjlVar2.c);
        }
        return fjlVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(e()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
