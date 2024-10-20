package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqux {
    public final aquw a;
    public final String b;
    public final String c;
    public final aquv d;
    public final aquv e;
    public final boolean f;

    public aqux(aquw aquwVar, String str, aquv aquvVar, aquv aquvVar2, boolean z) {
        String substring;
        new AtomicReferenceArray(2);
        aquwVar.getClass();
        this.a = aquwVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            substring = null;
        } else {
            substring = str.substring(0, lastIndexOf);
        }
        this.c = substring;
        aquvVar.getClass();
        this.d = aquvVar;
        aquvVar2.getClass();
        this.e = aquvVar2;
        this.f = z;
    }

    public static aquu a() {
        aquu aquuVar = new aquu();
        aquuVar.c = null;
        aquuVar.d = null;
        return aquuVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("fullMethodName", this.b);
        aj.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        aj.h("idempotent", false);
        aj.h("safe", false);
        aj.h("sampledToLocalTracing", this.f);
        aj.b("requestMarshaller", this.d);
        aj.b("responseMarshaller", this.e);
        aj.b("schemaDescriptor", null);
        aj.c();
        return aj.toString();
    }
}
