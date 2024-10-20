package defpackage;

import defpackage.ara;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atb<T> implements ara<T> {
    public final cbh a = new cbh(new ara.a[16]);
    public int b;
    private ara.a c;

    @Override // defpackage.ara
    public final ara.a a(int i) {
        if (i < 0 || i >= this.b) {
            aju.e("Index " + i + ", size " + this.b);
        }
        ara.a aVar = this.c;
        if (aVar != null) {
            int i2 = aVar.a;
            if (i < aVar.b + i2 && i2 <= i) {
                return aVar;
            }
        }
        cbh cbhVar = this.a;
        ara.a aVar2 = (ara.a) cbhVar.a[arb.a(cbhVar, i)];
        this.c = aVar2;
        return aVar2;
    }

    public final void b(int i, Object obj) {
        if (i < 0) {
            aju.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ara.a aVar = new ara.a(this.b, i, obj);
        this.b += i;
        this.a.n(aVar);
    }
}
