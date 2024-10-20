package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apaq extends AbstractList {
    private final apao a;
    private final apap b;

    public apaq(apao apaoVar, apap apapVar) {
        this.a = apaoVar;
        this.b = apapVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
