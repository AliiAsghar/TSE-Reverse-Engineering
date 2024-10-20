package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwm {
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final CharSequence g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;

    public agwm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agwm)) {
            return false;
        }
        agwm agwmVar = (agwm) obj;
        int i = this.m;
        int i2 = agwmVar.m;
        if (i != 0) {
            if (i2 == 1) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(agwmVar.a) && this.b == agwmVar.b && this.c == agwmVar.c && this.d == agwmVar.d && this.e == agwmVar.e && this.f == agwmVar.f) {
                    CharSequence charSequence = agwmVar.g;
                    if (this.h == agwmVar.h && this.i == agwmVar.i && this.j == agwmVar.j && this.k == agwmVar.k && this.l == agwmVar.l) {
                        int i3 = this.n;
                        int i4 = agwmVar.n;
                        if (i3 != 0) {
                            if (i4 == 1) {
                                int i5 = this.o;
                                int i6 = agwmVar.o;
                                if (i5 != 0) {
                                    if (i6 == 1) {
                                        return true;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        a.aS(this.m);
        int floatToIntBits = Float.floatToIntBits(this.a) ^ 1305276242;
        a.aS(this.n);
        a.aS(this.o);
        int i4 = 1231;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = this.b;
        int i6 = this.c;
        int i7 = (((((((((((floatToIntBits * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * (-721379959)) ^ 1237;
        if (true != this.i) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i8 = ((((i7 * (-721379959)) ^ i) * 1525764945) ^ i2) * 1000003;
        int i9 = this.j;
        if (true != this.k) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i10 = (((i8 ^ i9) * 583896283) ^ i3) * 1000003;
        if (true != this.l) {
            i4 = 1237;
        }
        return ((((((i10 ^ i4) * 1000003) ^ 1) * 1000003) ^ 1) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.m != 1) {
            str = "null";
        } else {
            str = GeneralPurposeRichCardLayoutInfo.ORIENTATION_HORIZONTAL;
        }
        float f = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        boolean z = this.h;
        boolean z2 = this.i;
        int i6 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        if (this.n != 1) {
            str3 = "null";
            str2 = str3;
        } else {
            str2 = "null";
            str3 = "UNKNOWN";
        }
        if (this.o == 1) {
            str4 = "UNKNOWN";
        } else {
            str4 = str2;
        }
        return "EmojiPickerUiOptions{headerLayoutOrientation=" + str + ", headerIconSelectedOverrideTint=0, rows=" + f + ", rowHeight=" + i + ", maxRecentCount=" + i2 + ", poolSize=" + i3 + ", columns=" + i4 + ", minRowsPerCategory=" + i5 + ", emojiIconBackground=0, hideCategoryTitle=false, selectedEmoji=null, displayEmojiVariants=" + z + ", emojiPlaceHolderDrawable=0, customEmojiTypeface=0, popupViewController=null, popupWindowFocusable=" + z2 + ", categoryIconMinWidth=" + i6 + ", popupWindowBackgroundDrawable=null, emojiPickerUiBehavior=null, scrollToHeaderPositionOnCategoryChange=" + z3 + ", enableHorizontalCategoryStartMargin=" + z4 + ", highLightSelectedEmojiStatus=" + str3 + ", scrollToInitialEmojiOption=" + str4 + ", useTitleCaseCategoryNames=false}";
    }

    public agwm(float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, boolean z3, boolean z4) {
        this.m = 1;
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = null;
        this.h = z;
        this.i = z2;
        this.j = i6;
        this.k = z3;
        this.l = z4;
        this.n = 1;
        this.o = 1;
    }
}
