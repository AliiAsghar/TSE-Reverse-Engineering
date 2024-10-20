package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqp {
    public final cbh d = new cbh(new cqo[16]);
    public final ux e = new ux(10);

    public boolean b(uj ujVar, cti ctiVar, cql cqlVar, boolean z) {
        cbh cbhVar = this.d;
        int i = cbhVar.b;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = cbhVar.a;
        int i2 = 0;
        boolean z2 = false;
        do {
            if (!((cqo) objArr[i2]).b(ujVar, ctiVar, cqlVar, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i2++;
        } while (i2 < i);
        return z2;
    }

    public final void f() {
        int i = this.d.b;
        while (true) {
            i--;
            if (i >= 0) {
                cbh cbhVar = this.d;
                if (((cqo) cbhVar.a[i]).b.a == 0) {
                    cbhVar.c(i);
                }
            } else {
                return;
            }
        }
    }
}
