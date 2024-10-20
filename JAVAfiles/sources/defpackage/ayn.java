package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayn {
    public static final int a(String str, int i) {
        int i2;
        ekt c = c();
        Integer num = null;
        if (c != null) {
            dye.f(c.h(), "Not initialized yet");
            d.aC(str, "charSequence cannot be null");
            Object obj = c.f.a;
            if (i >= 0 && i < str.length()) {
                i2 = ((ekw) ((ekz) obj).a(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ekw(i))).b;
            } else {
                i2 = -1;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int b(String str, int i) {
        ekt c = c();
        Integer num = null;
        if (c != null) {
            Integer valueOf = Integer.valueOf(c.a(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final ekt c() {
        if (ekt.g()) {
            ekt c = ekt.c();
            if (c.b() == 1) {
                return c;
            }
            return null;
        }
        return null;
    }
}
