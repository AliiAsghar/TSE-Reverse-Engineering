package defpackage;

import defpackage.cfq;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmm extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ cvc b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    final /* synthetic */ cvc f;
    final /* synthetic */ cvc g;
    final /* synthetic */ cvc h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmm(cvc cvcVar, cvc cvcVar2, int i, boolean z, int i2, cvc cvcVar3, cvc cvcVar4, cvc cvcVar5, int i3, int i4, int i5) {
        super(1);
        this.a = cvcVar;
        this.b = cvcVar2;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = cvcVar3;
        this.g = cvcVar4;
        this.h = cvcVar5;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int a;
        cvc.a aVar = (cvc.a) obj;
        cvc cvcVar = this.a;
        if (cvcVar != null) {
            int i = this.c;
            boolean z = this.d;
            int i2 = this.e;
            int i3 = this.i;
            if (!z) {
                int i4 = cfq.a;
                i2 = cfq.a.k.a(cvcVar.b, i3);
            }
            cvc.a.m(aVar, cvcVar, i, i2);
        }
        cvc cvcVar2 = this.b;
        if (cvcVar2 != null) {
            int i5 = this.j;
            int i6 = this.k;
            boolean z2 = this.d;
            int i7 = this.e;
            int i8 = this.i;
            int i9 = (i5 - i6) - cvcVar2.a;
            if (!z2) {
                int i10 = cfq.a;
                i7 = cfq.a.k.a(cvcVar2.b, i8);
            }
            cvc.a.m(aVar, cvcVar2, i9, i7);
        }
        int b = this.c + btf.b(this.a);
        if (this.d) {
            a = this.e;
        } else {
            int a2 = btf.a(this.f) + btf.a(this.g) + btf.a(this.h);
            int i11 = cfq.a;
            a = cfq.a.k.a(a2, this.i);
        }
        cvc cvcVar3 = this.g;
        if (cvcVar3 != null) {
            cvc.a.m(aVar, cvcVar3, b, a);
        }
        int a3 = a + btf.a(this.g);
        cvc cvcVar4 = this.f;
        if (cvcVar4 != null) {
            cvc.a.m(aVar, cvcVar4, b, a3);
        }
        int a4 = a3 + btf.a(this.f);
        cvc cvcVar5 = this.h;
        if (cvcVar5 != null) {
            cvc.a.m(aVar, cvcVar5, b, a4);
        }
        return arnb.a;
    }
}
