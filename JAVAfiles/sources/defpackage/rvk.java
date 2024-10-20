package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvk extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler");
    public final armf b;
    public final anen c;
    public final anen d;
    public final armf e;
    public final armf f;
    private final armf g;

    public rvk(armf armfVar, armf armfVar2, anen anenVar, anen anenVar2, armf armfVar3, armf armfVar4) {
        this.b = armfVar;
        this.g = armfVar2;
        this.c = anenVar;
        this.d = anenVar2;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DataUpgradeHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        armf armfVar = this.g;
        akul ag = aktp.ag(null);
        ArrayList arrayList = new ArrayList(((Map) armfVar.b()).values());
        Collections.shuffle(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ag = ag.i(new qdl(this, (rvm) arrayList.get(i), 19), this.c);
        }
        return ag.h(new rgh(3), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }
}
