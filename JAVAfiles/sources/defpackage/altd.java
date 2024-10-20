package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class altd extends alqh {
    final /* synthetic */ altf a;

    public altd(altf altfVar) {
        this.a = altfVar;
    }

    @Override // defpackage.alqh
    public final Object a(int i) {
        return this.a.b.h(i);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }

    @Override // defpackage.alqh, defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
