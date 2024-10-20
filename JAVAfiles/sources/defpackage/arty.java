package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arty extends artz implements Iterator, arpe, arse {
    public arpe a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException(a.bV(i, "Unexpected state of the iterator: "));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // defpackage.artz
    public final Object a(Object obj, arpe arpeVar) {
        this.c = obj;
        this.b = 3;
        this.a = arpeVar;
        return arpl.a;
    }

    @Override // defpackage.artz
    public final Object b(Iterator it, arpe arpeVar) {
        if (!it.hasNext()) {
            return arnb.a;
        }
        this.d = it;
        this.b = 2;
        this.a = arpeVar;
        return arpl.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            arpe arpeVar = this.a;
            arpeVar.getClass();
            this.a = null;
            arpeVar.w(arnb.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.b = 0;
                    Object obj = this.c;
                    this.c = null;
                    return obj;
                }
                throw c();
            }
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return arpj.a;
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        aqil.P(obj);
        this.b = 4;
    }
}
