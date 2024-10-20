package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlw {
    public final boolean a;
    private final alog b;

    public ahlw() {
        throw null;
    }

    public final alog a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahlw) {
            ahlw ahlwVar = (ahlw) obj;
            if (this.a == ahlwVar.a && alzz.at(this.b, ahlwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public ahlw(boolean z, alog alogVar) {
        this.a = z;
        if (alogVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = alogVar;
    }
}
