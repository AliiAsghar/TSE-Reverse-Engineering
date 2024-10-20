package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqo {
    public final String a;
    public final String b;
    public final String c;
    public final qqp d;
    public final amqv e;
    public final amqy f;

    public qqo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        qqp qqpVar;
        amqv amqvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqo) {
            qqo qqoVar = (qqo) obj;
            if (this.a.equals(qqoVar.a) && this.b.equals(qqoVar.b) && this.c.equals(qqoVar.c) && ((qqpVar = this.d) != null ? qqpVar.equals(qqoVar.d) : qqoVar.d == null) && ((amqvVar = this.e) != null ? amqvVar.equals(qqoVar.e) : qqoVar.e == null)) {
                amqy amqyVar = this.f;
                amqy amqyVar2 = qqoVar.f;
                if (amqyVar != null ? amqyVar.equals(amqyVar2) : amqyVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        qqp qqpVar = this.d;
        int i = 0;
        if (qqpVar == null) {
            hashCode = 0;
        } else {
            hashCode = qqpVar.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        amqv amqvVar = this.e;
        if (amqvVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = amqvVar.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        amqy amqyVar = this.f;
        if (amqyVar != null) {
            i = amqyVar.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        amqy amqyVar = this.f;
        amqv amqvVar = this.e;
        return "AnonymizedDestination{deviceCountry=" + this.a + ", rawAnonymizedWithExplicitCountryCode=" + this.b + ", rawAnonymizedWithAnonymizedCountryCode=" + this.c + ", phoneAnonymizationResult=" + String.valueOf(this.d) + ", anonymizedBotInfo=" + String.valueOf(amqvVar) + ", anonymizedRcsGroupInfo=" + String.valueOf(amqyVar) + "}";
    }

    public qqo(String str, String str2, String str3, qqp qqpVar, amqv amqvVar, amqy amqyVar) {
        if (str == null) {
            throw new NullPointerException("Null deviceCountry");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qqpVar;
        this.e = amqvVar;
        this.f = amqyVar;
    }
}
