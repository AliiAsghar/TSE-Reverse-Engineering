package defpackage;

import defpackage.cfq;
import defpackage.csv;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface yg extends ctz {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface c {
        public static final /* synthetic */ int c = 0;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class a {
            public static final /* synthetic */ int a = 0;

            static {
                int i = xv.a;
            }

            public static /* synthetic */ c a() {
                int i = csv.a;
                csv csvVar = csv.a.d;
                int i2 = cfq.a;
                cfq cfqVar = cfq.a.e;
                if ((csvVar != csv.a.d && csvVar != csv.a.c && csvVar != csv.a.g && csvVar != csv.a.b && csvVar != csv.a.a && csvVar != csv.a.f && csvVar != csv.a.e) || (cfqVar != cfq.a.a && cfqVar != cfq.a.b && cfqVar != cfq.a.c && cfqVar != cfq.a.d && cfqVar != cfq.a.e && cfqVar != cfq.a.f && cfqVar != cfq.a.g && cfqVar != cfq.a.h && cfqVar != cfq.a.i)) {
                    return new xx(csvVar, cfqVar);
                }
                ve veVar = yp.e;
                Object a2 = veVar.a(csvVar);
                if (a2 == null) {
                    a2 = new ve((byte[]) null);
                    veVar.j(csvVar, a2);
                }
                ve veVar2 = (ve) a2;
                Object a3 = veVar2.a(cfqVar);
                if (a3 == null) {
                    a3 = new xx(csvVar, cfqVar);
                    veVar2.j(cfqVar, a3);
                }
                return (xx) a3;
            }
        }

        static {
            int i = a.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d {
        public final Object a = "photoSelector_0";
        public final byn b = new byu(null, cav.a);

        public final ye a() {
            return (ye) this.b.a();
        }

        public final ye b() {
            ye a = a();
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        public final boolean c() {
            yd d;
            ye a = a();
            if (a != null && (d = a.d()) != null) {
                return d.i();
            }
            return false;
        }
    }

    boolean a();

    d b(bwj bwjVar);

    cga c(cga cgaVar, d dVar, wh whVar, xl xlVar, xn xnVar, wm wmVar, c cVar, b bVar, a aVar);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface b {
        public static final /* synthetic */ int b = 0;

        static {
            b bVar = a.a;
        }

        long a(long j);

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class a {
            public static final b a;

            /* compiled from: PG */
            /* renamed from: yg$b$a$1 */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 implements b {
                public static final /* synthetic */ int a = 0;

                @Override // yg.b
                public final long a(long j) {
                    throw null;
                }
            }

            static {
                int i = AnonymousClass1.a;
                a = AnonymousClass2.a;
            }

            /* compiled from: PG */
            /* renamed from: yg$b$a$2 */
            /* loaded from: classes.dex */
            static final class AnonymousClass2 implements b {
                public static final AnonymousClass2 a = ;

                @Override // yg.b
                public final long a(long j) {
                    return j;
                }
            }
        }
    }
}
