package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibi implements Parcelable {
    public final aiaj a;
    public final aiac b;
    public final aiak c;
    public final boolean d;

    public aibi() {
        throw null;
    }

    public static ajyt a(aiac aiacVar, aiak aiakVar) {
        ajyt ajytVar = new ajyt();
        if (aiacVar != null) {
            ajytVar.c = aiacVar;
            ajytVar.d = aiakVar;
            ajytVar.m(false);
            return ajytVar;
        }
        throw new NullPointerException("Null day");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibi) {
            aibi aibiVar = (aibi) obj;
            aiaj aiajVar = this.a;
            if (aiajVar != null ? aiajVar.equals(aibiVar.a) : aibiVar.a == null) {
                if (this.b.equals(aibiVar.b) && this.c.equals(aibiVar.c) && this.d == aibiVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        aiaj aiajVar = this.a;
        if (aiajVar == null) {
            hashCode = 0;
        } else {
            hashCode = aiajVar.hashCode();
        }
        int hashCode2 = ((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode2 * 1000003) ^ i;
    }

    public final String toString() {
        aiak aiakVar = this.c;
        aiac aiacVar = this.b;
        return "TimeOfWeek{date=" + String.valueOf(this.a) + ", day=" + aiacVar.toString() + ", time=" + aiakVar.toString() + ", truncated=" + this.d + "}";
    }

    public aibi(aiaj aiajVar, aiac aiacVar, aiak aiakVar, boolean z) {
        this.a = aiajVar;
        if (aiacVar == null) {
            throw new NullPointerException("Null day");
        }
        this.b = aiacVar;
        if (aiakVar != null) {
            this.c = aiakVar;
            this.d = z;
            return;
        }
        throw new NullPointerException("Null time");
    }
}
