package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class biq extends arpw implements arqv<arwe, arpe<? super arxm>, Object> {
    final /* synthetic */ bio a;
    private /* synthetic */ Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: biq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bio b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bio bioVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bioVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bio bioVar = this.b;
                Float f = new Float(brg.a);
                acf d = zs.d(150, 0, aao.d, 2);
                this.a = 1;
                if (zj.j(bioVar.f, f, d, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, arpeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public biq(bio bioVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = bioVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((biq) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        return arrn.J((arwe) this.b, null, null, new AnonymousClass1(this.a, null), 3);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        biq biqVar = new biq(this.a, arpeVar);
        biqVar.b = obj;
        return biqVar;
    }
}
