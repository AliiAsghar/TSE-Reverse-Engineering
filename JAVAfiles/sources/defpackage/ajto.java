package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajto extends ajsv {
    public static final algf a = new ajts();
    public static final algf b = new ajtp();

    @Override // defpackage.ajsv
    public final void b(GroupInformation groupInformation, aozy aozyVar) {
        aozy createBuilder = wed.a.createBuilder();
        String d = groupInformation.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wed wedVar = (wed) createBuilder.b;
        wedVar.b |= 1;
        wedVar.c = d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wbx wbxVar = (wbx) aozyVar.b;
        wed wedVar2 = (wed) createBuilder.s();
        wbx wbxVar2 = wbx.a;
        wedVar2.getClass();
        wbxVar.e = wedVar2;
        wbxVar.b |= 4;
    }

    @Override // defpackage.ajsv
    public final void c(GroupInformation groupInformation, aozy aozyVar) {
        Iterable iterable = (Iterable) Collection.EL.stream(groupInformation.a()).map(new ajqy(5)).collect(Collectors.toList());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wbx wbxVar = (wbx) aozyVar.b;
        wbx wbxVar2 = wbx.a;
        apax apaxVar = wbxVar.f;
        if (!apaxVar.c()) {
            wbxVar.f = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wbxVar.f);
    }

    @Override // defpackage.ajsv
    public final void d(GroupInformation groupInformation, aozy aozyVar) {
        groupInformation.b().ifPresent(new ajpx(aozyVar, 14));
    }

    @Override // defpackage.ajsv
    public final void e(GroupInformation groupInformation, aozy aozyVar) {
        if (groupInformation.c().isPresent()) {
            String f = groupInformation.f();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            wbx wbxVar = (wbx) aozyVar.b;
            wbx wbxVar2 = wbx.a;
            wbxVar.b |= 2;
            wbxVar.d = f;
            return;
        }
        if (!groupInformation.f().isEmpty()) {
            String f2 = groupInformation.f();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            wbx wbxVar3 = (wbx) aozyVar.b;
            wbx wbxVar4 = wbx.a;
            wbxVar3.b |= 2;
            wbxVar3.d = f2;
        }
    }

    @Override // defpackage.ajsv
    public final void f(GroupInformation groupInformation, aozy aozyVar) {
        groupInformation.c().ifPresent(new ajpx(aozyVar, 13));
    }
}
