package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aias implements Parcelable {
    public final aibi a;
    public final aibi b;

    public aias() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aias) {
            aias aiasVar = (aias) obj;
            aibi aibiVar = this.a;
            if (aibiVar != null ? aibiVar.equals(aiasVar.a) : aiasVar.a == null) {
                aibi aibiVar2 = this.b;
                aibi aibiVar3 = aiasVar.b;
                if (aibiVar2 != null ? aibiVar2.equals(aibiVar3) : aibiVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aibi aibiVar = this.a;
        int i = 0;
        if (aibiVar == null) {
            hashCode = 0;
        } else {
            hashCode = aibiVar.hashCode();
        }
        aibi aibiVar2 = this.b;
        if (aibiVar2 != null) {
            i = aibiVar2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        aibi aibiVar = this.b;
        return "Period{open=" + String.valueOf(this.a) + ", close=" + String.valueOf(aibiVar) + "}";
    }

    public aias(aibi aibiVar, aibi aibiVar2) {
        this.a = aibiVar;
        this.b = aibiVar2;
    }
}
