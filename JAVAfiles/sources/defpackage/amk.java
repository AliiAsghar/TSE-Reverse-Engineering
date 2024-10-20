package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amk implements amj {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public amk(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (f < brg.a) {
            ann.a("Start padding must be non-negative");
        }
        if (f2 < brg.a) {
            ann.a("Top padding must be non-negative");
        }
        if (f3 < brg.a) {
            ann.a("End padding must be non-negative");
        }
        if (f4 >= brg.a) {
            return;
        }
        ann.a("Bottom padding must be non-negative");
    }

    @Override // defpackage.amj
    public final float a() {
        return this.b;
    }

    @Override // defpackage.amj
    public final float b(drk drkVar) {
        if (drkVar == drk.a) {
            return this.c;
        }
        return this.d;
    }

    @Override // defpackage.amj
    public final float c(drk drkVar) {
        if (drkVar == drk.a) {
            return this.d;
        }
        return this.c;
    }

    @Override // defpackage.amj
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amk)) {
            return false;
        }
        amk amkVar = (amk) obj;
        if (!dqy.b(this.c, amkVar.c) || !dqy.b(this.a, amkVar.a) || !dqy.b(this.d, amkVar.d) || !dqy.b(this.b, amkVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) dqy.a(this.c)) + ", top=" + ((Object) dqy.a(this.a)) + ", end=" + ((Object) dqy.a(this.d)) + ", bottom=" + ((Object) dqy.a(this.b)) + ')';
    }
}
