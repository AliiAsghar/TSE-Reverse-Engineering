package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abyk extends abry {
    public abyk(abrg abrgVar) {
        super(abyl.b, abrgVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ abrm a(Status status) {
        if (status == null) {
            return Status.c;
        }
        return status;
    }

    @Override // defpackage.abry, defpackage.abrz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.j((abrm) obj);
    }
}
