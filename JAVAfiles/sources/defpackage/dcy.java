package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcy extends arrp implements arqr<dnw, arnb> {
    final /* synthetic */ dcz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcy(dcz dczVar) {
        super(1);
        this.a = dczVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dnw dnwVar = (dnw) obj;
        dnwVar.a();
        cbh cbhVar = this.a.d;
        int i = cbhVar.b;
        int i2 = -1;
        if (i > 0) {
            Object[] objArr = cbhVar.a;
            int i3 = 0;
            while (true) {
                if (!d.F((WeakReference) objArr[i3], dnwVar)) {
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else {
                    i2 = i3;
                    break;
                }
            }
        }
        if (i2 >= 0) {
            this.a.d.c(i2);
        }
        dcz dczVar = this.a;
        if (dczVar.d.b == 0) {
            dczVar.b.a();
        }
        return arnb.a;
    }
}
