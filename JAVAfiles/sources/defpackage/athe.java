package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athe extends athq {
    private final atgv a;

    public athe(atgv atgvVar) {
        super(atfy.b);
        this.a = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        if (this.a.Y(j) <= 0) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int b(Locale locale) {
        return athf.a(locale).j;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 1;
    }

    @Override // defpackage.atfw
    public final int d() {
        return 0;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ae(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, i, 0, 1);
        if (a(j) != i) {
            return this.a.ae(j, -this.a.Y(j));
        }
        return j;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) athf.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new atgg(atfy.b, str);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String m(int i, Locale locale) {
        return athf.a(locale).a[i];
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd q() {
        return atif.h(atgf.a);
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return null;
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
