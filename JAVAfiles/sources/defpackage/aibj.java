package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibj implements ahys {
    public final Integer a;
    public final Integer b;
    public final aiau c;
    private final adae d;

    public aibj() {
        throw null;
    }

    public static aibn b(aiau aiauVar) {
        aibn aibnVar = new aibn();
        if (aiauVar != null) {
            aibnVar.a = aiauVar;
            return aibnVar;
        }
        throw new NullPointerException("Null photoMetadata");
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibj) {
            aibj aibjVar = (aibj) obj;
            Integer num = this.a;
            if (num != null ? num.equals(aibjVar.a) : aibjVar.a == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(aibjVar.b) : aibjVar.b == null) {
                    if (this.c.equals(aibjVar.c)) {
                        adae adaeVar = this.d;
                        adae adaeVar2 = aibjVar.d;
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
        return "FetchPhotoRequest{maxWidth=" + this.a + ", maxHeight=" + this.b + ", photoMetadata=" + String.valueOf(this.c) + ", cancellationToken=" + String.valueOf(adaeVar) + "}";
    }

    public aibj(Integer num, Integer num2, aiau aiauVar, adae adaeVar) {
        this.a = num;
        this.b = num2;
        this.c = aiauVar;
        this.d = adaeVar;
    }
}
