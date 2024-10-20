package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acla extends ackq {
    final /* synthetic */ Uri a;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acla(abrg abrgVar, Uri uri, int i) {
        super(abrgVar);
        this.a = uri;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new acln(status, 0, 1);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ((IWearableService) ((aclw) abquVar).w()).deleteDataItemsByUriFilter(new aclp(this), this.a, this.e);
    }
}
