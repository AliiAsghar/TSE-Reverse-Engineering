package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daa extends czu {
    public static daa b;
    public final BreakIterator c;

    public daa(Locale locale) {
        this.c = BreakIterator.getWordInstance(locale);
    }

    private final boolean e(int i) {
        if (i <= 0 || !f(i - 1)) {
            return false;
        }
        if (i != a().length() && f(i)) {
            return false;
        }
        return true;
    }

    private final boolean f(int i) {
        if (i >= 0 && i < a().length()) {
            return Character.isLetterOrDigit(a().codePointAt(i));
        }
        return false;
    }

    private final boolean g(int i) {
        if (!f(i)) {
            return false;
        }
        if (i != 0 && f(i - 1)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.czz
    public final int[] c(int i) {
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!f(i) && !g(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    arro.b("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                arro.b("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i);
            if (following != -1 && e(following)) {
                return b(i, following);
            }
        }
        return null;
    }

    @Override // defpackage.czz
    public final int[] d(int i) {
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !f(i - 1) && !e(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    arro.b("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                arro.b("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1 && g(preceding)) {
                return b(preceding, i);
            }
        }
        return null;
    }
}
