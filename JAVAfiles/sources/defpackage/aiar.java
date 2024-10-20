package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiar implements Parcelable {
    public final aiav a;
    public final aiav b;
    public final aiav c;
    public final aiav d;

    public aiar() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiar) {
            aiar aiarVar = (aiar) obj;
            if (this.a.equals(aiarVar.a) && this.b.equals(aiarVar.b) && this.c.equals(aiarVar.c) && this.d.equals(aiarVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        aiav aiavVar = this.d;
        aiav aiavVar2 = this.c;
        aiav aiavVar3 = this.b;
        return "PaymentOptions{acceptsCreditCards=" + this.a.toString() + ", acceptsDebitCards=" + aiavVar3.toString() + ", acceptsCashOnly=" + aiavVar2.toString() + ", acceptsNfc=" + aiavVar.toString() + "}";
    }

    public aiar(aiav aiavVar, aiav aiavVar2, aiav aiavVar3, aiav aiavVar4) {
        if (aiavVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.a = aiavVar;
        if (aiavVar2 != null) {
            this.b = aiavVar2;
            if (aiavVar3 != null) {
                this.c = aiavVar3;
                if (aiavVar4 != null) {
                    this.d = aiavVar4;
                    return;
                }
                throw new NullPointerException("Null acceptsNfc");
            }
            throw new NullPointerException("Null acceptsCashOnly");
        }
        throw new NullPointerException("Null acceptsDebitCards");
    }
}
