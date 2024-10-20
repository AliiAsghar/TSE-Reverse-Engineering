package defpackage;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aret {
    public int a;
    public int b;
    public Object c;
    private int d;

    public aret() {
        if (aode.a == null) {
            aode.a = new aode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final aqrm a() {
        if (f()) {
            return ((aqsq) this.c.get(this.d)).c;
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final SocketAddress b() {
        if (f()) {
            return (SocketAddress) ((aqsq) this.c.get(this.d)).b.get(this.b);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void c() {
        this.d = 0;
        this.b = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        list.getClass();
        this.c = list;
        c();
        alur it = ((alog) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((aqsq) it.next()).b.size();
        }
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final boolean e() {
        if (!f()) {
            return false;
        }
        aqsq aqsqVar = (aqsq) this.c.get(this.d);
        int i = this.b + 1;
        this.b = i;
        if (i < aqsqVar.b.size()) {
            return true;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.b = 0;
        if (i2 >= ((alsx) this.c).c) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.d < ((alsx) this.c).c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final boolean g(SocketAddress socketAddress) {
        int i = 0;
        while (true) {
            ?? r2 = this.c;
            if (i >= ((alsx) r2).c) {
                return false;
            }
            int indexOf = ((aqsq) r2.get(i)).b.indexOf(socketAddress);
            if (indexOf == -1) {
                i++;
            } else {
                this.d = i;
                this.b = indexOf;
                return true;
            }
        }
    }

    public final int h(int i) {
        if (i < this.d) {
            return ((ByteBuffer) this.c).getShort(this.a + i);
        }
        return 0;
    }

    public final void i(int i, ByteBuffer byteBuffer) {
        short s;
        this.c = byteBuffer;
        if (byteBuffer != null) {
            this.b = i;
            int i2 = i - byteBuffer.getInt(i);
            this.a = i2;
            s = ((ByteBuffer) this.c).getShort(i2);
        } else {
            s = 0;
            this.b = 0;
            this.a = 0;
        }
        this.d = s;
    }

    public aret(List list) {
        d(list);
    }
}
