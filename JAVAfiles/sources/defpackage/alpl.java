package defpackage;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alpl extends alpm implements Collection, alsj {
    private static final long serialVersionUID = 912559;
    private transient alog a;
    private transient alpt b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.alsj
    @Deprecated
    public final int a(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        aluq listIterator = j().listIterator();
        while (listIterator.hasNext()) {
            alsk alskVar = (alsk) listIterator.next();
            Arrays.fill(objArr, i, alskVar.a() + i, alskVar.a);
            i += alskVar.a();
        }
        return i;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (b(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alsj
    @Deprecated
    public final int d(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return alzz.ab(this, obj);
    }

    @Override // defpackage.alnu
    public final alog g() {
        alog alogVar = this.a;
        if (alogVar == null) {
            alog g = super.g();
            this.a = g;
            return g;
        }
        return alogVar;
    }

    @Override // defpackage.alsj
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return alzz.F(j());
    }

    @Override // defpackage.alsj
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return new alph(j().listIterator());
    }

    public abstract alpt n();

    @Override // defpackage.alsj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final alpt j() {
        alpt alptVar = this.b;
        if (alptVar == null) {
            if (isEmpty()) {
                alptVar = altg.a;
            } else {
                alptVar = new alpj(this);
            }
            this.b = alptVar;
        }
        return alptVar;
    }

    public abstract alsk p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.alnu
    public abstract Object writeReplace();
}
