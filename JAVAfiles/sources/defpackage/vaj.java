package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vaj {
    public final String a;
    public final alpt b;

    public vaj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vaj) {
            vaj vajVar = (vaj) obj;
            String str = this.a;
            if (str != null ? str.equals(vajVar.a) : vajVar.a == null) {
                if (this.b.equals(vajVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IncomingMessageRecipients{to=" + this.a + ", cc=" + this.b.toString() + "}";
    }

    public vaj(String str, alpt alptVar) {
        this.a = str;
        if (alptVar == null) {
            throw new NullPointerException("Null cc");
        }
        this.b = alptVar;
    }
}
