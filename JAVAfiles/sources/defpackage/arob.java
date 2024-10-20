package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arob implements Iterator, arse {
    public boolean a;
    private final int b;
    private final int c;
    private int d;

    public arob() {
        throw null;
    }

    public final int a() {
        int i = this.d;
        if (i == this.c) {
            if (this.a) {
                this.a = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.b + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }

    public arob(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.a = z;
        this.d = true != z ? i2 : i;
    }
}
