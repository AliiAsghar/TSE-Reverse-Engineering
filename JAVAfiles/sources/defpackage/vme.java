package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vme implements vlf {
    final /* synthetic */ vmf a;

    public vme(vmf vmfVar) {
        this.a = vmfVar;
    }

    @Override // defpackage.vlf
    public final /* bridge */ /* synthetic */ vla a(Object obj) {
        vmq vmqVar = (vmq) obj;
        aozy createBuilder = vla.a.createBuilder();
        vlm vlmVar = vlm.NT_INCOMING_MESSAGE;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vla vlaVar = (vla) apagVar;
        vlaVar.e = vlmVar.i;
        vlaVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        vla vlaVar2 = (vla) createBuilder.b;
        vmqVar.getClass();
        vlaVar2.d = vmqVar;
        vlaVar2.c = 3;
        return (vla) createBuilder.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vlf
    public final alog b(alog alogVar) {
        int i;
        d.s(!alogVar.isEmpty());
        aozy createBuilder = vla.a.createBuilder();
        int i2 = 0;
        vlm b = vlm.b(((vla) alogVar.get(0)).e);
        if (b == null) {
            b = vlm.NT_UNKNOWN;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vla vlaVar = (vla) createBuilder.b;
        vlaVar.e = b.i;
        vlaVar.b |= 1;
        boolean allMatch = Collection.EL.stream(alogVar).allMatch(new vmc(4));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vla vlaVar2 = (vla) createBuilder.b;
        vlaVar2.b |= 2;
        vlaVar2.f = allMatch;
        alog alogVar2 = (alog) Collection.EL.stream(alogVar).filter(new vmc(5)).map(new vmd(0)).collect(alls.a);
        aozy createBuilder2 = vmq.a.createBuilder();
        boolean anyMatch = Collection.EL.stream(alogVar2).anyMatch(new vmc(0));
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        vmq vmqVar = (vmq) createBuilder2.b;
        vmqVar.b |= 2;
        vmqVar.e = anyMatch;
        boolean anyMatch2 = Collection.EL.stream(alogVar2).anyMatch(new vmc(2));
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        vmq vmqVar2 = (vmq) createBuilder2.b;
        vmqVar2.b |= 1;
        vmqVar2.d = anyMatch2;
        if (((pld) this.a.s.b()).a()) {
            boolean anyMatch3 = Collection.EL.stream(alogVar2).anyMatch(new vmc(3));
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            vmq vmqVar3 = (vmq) createBuilder2.b;
            vmqVar3.b = 4 | vmqVar3.b;
            vmqVar3.f = anyMatch3;
        }
        HashMap hashMap = new HashMap();
        int size = alogVar2.size();
        while (i2 < size) {
            Iterator it = DesugarCollections.unmodifiableMap(((vmq) alogVar2.get(i2)).c).entrySet().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    aozy builder = ((vmn) entry.getValue()).toBuilder();
                    vmn vmnVar = (vmn) hashMap.get(entry.getKey());
                    if (vmnVar != null) {
                        long min = Math.min(((vmn) builder.b).c, vmnVar.c);
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        vmn vmnVar2 = (vmn) builder.b;
                        vmnVar2.b |= 1;
                        vmnVar2.c = min;
                    }
                    hashMap.put((String) entry.getKey(), (vmn) builder.s());
                }
            }
            i2 = i;
        }
        createBuilder2.U(alor.j(hashMap));
        vmq vmqVar4 = (vmq) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vla vlaVar3 = (vla) createBuilder.b;
        vmqVar4.getClass();
        vlaVar3.d = vmqVar4;
        vlaVar3.c = 3;
        return alog.r((vla) createBuilder.s());
    }

    @Override // defpackage.vlf
    public final /* synthetic */ Object c(vla vlaVar) {
        if (vlaVar.c == 3) {
            return (vmq) vlaVar.d;
        }
        return vmq.a;
    }
}
