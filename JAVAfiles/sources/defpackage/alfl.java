package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alfl extends alfw {
    static final algc a = new alfl();

    private alfl() {
        super("CharMatcher.any()");
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        return true;
    }

    @Override // defpackage.algc
    public final int d(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.algc
    public final int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        albo.ae(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.alfq, defpackage.algc
    public final algc f() {
        return alfz.a;
    }

    @Override // defpackage.algc
    public final boolean h(CharSequence charSequence) {
        charSequence.getClass();
        return true;
    }

    @Override // defpackage.algc
    public final boolean i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.algc
    public final algc g(algc algcVar) {
        return this;
    }
}
