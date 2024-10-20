package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkg {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final BreakIterator d;

    public dkg(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            doz.b("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            doz.b("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new djk(charSequence, i));
    }

    private final boolean i(int i) {
        int i2 = i - 1;
        if (d.F(Character.UnicodeBlock.of(this.a.charAt(i2)), Character.UnicodeBlock.HIRAGANA) && d.F(Character.UnicodeBlock.of(this.a.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        if (d.F(Character.UnicodeBlock.of(this.a.charAt(i)), Character.UnicodeBlock.HIRAGANA) && d.F(Character.UnicodeBlock.of(this.a.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return false;
    }

    public final int a(int i) {
        c(i);
        int following = this.d.following(i);
        if (g(following - 1) && g(following) && !i(following)) {
            return a(following);
        }
        return following;
    }

    public final int b(int i) {
        c(i);
        int preceding = this.d.preceding(i);
        if (g(preceding) && d(preceding) && !i(preceding)) {
            return b(preceding);
        }
        return preceding;
    }

    public final void c(int i) {
        if (i <= this.c && this.b <= i) {
            return;
        }
        doz.b("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + this.c + ']');
    }

    public final boolean d(int i) {
        if (i <= this.c && this.b + 1 <= i) {
            if (Character.isLetterOrDigit(Character.codePointBefore(this.a, i))) {
                return true;
            }
            int i2 = i - 1;
            if (Character.isSurrogate(this.a.charAt(i2))) {
                return true;
            }
            if (ekt.g()) {
                ekt c = ekt.c();
                if (c.b() == 1 && c.a(this.a, i2) != -1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean e(int i) {
        if (i <= this.c && this.b + 1 <= i) {
            return a.J(Character.codePointBefore(this.a, i));
        }
        return false;
    }

    public final boolean f(int i) {
        c(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        if (i <= 0 || i >= this.a.length() - 1) {
            return true;
        }
        if (i(i) || i(i + 1)) {
            return false;
        }
        return true;
    }

    public final boolean g(int i) {
        if (i < this.c && this.b <= i) {
            if (Character.isLetterOrDigit(Character.codePointAt(this.a, i)) || Character.isSurrogate(this.a.charAt(i))) {
                return true;
            }
            if (ekt.g()) {
                ekt c = ekt.c();
                if (c.b() == 1 && c.a(this.a, i) != -1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean h(int i) {
        if (i < this.c && this.b <= i) {
            return a.J(Character.codePointAt(this.a, i));
        }
        return false;
    }
}
