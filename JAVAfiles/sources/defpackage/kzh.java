package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzh {
    public final alor a;
    public final Integer b;
    public final ngh c;
    private final Integer d = null;

    public kzh(alor alorVar, Integer num, ngh nghVar) {
        this.a = alorVar;
        this.b = num;
        this.c = nghVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzh)) {
            return false;
        }
        kzh kzhVar = (kzh) obj;
        Integer num = kzhVar.d;
        if (d.F(null, null) && d.F(this.a, kzhVar.a) && d.F(this.b, kzhVar.b) && this.c == kzhVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ngh nghVar = this.c;
        if (nghVar != null) {
            i = nghVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ConversationListItemViewAsyncData(testField=null, typingIndicatorData=" + this.a + ", groupUpgradeCounter=" + this.b + ", rcsAvailability=" + this.c + ")";
    }
}
