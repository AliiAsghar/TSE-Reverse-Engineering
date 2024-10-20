package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public aodn(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        abhg.i(!abvl.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aodn)) {
            return false;
        }
        aodn aodnVar = (aodn) obj;
        if (!d.B(this.b, aodnVar.b) || !d.B(this.a, aodnVar.a) || !d.B(this.e, aodnVar.e) || !d.B(this.f, aodnVar.f) || !d.B(this.c, aodnVar.c) || !d.B(this.g, aodnVar.g) || !d.B(this.d, aodnVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("applicationId", this.b, arrayList);
        abhg.q("apiKey", this.a, arrayList);
        abhg.q("databaseUrl", this.e, arrayList);
        abhg.q("gcmSenderId", this.c, arrayList);
        abhg.q("storageBucket", this.g, arrayList);
        abhg.q("projectId", this.d, arrayList);
        return abhg.p(arrayList, this);
    }
}
