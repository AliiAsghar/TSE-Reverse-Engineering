package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huz extends hlt {
    public static huz b() {
        huz huzVar = new huz();
        huzVar.c(new xzg(300, null));
        return huzVar;
    }

    public final void c(xzg xzgVar) {
        hxu hxuVar = new hxu(xzgVar.a);
        hwr.i(hxuVar);
        this.a = hxuVar;
    }

    @Override // defpackage.hlt
    public final boolean equals(Object obj) {
        if ((obj instanceof huz) && super.equals(obj)) {
            return true;
        }
        return false;
    }
}
