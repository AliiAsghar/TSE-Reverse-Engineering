package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knb implements rhp {
    public final armf a;

    public knb() {
        throw null;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LogTelephonyDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        parcel.getClass();
        return new LogTelephonyDatabaseAction(context, parcel);
    }

    public knb(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
