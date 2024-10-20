package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adba {
    static final acyz a = acyy.b("enable_receive_message_producer_module_2");
    private final Context b;
    private final Executor c;
    private final aegu d;
    private final ajsj e;
    private final anen f;
    private final yjr g;
    private final adov h;
    private final aikc i;
    private final acqy j;
    private final addv k;
    private final adaz l;
    private final aday m;
    private final addy n;
    private final wcf o;
    private final aneo p;
    private final adqg q;

    public adba(Context context, Executor executor, adqg adqgVar, aegu aeguVar, ajsj ajsjVar, anen anenVar, yjr yjrVar, adov adovVar, aikc aikcVar, acqy acqyVar, addv addvVar, adaz adazVar, aday adayVar, addy addyVar, wcf wcfVar, aneo aneoVar) {
        this.b = context;
        this.c = executor;
        this.q = adqgVar;
        this.d = aeguVar;
        this.e = ajsjVar;
        this.f = anenVar;
        this.g = yjrVar;
        this.h = adovVar;
        this.i = aikcVar;
        this.j = acqyVar;
        this.k = addvVar;
        this.l = adazVar;
        this.m = adayVar;
        this.n = addyVar;
        this.o = wcfVar;
        this.p = aneoVar;
    }

    public final ListenableFuture a(adcc adccVar) {
        adqg adqgVar = this.q;
        adqgVar.getClass();
        adov adovVar = this.h;
        adovVar.getClass();
        aikc aikcVar = this.i;
        aikcVar.getClass();
        adaz adazVar = this.l;
        adazVar.getClass();
        addy addyVar = this.n;
        addyVar.getClass();
        aegu aeguVar = this.d;
        ajsj ajsjVar = this.e;
        adap adapVar = new adap(adccVar, this.b, this.c, adqgVar, aeguVar, ajsjVar, this.f, this.g, adovVar, aikcVar, this.j, adazVar, this.m, addyVar, this.p, this.o);
        if (((Boolean) a.a()).booleanValue()) {
            return adapVar.m.d();
        }
        return adapVar.f.d();
    }
}
