package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackz extends ackq {
    final /* synthetic */ Uri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackz(abrg abrgVar, Uri uri) {
        super(abrgVar);
        this.a = uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new acke(new DataHolder(DataHolder.j, status.f), 0);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ((IWearableService) ((aclw) abquVar).w()).getDataItemsByUriFilter(new aclr(this), this.a, 0);
    }
}
