package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class aopg implements Iterator {
    aoph a;
    aoph b = null;
    int c;
    final /* synthetic */ aopi d;

    public aopg(aopi aopiVar) {
        this.d = aopiVar;
        this.a = aopiVar.e.d;
        this.c = aopiVar.d;
    }

    public final aoph a() {
        aopi aopiVar = this.d;
        aoph aophVar = this.a;
        if (aophVar != aopiVar.e) {
            if (aopiVar.d == this.c) {
                this.a = aophVar.d;
                this.b = aophVar;
                return aophVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a != this.d.e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        aoph aophVar = this.b;
        if (aophVar != null) {
            this.d.e(aophVar, true);
            this.b = null;
            this.c = this.d.d;
            return;
        }
        throw new IllegalStateException();
    }
}
