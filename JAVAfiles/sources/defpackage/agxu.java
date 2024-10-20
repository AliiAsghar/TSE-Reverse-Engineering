package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxu {
    public byte a;
    private String b;
    private int c;
    private int d;
    private int e;
    private alog f;
    private boolean g;
    private boolean h;

    public agxu() {
    }

    public final agxv a() {
        if (this.a == 63 && this.b != null && this.f != null) {
            return new agxv(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" emoji");
        }
        if ((this.a & 1) == 0) {
            sb.append(" positionInCategory");
        }
        if ((this.a & 2) == 0) {
            sb.append(" categoryIndex");
        }
        if ((this.a & 4) == 0) {
            sb.append(" categorySize");
        }
        if (this.f == null) {
            sb.append(" variants");
        }
        if ((this.a & 8) == 0) {
            sb.append(" inVariantsPopup");
        }
        if ((this.a & 16) == 0) {
            sb.append(" isSelected");
        }
        if ((this.a & 32) == 0) {
            sb.append(" isActivated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.a = (byte) (this.a | 2);
    }

    public final void c(int i) {
        this.e = i;
        this.a = (byte) (this.a | 4);
    }

    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null emoji");
    }

    public final void e(boolean z) {
        this.g = z;
        this.a = (byte) (this.a | 8);
    }

    public final void f(boolean z) {
        this.h = z;
        this.a = (byte) (this.a | 16);
    }

    public final void g(int i) {
        this.c = i;
        this.a = (byte) (this.a | 1);
    }

    public final void h(alog alogVar) {
        if (alogVar != null) {
            this.f = alogVar;
            return;
        }
        throw new NullPointerException("Null variants");
    }

    public agxu(agxv agxvVar) {
        this.b = agxvVar.b;
        this.c = agxvVar.c;
        this.d = agxvVar.d;
        this.e = agxvVar.e;
        this.f = agxvVar.f;
        this.g = agxvVar.g;
        this.h = agxvVar.h;
        this.a = (byte) 63;
    }
}
