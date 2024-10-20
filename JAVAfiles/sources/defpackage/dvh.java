package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvh implements dvg {
    final float a;
    float b;

    public dvh(float f, float f2) {
        this.a = f2;
        this.b = f;
    }

    @Override // defpackage.dvg
    public final float a() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}
