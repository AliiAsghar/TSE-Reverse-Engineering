package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmw {
    public static final xze a = xze.f("BugleDiagnostics", kmw.class);
    public final Context b;
    public List c;
    public final armf d;
    public final kni e;
    public final ServiceConnection f = new aalm(this, 1);
    public boolean g;
    public DiagnosticsFragment h;
    private final nei i;

    public kmw(Context context, nei neiVar, armf armfVar, kni kniVar) {
        this.b = context;
        this.i = neiVar;
        this.d = armfVar;
        this.e = kniVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kni, java.lang.Object] */
    public final List a() {
        if (this.c == null) {
            nei neiVar = this.i;
            ArrayList arrayList = new ArrayList();
            jxv jxvVar = (jxv) neiVar.d;
            arrayList.add(new kno(neiVar.b, new knp(((yep) jxvVar.a).d(), ((lpg) jxvVar.b.b()).B())));
            arrayList.add(neiVar.e);
            arrayList.add(neiVar.c);
            arrayList.add(neiVar.f);
            arrayList.add(neiVar.a);
            this.c = arrayList;
        }
        return this.c;
    }
}
