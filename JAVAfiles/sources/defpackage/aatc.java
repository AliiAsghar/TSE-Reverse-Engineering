package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aatc {
    public final int c;

    public aatc(int i) {
        this.c = i;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aatc) && this.c == ((aatc) obj).c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }
}
