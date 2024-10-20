package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoee> CREATOR = new ajuw(13);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final aoed e;
    public final String f;
    public final Bundle g;

    public aoee(String str, String str2, String str3, String str4, aoed aoedVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aoedVar;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        albo.C(classLoader);
        this.g.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        if (this.d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ metadata: '");
            sb.append(this.e.toString());
            sb.append("' } ");
        }
        if (this.f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f);
            sb.append("' } ");
        }
        if (!this.g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.g);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.t(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
