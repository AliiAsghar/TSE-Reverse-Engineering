package defpackage;

import android.R;
import android.os.Bundle;
import com.google.android.apps.messaging.startchat.StartChatActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yys implements ajyk {
    final /* synthetic */ Object a;
    private final Bundle b;
    private final /* synthetic */ int c;

    public yys(Object obj, Bundle bundle, int i) {
        this.c = i;
        this.a = obj;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        if (this.c != 0) {
            ((kpw) ((lft) this.a).b.b()).a(ajxtVar);
        } else {
            ((kpw) ((yyt) this.a).c.b()).a(ajxtVar);
        }
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        if (this.c != 0) {
            ajwt n = agxwVar.n();
            lfv lfvVar = new lfv();
            apxh.e(lfvVar);
            aklw.b(lfvVar, n);
            Bundle bundle = lfvVar.m;
            bundle.getClass();
            bundle.putAll(this.b);
            bd bdVar = new bd(((lft) this.a).a.a());
            bdVar.q(R.id.content, lfvVar);
            bdVar.b();
            return;
        }
        yyw a = yyw.a(agxwVar.n());
        a.ak(this.b);
        bd bdVar2 = new bd(((StartChatActivity) ((yyt) this.a).b).a());
        bdVar2.q(R.id.content, a);
        bdVar2.b();
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}
