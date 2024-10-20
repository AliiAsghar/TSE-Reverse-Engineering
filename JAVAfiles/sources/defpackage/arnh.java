package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnh extends arng implements ListIterator, arse {
    final /* synthetic */ arnj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arnh(arnj arnjVar, int i) {
        super(arnjVar);
        this.c = arnjVar;
        a.O(i, arnjVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.p();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            arnj arnjVar = this.c;
            int i = this.a - 1;
            this.a = i;
            return arnjVar.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.p();
    }
}
