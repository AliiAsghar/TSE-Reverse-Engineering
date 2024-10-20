package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpl {
    public static final gpl a = new gpl(0);
    public static final gpl b = new gpl(1);
    private final int c;

    private gpl(int i) {
        this.c = i;
    }

    public final String toString() {
        if (this.c != 0) {
            return "JUMP_CUT";
        }
        return "DEFAULT";
    }
}
