package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anna {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public anna(int i, hfa hfaVar, hew hewVar, boolean z) {
        this.a = i;
        this.c = hfaVar;
        this.d = hewVar;
        this.b = z;
    }

    public static anna e(char c) {
        return f(new alfs(c));
    }

    public static anna f(algc algcVar) {
        return new anna(new alhj(algcVar, 1));
    }

    public static anna g(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return e(str.charAt(0));
        }
        return new anna(new alhj(str, 0));
    }

    public static anna h(String str) {
        algo algoVar = new algo(Pattern.compile(str));
        albo.N(!((Matcher) algoVar.a("").a).matches(), "The pattern may not match the empty string: %s", algoVar);
        return new anna(new alhj(algoVar, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    private final Iterator q() {
        return almw.a(this.c, this.d).iterator();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Queue] */
    private final void r(eqp eqpVar, int i, int i2) {
        int c;
        dzg.d(this.c.isEmpty());
        dzg.d(this.d.isEmpty());
        for (int i3 = 0; i3 < this.a; i3++) {
            if (this.b) {
                c = ett.c(i, i2, 34842, 5131);
            } else {
                c = ett.c(i, i2, 6408, 5121);
            }
            this.c.add(eqpVar.d(c, i, i2));
        }
    }

    public final Iterable a(CharSequence charSequence) {
        charSequence.getClass();
        return new alhl(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, alhn] */
    public final Iterator b(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator b = b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (b.hasNext()) {
            arrayList.add((String) b.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, alhn] */
    public final anna d() {
        return new anna((alhn) this.c, true, (algc) this.d, this.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, alhn] */
    public final anna i() {
        algc algcVar = algb.b;
        algcVar.getClass();
        return new anna((alhn) this.c, this.b, algcVar, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final int j() {
        if (!p()) {
            return this.a;
        }
        return this.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final eqq k() {
        if (!this.c.isEmpty()) {
            eqq eqqVar = (eqq) this.c.remove();
            this.d.add(eqqVar);
            return eqqVar;
        }
        throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Queue] */
    public final void l() {
        Iterator q = q();
        while (q.hasNext()) {
            ((eqq) q.next()).a();
        }
        this.c.clear();
        this.d.clear();
    }

    public final void m(eqp eqpVar, int i, int i2) {
        if (!p()) {
            r(eqpVar, i, i2);
            return;
        }
        eqq eqqVar = (eqq) q().next();
        if (eqqVar.d == i && eqqVar.e == i2) {
            return;
        }
        l();
        r(eqpVar, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void n() {
        this.c.addAll(this.d);
        this.d.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    public final void o() {
        dzg.d(!this.d.isEmpty());
        this.c.add((eqq) this.d.remove());
    }

    public final boolean p() {
        return q().hasNext();
    }

    public anna(int i, boolean z, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = z;
        this.c = bArr;
        this.d = bArr2;
    }

    public anna(alhn alhnVar, boolean z, algc algcVar, int i) {
        this.c = alhnVar;
        this.b = z;
        this.d = algcVar;
        this.a = i;
    }

    public anna(anme anmeVar, anmx anmxVar, int i, boolean z) {
        this.c = anmeVar;
        this.d = anmxVar;
        this.a = i;
        this.b = z;
    }

    public anna(efu efuVar, efu efuVar2, int i) {
        this.c = efuVar;
        this.d = efuVar2;
        this.a = i;
        this.b = efuVar == efuVar2;
    }

    public anna(String str, String str2, int i, boolean z) {
        this.d = str;
        this.c = str2;
        this.a = i;
        this.b = z;
    }

    private anna(alhn alhnVar) {
        this(alhnVar, false, alfz.a, Integer.MAX_VALUE);
    }

    public anna(boolean z, int i) {
        this.a = i;
        this.b = z;
        this.c = new ArrayDeque(i);
        this.d = new ArrayDeque(i);
    }
}
