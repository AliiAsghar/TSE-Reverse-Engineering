package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbw implements bzt {
    public final long a;
    public final bes b;
    public final long c;
    public bbz d;
    public bcw e;
    public final cga f;

    /* compiled from: PG */
    /* renamed from: bbw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<cti> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return bbw.this.d.b;
        }
    }

    /* compiled from: PG */
    /* renamed from: bbw$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<diy> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return bbw.this.d.c;
        }
    }

    public /* synthetic */ bbw(long j, bes besVar, long j2) {
        cga a;
        bbz bbzVar = bbz.a;
        this.a = j;
        this.b = besVar;
        this.c = j2;
        this.d = bbzVar;
        bbv bbvVar = new bbv(this);
        bbx bbxVar = new bbx(bbvVar, besVar, j);
        a = bdm.a(cga.e, new bby(bbvVar, besVar, j), bbxVar).a(new PointerHoverIconModifierElement(bai.a));
        this.f = a;
    }

    @Override // defpackage.bzt
    public final void g() {
        bcw bcwVar = this.e;
        if (bcwVar != null) {
            this.b.g(bcwVar);
            this.e = null;
        }
    }

    @Override // defpackage.bzt
    public final void h() {
        bcw bcwVar = this.e;
        if (bcwVar != null) {
            this.b.g(bcwVar);
            this.e = null;
        }
    }

    @Override // defpackage.bzt
    public final void i() {
        bct bctVar = new bct(this.a, new AnonymousClass1(), new AnonymousClass2());
        this.b.i(bctVar);
        this.e = bctVar;
    }
}
