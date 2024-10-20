package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whi {
    private final String a;
    private final apjo b;

    public whi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof whi) {
            whi whiVar = (whi) obj;
            if (this.a.equals(whiVar.a) && this.b.equals(whiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return aduy.h("phone_number_record_by_sim_and_msisdn_source_", new algs("_").f(this.a, Integer.valueOf(this.b.d), new Object[0]));
    }

    public whi(String str, apjo apjoVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (apjoVar != null) {
            this.b = apjoVar;
            return;
        }
        throw new NullPointerException("Null msisdnSource");
    }
}
