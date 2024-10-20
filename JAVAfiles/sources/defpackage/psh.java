package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psh {
    public static final xze a = xze.g("Bugle", "ChatbotDirectoryHelper");
    public static final uuf b = uuh.i(uuh.b, "enable_chatbot_directory", false);
    public static final uuf c = uuh.e(uuh.b, "chatbot_directory_toolbar_color", 0);
    public final anen d;
    public final armf e;
    public final hgj f;
    private final psi g;
    private final yjr h;

    static {
        uuh.e(uuh.b, "chatbot_directory_new_pill_show_duration_hours", 240);
    }

    public psh(hgj hgjVar, anen anenVar, psi psiVar, armf armfVar, yjr yjrVar) {
        this.f = hgjVar;
        this.d = anenVar;
        this.g = psiVar;
        this.e = armfVar;
        this.h = yjrVar;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, wul] */
    public final void a(Context context, String str) {
        int i = 1;
        albo.U(!str.isEmpty(), "Chatbot directory URL is not set.");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        int i2 = 20;
        this.h.e().ifPresent(new mpv(buildUpon, i2));
        buildUpon.appendQueryParameter("client_vendor", "Goog");
        tc tcVar = new tc();
        tcVar.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        tcVar.b = 2;
        tcVar.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        uuf uufVar = c;
        if (((Integer) uufVar.e()).intValue() != 0) {
            mka mkaVar = new mka();
            mkaVar.k(((Integer) uufVar.e()).intValue());
            tcVar.a(mkaVar.l());
        }
        try {
            tcVar.b().b(context, buildUpon.build());
        } catch (ActivityNotFoundException e) {
            a.r("Couldn't find activity to launch custom tabs", e);
            this.g.d.c("Bugle.Rbm.ChatbotDirectory.OpenDirectoryFailure");
        }
        this.f.a.j(new mme(i2)).h(new psf(i), andi.a).k(qiu.b(), andi.a);
    }
}
