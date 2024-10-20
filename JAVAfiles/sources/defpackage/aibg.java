package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibg implements Parcelable {
    public final aiaj a;
    public final boolean b;

    public aibg() {
        throw null;
    }

    public static aibf a(aiaj aiajVar) {
        aibf aibfVar = new aibf();
        aibfVar.c = aiajVar;
        aibfVar.b(false);
        return aibfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibg) {
            aibg aibgVar = (aibg) obj;
            if (this.a.equals(aibgVar.a) && this.b == aibgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "SpecialDay{date=" + this.a.toString() + ", exceptional=" + this.b + "}";
    }

    public aibg(aiaj aiajVar, boolean z) {
        if (aiajVar == null) {
            throw new NullPointerException("Null date");
        }
        this.a = aiajVar;
        this.b = z;
    }
}
