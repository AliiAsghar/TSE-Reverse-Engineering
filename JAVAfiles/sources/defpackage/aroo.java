package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroo extends aroq implements Iterator, arse {
    public aroo(aros arosVar) {
        super(arosVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        aros arosVar = this.a;
        int i = this.b;
        if (i < arosVar.e) {
            this.b = i + 1;
            this.c = i;
            arop aropVar = new arop(arosVar, i);
            b();
            return aropVar;
        }
        throw new NoSuchElementException();
    }
}
