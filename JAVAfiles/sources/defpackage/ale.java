package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ale extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cbh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(cbh cbhVar) {
        super(1);
        this.a = cbhVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cbh cbhVar = this.a;
        int i = cbhVar.b;
        if (i > 0) {
            Object[] objArr = cbhVar.a;
            int i2 = 0;
            do {
                ((cuf) objArr[i2]).o();
                i2++;
            } while (i2 < i);
        }
        return arnb.a;
    }
}
