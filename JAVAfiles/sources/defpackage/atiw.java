package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atiw extends atio {
    public atiw(atfy atfyVar, int i, boolean z) {
        super(atfyVar, i, z);
    }

    @Override // defpackage.atjg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        try {
            atjc.d(appendable, this.a.a(atfuVar).a(j));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
