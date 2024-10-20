package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atiy implements Comparable {
    atfw a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(atiy atiyVar) {
        atfw atfwVar = atiyVar.a;
        int a = atja.a(this.a.s(), atfwVar.s());
        if (a != 0) {
            return a;
        }
        return atja.a(this.a.q(), atfwVar.q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b(long j, boolean z) {
        long i;
        String str = this.c;
        if (str == null) {
            i = this.a.j(j, this.b);
        } else {
            i = this.a.i(j, str, this.d);
        }
        if (z) {
            return this.a.g(i);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(atfw atfwVar, int i) {
        this.a = atfwVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
