package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lea implements uza {
    private static final alwo c = alwo.o("BugleLinkify");
    public final xce a;
    public final ldz b;
    private final anen d;

    public lea(anen anenVar, xce xceVar, ldz ldzVar) {
        this.d = anenVar;
        this.a = xceVar;
        this.b = ldzVar;
    }

    public static /* synthetic */ void a(URLSpan uRLSpan, ahjj ahjjVar, View view) {
        ((alwl) ((alwl) c.g()).h("com/google/android/apps/messaging/linkify/SystemLinkifyText", "handleOnClick", 84, "SystemLinkifyText.java")).t("SystemLinkifY: Linkified URL clicked: %s", uRLSpan.getURL());
        d.ag(uRLSpan);
        ahjjVar.r();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uRLSpan.getURL()));
        intent.addFlags(268439552);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            akto.n(context, intent);
        } catch (ActivityNotFoundException e) {
            ((alwl) ((alwl) ((alwl) c.h()).g(e)).h("com/google/android/apps/messaging/linkify/SystemLinkifyText", "handleOnClick", '^', "SystemLinkifyText.java")).q("SystemLinkifY: Unable to open linkified text, activity not found");
        }
    }

    @Override // defpackage.uza
    public final ListenableFuture b(Spannable spannable, ahjj ahjjVar) {
        return this.d.submit(new hbd(this, spannable, ahjjVar, 5, (char[]) null));
    }
}
