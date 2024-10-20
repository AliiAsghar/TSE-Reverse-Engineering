package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vaq {
    private final String a;
    private final aoty b;

    public vaq() {
        throw null;
    }

    public static vaq a(String str, aoty aotyVar) {
        albo.N(!str.isEmpty(), "Invalid simId: %s", str);
        return new vaq(str, aotyVar);
    }

    public final String b() {
        return this.a + "." + this.b.name();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vaq) {
            vaq vaqVar = (vaq) obj;
            if (this.a.equals(vaqVar.a) && this.b.equals(vaqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MobileConfigurationId{simId=" + this.a + ", configurationType=" + this.b.toString() + "}";
    }

    public vaq(String str, aoty aotyVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (aotyVar != null) {
            this.b = aotyVar;
            return;
        }
        throw new NullPointerException("Null configurationType");
    }
}
