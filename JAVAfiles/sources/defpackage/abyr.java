package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyr extends abug {
    public final Context a;

    public abyr(Context context, Looper looper, abre abreVar, abrf abrfVar, abua abuaVar) {
        super(context, looper, 29, abuaVar, abreVar, abrfVar);
        this.a = context;
        acmn.b(context);
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IFeedbackService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return abyf.b;
    }
}
