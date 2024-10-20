package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esz {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final float A;
    public final int B;
    public final float C;
    public final float D;
    public final boolean E;
    public final int F;
    public final int G;
    public final float H;
    public final int I;
    public final float J;
    public final CharSequence t;
    public final Layout.Alignment u;
    public final Layout.Alignment v;
    public final Bitmap w;
    public final float x;
    public final int y;
    public final int z;

    static {
        esy esyVar = new esy();
        esyVar.a = "";
        esyVar.a();
        a = eul.M(0);
        b = eul.M(17);
        c = eul.M(1);
        d = eul.M(2);
        e = eul.M(3);
        f = eul.M(18);
        g = eul.M(4);
        h = eul.M(5);
        i = eul.M(6);
        j = eul.M(7);
        k = eul.M(8);
        l = eul.M(9);
        m = eul.M(10);
        n = eul.M(11);
        o = eul.M(12);
        p = eul.M(13);
        q = eul.M(14);
        r = eul.M(15);
        s = eul.M(16);
    }

    public esz(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        boolean z2;
        String str;
        if (charSequence == null) {
            dzg.g(bitmap);
        } else {
            if (bitmap == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.s(z2);
        }
        if (charSequence instanceof Spanned) {
            this.t = SpannedString.valueOf(charSequence);
        } else {
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            this.t = str;
        }
        this.u = alignment;
        this.v = alignment2;
        this.w = bitmap;
        this.x = f2;
        this.y = i2;
        this.z = i3;
        this.A = f3;
        this.B = i4;
        this.C = f5;
        this.D = f6;
        this.E = z;
        this.F = i6;
        this.G = i5;
        this.H = f4;
        this.I = i7;
        this.J = f7;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            esz eszVar = (esz) obj;
            if (TextUtils.equals(this.t, eszVar.t) && this.u == eszVar.u && this.v == eszVar.v && ((bitmap = this.w) != null ? !((bitmap2 = eszVar.w) == null || !bitmap.sameAs(bitmap2)) : eszVar.w == null) && this.x == eszVar.x && this.y == eszVar.y && this.z == eszVar.z && this.A == eszVar.A && this.B == eszVar.B && this.C == eszVar.C && this.D == eszVar.D && this.E == eszVar.E && this.F == eszVar.F && this.G == eszVar.G && this.H == eszVar.H && this.I == eszVar.I && this.J == eszVar.J) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, this.u, this.v, this.w, Float.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C), Float.valueOf(this.D), Boolean.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Float.valueOf(this.H), Integer.valueOf(this.I), Float.valueOf(this.J)});
    }
}
