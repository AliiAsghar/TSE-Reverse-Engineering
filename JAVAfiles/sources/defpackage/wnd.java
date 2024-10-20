package defpackage;

import android.app.Notification;
import android.content.Intent;
import com.google.android.apps.messaging.voiceactions.BugleSearchActionVerificationClientActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wnd implements uwe {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wnd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.uwe
    public final void a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((BugleSearchActionVerificationClientActivity) this.a).startForegroundService((Intent) this.b);
                return;
            } else {
                ((uih) this.a).a.startForegroundService((Intent) this.b);
                return;
            }
        }
        Object obj = this.a;
        wne wneVar = (wne) obj;
        akul e = akul.g(d.m(new uqe(obj, 5))).h(new whg(obj, 17), wneVar.f).e(RuntimeException.class, new whg(obj, 18), wneVar.f);
        Object obj2 = this.b;
        obj2.getClass();
        wneVar.e.h(e, (Notification) obj2);
    }
}
