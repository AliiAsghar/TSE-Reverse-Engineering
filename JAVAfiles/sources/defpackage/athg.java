package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athg extends atgz {
    public athg(atgv atgvVar) {
        super(atgvVar);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int b(Locale locale) {
        return athf.a(locale).l;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String k(int i, Locale locale) {
        return athf.a(locale).e[i];
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String m(int i, Locale locale) {
        return athf.a(locale).d[i];
    }

    @Override // defpackage.athq
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) athf.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new atgg(atfy.h, str);
    }
}
