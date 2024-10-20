package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackx extends ackq {
    final /* synthetic */ PutDataRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackx(abrg abrgVar, PutDataRequest putDataRequest) {
        super(abrgVar);
        this.a = putDataRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new aclc(status, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01f6  */
    @Override // defpackage.abry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ void b(defpackage.abqu r17) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackx.b(abqu):void");
    }
}
