package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alxj implements alxf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alxf
    public final /* synthetic */ void a(alvz alvzVar, Iterator it, Object obj) {
        alzz.d(alvzVar.b, "non repeating key");
        if (alvzVar.c && alxu.a() > 20) {
            while (it.hasNext()) {
                obj.a(alvzVar.a, it.next());
            }
        } else {
            alvzVar.b(it, obj);
        }
    }
}
