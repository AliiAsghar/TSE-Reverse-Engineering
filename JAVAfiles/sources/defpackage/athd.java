package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athd extends atia {
    private final atgv b;

    public athd(atgv atgvVar, atgd atgdVar) {
        super(atfy.m, atgdVar);
        this.b = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.b.O(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int b(Locale locale) {
        return athf.a(locale).k;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 7;
    }

    @Override // defpackage.atia, defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String k(int i, Locale locale) {
        return athf.a(locale).c[i];
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String m(int i, Locale locale) {
        return athf.a(locale).b[i];
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.b.d;
    }

    @Override // defpackage.athq
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) athf.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new atgg(atfy.m, str);
    }
}
