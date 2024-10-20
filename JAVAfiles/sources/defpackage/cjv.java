package defpackage;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjv {
    public static final BlendMode a(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (a.bA(i, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (a.bA(i, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (a.bA(i, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (a.bA(i, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (a.bA(i, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (a.bA(i, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (a.bA(i, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (a.bA(i, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (a.bA(i, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (a.bA(i, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (a.bA(i, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (a.bA(i, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (a.bA(i, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (a.bA(i, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (a.bA(i, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (a.bA(i, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (a.bA(i, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (a.bA(i, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (a.bA(i, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (a.bA(i, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (a.bA(i, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (a.bA(i, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (a.bA(i, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (a.bA(i, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (a.bA(i, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (a.bA(i, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (a.bA(i, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (a.bA(i, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (a.bA(i, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final PorterDuff.Mode b(int i) {
        if (a.bA(i, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (a.bA(i, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (a.bA(i, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (!a.bA(i, 3)) {
            if (a.bA(i, 4)) {
                return PorterDuff.Mode.DST_OVER;
            }
            if (a.bA(i, 5)) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (a.bA(i, 6)) {
                return PorterDuff.Mode.DST_IN;
            }
            if (a.bA(i, 7)) {
                return PorterDuff.Mode.SRC_OUT;
            }
            if (a.bA(i, 8)) {
                return PorterDuff.Mode.DST_OUT;
            }
            if (a.bA(i, 9)) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            if (a.bA(i, 10)) {
                return PorterDuff.Mode.DST_ATOP;
            }
            if (a.bA(i, 11)) {
                return PorterDuff.Mode.XOR;
            }
            if (a.bA(i, 12)) {
                return PorterDuff.Mode.ADD;
            }
            if (a.bA(i, 14)) {
                return PorterDuff.Mode.SCREEN;
            }
            if (a.bA(i, 15)) {
                return PorterDuff.Mode.OVERLAY;
            }
            if (a.bA(i, 16)) {
                return PorterDuff.Mode.DARKEN;
            }
            if (a.bA(i, 17)) {
                return PorterDuff.Mode.LIGHTEN;
            }
            if (a.bA(i, 13)) {
                return PorterDuff.Mode.MULTIPLY;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
