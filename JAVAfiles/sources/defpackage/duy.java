package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duy extends duw {
    float a;

    public duy(float f) {
        super(null);
        this.a = f;
    }

    @Override // defpackage.duw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duy) {
            float t = t();
            float t2 = ((duy) obj).t();
            if ((Float.isNaN(t) && Float.isNaN(t2)) || t == t2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duw
    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        float f = this.a;
        if (f != brg.a) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // defpackage.duw
    public final float t() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Float.parseFloat(v());
        }
        return this.a;
    }

    @Override // defpackage.duw
    public final int u() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Integer.parseInt(v());
        }
        return (int) this.a;
    }
}
