package defpackage;

import defpackage.dqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dql {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dql$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<Float> {
        final /* synthetic */ dqm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dqm dqmVar) {
            super(0);
            this.a = dqmVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dql$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<dqm> {
        final /* synthetic */ dqm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dqm dqmVar) {
            super(0);
            this.a = dqmVar;
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return this.a;
        }
    }

    public static dqm a(dqm dqmVar, dqm dqmVar2) {
        boolean z = dqmVar2 instanceof dqb;
        if (z && (dqmVar instanceof dqb)) {
            clz clzVar = ((dqb) dqmVar2).a;
            float a = dqmVar2.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dqmVar);
            if (Float.isNaN(a)) {
                a = ((Number) anonymousClass1.a()).floatValue();
            }
            return new dqb(clzVar, a);
        }
        if (z && !(dqmVar instanceof dqb)) {
            return dqmVar2;
        }
        if (!z && (dqmVar instanceof dqb)) {
            return dqmVar;
        }
        return dqmVar2.e(new AnonymousClass2(dqmVar));
    }

    public static dqm b(dqm dqmVar, arqg arqgVar) {
        if (!d.F(dqmVar, dqm.b.a)) {
            return dqmVar;
        }
        return (dqm) arqgVar.a();
    }
}
