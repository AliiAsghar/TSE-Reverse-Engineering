package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahqw {
    public final ahqv a;
    private long b = 1;

    public ahqw(ahqv ahqvVar) {
        this.a = ahqvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ahqv ahqvVar, long j, ArrayList arrayList) {
        List list;
        if (ahqvVar.f == null) {
            if (ahqvVar.f == null) {
                list = Collections.emptyList();
            } else {
                list = ahqvVar.f;
            }
        } else {
            list = ahqvVar.f;
            ahqvVar.f = null;
        }
        if (!ahqvVar.c() || !list.isEmpty()) {
            apaa apaaVar = (apaa) asij.a.createBuilder();
            int i = ahqvVar.g;
            String str = ahqvVar.b;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar = (asij) apaaVar.b;
            str.getClass();
            asijVar.b |= 1;
            asijVar.c = str;
            long j2 = ahqvVar.c;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar2 = (asij) apaaVar.b;
            asijVar2.b |= 512;
            asijVar2.h = j2;
            long a = ahqvVar.a();
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar3 = (asij) apaaVar.b;
            asijVar3.b |= 1024;
            asijVar3.i = a;
            long j3 = ahqvVar.e;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar4 = (asij) apaaVar.b;
            asijVar4.b |= 4096;
            asijVar4.j = j3;
            long j4 = this.b;
            this.b = 1 + j4;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar5 = (asij) apaaVar.b;
            asijVar5.b |= 8;
            asijVar5.f = j4;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            asij asijVar6 = (asij) apaaVar.b;
            asijVar6.b |= 16;
            asijVar6.g = j;
            int i2 = ahqvVar.h - 1;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (!apaaVar.b.isMutable()) {
                        apaaVar.u();
                    }
                    asij asijVar7 = (asij) apaaVar.b;
                    asijVar7.k = 0;
                    asijVar7.b |= 8192;
                } else {
                    if (!apaaVar.b.isMutable()) {
                        apaaVar.u();
                    }
                    asij asijVar8 = (asij) apaaVar.b;
                    asijVar8.k = 4;
                    asijVar8.b |= 8192;
                }
            } else {
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                asij asijVar9 = (asij) apaaVar.b;
                asijVar9.k = 1;
                asijVar9.b |= 8192;
            }
            if (ahqvVar.c()) {
                long j5 = ((ahqv) list.get(list.size() - 1)).d - ahqvVar.c;
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                asij asijVar10 = (asij) apaaVar.b;
                asijVar10.b |= 1024;
                asijVar10.i = j5;
            }
            arrayList.add((asij) apaaVar.s());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((ahqv) it.next(), ((asij) apaaVar.b).f, arrayList);
            }
        }
    }
}
