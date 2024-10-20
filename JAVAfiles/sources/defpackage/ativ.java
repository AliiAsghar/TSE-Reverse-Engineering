package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ativ implements atjg, atje {
    private final atfy a;
    private final int b;
    private final boolean c;

    public ativ(atfy atfyVar, int i, boolean z) {
        this.a = atfyVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.atje
    public final int a() {
        if (this.c) {
            return 4;
        }
        return 2;
    }

    @Override // defpackage.atjg
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0038 A[SYNTHETIC] */
    @Override // defpackage.atje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.atja r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ativ.c(atja, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        int i2;
        try {
            int a = this.a.a(atfuVar).a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        } else {
            atjc.b(appendable, i2, 2);
        }
    }
}
