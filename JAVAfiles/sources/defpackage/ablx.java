package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablx extends abug {
    public final GoogleSignInOptions a;

    public ablx(Context context, Looper looper, abua abuaVar, GoogleSignInOptions googleSignInOptions, abre abreVar, abrf abrfVar) {
        super(context, looper, 91, abuaVar, abreVar, abrfVar);
        ablt abltVar;
        if (googleSignInOptions != null) {
            abltVar = new ablt(googleSignInOptions);
        } else {
            abltVar = new ablt();
        }
        abltVar.b = acbj.a();
        if (!abuaVar.c.isEmpty()) {
            Iterator it = abuaVar.c.iterator();
            while (it.hasNext()) {
                abltVar.c((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = abltVar.a();
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISignInService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
