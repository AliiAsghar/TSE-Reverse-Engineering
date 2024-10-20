package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwj extends akwr {
    public final akxm a;
    private volatile transient String b;

    public akwj(akxm akxmVar) {
        if (akxmVar != null) {
            this.a = akxmVar;
            return;
        }
        throw new NullPointerException("Null capability");
    }

    @Override // defpackage.akwr
    public final akxm a() {
        return this.a;
    }

    @Override // defpackage.akwr
    public final String b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = (String) this.a.c().orElseGet(new adpp(this, 9));
                    if (this.b == null) {
                        throw new NullPointerException("getIdentifier() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwr) {
            return this.a.equals(((akwr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IdentifiableActionCapability{capability=" + this.a.toString() + "}";
    }
}
