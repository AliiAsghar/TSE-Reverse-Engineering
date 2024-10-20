package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artq implements Iterator, arse {
    private int a;
    private final /* synthetic */ int b;
    private final Object c;

    public artq(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Iterator, java.lang.Object] */
    private final void a() {
        while (this.a > 0 && this.c.hasNext()) {
            this.c.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (this.a <= 0 || !this.c.hasNext()) {
                    return false;
                }
                return true;
            }
            if (this.a >= ((Object[]) this.c).length) {
                return false;
            }
            return true;
        }
        a();
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                int i2 = this.a;
                if (i2 != 0) {
                    this.a = i2 - 1;
                    return this.c.next();
                }
                throw new NoSuchElementException();
            }
            try {
                Object obj = this.c;
                int i3 = this.a;
                this.a = i3 + 1;
                return ((Object[]) obj)[i3];
            } catch (ArrayIndexOutOfBoundsException e) {
                this.a--;
                throw new NoSuchElementException(e.getMessage());
            }
        }
        a();
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                a.g();
                return;
            } else {
                a.g();
                return;
            }
        }
        a.g();
    }

    public artq(arui aruiVar, int i, byte[] bArr) {
        this.b = i;
        this.c = aruiVar.a.a();
        this.a = aruiVar.b;
    }

    public artq(arui aruiVar, int i) {
        this.b = i;
        this.a = aruiVar.b;
        this.c = aruiVar.a.a();
    }
}
