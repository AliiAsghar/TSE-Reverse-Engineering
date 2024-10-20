package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface dqm {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static final dqm a(long j) {
            if (j != 16) {
                return new dqc(j);
            }
            return b.a;
        }

        public static final dqm b(cko ckoVar, float f) {
            if (ckoVar == null) {
                return b.a;
            }
            if (ckoVar instanceof cmd) {
                long j = ((cmd) ckoVar).a;
                if (!Float.isNaN(f) && f < 1.0f) {
                    j = ckw.f(cku.d(j), cku.c(j), cku.b(j), cku.a(j) * f, cku.f(j));
                }
                return a(j);
            }
            if (ckoVar instanceof clz) {
                return new dqb((clz) ckoVar, f);
            }
            throw new armm();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements dqm {
        public static final b a = new b();

        private b() {
        }

        @Override // defpackage.dqm
        public final float a() {
            return Float.NaN;
        }

        @Override // defpackage.dqm
        public final long b() {
            return cku.h;
        }

        @Override // defpackage.dqm
        public final cko c() {
            return null;
        }

        @Override // defpackage.dqm
        public final /* synthetic */ dqm d(dqm dqmVar) {
            return dql.a(this, dqmVar);
        }

        @Override // defpackage.dqm
        public final /* synthetic */ dqm e(arqg arqgVar) {
            return dql.b(this, arqgVar);
        }
    }

    float a();

    long b();

    cko c();

    dqm d(dqm dqmVar);

    dqm e(arqg arqgVar);
}
