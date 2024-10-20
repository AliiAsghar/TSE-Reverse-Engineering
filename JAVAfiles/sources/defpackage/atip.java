package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class atip extends atio {
    protected final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public atip(atfy atfyVar, int i, boolean z, int i2) {
        super(atfyVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.atjg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        try {
            atjc.b(appendable, this.a.a(atfuVar).a(j), this.d);
        } catch (RuntimeException unused) {
            atix.b(appendable, this.d);
        }
    }
}
