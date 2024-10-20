package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class athm extends athq {
    final atfw a;
    final atgc b;
    final atgd c;
    final boolean d;
    final atgd e;
    final atgd f;

    public athm(atfw atfwVar, atgc atgcVar, atgd atgdVar, atgd atgdVar2, atgd atgdVar3) {
        super(atfwVar.p());
        if (atfwVar.u()) {
            this.a = atfwVar;
            this.b = atgcVar;
            this.c = atgdVar;
            this.d = atho.O(atgdVar);
            this.e = atgdVar2;
            this.f = atgdVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int x(long j) {
        int a = this.b.a(j);
        long j2 = a;
        if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return a;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.atfw
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        if (this.d) {
            long x = x(j);
            return this.a.e(j + x, i) - x;
        }
        return this.b.m(this.a.e(this.b.d(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof athm) {
            athm athmVar = (athm) obj;
            if (this.a.equals(athmVar.a) && this.b.equals(athmVar.b) && this.c.equals(athmVar.c) && this.e.equals(athmVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long g(long j) {
        if (this.d) {
            long x = x(j);
            return this.a.g(j + x) - x;
        }
        return this.b.m(this.a.g(this.b.d(j)), j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        long h = this.a.h(this.b.d(j), i);
        long m = this.b.m(h, j);
        if (a(m) == i) {
            return m;
        }
        atgh atghVar = new atgh(h, this.b.c);
        atgg atggVar = new atgg(this.a.p(), Integer.valueOf(i), atghVar.getMessage());
        atggVar.initCause(atghVar);
        throw atggVar;
    }

    public final int hashCode() {
        atgc atgcVar = this.b;
        return atgcVar.hashCode() ^ this.a.hashCode();
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long i(long j, String str, Locale locale) {
        return this.b.m(this.a.i(this.b.d(j), str, locale), j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.d(j), locale);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String m(int i, Locale locale) {
        return this.a.m(i, locale);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final String n(long j, Locale locale) {
        return this.a.n(this.b.d(j), locale);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd q() {
        return this.c;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.f;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.e;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.a.t(this.b.d(j));
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
