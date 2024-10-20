package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcw implements rhp {
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
    private final armf n;

    public rcw(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15) {
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
        armfVar14.getClass();
        armfVar15.getClass();
        this.n = armfVar15;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessFileTransferAction c(Parcel parcel) {
        rys rysVar = (rys) this.a.b();
        rysVar.getClass();
        rjm rjmVar = (rjm) this.b.b();
        rjmVar.getClass();
        vjs vjsVar = (vjs) this.c.b();
        vjsVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        mho mhoVar = (mho) this.g.b();
        mhoVar.getClass();
        yjr yjrVar = (yjr) this.h.b();
        yjrVar.getClass();
        agnq agnqVar = (agnq) this.i.b();
        agnqVar.getClass();
        Optional optional = (Optional) ((apxx) this.j).a;
        yyt yytVar = (yyt) this.k.b();
        yytVar.getClass();
        parcel.getClass();
        return new ProcessFileTransferAction(rysVar, rjmVar, vjsVar, this.d, this.e, xnvVar, mhoVar, yjrVar, agnqVar, optional, this.l, yytVar, this.m, this.n, parcel);
    }

    public final ProcessFileTransferAction b(Event event) {
        rys rysVar = (rys) this.a.b();
        rysVar.getClass();
        rjm rjmVar = (rjm) this.b.b();
        rjmVar.getClass();
        vjs vjsVar = (vjs) this.c.b();
        vjsVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        mho mhoVar = (mho) this.g.b();
        mhoVar.getClass();
        yjr yjrVar = (yjr) this.h.b();
        yjrVar.getClass();
        agnq agnqVar = (agnq) this.i.b();
        agnqVar.getClass();
        Optional optional = (Optional) ((apxx) this.j).a;
        yyt yytVar = (yyt) this.k.b();
        yytVar.getClass();
        event.getClass();
        armf armfVar = this.l;
        return new ProcessFileTransferAction(rysVar, rjmVar, vjsVar, this.d, this.e, xnvVar, mhoVar, yjrVar, agnqVar, optional, yytVar, armfVar, this.m, this.n, event);
    }
}
