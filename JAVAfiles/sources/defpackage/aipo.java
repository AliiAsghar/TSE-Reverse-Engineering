package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aipo {
    private static final alwo b = alwo.o("GlobMatcher");
    public final Pattern a;

    private aipo(String str, Pattern pattern) {
        str.getClass();
        this.a = pattern;
    }

    public static algw a(String str) {
        arjs arjsVar = new arjs();
        StringBuilder sb = new StringBuilder();
        if (arjsVar.c(str.toCharArray(), sb, false)) {
            try {
                return algw.i(new aipo(str, Pattern.compile(sb.toString(), 2)));
            } catch (PatternSyntaxException e) {
                ((alwl) ((alwl) ((alwl) b.h()).g(e)).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 44, "GlobMatcher.java")).t("Internal error. Generated regex is invalid: %s", sb);
                return alfd.a;
            }
        }
        ((alwl) ((alwl) b.h()).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 49, "GlobMatcher.java")).t("Internal error. Can't parse glob-pattern: %s", str);
        return alfd.a;
    }
}
