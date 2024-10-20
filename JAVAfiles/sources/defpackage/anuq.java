package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anuq implements antz {
    public static final anuq a = new anuq();

    private anuq() {
    }

    @Override // defpackage.antz
    public final Class a() {
        return anup.class;
    }

    @Override // defpackage.antz
    public final Class b() {
        return anup.class;
    }

    @Override // defpackage.antz
    public final /* bridge */ /* synthetic */ Object c(atii atiiVar) {
        if (atiiVar.d != null) {
            Iterator it = atiiVar.f().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new anvb((byte[]) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
