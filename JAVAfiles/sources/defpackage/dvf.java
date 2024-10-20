package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvf implements dvg {
    public final String b;
    public final String c;
    public final float e;
    public final float f;
    boolean a = false;
    float d = brg.a;

    public dvf(float f, float f2, String str, String str2) {
        this.b = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
        this.f = f2;
        this.e = f;
    }

    @Override // defpackage.dvg
    public final float a() {
        float f = this.d;
        if (f >= this.f) {
            this.a = true;
        }
        if (!this.a) {
            float f2 = f + 1.0f;
            this.d = f2;
            return f2;
        }
        return f;
    }
}
