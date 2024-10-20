package defpackage;

import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch;
import com.google.android.gms.appdatasearch.internal.UsageReportingApiImpl;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoeg extends abtl implements abrz {
    protected acit a;
    final /* synthetic */ aoee[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoeg(aoee[] aoeeVarArr) {
        super(null, false, 9004);
        this.e = aoeeVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abtl
    public final /* bridge */ /* synthetic */ void a(abqu abquVar, acit acitVar) {
        this.a = acitVar;
        ((ILightweightAppDataSearch) ((abjo) abquVar).w()).reportUserActions(new UsageReportingApiImpl.OnStatusCallback(this), this.e);
    }

    @Override // defpackage.abrz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Status status = (Status) obj;
        if (status.c()) {
            this.a.b(null);
        } else {
            this.a.a(aode.m(status, "User Action indexing error, please try again."));
        }
    }

    public aoeg() {
        super(null, false, 9004);
    }
}
