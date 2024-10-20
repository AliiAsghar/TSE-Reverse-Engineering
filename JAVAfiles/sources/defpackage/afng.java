package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afng implements agva {
    public final Context a;
    public final boolean b;
    public final afmd c;
    public final afmq d;
    public final afxz e;
    private final arwe f;
    private final arml g = armd.a(new afjm(this, 12));

    public afng(Context context, arwe arweVar, afmd afmdVar, afmq afmqVar, boolean z, afxz afxzVar) {
        this.a = context;
        this.f = arweVar;
        this.c = afmdVar;
        this.d = afmqVar;
        this.b = z;
        this.e = afxzVar;
    }

    @Override // defpackage.agva
    public final aguz a() {
        return f().a();
    }

    @Override // defpackage.agvb
    public final ListenableFuture b() {
        return arro.I(this.f, new lfn(this, (arpe) null, 15));
    }

    @Override // defpackage.agvb
    public final String c(String str) {
        Object G;
        G = arrn.G(arpj.a, new afju(this, str, (arpe) null, 4));
        String str2 = (String) G;
        if (str2 == null) {
            return f().c(str);
        }
        return str2;
    }

    @Override // defpackage.agvb
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.agvb
    public final int e() {
        return f().e();
    }

    public final agva f() {
        Object a = this.g.a();
        a.getClass();
        return (agva) a;
    }
}
