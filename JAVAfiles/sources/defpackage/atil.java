package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atil extends atip {
    public atil(atfy atfyVar, int i) {
        super(atfyVar, i, false, i);
    }

    @Override // defpackage.atio, defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        char charAt;
        int c = super.c(atjaVar, charSequence, i);
        if (c < 0) {
            return c;
        }
        int i2 = this.b + i;
        if (c != i2) {
            if (this.c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            if (c > i2) {
                return ~(i2 + 1);
            }
            if (c < i2) {
                return ~c;
            }
            return c;
        }
        return c;
    }
}
