package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dne {
    public static final boolean a(char c, char c2) {
        if (Character.isHighSurrogate(c) && Character.isLowSurrogate(c2)) {
            return true;
        }
        return false;
    }
}
