package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arat extends aqzg {
    private static final arar b = new arap(1);
    private static final arar c = new arap(0);
    private static final arar d = new arap(2);
    private static final arar e = new arap(3);
    private static final aras f = new araq();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public arat() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(aras arasVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            arfh arfhVar = (arfh) this.g.peek();
            int min = Math.min(i, arfhVar.f());
            i2 = arasVar.a(arfhVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(arar ararVar, int i, Object obj, int i2) {
        try {
            return m(ararVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((arfh) this.g.remove());
            arfh arfhVar = (arfh) this.g.peek();
            if (arfhVar != null) {
                arfhVar.b();
                return;
            }
            return;
        }
        ((arfh) this.g.remove()).close();
    }

    private final void p() {
        if (((arfh) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((arfh) this.h.remove()).close();
        }
        this.i = true;
        arfh arfhVar = (arfh) this.g.peek();
        if (arfhVar != null) {
            arfhVar.b();
        }
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void c() {
        if (this.i) {
            arfh arfhVar = (arfh) this.g.peek();
            if (arfhVar != null) {
                int f2 = arfhVar.f();
                arfhVar.c();
                this.a += arfhVar.f() - f2;
            }
            while (true) {
                arfh arfhVar2 = (arfh) this.h.pollLast();
                if (arfhVar2 != null) {
                    arfhVar2.c();
                    this.g.addFirst(arfhVar2);
                    this.a += arfhVar2.f();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // defpackage.aqzg, defpackage.arfh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((arfh) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((arfh) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((arfh) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.arfh
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.arfh
    public final int f() {
        return this.a;
    }

    @Override // defpackage.arfh
    public final arfh g(int i) {
        arfh arfhVar;
        int i2;
        arfh arfhVar2;
        if (i <= 0) {
            return arfl.a;
        }
        a(i);
        this.a -= i;
        arfh arfhVar3 = null;
        arat aratVar = null;
        while (true) {
            arfh arfhVar4 = (arfh) this.g.peek();
            int f2 = arfhVar4.f();
            if (f2 > i) {
                arfhVar2 = arfhVar4.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    arfhVar = arfhVar4.g(f2);
                    o();
                } else {
                    arfhVar = (arfh) this.g.poll();
                }
                arfh arfhVar5 = arfhVar;
                i2 = i - f2;
                arfhVar2 = arfhVar5;
            }
            if (arfhVar3 == null) {
                arfhVar3 = arfhVar2;
            } else {
                if (aratVar == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.g.size() + 2, 16);
                    }
                    aratVar = new arat(i3);
                    aratVar.h(arfhVar3);
                    arfhVar3 = aratVar;
                }
                aratVar.h(arfhVar2);
            }
            if (i2 <= 0) {
                return arfhVar3;
            }
            i = i2;
        }
    }

    public final void h(arfh arfhVar) {
        boolean z;
        if (this.i && this.g.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(arfhVar instanceof arat)) {
            this.g.add(arfhVar);
            this.a += arfhVar.f();
        } else {
            arat aratVar = (arat) arfhVar;
            while (!aratVar.g.isEmpty()) {
                this.g.add((arfh) aratVar.g.remove());
            }
            this.a += aratVar.a;
            aratVar.a = 0;
            aratVar.close();
        }
        if (z) {
            ((arfh) this.g.peek()).b();
        }
    }

    @Override // defpackage.arfh
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.arfh
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.arfh
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.arfh
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public arat(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
