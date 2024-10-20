package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arus implements Serializable {
    private final Pattern a;

    public arus(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.a.pattern();
        pattern.getClass();
        return new aruq(pattern, this.a.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final boolean b(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final aruo c(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        return arro.f(matcher, 0, charSequence);
    }

    public final List d(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return aqjn.y(charSequence);
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public arus(java.lang.String r1) {
        /*
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arus.<init>(java.lang.String):void");
    }
}
