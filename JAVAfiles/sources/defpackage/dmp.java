package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface dmp extends cas<Object> {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements dmp, cas {
        private final dld a;

        public a(dld dldVar) {
            this.a = dldVar;
        }

        @Override // defpackage.cas
        public final Object a() {
            return this.a.a();
        }

        @Override // defpackage.dmp
        public final boolean b() {
            return this.a.b;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements dmp {
        private final Object a;
        private final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        @Override // defpackage.cas
        public final Object a() {
            return this.a;
        }

        @Override // defpackage.dmp
        public final boolean b() {
            return this.b;
        }

        public /* synthetic */ b(Object obj) {
            this(obj, true);
        }
    }

    boolean b();
}
