package defpackage;

import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaok {
    public final aaoj a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public AlertDialog g;
    public int h;
    public final akgs i = new isj(this, 11);
    public final akbp j = new akbp<Void, Void>() { // from class: aaok.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            xzb.p("Bugle", th, "Registration with Tachyon failed");
            AlertDialog alertDialog = aaok.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration failed");
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            AlertDialog alertDialog = aaok.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration pending");
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            xzb.c("Bugle", "Registered successfully with tachyon");
            AlertDialog alertDialog = aaok.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration successful");
            }
        }
    };

    public aaok(aaoj aaojVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = aaojVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
    }
}
