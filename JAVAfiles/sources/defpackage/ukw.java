package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukw implements uld {
    private static final xze a = xze.g("BugleCms", "CmsKeyTriggers");
    private final nxt b;

    public ukw(nxt nxtVar) {
        this.b = nxtVar;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i != 2) {
                return 24;
            }
            return 48;
        }
        return 20;
    }

    private static String c(int i, int i2, boolean z) {
        Object obj;
        a.p(a.bV(i, "Creating trigger SQL for operation INSERT and type "));
        rzy rzyVar = new rzy();
        rzyVar.i = 1;
        rzyVar.d = 32;
        rzyVar.b = 7;
        rzyVar.h = "key_index";
        rzyVar.c();
        rzyVar.a = a.bV(i, "key_type_");
        rzyVar.b(a.bV(i, "NEW.key_type = "));
        rzyVar.f = i2;
        rzyVar.g = z;
        obj = ulc.a.get();
        if (((Boolean) ((utz) obj).e()).booleanValue()) {
            rzyVar.b("NEW.cms_id IS NULL");
        }
        return rzyVar.a();
    }

    @Override // defpackage.uld
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c(1, b(1), this.b.a()));
        arrayList.add(c(3, b(3), this.b.a()));
        arrayList.add(c(2, b(2), this.b.a()));
        boolean a2 = this.b.a();
        a.p("Creating trigger SQL for delete object");
        rzy rzyVar = new rzy();
        rzyVar.i = 3;
        rzyVar.d = 32;
        rzyVar.b = 7;
        rzyVar.h = "cms_id";
        rzyVar.c();
        rzyVar.f = 2;
        rzyVar.b("OLD.cms_id IS NOT NULL");
        rzyVar.g = a2;
        arrayList.add(rzyVar.a());
        return arrayList;
    }
}
