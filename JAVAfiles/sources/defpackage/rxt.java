package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxt implements utv {
    private final armf a;
    private final /* synthetic */ int b;

    public rxt(armf armfVar, int i) {
        this.b = i;
        this.a = armfVar;
    }

    public static void c(String str, int i) {
        String str2;
        if (d.ao(str)) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "DISPLAY";
                } else {
                    str2 = "NORMALIZED";
                }
            } else {
                str2 = "SEND";
            }
            throw new IllegalArgumentException(a.cg(str, str2, "Participant's ", " destination is not valid: "));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    @Override // defpackage.utv
    public final void a() {
        if (this.b != 0) {
            ((uof) ((ibi) this.a.b()).a.b()).a(upk.a("data_upgrade", und.a));
        } else {
            armf armfVar = ((qyd) this.a.b()).b;
            final boolean j = riw.j();
            ((agnq) armfVar.b()).e("ParticipantsColumnSetter#updatePhenotypeColumn", new Runnable() { // from class: qyc
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = j;
                    if (z) {
                        qyd.d();
                    }
                    tbb f = ParticipantsTable.f();
                    f.aj("updatePhenotypeColumn");
                    f.s(z);
                    f.a().e();
                }
            });
        }
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return true;
    }
}
