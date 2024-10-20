package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abob {
    protected final int a;

    public abob() {
        abhg.c(true, "bad alias: %s", 1);
        this.a = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abob)) {
            return false;
        }
        int i = ((abob) obj).a;
        return true;
    }
}
