package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyj extends tm {
    private int e;

    @Override // defpackage.vl, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.vl
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.vl
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.vl, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.vl
    public final void i(vl vlVar) {
        this.e = 0;
        super.i(vlVar);
    }

    @Override // defpackage.vl, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
