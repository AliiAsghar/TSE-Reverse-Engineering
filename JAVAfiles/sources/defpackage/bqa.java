package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqa extends arpw implements arqv<crk, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bqb b;
    private /* synthetic */ Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqw<ahq, cjn, arpe<? super arnb>, Object> {
        /* synthetic */ long a;
        final /* synthetic */ bqb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bqb bqbVar, arpe arpeVar) {
            super(3, arpeVar);
            this.b = bqbVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            long j = ((cjn) obj2).a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, (arpe) obj3);
            anonymousClass1.a = j;
            return anonymousClass1.b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float b;
            aqil.P(obj);
            long j = this.a;
            bqb bqbVar = this.b;
            if (bqbVar.e) {
                b = bqbVar.f() - cjn.b(j);
            } else {
                b = cjn.b(j);
            }
            bqbVar.i(b - bqbVar.c());
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqa$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<cjn, arnb> {
        final /* synthetic */ bqb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bqb bqbVar) {
            super(1);
            this.a = bqbVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            this.a.g(brg.a);
            this.a.h.a();
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqa(bqb bqbVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bqbVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bqa) c((crk) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            crk crkVar = (crk) this.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b);
            this.a = 1;
            if (aik.g(crkVar, null, null, anonymousClass1, anonymousClass2, this, 3) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bqa bqaVar = new bqa(this.b, arpeVar);
        bqaVar.c = obj;
        return bqaVar;
    }
}
