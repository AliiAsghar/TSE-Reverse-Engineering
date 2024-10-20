package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akaf implements ajyk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public akaf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aknd akndVar = (aknd) this.a;
                    akndVar.b(akndVar.c.e());
                    return;
                }
                return;
            }
            ((kpw) ((zjq) this.a).c.b()).a(ajxtVar);
        }
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        int i = this.b;
        byte[] bArr = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((aknd) this.a).c();
                    return;
                }
                ajwt n = agxwVar.n();
                akrh f = aktp.f("AccountChanged: UserConfigurationCommitter.commitOnAccountChange", akrk.a);
                Object obj = this.a;
                try {
                    n.getClass();
                    ListenableFuture b = ((akka) obj).b.b(akto.c(new akiq(n, obj, 5)), andi.a);
                    b.getClass();
                    f.b(b);
                    armd.i(f, null);
                    akat.c(b, "Failed to commit to configuration for account %s", n);
                } finally {
                }
            } else {
                bd bdVar = new bd(((PerSubscriptionSettingsActivity) ((zjq) this.a).b).a());
                ajwt n2 = agxwVar.n();
                zju zjuVar = new zju();
                apxh.e(zjuVar);
                aklw.b(zjuVar, n2);
                bdVar.z(R.id.fragment_container, zjuVar);
                bdVar.b();
            }
        } else {
            ajwt n3 = agxwVar.n();
            Object obj2 = this.a;
            akat.c(((akag) obj2).c.c(akto.d(new ahsi(obj2, n3, 11, bArr)), andi.a), "Failed to set default account.", new Object[0]);
        }
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}
