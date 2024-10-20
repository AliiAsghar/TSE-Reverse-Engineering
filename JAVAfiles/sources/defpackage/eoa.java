package defpackage;

import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class eoa implements enk {
    private final Object a;
    private final emu b;

    public eoa(Object obj) {
        this.a = obj;
        this.b = emw.a.b(obj.getClass());
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        emu emuVar = this.b;
        List list = (List) emuVar.a.get(enfVar);
        Object obj = this.a;
        emu.a(list, enmVar, enfVar, obj);
        emu.a((List) emuVar.a.get(enf.ON_ANY), enmVar, enfVar, obj);
    }
}
