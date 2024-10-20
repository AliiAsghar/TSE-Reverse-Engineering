package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enc implements gjx {
    @Override // defpackage.gjx
    public final void a(gjz gjzVar) {
        if (gjzVar instanceof eoz) {
            efu aL = ((eoz) gjzVar).aL();
            iba aK = gjzVar.aK();
            Iterator it = aL.y().iterator();
            while (it.hasNext()) {
                eor x = aL.x((String) it.next());
                x.getClass();
                dyv.s(x, aK, gjzVar.N());
            }
            if (!aL.y().isEmpty()) {
                aK.d(enc.class);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
