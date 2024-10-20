package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiaq implements Parcelable {
    public final aiav a;
    public final aiav b;
    public final aiav c;
    public final aiav d;
    public final aiav e;
    public final aiav f;
    public final aiav g;

    public aiaq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiaq) {
            aiaq aiaqVar = (aiaq) obj;
            if (this.a.equals(aiaqVar.a) && this.b.equals(aiaqVar.b) && this.c.equals(aiaqVar.c) && this.d.equals(aiaqVar.d) && this.e.equals(aiaqVar.e) && this.f.equals(aiaqVar.f) && this.g.equals(aiaqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aiav aiavVar = this.g;
        aiav aiavVar2 = this.f;
        aiav aiavVar3 = this.e;
        aiav aiavVar4 = this.d;
        aiav aiavVar5 = this.c;
        aiav aiavVar6 = this.b;
        return "ParkingOptions{freeParkingLot=" + this.a.toString() + ", paidParkingLot=" + aiavVar6.toString() + ", freeStreetParking=" + aiavVar5.toString() + ", paidStreetParking=" + aiavVar4.toString() + ", valetParking=" + aiavVar3.toString() + ", freeGarageParking=" + aiavVar2.toString() + ", paidGarageParking=" + aiavVar.toString() + "}";
    }

    public aiaq(aiav aiavVar, aiav aiavVar2, aiav aiavVar3, aiav aiavVar4, aiav aiavVar5, aiav aiavVar6, aiav aiavVar7) {
        if (aiavVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.a = aiavVar;
        if (aiavVar2 != null) {
            this.b = aiavVar2;
            if (aiavVar3 != null) {
                this.c = aiavVar3;
                if (aiavVar4 != null) {
                    this.d = aiavVar4;
                    if (aiavVar5 != null) {
                        this.e = aiavVar5;
                        if (aiavVar6 != null) {
                            this.f = aiavVar6;
                            if (aiavVar7 != null) {
                                this.g = aiavVar7;
                                return;
                            }
                            throw new NullPointerException("Null paidGarageParking");
                        }
                        throw new NullPointerException("Null freeGarageParking");
                    }
                    throw new NullPointerException("Null valetParking");
                }
                throw new NullPointerException("Null paidStreetParking");
            }
            throw new NullPointerException("Null freeStreetParking");
        }
        throw new NullPointerException("Null paidParkingLot");
    }
}
