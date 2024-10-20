package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnc {
    public final int a;
    private final arml b = armd.a(new afjm(this, 10));

    public afnc(int i) {
        this.a = i;
    }

    public final String a() {
        return (String) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afnc) && this.a == ((afnc) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Modifier(raw=" + this.a + ")";
    }
}
