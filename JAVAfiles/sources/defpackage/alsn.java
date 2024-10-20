package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alsn implements Iterator {
    private final alsj a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private alsk f;

    public alsn(alsj alsjVar, Iterator it) {
        this.a = alsjVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c <= 0 && !this.b.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.c;
            if (i == 0) {
                alsk alskVar = (alsk) this.b.next();
                this.f = alskVar;
                i = alskVar.a();
                this.d = i;
            }
            this.c = i - 1;
            this.e = true;
            alsk alskVar2 = this.f;
            alskVar2.getClass();
            return alskVar2.a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        albo.w(this.e);
        if (this.d == 1) {
            this.b.remove();
        } else {
            alsj alsjVar = this.a;
            alsk alskVar = this.f;
            alskVar.getClass();
            alsjVar.remove(alskVar.a);
        }
        this.d--;
        this.e = false;
    }
}
