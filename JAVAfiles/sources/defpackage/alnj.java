package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnj extends alnl {
    final /* synthetic */ alnm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alnj(alnm alnmVar) {
        super(alnmVar);
        this.a = alnmVar;
    }

    @Override // defpackage.alnl
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        alnm alnmVar = this.a;
        int bg = alzz.bg(obj);
        int f = alnmVar.f(obj, bg);
        if (f != -1) {
            this.a.i(f, bg);
            return true;
        }
        return false;
    }
}
