package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckl extends ckv {
    public final int a;
    private final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ckl(long r4, int r6) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            int r1 = defpackage.ckw.b(r4)
            android.graphics.BlendMode r2 = defpackage.cjv.a(r6)
            r0.<init>(r1, r2)
            goto L21
        L14:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = defpackage.ckw.b(r4)
            android.graphics.PorterDuff$Mode r2 = defpackage.cjv.b(r6)
            r0.<init>(r1, r2)
        L21:
            r3.<init>(r0)
            r3.c = r4
            r3.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckl.<init>(long, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckl)) {
            return false;
        }
        ckl cklVar = (ckl) obj;
        if (a.bB(this.c, cklVar.c) && a.bA(this.a, cklVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.c) * 31) + this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        sb.append((Object) cku.g(this.c));
        sb.append(", blendMode=");
        int i = this.a;
        if (a.bA(i, 0)) {
            str = "Clear";
        } else if (a.bA(i, 1)) {
            str = "Src";
        } else if (a.bA(i, 2)) {
            str = "Dst";
        } else if (a.bA(i, 3)) {
            str = "SrcOver";
        } else if (a.bA(i, 4)) {
            str = "DstOver";
        } else if (a.bA(i, 5)) {
            str = "SrcIn";
        } else if (a.bA(i, 6)) {
            str = "DstIn";
        } else if (a.bA(i, 7)) {
            str = "SrcOut";
        } else if (a.bA(i, 8)) {
            str = "DstOut";
        } else if (a.bA(i, 9)) {
            str = "SrcAtop";
        } else if (a.bA(i, 10)) {
            str = "DstAtop";
        } else if (a.bA(i, 11)) {
            str = "Xor";
        } else if (a.bA(i, 12)) {
            str = "Plus";
        } else if (a.bA(i, 13)) {
            str = "Modulate";
        } else if (a.bA(i, 14)) {
            str = "Screen";
        } else if (a.bA(i, 15)) {
            str = "Overlay";
        } else if (a.bA(i, 16)) {
            str = "Darken";
        } else if (a.bA(i, 17)) {
            str = "Lighten";
        } else if (a.bA(i, 18)) {
            str = "ColorDodge";
        } else if (a.bA(i, 19)) {
            str = "ColorBurn";
        } else if (a.bA(i, 20)) {
            str = "HardLight";
        } else if (a.bA(i, 21)) {
            str = "Softlight";
        } else if (a.bA(i, 22)) {
            str = "Difference";
        } else if (a.bA(i, 23)) {
            str = "Exclusion";
        } else if (a.bA(i, 24)) {
            str = "Multiply";
        } else if (a.bA(i, 25)) {
            str = "Hue";
        } else if (a.bA(i, 26)) {
            str = "Saturation";
        } else if (a.bA(i, 27)) {
            str = "Color";
        } else if (a.bA(i, 28)) {
            str = "Luminosity";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
