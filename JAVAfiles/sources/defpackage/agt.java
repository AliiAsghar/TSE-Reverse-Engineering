package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agt implements ahk {
    public final arqr a;
    public final ahg b = new ahg() { // from class: agt.2
        @Override // defpackage.ahg
        public final void a(float f) {
            agt.this.a.a(Float.valueOf(f));
        }
    };
    public final aff c = new aff();

    /* compiled from: PG */
    /* renamed from: agt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ afd c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afd afdVar, arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = afdVar;
            this.d = arqvVar;
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
                agt agtVar = agt.this;
                afd afdVar = this.c;
                arqv arqvVar = this.d;
                this.a = 1;
                if (agtVar.c.a(agtVar.b, afdVar, arqvVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, this.d, arpeVar);
        }
    }

    public agt(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.ahk
    public final Object a(afd afdVar, arqv arqvVar, arpe arpeVar) {
        Object d = arwi.d(new AnonymousClass1(afdVar, arqvVar, null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }
}
