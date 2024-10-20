package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arup implements aruo {
    public final Matcher a;
    private final CharSequence b;

    public arup(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    @Override // defpackage.aruo
    public final String a() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    @Override // defpackage.aruo
    public final artb b() {
        Matcher matcher = this.a;
        return arrn.B(matcher.start(), matcher.end());
    }

    @Override // defpackage.aruo
    public final aruo c() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.b.length()) {
            Matcher matcher2 = this.a;
            Matcher matcher3 = matcher2.pattern().matcher(this.b);
            matcher3.getClass();
            return arro.f(matcher3, i2, this.b);
        }
        return null;
    }
}
