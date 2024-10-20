package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abug<T extends IInterface> extends BaseGmsClient<T> implements abqz {
    private static volatile Executor a;
    public final abua u;
    private final Set v;
    private final Account w;

    /* JADX INFO: Access modifiers changed from: protected */
    public abug(Context context, Looper looper, int i, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, abui.a(context), abqa.a, i, new ahjj(absfVar, (byte[]) null), new ahjj(abtcVar, (byte[]) null), abuaVar.f);
        this.u = abuaVar;
        this.w = abuaVar.a;
        Set set = abuaVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.v = set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] G() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public int a() {
        throw null;
    }

    @Override // defpackage.abqz
    public final Set l() {
        if (j()) {
            return this.v;
        }
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account v() {
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set z() {
        return this.v;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void I() {
    }
}
