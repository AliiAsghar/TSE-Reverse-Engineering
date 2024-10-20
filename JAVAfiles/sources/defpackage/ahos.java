package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahos {
    public final ahka a;
    public final boolean b;
    private final String c;

    public ahos() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ahos a(Activity activity) {
        return new ahos(null, new ahka(activity.getClass().getName()), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        ahka ahkaVar = this.a;
        if (ahkaVar != null) {
            return ahkaVar.a;
        }
        String str = this.c;
        albo.C(str);
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahos)) {
            return false;
        }
        ahos ahosVar = (ahos) obj;
        if (!b().equals(ahosVar.b()) || this.b != ahosVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = b().hashCode() * 31;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "MeasurementKey{rawStringEventName=" + this.c + ", noPiiEventName=" + String.valueOf(this.a) + ", isActivity=" + this.b + "}";
    }

    public ahos(String str, ahka ahkaVar, boolean z) {
        this.c = str;
        this.a = ahkaVar;
        this.b = z;
    }
}
