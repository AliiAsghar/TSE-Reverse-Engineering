package defpackage;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class bix implements aew {
    public final boolean j;
    public final bjd k;

    /* compiled from: PG */
    /* renamed from: bix$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bin> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cas casVar) {
            super(0);
            this.a = casVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return (bin) this.a.a();
        }
    }

    public bix(boolean z, cas casVar) {
        this.j = z;
        this.k = new bjd(z, new AnonymousClass1(casVar));
    }

    public abstract void e();
}
