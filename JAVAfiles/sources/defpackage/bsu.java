package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsu extends cga.c implements czk {
    public arqr a;

    /* compiled from: PG */
    /* renamed from: bsu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<czp, Boolean> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            czp czpVar = (czp) obj;
            czpVar.getClass();
            throw null;
        }
    }

    /* compiled from: PG */
    /* renamed from: bsu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<czp, Boolean> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            czp czpVar = (czp) obj;
            czpVar.getClass();
            czl.a((btk) czpVar);
            return false;
        }
    }

    public bsu(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        czq.d(this, btl.a, new AnonymousClass1());
        this.a.a(dhoVar);
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // cga.c
    public final void s() {
        czq.d(this, btl.a, AnonymousClass2.a);
    }
}
