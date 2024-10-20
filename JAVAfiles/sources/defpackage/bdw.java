package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdw extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ cas b;
    final /* synthetic */ zj c;
    private /* synthetic */ Object d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<cjn> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cas casVar) {
            super(0);
            this.a = casVar;
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new cjn(bdu.a(this.a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdw(cas casVar, zj zjVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = casVar;
        this.c = zjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            final arwe arweVar = (arwe) this.d;
            asai a = cao.a(new AnonymousClass1(this.b));
            final zj zjVar = this.c;
            asaj asajVar = new asaj() { // from class: bdw.2
                @Override // defpackage.asaj
                public final /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                    long j = ((cjn) obj2).a;
                    if ((((cjn) zj.this.d()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L) {
                        if (Float.intBitsToFloat((int) (((cjn) zj.this.d()).a & 4294967295L)) != Float.intBitsToFloat((int) (4294967295L & j))) {
                            arrn.J(arweVar, null, null, new bdx(zj.this, j, null), 3);
                            return arnb.a;
                        }
                    }
                    Object e = zj.this.e(new cjn(j), arpeVar);
                    if (e == arpl.a) {
                        return e;
                    }
                    return arnb.a;
                }
            };
            this.a = 1;
            if (a.a(asajVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bdw bdwVar = new bdw(this.b, this.c, arpeVar);
        bdwVar.d = obj;
        return bdwVar;
    }
}
