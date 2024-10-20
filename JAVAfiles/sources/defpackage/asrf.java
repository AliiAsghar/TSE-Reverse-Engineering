package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrf extends arnj implements RandomAccess {
    public static final aotl c = new aotl();
    public final asqx[] a;
    public final int[] b;

    public asrf(asqx[] asqxVarArr, int[] iArr) {
        this.a = asqxVarArr;
        this.b = iArr;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof asqx)) {
            return false;
        }
        return super.contains((asqx) obj);
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.arnj, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof asqx)) {
            return -1;
        }
        return super.indexOf((asqx) obj);
    }

    @Override // defpackage.arnj, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof asqx)) {
            return -1;
        }
        return super.lastIndexOf((asqx) obj);
    }
}
