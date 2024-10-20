package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqg {
    public static final dqg a = new dqg(a.b, 17);
    public final float b;
    public final int c;
    public final int d;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final float a;
        public static final float b;
        public static final float c;

        static {
            a(brg.a);
            a(0.5f);
            a = 0.5f;
            a(-1.0f);
            b = -1.0f;
            a(1.0f);
            c = 1.0f;
        }

        public static void a(float f) {
            if ((f >= brg.a && f <= 1.0f) || f == -1.0f) {
                return;
            }
            doz.c("topRatio should be in [0..1] range or -1");
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public dqg(float f, int i) {
        this.b = f;
        this.c = i;
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqg)) {
            return false;
        }
        dqg dqgVar = (dqg) obj;
        if (Float.compare(this.b, dqgVar.b) != 0 || !defpackage.a.bA(this.c, dqgVar.c)) {
            return false;
        }
        int i = dqgVar.d;
        if (defpackage.a.bA(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c) * 31;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = a.a;
        float f2 = this.b;
        if (f2 == brg.a) {
            str = "LineHeightStyle.Alignment.Top";
        } else if (f2 == a.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f2 == a.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f2 == a.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.c;
        if (i == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str2 = "LineHeightStyle.Trim.None";
        } else {
            str2 = "Invalid";
        }
        sb.append((Object) str2);
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }

    public dqg(float f) {
        this(f, 0);
    }
}
