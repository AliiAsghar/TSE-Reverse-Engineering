package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdl implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;

    public rdl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RebuildShortcutsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Optional optional = (Optional) this.b.b();
        optional.getClass();
        rrj rrjVar = (rrj) this.c.b();
        rrjVar.getClass();
        aneo aneoVar = (aneo) this.d.b();
        aneoVar.getClass();
        aneo aneoVar2 = (aneo) this.e.b();
        aneoVar2.getClass();
        parcel.getClass();
        return new RebuildShortcutsAction(context, optional, rrjVar, aneoVar, aneoVar2, parcel);
    }
}
