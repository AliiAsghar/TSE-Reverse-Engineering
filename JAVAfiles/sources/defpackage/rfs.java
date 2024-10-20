package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfs implements rjl {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public rfs(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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
    public final SanitizeParticipantsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        agnq agnqVar = (agnq) this.e.b();
        agnqVar.getClass();
        parcel.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, this.d, agnqVar, parcel);
    }

    @Override // defpackage.rjl
    public final /* bridge */ /* synthetic */ Action b() {
        Context context = (Context) this.a.b();
        context.getClass();
        agnq agnqVar = (agnq) this.e.b();
        agnqVar.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, this.d, agnqVar);
    }
}
