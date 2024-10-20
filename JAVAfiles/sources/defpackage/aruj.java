package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aruj implements Iterator, arse {
    final /* synthetic */ Object a;
    private final Iterator b;
    private int c = -1;
    private Object d;
    private final /* synthetic */ int e;

    public aruj(artt arttVar, int i) {
        this.e = i;
        this.a = arttVar;
        this.b = arttVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, arqr] */
    private final void a() {
        if (this.b.hasNext()) {
            Iterator it = this.b;
            ?? r1 = ((artw) this.a).a;
            Object next = it.next();
            if (((Boolean) r1.a(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    private final void b() {
        int i;
        while (true) {
            if (this.b.hasNext()) {
                Iterator it = this.b;
                arqr arqrVar = ((artt) this.a).c;
                Object next = it.next();
                if (((Boolean) arqrVar.a(next)).booleanValue() == ((artt) this.a).b) {
                    this.d = next;
                    i = 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e != 0) {
            if (this.c == -1) {
                b();
            }
            if (this.c != 1) {
                return false;
            }
            return true;
        }
        if (this.c == -1) {
            a();
        }
        if (this.c != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e != 0) {
            if (this.c == -1) {
                b();
            }
            if (this.c != 0) {
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }
        if (this.c == -1) {
            a();
        }
        if (this.c != 0) {
            Object obj2 = this.d;
            this.d = null;
            this.c = -1;
            return obj2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e != 0) {
            a.g();
        } else {
            a.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [artx, java.lang.Object] */
    public aruj(artw artwVar, int i) {
        this.e = i;
        this.a = artwVar;
        this.b = artwVar.b.a();
    }
}
