package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atiq implements atjg, atje {
    private final String a;

    public atiq(String str) {
        this.a = str;
    }

    @Override // defpackage.atje
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.atjg
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        if (atix.d(charSequence, i, this.a)) {
            return i + this.a.length();
        }
        return ~i;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        appendable.append(this.a);
    }
}
