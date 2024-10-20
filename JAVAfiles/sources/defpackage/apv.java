package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apv extends aqi {
    final /* synthetic */ aqo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apv(aqo aqoVar, int i, int i2, apu apuVar, aqq aqqVar) {
        super(aqoVar, i, i2, apuVar, aqqVar);
        this.a = aqoVar;
    }

    @Override // defpackage.aqi
    public final aqh a(int i, aqf[] aqfVarArr, List list, int i2) {
        return new aqh(i, aqfVarArr, this.a, list, i2);
    }
}
