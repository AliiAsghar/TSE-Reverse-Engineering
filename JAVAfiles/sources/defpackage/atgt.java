package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atgt extends athz {
    public atgt() {
        super(atfy.n, atgv.s, atgv.t);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int b(Locale locale) {
        return athf.a(locale).m;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long i(long j, String str, Locale locale) {
        String[] strArr = athf.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new atgg(atfy.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String m(int i, Locale locale) {
        return athf.a(locale).f[i];
    }
}
