package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alni extends alnl {
    final /* synthetic */ alnm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alni(alnm alnmVar) {
        super(alnmVar);
        this.a = alnmVar;
    }

    @Override // defpackage.alnl
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        alnm alnmVar = this.a;
        int bg = alzz.bg(obj);
        int d = alnmVar.d(obj, bg);
        if (d != -1) {
            this.a.h(d, bg);
            return true;
        }
        return false;
    }
}
