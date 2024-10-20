package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnt implements Iterator, arse {
    private final int a;
    private boolean b;
    private int c;

    public arnt() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.c;
        if (i == this.a) {
            if (this.b) {
                this.b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.c = i + 1;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }

    public arnt(char c, char c2) {
        this.a = c2;
        int a = arro.a(c, c2);
        this.b = a <= 0;
        this.c = a > 0 ? c2 : c;
    }
}
