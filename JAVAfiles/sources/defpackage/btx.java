package defpackage;

import defpackage.abt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btx extends arrp implements arqw<abt.b<btd>, bwj, Integer, aap<Float>> {
    final /* synthetic */ aap a;
    final /* synthetic */ aap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btx(aap aapVar, aap aapVar2) {
        super(3);
        this.a = aapVar;
        this.b = aapVar2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aap aapVar;
        abt.b bVar = (abt.b) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1154662212);
        if (bVar.c(btd.a, btd.b)) {
            aapVar = this.a;
        } else if (!bVar.c(btd.b, btd.a) && !bVar.c(btd.c, btd.b)) {
            aapVar = this.a;
        } else {
            aapVar = this.b;
        }
        bwjVar.q();
        return aapVar;
    }
}
