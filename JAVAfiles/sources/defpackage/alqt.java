package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alqt extends aluq {
    private final Object a;
    private boolean b;

    public alqt(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.a;
        }
        throw new NoSuchElementException();
    }
}
