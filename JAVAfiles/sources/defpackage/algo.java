package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algo extends algd implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public algo(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.algd
    public final ahlp a(CharSequence charSequence) {
        return new ahlp(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
