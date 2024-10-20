package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgr extends zgw {
    private static final xze fa = xze.g("Bugle", "BaseBugleActivity");
    private long o;
    public xnv t;
    public armf u;
    public rrj v;
    public zas w;

    protected boolean F() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H() {
        ahqe.a.d(ahka.b(getClass()));
    }

    protected BooleanSupplier fb() {
        return new zgq(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean asBoolean;
        super.onCreate(bundle);
        H();
        asBoolean = fb().getAsBoolean();
        if (asBoolean) {
            fa.o("Redirecting to default SMS/permission check activity");
        }
        if (bundle != null && bundle.getBoolean("PrevDarkModeStateKey", false)) {
            this.v.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, android.app.Activity
    public void onPause() {
        super.onPause();
        this.w.e(this.t.f().toEpochMilli() - this.o);
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [yjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [yjj, java.lang.Object] */
    @Override // defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        yjl yjlVar = (yjl) this.u.b();
        for (yjh yjhVar : yjh.values()) {
            if (yjhVar.q == i) {
                for (yjh yjhVar2 : yjh.values()) {
                    if (yjhVar2.q == i) {
                        wfh wfhVar = (wfh) yjlVar.b.remove(yjhVar2);
                        if (wfhVar != null) {
                            String[] strArr2 = (String[]) yji.r.get(yjhVar2);
                            if (strArr2 != null && yjlVar.d.p(strArr2)) {
                                wfhVar.D();
                                return;
                            }
                            if (yjlVar.a.a() - yjlVar.c < 250) {
                                wfhVar.a.b();
                                ?? r6 = wfhVar.a;
                                boolean e = r6.e();
                                r6.a();
                                if (e) {
                                    yhx.c((Context) yjlVar.e.a);
                                    return;
                                }
                                return;
                            }
                            wfhVar.C();
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(String.format("Can't find RequestCode for code=%d.", Integer.valueOf(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        zas zasVar = this.w;
        if (F()) {
            ((ubl) zasVar.d.b()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.aitz, defpackage.cj, android.app.Activity
    public void onResume() {
        boolean asBoolean;
        super.onResume();
        asBoolean = fb().getAsBoolean();
        if (asBoolean) {
            fa.o("Redirecting to default SMS/permission check activity");
        }
        zas zasVar = this.w;
        aiut.c();
        qjb.a(new ybh(zasVar, 13), zasVar.e);
        if (!yhx.h(this)) {
            ajgi ajgiVar = new ajgi(this);
            ajgiVar.m(R.string.sms_disallowed_message);
            ajgiVar.j(false);
            ajgiVar.o(R.string.sms_disallowed_close_button, new iws(7));
            ajgiVar.a();
        } else if (!F()) {
            ((ubl) zasVar.d.b()).a();
        }
        this.o = this.t.f().toEpochMilli();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, defpackage.dx, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("PrevDarkModeStateKey", false);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
