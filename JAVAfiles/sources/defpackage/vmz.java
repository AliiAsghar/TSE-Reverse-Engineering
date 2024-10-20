package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmz extends vju {
    private final Context a;
    private final qoq b;

    public vmz(Context context, qoq qoqVar) {
        context.getClass();
        qoqVar.getClass();
        this.a = context;
        this.b = qoqVar;
    }

    @Override // defpackage.vju
    public final /* synthetic */ akul b(Object obj) {
        aiwl a = vjv.a();
        a.n(true);
        Intent d = this.b.d(this.a);
        d.putExtra("via_notification", true);
        a.f = vlb.a(d, true, Optional.empty(), Optional.empty());
        Context context = this.a;
        vlg a2 = vli.a();
        a2.d(context.getString(R.string.secondary_user_notification_title));
        a2.a = IconCompat.g(this.a, R.drawable.notification_icon);
        a2.c(this.a.getColor(R.color.primary_brand_icon_color));
        a2.d = Optional.of(this.a.getString(R.string.secondary_user_notification_ticker));
        a.d = a2.a();
        akul ag = aktp.ag(a.m());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vkh
    public final vlf c() {
        return new vna(1);
    }

    @Override // defpackage.vkh
    public final vlm d() {
        return vlm.NT_SECONDARY_USER;
    }

    @Override // defpackage.vkh
    public final akul e() {
        akul ag = aktp.ag(true);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vkh
    public final String g() {
        return "msg";
    }
}
