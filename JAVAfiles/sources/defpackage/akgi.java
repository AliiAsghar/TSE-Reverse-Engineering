package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgi {
    public static final akgh a = new akgh<Object>() { // from class: akgi.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.akgh
        public final void b() {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.akgh
        public final void c(Object obj) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }
    };
    public final long b;
    public final akgh c;
    public final boolean d;
    public final algw e;
    public final algw f;

    public akgi() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akgi a(akfq akfqVar) {
        return new akgi(this.b, this.c, this.d, algw.i(akfqVar), algw.i(akfqVar));
    }

    public final akgi b(boolean z) {
        boolean z2;
        albo.U(this.c instanceof akey, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        if (z != this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.U(z2, "Double-open or double-close on background fetch callbacks.");
        algw algwVar = this.f;
        algw algwVar2 = this.e;
        return new akgi(this.b, this.c, z, algwVar2, algwVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akgi) {
            akgi akgiVar = (akgi) obj;
            if (this.b == akgiVar.b && this.c.equals(akgiVar.c) && this.d == akgiVar.d && this.e.equals(akgiVar.e) && this.f.equals(akgiVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.b;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        algw algwVar = this.f;
        algw algwVar2 = this.e;
        return "SubscriptionCallbacksState{index=" + this.b + ", callbacks=" + this.c.toString() + ", openBackgroundFetch=" + this.d + ", maybeTopicData=" + String.valueOf(algwVar2) + ", maybeInstanceData=" + String.valueOf(algwVar) + "}";
    }

    public akgi(long j, akgh akghVar, boolean z, algw algwVar, algw algwVar2) {
        this.b = j;
        if (akghVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.c = akghVar;
        this.d = z;
        if (algwVar != null) {
            this.e = algwVar;
            if (algwVar2 != null) {
                this.f = algwVar2;
                return;
            }
            throw new NullPointerException("Null maybeInstanceData");
        }
        throw new NullPointerException("Null maybeTopicData");
    }
}
