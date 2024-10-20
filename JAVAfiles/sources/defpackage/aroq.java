package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aroq {
    public final aros a;
    public int b;
    public int c = -1;
    private int d;

    public aroq(aros arosVar) {
        this.a = arosVar;
        this.d = arosVar.f;
        b();
    }

    public final void a() {
        if (this.a.f == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            aros arosVar = this.a;
            if (i < arosVar.e && arosVar.d[i] < 0) {
                this.b = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        if (this.b < this.a.e) {
            return true;
        }
        return false;
    }

    public final void remove() {
        a();
        if (this.c != -1) {
            this.a.f();
            this.a.g(this.c);
            this.c = -1;
            this.d = this.a.f;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
