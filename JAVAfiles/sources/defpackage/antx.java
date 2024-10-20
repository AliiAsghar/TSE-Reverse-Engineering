package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antx {
    public final Class a;
    public anty d;
    public Map b = new HashMap();
    public final List c = new ArrayList();
    public anth e = anth.a;

    public antx(Class cls) {
        this.a = cls;
    }

    public final void a(Object obj, anxh anxhVar, boolean z) {
        byte[] c;
        int i;
        if (this.b != null) {
            int Z = a.Z(anxhVar.d);
            if (Z != 0 && Z == 3) {
                anxp b = anxp.b(anxhVar.f);
                if (b == null) {
                    b = anxp.UNRECOGNIZED;
                }
                int ordinal = b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            c = anms.a;
                        }
                    }
                    c = antr.a(anxhVar.e).c();
                } else {
                    c = antr.b(anxhVar.e).c();
                }
                aocj b2 = aocj.b(c);
                int Z2 = a.Z(anxhVar.d);
                if (Z2 == 0) {
                    i = 1;
                } else {
                    i = Z2;
                }
                anxp b3 = anxp.b(anxhVar.f);
                if (b3 == null) {
                    b3 = anxp.UNRECOGNIZED;
                }
                anxp anxpVar = b3;
                int i2 = anxhVar.e;
                anxf anxfVar = anxhVar.c;
                if (anxfVar == null) {
                    anxfVar = anxf.a;
                }
                anty antyVar = new anty(obj, b2, i, anxpVar, i2, anxfVar.b);
                Map map = this.b;
                List list = this.c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(antyVar);
                List list2 = (List) map.put(antyVar.b, DesugarCollections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(antyVar);
                    map.put(antyVar.b, DesugarCollections.unmodifiableList(arrayList2));
                }
                list.add(antyVar);
                if (z) {
                    if (this.d == null) {
                        this.d = antyVar;
                        return;
                    }
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                return;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }
}
