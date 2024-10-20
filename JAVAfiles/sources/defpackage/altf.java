package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altf extends alpl {
    static final altf a = new altf(new alsp());
    final transient alsp b;
    private final transient int c;
    private transient alpt d;

    public altf(alsp alspVar) {
        this.b = alspVar;
        long j = 0;
        for (int i = 0; i < alspVar.c; i++) {
            j += alspVar.c(i);
        }
        this.c = albo.cu(j);
    }

    @Override // defpackage.alsj
    public final int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // defpackage.alpl, defpackage.alsj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final alpt i() {
        alpt alptVar = this.d;
        if (alptVar == null) {
            altd altdVar = new altd(this);
            this.d = altdVar;
            return altdVar;
        }
        return alptVar;
    }

    @Override // defpackage.alpl
    public final alsk p(int i) {
        return this.b.p(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.alsj
    public final int size() {
        return this.c;
    }

    @Override // defpackage.alpl, defpackage.alnu
    public Object writeReplace() {
        return new alte(this);
    }
}
