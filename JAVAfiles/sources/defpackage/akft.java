package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akft {
    public final ListenableFuture a;
    public final Object b;
    public final algk c;

    public akft() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akft) {
            akft akftVar = (akft) obj;
            if (this.a.equals(akftVar.a) && this.b.equals(akftVar.b)) {
                algk algkVar = this.c;
                algk algkVar2 = akftVar.c;
                if (algkVar != null ? algkVar.equals(algkVar2) : algkVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        algk algkVar = this.c;
        if (algkVar == null) {
            hashCode = 0;
        } else {
            hashCode = algkVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        algk algkVar = this.c;
        Object obj = this.b;
        return "Mutation{future=" + String.valueOf(this.a) + ", key=" + String.valueOf(obj) + ", localOptimisticTransform=" + String.valueOf(algkVar) + "}";
    }

    public akft(ListenableFuture listenableFuture, Object obj, algk algkVar) {
        this.a = listenableFuture;
        this.b = obj;
        this.c = algkVar;
    }
}
