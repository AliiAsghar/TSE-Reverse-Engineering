package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiat {
    public String a;
    public String b;
    public ahyx c;
    private String d;
    private int e;
    private int f;
    private byte g;

    public final aiau a() {
        String str;
        String str2;
        boolean z;
        if (this.g == 3 && (str = this.d) != null && (str2 = this.a) != null) {
            ahzp ahzpVar = new ahzp(str, this.e, this.f, str2, this.b, this.c);
            int i = ahzpVar.c;
            boolean z2 = false;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            albo.L(z, "Width must not be < 0, but was: %s.", i);
            int i2 = ahzpVar.b;
            if (i2 >= 0) {
                z2 = true;
            }
            albo.L(z2, "Height must not be < 0, but was: %s.", i2);
            d.t(!ahzpVar.d.isEmpty(), "PhotoReference must not be empty.");
            return ahzpVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" attributions");
        }
        if ((this.g & 1) == 0) {
            sb.append(" height");
        }
        if ((this.g & 2) == 0) {
            sb.append(" width");
        }
        if (this.a == null) {
            sb.append(" photoReference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null attributions");
    }

    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 1);
    }

    public final void d(int i) {
        this.f = i;
        this.g = (byte) (this.g | 2);
    }
}
