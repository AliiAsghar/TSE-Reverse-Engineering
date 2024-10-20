package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyz implements Parcelable {
    public static final Parcelable.Creator<ajyz> CREATOR = new ajuw(6);
    private static ajyz d;
    public final boolean a;
    public final boolean b;
    public final Intent c;

    public ajyz() {
        throw null;
    }

    public static ajyz a() {
        ajyz ajyzVar;
        synchronized (ajyz.class) {
            if (d == null) {
                d = new ajyz(true, false, null);
            }
            ajyzVar = d;
        }
        return ajyzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyz) {
            ajyz ajyzVar = (ajyz) obj;
            if (this.a == ajyzVar.a && this.b == ajyzVar.b) {
                Intent intent = this.c;
                Intent intent2 = ajyzVar.c;
                if (intent != null ? intent.equals(intent2) : intent2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Intent intent = this.c;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        return hashCode ^ ((((i ^ 1000003) * 1000003) ^ i2) * 1000003);
    }

    public final String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, 0);
    }

    public ajyz(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }
}
