package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.dai;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfi implements bwq, enk {
    public final dai a;
    public final bwq b;
    public boolean c;
    public enh d;
    public arqv e = dcg.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dfi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<dai.b, arnb> {
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar) {
            super(1);
            this.b = arqvVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            dai.b bVar = (dai.b) obj;
            if (!dfi.this.c) {
                enh N = bVar.a.N();
                dfi dfiVar = dfi.this;
                dfiVar.e = this.b;
                if (dfiVar.d == null) {
                    dfiVar.d = N;
                    N.c(dfiVar);
                } else if (N.a().a(eng.CREATED)) {
                    dfi dfiVar2 = dfi.this;
                    ((bwt) dfiVar2.b).i(new cdj(-2000640158, true, new dfh(dfiVar2, this.b)));
                }
            }
            return arnb.a;
        }
    }

    public dfi(dai daiVar, bwq bwqVar) {
        this.a = daiVar;
        this.b = bwqVar;
    }

    @Override // defpackage.bwq
    public final void b() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            enh enhVar = this.d;
            if (enhVar != null) {
                enhVar.d(this);
            }
        }
        this.b.b();
    }

    @Override // defpackage.bwq
    public final boolean c() {
        throw null;
    }

    public final void d(arqv arqvVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arqvVar);
        dai daiVar = this.a;
        dai.b C = daiVar.C();
        if (C != null) {
            anonymousClass1.a(C);
        }
        if (!daiVar.isAttachedToWindow()) {
            daiVar.A = anonymousClass1;
        }
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (enfVar == enf.ON_DESTROY) {
            b();
        } else if (enfVar == enf.ON_CREATE && !this.c) {
            d(this.e);
        }
    }
}
