package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfn extends alfw {
    public static final algc a = new alfn();

    public alfn() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c <= 127) {
            return true;
        }
        return false;
    }
}
