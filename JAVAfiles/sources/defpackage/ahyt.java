package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahyt implements Parcelable {
    public final aiav a;
    public final aiav b;
    public final aiav c;
    public final aiav d;

    public ahyt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyt) {
            ahyt ahytVar = (ahyt) obj;
            if (this.a.equals(ahytVar.a) && this.b.equals(ahytVar.b) && this.c.equals(ahytVar.c) && this.d.equals(ahytVar.d)) {
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
        return "AccessibilityOptions{wheelchairAccessibleParking=" + this.a.toString() + ", wheelchairAccessibleEntrance=" + aiavVar3.toString() + ", wheelchairAccessibleRestroom=" + aiavVar2.toString() + ", wheelchairAccessibleSeating=" + aiavVar.toString() + "}";
    }

    public ahyt(aiav aiavVar, aiav aiavVar2, aiav aiavVar3, aiav aiavVar4) {
        if (aiavVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
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
                throw new NullPointerException("Null wheelchairAccessibleSeating");
            }
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        throw new NullPointerException("Null wheelchairAccessibleEntrance");
    }
}
