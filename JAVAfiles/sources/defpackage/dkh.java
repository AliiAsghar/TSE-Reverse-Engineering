package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkh implements dkf {
    private final CharSequence a;
    private final dkg b;

    public dkh(CharSequence charSequence, dkg dkgVar) {
        this.a = charSequence;
        this.b = dkgVar;
    }

    @Override // defpackage.dkf
    public final int b(int i) {
        do {
            i = this.b.a(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dkf
    public final int c(int i) {
        do {
            i = this.b.a(i);
            if (i == -1 || i == this.a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }

    @Override // defpackage.dkf
    public final int e(int i) {
        do {
            i = this.b.b(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dkf
    public final int f(int i) {
        do {
            i = this.b.b(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }
}
