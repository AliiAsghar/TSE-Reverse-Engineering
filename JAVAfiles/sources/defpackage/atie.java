package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atie extends atfw implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final atfy b;
    private final atgd c;

    private atie(atfy atfyVar, atgd atgdVar) {
        if (atgdVar != null) {
            this.b = atfyVar;
            this.c = atgdVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private Object readResolve() {
        return w(this.b, this.c);
    }

    public static synchronized atie w(atfy atfyVar, atgd atgdVar) {
        synchronized (atie.class) {
            HashMap hashMap = a;
            atie atieVar = null;
            if (hashMap == null) {
                a = new HashMap(7);
            } else {
                atie atieVar2 = (atie) hashMap.get(atfyVar);
                if (atieVar2 == null || atieVar2.c == atgdVar) {
                    atieVar = atieVar2;
                }
            }
            if (atieVar == null) {
                atie atieVar3 = new atie(atfyVar, atgdVar);
                a.put(atfyVar, atieVar3);
                return atieVar3;
            }
            return atieVar;
        }
    }

    private final UnsupportedOperationException x() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.atfw
    public final int a(long j) {
        throw x();
    }

    @Override // defpackage.atfw
    public final int b(Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final int c() {
        throw x();
    }

    @Override // defpackage.atfw
    public final int d() {
        throw x();
    }

    @Override // defpackage.atfw
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.atfw
    public final long f(long j) {
        throw x();
    }

    @Override // defpackage.atfw
    public final long g(long j) {
        throw x();
    }

    @Override // defpackage.atfw
    public final long h(long j, int i) {
        throw x();
    }

    @Override // defpackage.atfw
    public final long i(long j, String str, Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final String k(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final String l(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final String m(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final String n(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.atfw
    public final String o() {
        return this.b.y;
    }

    @Override // defpackage.atfw
    public final atfy p() {
        return this.b;
    }

    @Override // defpackage.atfw
    public final atgd q() {
        return this.c;
    }

    @Override // defpackage.atfw
    public final atgd r() {
        return null;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return null;
    }

    @Override // defpackage.atfw
    public final boolean t(long j) {
        throw x();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.atfw
    public final boolean u() {
        return false;
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
