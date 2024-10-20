package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebi {
    public static final ebi a = b(new Locale[0]);
    private final ebj b;

    private ebi(ebj ebjVar) {
        this.b = ebjVar;
    }

    public static ebi b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static ebi c(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return b(localeArr);
        }
        return a;
    }

    public static ebi d(LocaleList localeList) {
        return new ebi(new ebj(localeList));
    }

    public final int a() {
        int size;
        size = this.b.a.size();
        return size;
    }

    public final String e() {
        String languageTags;
        languageTags = this.b.a.toLanguageTags();
        return languageTags;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ebi) && this.b.equals(((ebi) obj).b)) {
            return true;
        }
        return false;
    }

    public final Locale f(int i) {
        Locale locale;
        locale = this.b.a.get(i);
        return locale;
    }

    public final boolean g() {
        boolean isEmpty;
        isEmpty = this.b.a.isEmpty();
        return isEmpty;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
