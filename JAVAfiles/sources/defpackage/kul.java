package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kul implements kuk {
    private final Context a;
    private final apwt b;
    private final armf c;

    public kul(Context context, apwt apwtVar, armf armfVar) {
        this.a = context;
        this.b = apwtVar;
        this.c = armfVar;
    }

    @Override // defpackage.kuk
    public final ListenableFuture a(amme ammeVar, Throwable th, alor alorVar) {
        abym abymVar;
        String string;
        abrc abrcVar = (abrc) this.c.b();
        if (abrcVar != null) {
            if (th != null) {
                String t = ajro.t(th);
                if (th.getCause() instanceof vjf) {
                    string = this.a.getString(R.string.report_invalid_thread_id_issue_description);
                } else if (th.getCause() instanceof vjg) {
                    string = this.a.getString(R.string.report_thread_id_not_found_description);
                } else {
                    string = this.a.getString(R.string.report_issue_description);
                }
                abymVar = new abyn(th);
                abymVar.c = string;
                abymVar.c(t);
            } else {
                abymVar = new abym(this.a);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("IssueTypeName", ammeVar.name());
            if (alorVar != null) {
                hashMap.putAll(alorVar);
            }
            ((uvq) this.b.b()).c(alor.l("EXTRA", new uvs(hashMap)));
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = 0;
            abymVar.e = themeSettings;
            aqws aqwsVar = new aqws((char[]) null);
            aqwsVar.d();
            abymVar.f = aqwsVar.c();
            abymVar.d((abmr) this.b.b(), false);
            abymVar.d = (String) utw.m.e();
            return agkx.f(abrcVar.m(abymVar.a()));
        }
        return albo.bI(null);
    }
}
