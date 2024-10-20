package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfi implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;

    public rfi(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.m = armfVar13;
    }

    public final /* bridge */ /* synthetic */ Action a(int i) {
        yjy yjyVar = (yjy) this.d.b();
        yjyVar.getClass();
        yjr yjrVar = (yjr) this.e.b();
        yjrVar.getClass();
        wyt wytVar = (wyt) this.f.b();
        wytVar.getClass();
        mce mceVar = (mce) this.g.b();
        mceVar.getClass();
        vjs vjsVar = (vjs) this.h.b();
        vjsVar.getClass();
        vjs vjsVar2 = (vjs) this.i.b();
        vjsVar2.getClass();
        uhj uhjVar = (uhj) this.j.b();
        uhjVar.getClass();
        agnq agnqVar = (agnq) this.k.b();
        agnqVar.getClass();
        Context context = (Context) this.m.b();
        context.getClass();
        return new RemoveSelfNumberFromConversationsAction(this.a, this.b, this.c, yjyVar, yjrVar, wytVar, mceVar, vjsVar, vjsVar2, uhjVar, agnqVar, this.l, context, i);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        yjy yjyVar = (yjy) this.d.b();
        yjyVar.getClass();
        yjr yjrVar = (yjr) this.e.b();
        yjrVar.getClass();
        wyt wytVar = (wyt) this.f.b();
        wytVar.getClass();
        mce mceVar = (mce) this.g.b();
        mceVar.getClass();
        vjs vjsVar = (vjs) this.h.b();
        vjsVar.getClass();
        vjs vjsVar2 = (vjs) this.i.b();
        vjsVar2.getClass();
        uhj uhjVar = (uhj) this.j.b();
        uhjVar.getClass();
        agnq agnqVar = (agnq) this.k.b();
        agnqVar.getClass();
        Context context = (Context) this.m.b();
        context.getClass();
        parcel.getClass();
        return new RemoveSelfNumberFromConversationsAction(this.a, this.b, this.c, yjyVar, yjrVar, wytVar, mceVar, vjsVar, vjsVar2, uhjVar, agnqVar, this.l, context, parcel);
    }
}
