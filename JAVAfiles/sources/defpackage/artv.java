package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artv implements Iterator, arse {
    final /* synthetic */ artw a;
    private Object b;
    private int c = -2;

    public artv(artw artwVar) {
        this.a = artwVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, arqg] */
    private final void a() {
        Object a;
        int i;
        if (this.c == -2) {
            a = this.a.a.a();
        } else {
            artw artwVar = this.a;
            Object obj = this.b;
            obj.getClass();
            a = artwVar.b.a(obj);
        }
        this.b = a;
        if (a == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.b;
            obj.getClass();
            this.c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
