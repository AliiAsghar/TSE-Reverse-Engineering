package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibo implements ahys {
    public final Integer a;
    public final Integer b;
    public final aiau c;
    public final adae d;

    public aibo() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibo) {
            aibo aiboVar = (aibo) obj;
            Integer num = this.a;
            if (num != null ? num.equals(aiboVar.a) : aiboVar.a == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(aiboVar.b) : aiboVar.b == null) {
                    if (this.c.equals(aiboVar.c)) {
                        adae adaeVar = this.d;
                        adae adaeVar2 = aiboVar.d;
                        if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode3 = ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.c.hashCode();
        adae adaeVar = this.d;
        if (adaeVar != null) {
            i = adaeVar.hashCode();
        }
        return (hashCode3 * 1000003) ^ i;
    }

    public final String toString() {
        adae adaeVar = this.d;
        return "FetchResolvedPhotoUriRequest{maxWidth=" + this.a + ", maxHeight=" + this.b + ", photoMetadata=" + String.valueOf(this.c) + ", cancellationToken=" + String.valueOf(adaeVar) + "}";
    }

    public aibo(Integer num, Integer num2, aiau aiauVar, adae adaeVar) {
        this.a = num;
        this.b = num2;
        this.c = aiauVar;
        this.d = adaeVar;
    }
}
