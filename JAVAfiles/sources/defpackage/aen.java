package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.cva;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aen extends cwr implements czk, cwz, cwm, cyu, czp {
    private static final a f = new a();
    public ajr a;
    public final arqr b;
    public ajk c;
    public cva.a d;
    public final cja e;
    private cti g;
    private arqg h;

    /* compiled from: PG */
    /* renamed from: aen$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Boolean.valueOf(aen.this.e.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aen$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajr b;
        final /* synthetic */ ajp c;
        final /* synthetic */ arwu d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ajr ajrVar, ajp ajpVar, arwu arwuVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ajrVar;
            this.c = ajpVar;
            this.d = arwuVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ajr ajrVar = this.b;
                ajp ajpVar = this.c;
                this.a = 1;
                if (ajrVar.b(ajpVar, this) == arplVar) {
                    return arplVar;
                }
            }
            arwu arwuVar = this.d;
            if (arwuVar != null) {
                arwuVar.hd();
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.b, this.c, this.d, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aen$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<Throwable, arnb> {
        final /* synthetic */ ajr a;
        final /* synthetic */ ajp b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ajr ajrVar, ajp ajpVar) {
            super(1);
            this.a = ajrVar;
            this.b = ajpVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.c(this.b);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aen$4, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass4 extends arrm implements arqv<ciy, ciy, arnb> {
        public AnonymousClass4(Object obj) {
            super(2, obj, aen.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            boolean b;
            cva.a aVar;
            ciy ciyVar = (ciy) obj;
            ciy ciyVar2 = (ciy) obj2;
            aen aenVar = (aen) this.e;
            if (aenVar.z && (b = ciyVar2.b()) != ciyVar.b()) {
                arqr arqrVar = aenVar.b;
                if (arqrVar != null) {
                    arqrVar.a(Boolean.valueOf(b));
                }
                if (b) {
                    avi a = avl.a(aenVar);
                    if (a != null) {
                        arrn.J(aenVar.B(), null, null, new aeo(aenVar, a, cwp.c(aenVar), null), 3);
                    }
                    cva e = aenVar.e();
                    if (e != null) {
                        aVar = e.b();
                    } else {
                        aVar = null;
                    }
                    aenVar.d = aVar;
                    aenVar.h();
                } else {
                    cva.a aVar2 = aenVar.d;
                    if (aVar2 != null) {
                        aVar2.e();
                    }
                    aenVar.d = null;
                    aep d = aenVar.d();
                    if (d != null) {
                        d.a(null);
                    }
                }
                czl.a(aenVar);
                ajr ajrVar = aenVar.a;
                if (ajrVar != null) {
                    if (b) {
                        ajk ajkVar = aenVar.c;
                        if (ajkVar != null) {
                            aenVar.g(ajrVar, new ajl(ajkVar));
                            aenVar.c = null;
                        }
                        ajk ajkVar2 = new ajk();
                        aenVar.g(ajrVar, ajkVar2);
                        aenVar.c = ajkVar2;
                    } else {
                        ajk ajkVar3 = aenVar.c;
                        if (ajkVar3 != null) {
                            aenVar.g(ajrVar, new ajl(ajkVar3));
                            aenVar.c = null;
                        }
                    }
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aen$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<arnb> {
        final /* synthetic */ arsb a;
        final /* synthetic */ aen b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arsb arsbVar, aen aenVar) {
            super(0);
            this.a = arsbVar;
            this.b = aenVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.a = cwn.a(this.b, cvb.a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a {
    }

    public aen(ajr ajrVar, int i, arqr arqrVar) {
        this.a = ajrVar;
        this.b = arqrVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new AnonymousClass4(this));
        K(focusTargetNode);
        this.e = focusTargetNode;
    }

    @Override // defpackage.cyu
    public final void a() {
        cva.a aVar;
        cva e = e();
        if (((FocusTargetNode) this.e).e().b()) {
            cva.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.e();
            }
            if (e != null) {
                aVar = e.b();
            } else {
                aVar = null;
            }
            this.d = aVar;
        }
    }

    public final aep d() {
        if (this.z) {
            czp b = czq.b(this, aep.a);
            if (b instanceof aep) {
                return (aep) b;
            }
            return null;
        }
        return null;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        boolean b = ((FocusTargetNode) this.e).e().b();
        artm[] artmVarArr = dhl.a;
        dhn dhnVar = dhh.a;
        dhn dhnVar2 = dhh.k;
        artm artmVar = dhl.a[4];
        dhnVar2.a(dhoVar, Boolean.valueOf(b));
        if (this.h == null) {
            this.h = new AnonymousClass1();
        }
        dhl.A(dhoVar, this.h);
    }

    @Override // defpackage.czp
    public final Object dP() {
        return f;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    public final cva e() {
        arsb arsbVar = new arsb();
        cyv.a(this, new AnonymousClass5(arsbVar, this));
        return (cva) arsbVar.a;
    }

    @Override // cga.c
    public final void eb() {
        cva.a aVar = this.d;
        if (aVar != null) {
            aVar.e();
        }
        this.d = null;
    }

    public final void g(ajr ajrVar, ajp ajpVar) {
        arwu arwuVar;
        if (this.z) {
            arxm arxmVar = (arxm) ((asep) B()).a.get(arxm.c);
            if (arxmVar != null) {
                arwuVar = arxmVar.s(new AnonymousClass3(ajrVar, ajpVar));
            } else {
                arwuVar = null;
            }
            arrn.J(B(), null, null, new AnonymousClass2(ajrVar, ajpVar, arwuVar, null), 3);
            return;
        }
        ajrVar.c(ajpVar);
    }

    public final void h() {
        aep d;
        cti ctiVar = this.g;
        if (ctiVar != null && ctiVar.r() && (d = d()) != null) {
            d.a(this.g);
        }
    }

    @Override // defpackage.cwz
    public final void i(cti ctiVar) {
        this.g = ctiVar;
        if (((FocusTargetNode) this.e).e().b()) {
            if (ctiVar.r()) {
                h();
                return;
            }
            aep d = d();
            if (d != null) {
                d.a(null);
            }
        }
    }

    public final void j(ajr ajrVar) {
        ajk ajkVar;
        if (!d.F(this.a, ajrVar)) {
            ajr ajrVar2 = this.a;
            if (ajrVar2 != null && (ajkVar = this.c) != null) {
                ajrVar2.c(new ajl(ajkVar));
            }
            this.c = null;
            this.a = ajrVar;
        }
    }
}
