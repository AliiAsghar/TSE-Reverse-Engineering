package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bip extends arpw implements arqv<arwe, arpe<? super arxm>, Object> {
    final /* synthetic */ bio a;
    private /* synthetic */ Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bip$1, reason: invalid class name */
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
                Float f = new Float(1.0f);
                acf d = zs.d(75, 0, aao.d, 2);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bip$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bio b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bio bioVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bioVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bio bioVar = this.b;
                Float f = new Float(1.0f);
                acf d = zs.d(225, 0, aao.a, 2);
                this.a = 1;
                if (zj.j(bioVar.g, f, d, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.b, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bip$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bio b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bio bioVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bioVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bio bioVar = this.b;
                Float f = new Float(1.0f);
                acf d = zs.d(225, 0, aao.d, 2);
                this.a = 1;
                if (zj.j(bioVar.h, f, d, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass3(this.b, arpeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bip(bio bioVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = bioVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bip) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        arwe arweVar = (arwe) this.b;
        arrn.J(arweVar, null, null, new AnonymousClass1(this.a, null), 3);
        arrn.J(arweVar, null, null, new AnonymousClass2(this.a, null), 3);
        return arrn.J(arweVar, null, null, new AnonymousClass3(this.a, null), 3);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bip bipVar = new bip(this.a, arpeVar);
        bipVar.b = obj;
        return bipVar;
    }
}
