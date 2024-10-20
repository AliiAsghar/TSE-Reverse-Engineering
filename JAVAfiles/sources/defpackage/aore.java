package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aore extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        try {
            return new AtomicInteger(aoroVar.c());
        } catch (NumberFormatException e) {
            throw new aook(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.k(((AtomicInteger) obj).get());
    }
}
