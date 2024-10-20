package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class klz implements akbp<Void, Void> {
    final /* synthetic */ kma a;

    public klz(kma kmaVar) {
        this.a = kmaVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        this.a.a();
        this.a.s.setEnabled(true);
        kma.a.r("#donateCallback: failed to donate messages", th);
        aktp.K(new klp(false), (cg) this.a.b.b());
        ((abbu) this.a.e.b()).k(R.string.donation_donate_error);
        ((klc) this.a.j.b()).a(3);
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b();
        this.a.s.setEnabled(false);
        aktp.K(new klp(true), (cg) this.a.b.b());
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((abbu) this.a.e.b()).k(R.string.donation_flow_complete);
        Bundle extras = ((cj) this.a.c.b()).getIntent().getExtras();
        extras.getClass();
        if (extras.containsKey("EXTRA_LISTENER_KEY")) {
            Map map = (Map) ((apxx) this.a.k).a;
            String string = extras.getString("EXTRA_LISTENER_KEY");
            string.getClass();
            kkv kkvVar = (kkv) map.get(string);
            kkvVar.getClass();
            kkvVar.a();
        }
        aktp.K(new klm(4), (cg) this.a.b.b());
        ((klc) this.a.j.b()).a(2);
    }
}
