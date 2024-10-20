package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aib extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ aia b;
    final /* synthetic */ long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aib$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
        final /* synthetic */ long a;
        private /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.a = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((aho) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            ((aho) this.b).b(this.a);
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, arpeVar);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aib(aia aiaVar, long j, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aiaVar;
        this.c = j;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aib) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            aia aiaVar = this.b;
            long j = this.c;
            afd afdVar = afd.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(j, null);
            this.a = 1;
            if (aiaVar.k.h(afdVar, anonymousClass1, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aib(this.b, this.c, arpeVar);
    }
}
