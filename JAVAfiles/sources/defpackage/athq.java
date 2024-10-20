package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class athq extends atfw {
    public final atfy g;

    /* JADX INFO: Access modifiers changed from: protected */
    public athq(atfy atfyVar) {
        if (atfyVar != null) {
            this.g = atfyVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // defpackage.atfw
    public abstract int a(long j);

    @Override // defpackage.atfw
    public int b(Locale locale) {
        int c = c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    @Override // defpackage.atfw
    public abstract int c();

    @Override // defpackage.atfw
    public long e(long j, int i) {
        return q().a(j, i);
    }

    @Override // defpackage.atfw
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.atfw
    public abstract long g(long j);

    @Override // defpackage.atfw
    public abstract long h(long j, int i);

    @Override // defpackage.atfw
    public long i(long j, String str, Locale locale) {
        return h(j, y(str, locale));
    }

    @Override // defpackage.atfw
    public String k(int i, Locale locale) {
        return m(i, locale);
    }

    @Override // defpackage.atfw
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.atfw
    public String m(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.atfw
    public String n(long j, Locale locale) {
        return m(a(j), locale);
    }

    @Override // defpackage.atfw
    public final String o() {
        return this.g.y;
    }

    @Override // defpackage.atfw
    public final atfy p() {
        return this.g;
    }

    @Override // defpackage.atfw
    public abstract atgd q();

    @Override // defpackage.atfw
    public atgd r() {
        return null;
    }

    @Override // defpackage.atfw
    public boolean t(long j) {
        return false;
    }

    public final String toString() {
        return "DateTimeField[" + o() + "]";
    }

    @Override // defpackage.atfw
    public final boolean u() {
        return true;
    }

    public int w(long j) {
        return c();
    }

    protected int y(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new atgg(this.g, str);
        }
    }
}
