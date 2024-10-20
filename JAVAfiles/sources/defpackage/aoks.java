package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoks {
    public final boolean a;
    public final aokt b;
    public final int c;
    private final int d;

    public aoks() {
        throw null;
    }

    public final boolean equals(Object obj) {
        aokt aoktVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoks) {
            aoks aoksVar = (aoks) obj;
            if (this.a == aoksVar.a && this.d == aoksVar.d && ((aoktVar = this.b) != null ? aoktVar.equals(aoksVar.b) : aoksVar.b == null) && this.c == aoksVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        aokt aoktVar = this.b;
        if (aoktVar == null) {
            hashCode = 0;
        } else {
            hashCode = aoktVar.hashCode();
        }
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ ((((((((((((i ^ 583896283) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.d) * 1525764945)) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "CronetConfig{context=null, storagePath=null, enableQuic=" + this.a + ", enableBrotli=false, enableCertificateCache=false, enableHttpCache=false, enableNetworkQualityEstimator=false, diskCacheSizeBytes=" + this.d + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=null, cronetEngineBuilderFactory=" + String.valueOf(this.b) + ", threadPriority=" + this.c + "}";
    }

    public aoks(aokt aoktVar) {
        this.a = true;
        this.d = 1000;
        this.b = aoktVar;
        this.c = 20;
    }
}
