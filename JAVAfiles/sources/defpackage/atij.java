package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atij implements atjg, atje {
    private final char a;

    public atij(char c) {
        this.a = c;
    }

    @Override // defpackage.atje
    public final int a() {
        return 1;
    }

    @Override // defpackage.atjg
    public final int b() {
        return 1;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        if (charAt != c && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(c)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
            return ~i;
        }
        return i + 1;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        appendable.append(this.a);
    }
}
