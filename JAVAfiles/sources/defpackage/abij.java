package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abij {
    private final Integer a;

    public abij() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abij)) {
            return false;
        }
        Integer num = this.a;
        Integer num2 = ((abij) obj).a;
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            return false;
        }
        return num.equals(num2);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }

    public abij(Integer num) {
        this.a = num;
    }
}
