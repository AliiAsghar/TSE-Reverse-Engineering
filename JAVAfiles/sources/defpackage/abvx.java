package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvx extends abwc {
    public final abwl a;
    final /* synthetic */ Map b;
    final /* synthetic */ addy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvx(addy addyVar, String str, DroidGuardResultsRequest droidGuardResultsRequest, Map map) {
        super(str, droidGuardResultsRequest);
        this.b = map;
        this.c = addyVar;
        this.a = new abwl();
    }

    @Override // defpackage.abwc
    protected final void a(abwb abwbVar) {
        try {
            abwl abwlVar = this.a;
            String a = abwbVar.a(this.b);
            abwbVar.close();
            abwlVar.b(a);
        } catch (RuntimeException e) {
            this.a.b(b("deliverHandle", e));
        }
    }

    public final /* bridge */ /* synthetic */ Object b(String str, Throwable th) {
        String str2;
        if (true != ((abwd) this.c.c).b.getLooper().getThread().isAlive()) {
            str2 = "(service thread not alive) ";
        } else {
            str2 = "";
        }
        return abhx.e(abhx.g("getResults " + str2 + str, th));
    }
}
