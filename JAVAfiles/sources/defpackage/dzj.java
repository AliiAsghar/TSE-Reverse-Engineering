package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzj extends dzk {
    public CharSequence b;
    private dzv d;
    private Boolean e;
    public final List a = new ArrayList();
    private final List c = new ArrayList();

    public dzj() {
    }

    @Override // defpackage.dzk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.a.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.d = dzv.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            dzu dzuVar = new dzu();
            dzuVar.a = bundle.getString("android.selfDisplayName");
            this.d = new dzv(dzuVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.b = charSequence;
        if (charSequence == null) {
            this.b = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.a.addAll(dzi.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.c.addAll(dzi.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    @Override // defpackage.dzk
    public final void f(fqf fqfVar) {
        Notification.MessagingStyle b;
        dyu dyuVar = this.g;
        boolean z = false;
        if (dyuVar != null && dyuVar.a.getApplicationInfo().targetSdkVersion < 28 && this.e == null) {
            if (this.b != null) {
                z = true;
            }
        } else {
            Boolean bool = this.e;
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        g(z);
        if (Build.VERSION.SDK_INT >= 28) {
            b = dzf.a(dyf.b(this.d));
        } else {
            b = dzd.b(this.d.a);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dzd.a(b, ((dzi) it.next()).a());
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            dze.a(b, ((dzi) it2.next()).a());
        }
        if (this.e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            dzd.c(b, this.b);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            dzf.b(b, this.e.booleanValue());
        }
        b.setBuilder((Notification.Builder) fqfVar.e);
    }

    public final void g(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.dzk
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.d.a);
        bundle.putBundle("android.messagingStyleUser", this.d.a());
        bundle.putCharSequence("android.hiddenConversationTitle", this.b);
        if (this.b != null && this.e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.b);
        }
        if (!this.a.isEmpty()) {
            bundle.putParcelableArray("android.messages", dzi.c(this.a));
        }
        if (!this.c.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", dzi.c(this.c));
        }
        Boolean bool = this.e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public dzj(dzv dzvVar) {
        if (!TextUtils.isEmpty(dzvVar.a)) {
            this.d = dzvVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
