package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adit {
    public final String a;

    public adit(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof adit) && d.F(this.a, ((adit) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FormattedE164PhoneNumber(e164FormattedNumber=" + this.a + ")";
    }
}
