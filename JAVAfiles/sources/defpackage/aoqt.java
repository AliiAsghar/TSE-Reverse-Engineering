package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqt extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        try {
            return UUID.fromString(j);
        } catch (IllegalArgumentException e) {
            throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as UUID; at path "), e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        aorpVar.m(uuid);
    }
}
