package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adol implements aijy {
    @Override // defpackage.aijy
    public final void a(aiom aiomVar) {
        if (!((Boolean) adaa.p().a.q.a()).booleanValue()) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        aimz aimzVar = new aimz();
        aimzVar.a = new aina(uuid);
        aiomVar.q(aimzVar);
    }
}
