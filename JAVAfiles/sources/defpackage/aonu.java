package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonu extends aoon {
    final /* synthetic */ aoon a;

    public aonu(aoon aoonVar) {
        this.a = aoonVar;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        return new AtomicLong(((Number) this.a.a(aoroVar)).longValue());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        this.a.b(aorpVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
