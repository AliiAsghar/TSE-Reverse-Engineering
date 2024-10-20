package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwy {
    public final apbt a;
    public final aozs b;

    public aiwy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiwy) {
            aiwy aiwyVar = (aiwy) obj;
            if (this.a.equals(aiwyVar.a) && this.b.equals(aiwyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aozs aozsVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + aozsVar.toString() + "}";
    }

    public aiwy(apbt apbtVar, aozs aozsVar) {
        if (apbtVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = apbtVar;
        if (aozsVar != null) {
            this.b = aozsVar;
            return;
        }
        throw new NullPointerException("Null extensionRegistryLite");
    }
}
