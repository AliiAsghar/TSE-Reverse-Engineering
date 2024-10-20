package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxi {
    public final Integer a;

    public afxi(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afxi) && d.F(this.a, ((afxi) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ShortcutsScreenArguments(autoLaunchShortcut=" + this.a + ")";
    }

    public afxi() {
        this(null);
    }
}
