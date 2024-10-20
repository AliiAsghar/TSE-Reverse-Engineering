package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asle {
    public static final /* synthetic */ int j = 0;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    private final int k;
    private final boolean l;
    private final boolean m;
    private String n;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        timeUnit.toSeconds(2147483647L);
    }

    public asle(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.k = i2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i3;
        this.h = i4;
        this.i = z6;
        this.l = z7;
        this.m = z8;
        this.n = str;
    }

    public final String toString() {
        String str = this.n;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.k != -1) {
                sb.append("s-maxage=");
                sb.append(this.k);
                sb.append(", ");
            }
            if (this.d) {
                sb.append("private, ");
            }
            if (this.e) {
                sb.append("public, ");
            }
            if (this.f) {
                sb.append("must-revalidate, ");
            }
            if (this.g != -1) {
                sb.append("max-stale=");
                sb.append(this.g);
                sb.append(", ");
            }
            if (this.h != -1) {
                sb.append("min-fresh=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i) {
                sb.append("only-if-cached, ");
            }
            if (this.l) {
                sb.append("no-transform, ");
            }
            if (this.m) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            this.n = sb2;
            return sb2;
        }
        return str;
    }
}
