package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmg implements dme {
    private static final Typeface c(String str, dlx dlxVar, int i) {
        if (a.bA(i, 0) && d.F(dlxVar, dlx.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int b = dlc.b(dlxVar, i);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, b);
        }
        return Typeface.defaultFromStyle(b);
    }

    @Override // defpackage.dme
    public final Typeface a(dlx dlxVar, int i) {
        return c(null, dlxVar, i);
    }

    @Override // defpackage.dme
    public final Typeface b(dlz dlzVar, dlx dlxVar, int i) {
        String str;
        int i2 = dlxVar.h / 100;
        String str2 = dlzVar.d;
        if (i2 >= 0 && i2 < 2) {
            str2 = str2.concat("-thin");
        } else {
            if (i2 >= 2 && i2 < 4) {
                str = "-light";
            } else if (i2 != 4) {
                if (i2 == 5) {
                    str = "-medium";
                } else if ((i2 < 6 || i2 >= 8) && i2 >= 8 && i2 < 11) {
                    str = "-black";
                }
            }
            str2 = str2.concat(str);
        }
        Typeface typeface = null;
        if (str2.length() != 0) {
            Typeface c = c(str2, dlxVar, i);
            if (!d.F(c, Typeface.create(Typeface.DEFAULT, dlc.b(dlxVar, i))) && !d.F(c, c(null, dlxVar, i))) {
                typeface = c;
            }
        }
        if (typeface == null) {
            return c(dlzVar.d, dlxVar, i);
        }
        return typeface;
    }
}
