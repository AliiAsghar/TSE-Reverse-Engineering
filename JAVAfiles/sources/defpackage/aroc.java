package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroc implements Iterator, arse {
    private final long a;
    private boolean b;
    private long c;

    public aroc() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        long j = this.c;
        if (j == this.a) {
            if (this.b) {
                this.b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.c = 1 + j;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }

    public aroc(long j, long j2) {
        this.a = j2;
        boolean z = j <= j2;
        this.b = z;
        this.c = true != z ? j2 : j;
    }
}
