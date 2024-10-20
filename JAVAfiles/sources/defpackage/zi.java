package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class zi extends arpw implements arqr<arpe<? super zp>, Object> {
    Object a;
    Object b;
    int c;
    final /* synthetic */ zj d;
    final /* synthetic */ Object e;
    final /* synthetic */ zn f;
    final /* synthetic */ long g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: zi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<zq, arnb> {
        final /* synthetic */ zj a;
        final /* synthetic */ zt b;
        final /* synthetic */ arrx c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zj zjVar, zt ztVar, arrx arrxVar) {
            super(1);
            this.a = zjVar;
            this.b = ztVar;
            this.c = arrxVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            zq zqVar = (zq) obj;
            abq.g(zqVar, this.a.b);
            Object b = this.a.b(zqVar.a());
            if (!d.F(b, zqVar.a())) {
                this.a.b.c(b);
                this.b.c(b);
                zqVar.c();
                this.c.a = true;
            }
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(zj zjVar, Object obj, zn znVar, long j, arpe arpeVar) {
        super(1, arpeVar);
        this.d = zjVar;
        this.e = obj;
        this.f = znVar;
        this.g = j;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new zi(this.d, this.e, this.f, this.g, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        zo zoVar;
        arpl arplVar = arpl.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                obj3 = this.a;
                aqil.P(obj);
            } else {
                aqil.P(obj);
                zj zjVar = this.d;
                zjVar.b.b = (zz) zjVar.a.b().a(this.e);
                this.d.i(((abs) this.f).a);
                this.d.h(true);
                zt ztVar = this.d.b;
                zt ztVar2 = new zt(ztVar.a, ztVar.a(), aaa.a(ztVar.b), ztVar.c, Long.MIN_VALUE, ztVar.e);
                arrx arrxVar = new arrx();
                zn znVar = this.f;
                long j = this.g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, ztVar2, arrxVar);
                this.a = ztVar2;
                this.b = arrxVar;
                this.c = 1;
                if (abq.b(ztVar2, znVar, j, anonymousClass1, this) != arplVar) {
                    obj2 = arrxVar;
                    obj3 = ztVar2;
                } else {
                    return arplVar;
                }
            }
            if (((arrx) obj2).a) {
                zoVar = zo.a;
            } else {
                zoVar = zo.b;
            }
            this.d.g();
            return new zp((zt) obj3, zoVar);
        } catch (CancellationException e) {
            this.d.g();
            throw e;
        }
    }
}
