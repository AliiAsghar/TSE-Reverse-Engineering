package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arng implements Iterator, arse {
    public int a;
    final /* synthetic */ arnj b;

    public arng(arnj arnjVar) {
        this.b = arnjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.a()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            arnj arnjVar = this.b;
            int i = this.a;
            this.a = i + 1;
            return arnjVar.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
