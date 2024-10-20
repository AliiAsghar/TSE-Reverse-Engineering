package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoiq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoiq> CREATOR = new apdi(1);
    public final Bundle a;
    private Map b;

    public aoiq(Bundle bundle) {
        this.a = bundle;
    }

    private static final int d(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public final int a() {
        String string = this.a.getString("google.original_priority");
        if (string == null) {
            string = this.a.getString("google.priority");
        }
        return d(string);
    }

    public final int b() {
        String string = this.a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.a.getString("google.priority");
        }
        return d(string);
    }

    public final Map c() {
        if (this.b == null) {
            Bundle bundle = this.a;
            tm tmVar = new tm();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        tmVar.put(str, str2);
                    }
                }
            }
            this.b = tmVar;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.t(parcel, 2, this.a);
        abhi.g(parcel, e);
    }
}
