package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upm {
    public final boolean a;
    public final boolean b;
    public final alog c;
    public final boolean d;
    public final Bundle e;

    public upm() {
        throw null;
    }

    public static upl a() {
        upl uplVar = new upl();
        uplVar.d(false);
        return uplVar;
    }

    public static upm b() {
        upl uplVar = new upl();
        uplVar.b(true);
        uplVar.c(false);
        uplVar.d(false);
        return uplVar.a();
    }

    public static upm c(alog alogVar) {
        upl a = a();
        a.b(true);
        a.c(false);
        a.a = alogVar;
        return a.a();
    }

    public static upm d() {
        upl a = a();
        a.b(false);
        a.c(false);
        a.d(false);
        return a.a();
    }

    public static upm e() {
        upl a = a();
        a.b(false);
        a.c(true);
        a.d(false);
        return a.a();
    }

    public static upm f() {
        upl a = a();
        a.b(false);
        a.c(true);
        a.d(true);
        return a.a();
    }

    public final boolean equals(Object obj) {
        alog alogVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof upm) {
            upm upmVar = (upm) obj;
            if (this.a == upmVar.a && this.b == upmVar.b && ((alogVar = this.c) != null ? alzz.at(alogVar, upmVar.c) : upmVar.c == null) && this.d == upmVar.d) {
                Bundle bundle = this.e;
                Bundle bundle2 = upmVar.e;
                if (bundle != null ? bundle.equals(bundle2) : bundle2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        alog alogVar = this.c;
        int i3 = 0;
        if (alogVar == null) {
            hashCode = 0;
        } else {
            hashCode = alogVar.hashCode();
        }
        int i4 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = hashCode ^ ((((i ^ 1000003) * 1000003) ^ i2) * 1000003);
        if (true == this.d) {
            i4 = 1231;
        }
        int i6 = ((i5 * (-721379959)) ^ i4) * 1000003;
        Bundle bundle = this.e;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return i6 ^ i3;
    }

    public final String toString() {
        Bundle bundle = this.e;
        return "WorkQueueResult{completed=" + this.a + ", retryable=" + this.b + ", newRequests=" + String.valueOf(this.c) + ", error=null, skipped=" + this.d + ", extras=" + String.valueOf(bundle) + "}";
    }

    public upm(boolean z, boolean z2, alog alogVar, boolean z3, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = alogVar;
        this.d = z3;
        this.e = bundle;
    }
}
