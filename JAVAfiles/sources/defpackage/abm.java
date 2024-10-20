package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abm<T> implements aap<T> {
    public final float a;
    public final float b;
    public final Object c;

    public abm() {
        this(null, 7);
    }

    @Override // defpackage.zr
    public final /* bridge */ /* synthetic */ ack a(acg acgVar) {
        zz zzVar;
        Object obj = this.c;
        if (obj == null) {
            zzVar = null;
        } else {
            zzVar = (zz) acgVar.b().a(obj);
        }
        return new acx(this.a, this.b, zzVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abm) {
            abm abmVar = (abm) obj;
            if (abmVar.a == this.a && abmVar.b == this.b && d.F(abmVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public abm(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ abm(Object obj, int i) {
        this(1 != (i & 1) ? 0.0f : 1.0f, (i & 2) != 0 ? 1500.0f : brg.a, (i & 4) != 0 ? null : obj);
    }
}
