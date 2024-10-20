package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfv extends alfw {
    public static final algc a = new alfv();

    private alfv() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c <= 31) {
            return true;
        }
        if (c >= 127 && c <= 159) {
            return true;
        }
        return false;
    }
}
