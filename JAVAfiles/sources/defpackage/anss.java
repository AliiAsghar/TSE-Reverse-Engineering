package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class anss {
    final long[] a;
    final long[] b;
    final long[] c;

    public anss(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(anss anssVar, int i) {
        ansr.a(this.a, anssVar.a, i);
        ansr.a(this.b, anssVar.b, i);
        ansr.a(this.c, anssVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    anss() {
        this(new long[10], new long[10], new long[10]);
    }

    public anss(anss anssVar) {
        this.a = Arrays.copyOf(anssVar.a, 10);
        this.b = Arrays.copyOf(anssVar.b, 10);
        this.c = Arrays.copyOf(anssVar.c, 10);
    }
}
