package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aant {
    public final Object a;

    public aant(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final VCardContentItem a(Uri uri, ameb amebVar) {
        rtb rtbVar = (rtb) this.a.b();
        rtbVar.getClass();
        amebVar.getClass();
        return new VCardContentItem(rtbVar, uri, amebVar);
    }

    public final void b(String str) {
        ((Intent) this.a).putExtra("content_type", str);
    }

    public final void c(Uri uri) {
        ((Intent) this.a).putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
    }

    public final void d(int i) {
        ((Intent) this.a).putExtra("opening_source", i - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final aant e(Context context) {
        return new aant(new Intent(context, (Class<?>) this.a.b()));
    }

    public aant(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public aant(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
