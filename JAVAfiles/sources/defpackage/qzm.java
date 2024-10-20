package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzm implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public qzm(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
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
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [apwt, java.lang.Object] */
    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GenericWorkerQueueAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        uko ukoVar = (uko) this.d.b();
        ukoVar.getClass();
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        ?? b = this.f.b();
        b.getClass();
        xnv xnvVar = (xnv) this.g.b();
        xnvVar.getClass();
        parcel.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, ukoVar, anenVar, b, xnvVar, parcel);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [apwt, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        Context context = (Context) this.a.b();
        context.getClass();
        uko ukoVar = (uko) this.d.b();
        ukoVar.getClass();
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        ?? b = this.f.b();
        b.getClass();
        xnv xnvVar = (xnv) this.g.b();
        xnvVar.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, ukoVar, anenVar, b, xnvVar);
    }
}
