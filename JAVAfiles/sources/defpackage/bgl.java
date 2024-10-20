package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgl {
    public final bfr a;

    /* compiled from: PG */
    /* renamed from: bgl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Float> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            dqv a = bgl.this.a();
            int i = bgi.a;
            return Float.valueOf(a.em(400.0f));
        }
    }

    public bgl(bgm bgmVar) {
        int i = bgi.a;
        this.a = new bfr(bgmVar, new AnonymousClass1());
    }

    public final dqv a() {
        throw new IllegalArgumentException(a.cc(this, "The density on DrawerState (", ") was not set. Did you use DrawerState with the Drawer composable?"));
    }
}
