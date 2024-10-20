package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alqg extends alog {
    final /* synthetic */ alqh a;

    public alqg(alqh alqhVar) {
        this.a = alqhVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alog, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
