package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alfp extends algc {
    static final algc a = new alfp();

    private alfp() {
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c != ' ' && c != 133 && c != 5760) {
            if (c != 8199) {
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c >= 8192 && c <= 8202) {
                                return true;
                            }
                            break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
